package com.assignment.lib.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ElectronicsPage {


    @FindBy(xpath = "/html/body/div[2]/div/div/button")
     public WebElement popUp;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
    public WebElement flipkartHeading;

    @FindBy(xpath= "//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span")
    public WebElement electronicsTab;

    @FindBy(partialLinkText = "OPPO")
    public WebElement selectOption;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div[1]/div/div[1]/div[2]/a/span")
    public WebElement viewAll;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
    public WebElement mobileName;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
    public WebElement flipkartIcon;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[5]/div/div/a/span")
    public WebElement cart;

    @FindBy(linkText = "OPPO A3s (Red, 16 GB)")
    public WebElement item;

     @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[2]/div/div[1]/div/div[3]/div/form/button")
    public WebElement placeOrder;

     @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")
    public WebElement email;

     @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")
    public WebElement continueButton ;

     @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")
    public WebElement contact;

     @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")
     public WebElement continue1;



//    @FindBy(css = "input[value=\"Google Search\"]")
//    public WebElement btnSearch;
//
//    @FindBy(className="_Vbu")
//    public WebElement searchResultsFooter;
//}
}