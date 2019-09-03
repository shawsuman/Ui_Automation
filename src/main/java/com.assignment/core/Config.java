package com.assignment.core;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import static junit.framework.TestCase.fail;

public class Config {
    private static final String ENVBASEURL = "base.url";
    private static final String ENVIRONMENT_PROFILE = "environment.profile";
    private static final String ENVIRONMENT_BROWSER = "environment.browser";
    private static Configuration preConfiguration;
    private static Configuration config;

    private static String preConfigFile = "config.properties";
    private static String configFile;

    private Config() {
    }

    public static Configuration getPreConfigInstance() {
        if (preConfiguration == null) {
            try {
                preConfiguration = new PropertiesConfiguration(loadAndGetResourceLocation(preConfigFile));
            } catch (ConfigurationException e) {
                e.printStackTrace();
            }
        }
        return preConfiguration;
    }

    public static void loadPreConfig() {
        getPreConfigInstance();
    }

    public static Configuration getConfig() {
        if (config == null) {
            loadConfig();
        }
        return config;
    }

    public static void loadConfig() {
        configFile = getEnvironmentProfile() + ".properties";
        if (configFile != null) {
            try {
                config = new PropertiesConfiguration(loadAndGetResourceLocation(configFile));
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else
            fail("Please pass an environment config");
    }

    public static String loadAndGetResourceLocation(String fileName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return classLoader.getResource(fileName).toString();
    }

    public static String getEnvUrl() {
        return config.getString(ENVBASEURL); }

    public static String getEnvironmentProfile() {
        return preConfiguration.getString(ENVIRONMENT_PROFILE);
    }

    public static String getBrowserDetails()
    {
        return preConfiguration.getString(ENVIRONMENT_BROWSER);
    }
}
