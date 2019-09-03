package com.assignment.lib.actions;

import com.assignment.core.MyWebDriver;
import com.assignment.lib.pages.ElectronicsPage;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;


public class ElectronicsActions extends ElectronicsPage {
    MyWebDriver myWebDriver;
    public ElectronicsActions(MyWebDriver myWebDriver) {
        this.myWebDriver = myWebDriver;
        PageFactory.initElements(myWebDriver.getWebDriver(), this);

    }

    public void navigateToFlipkartHomePage() {
        myWebDriver.getWebDriver().navigate().to("https://www.flipkart.com");

    }

    public void closeLoginPopUp(){
        popUp.click();

    }

    public String validateHeader(){

        return  flipkartHeading.getText();
    }

    public void selectElectronicsTab() {
        //Instantiate Action Class
//        Actions actions = new Actions(myWebDriver);
//        actions.moveToElement(electronicsTab).perform();
//        System.out.println("Done Mouse hover on 'Electronics section' from Menu");
        electronicsTab.click();
    }

    public void selectSubOption(){
        selectOption.click();
        System.out.println("Select oppo in mobiles section");
    }

    public void clickOnViewAll(){
        viewAll.click();

    }

    public void selectMobileByName(){
        mobileName.click();
        System.out.println("selected OPPO A3s (Purple,16 GB)");
    }

    public void itemAddToCart(){
        ArrayList<String> tabs = new ArrayList<String>(myWebDriver.getWebDriver().getWindowHandles());
        System.out.println(tabs.size());
        myWebDriver.getWebDriver().switchTo().window(tabs.get(1));
        addToCart.click();
        System.out.println("Added to cart");

    }

    public void clickOnFlipkartMainIcon(){
        flipkartIcon.click();
    }

    public void goToCart(){
        cart.click();
    }

     public String validateItemInCart() {
         return item.getText();
     }

     public void clickOnPlaceOrder(){
        placeOrder.click();
     }

     public void enterEmail(){
        email.sendKeys("testuserwebsite1@gmail.com");
     }

     public void clickOnContinue(){
        continueButton.click();
     }

     public void enterContact(){
        contact.sendKeys("**********");
        continue1.click();
     }



}