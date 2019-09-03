 ## Cucumber UI Template using Maven Profiles
 This is just a sample UI framework using Cucumber with maven profiles. In this sample, we are testing searching a text in google.com
 
 # Steps
 1. Open this project in editor(intellij).
 2. Cucumber profile has to be selected in Maven Profile
 3. Apart from Cucumber profile, You need to select environment profile eg: qa-chrome profile.
 4. Maven will fetch the required libraries to run the test.
 5. Add the path for glue as "classpath:com.assignment.tests" in default configuration of "Cucumber java".
 6. Right click the scenario and run.
 
 You can run the tests from terminal as well using following command:
 ` mvn -Dtest=RunCukes test -P Cucumber,qa-chrome`
 
 
 
