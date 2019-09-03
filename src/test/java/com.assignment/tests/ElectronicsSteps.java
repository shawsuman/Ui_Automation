package com.assignment.tests;

import com.assignment.core.MyWebDriver;
import com.assignment.lib.actions.ElectronicsActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class ElectronicsSteps {

    MyWebDriver myWebDriver;

    ElectronicsActions electronicsActions;

    public ElectronicsSteps(ElectronicsActions electronicsActions)
    {
        this.electronicsActions=electronicsActions;
    }

    @Given("^User visit Flipkart site$")
    public void i_visit_flipkart() throws Throwable{
        electronicsActions.navigateToFlipkartHomePage();
        System.out.println("Successfully came to flipkart.com");
        Thread.sleep(3000);
    }

    @Then("^user clicks on the background$")
    public void user_clicks_on_the_background() throws Throwable {
        electronicsActions.closeLoginPopUp();
        System.out.println("closed login pop-up");
        Thread.sleep(5000);
    }

    @When("^User click on Electronic tab present in the menu bar$")
    public void user_select_electronics_section() throws Throwable{
        electronicsActions.selectElectronicsTab();
        System.out.println("Clicked on electronics section");
        Thread.sleep(3000);

    }

    @Then("^User should able to select OPPO in Electronics section$")
    public void user_should_select_oppo()throws Throwable{
        electronicsActions.selectSubOption();
        Thread.sleep(3000);
    }

    @And("^User clicks on view all button$")
    public void user_clicks_ViewAll() throws Throwable{
        electronicsActions.clickOnViewAll();
        Thread.sleep(3000);
    }

    @And("^User should able to select OPPO A3s$")
    public void user_should_select_mobile() throws Throwable{
        electronicsActions.selectMobileByName();

    }

    @Then("^User should able to Add item to its cart$")
    public void add_to_cart()throws Throwable{
        electronicsActions.itemAddToCart();
        Thread.sleep(3000);
    }

    @When("^User clicks on flipkart main icon in the screen$")
    public void user_clicks_on_flipkart_icon()throws Throwable{
        electronicsActions.clickOnFlipkartMainIcon();

    }

    @Then("^User clicks on cart icon present in the homepage$")
    public void user_clicks_on_cart_icon()throws Throwable{
        electronicsActions.goToCart();
    }

    @And("^user should able to see item exits$")
    public void validate_item_exists() throws Throwable{
        assertThat(electronicsActions.validateItemInCart().equals("OPPO A3s (Red, 16 GB)"));
    }

    @When("^User clicks on place order button present in the cart$")
    public void user_clicks_on_place_order()throws Throwable{
        electronicsActions.clickOnPlaceOrder();
    }

    @Then("^User should signup with flipkart$")
    public void user_should_signUp() throws Throwable{
    electronicsActions.enterEmail();
    }

    @And("^User enters contact number$")
    public void user_enters_contact() throws Throwable{
        electronicsActions.enterContact();
    }

}
