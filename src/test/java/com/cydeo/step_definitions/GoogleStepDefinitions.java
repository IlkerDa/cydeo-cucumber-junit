package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @When("user types apple and clicks enter")
    public void user_types_and_clicks_enter2() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword);

    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle =string+ " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("Title is not as expected!", expectedTitle,actualTitle);
    }

    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("Title is not as expected!", expectedTitle,actualTitle);

    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
        WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        acceptButton.click();
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);


    }

}
