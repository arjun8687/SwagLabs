package com.automation.newpages;

import com.automationByArjun.Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class SwagCartPage extends BaseActions {
    WebDriver driver;

    public SwagCartPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public String backPackVerify(){
        String backPackValue=getTextFromElement("CartPage.BackPackFinal");
    return backPackValue;
    }

    public String fleeceJacketVerify(){
        String fleeceJacketValue=getTextFromElement("CartPage.FleeceJacketFinal");
        return fleeceJacketValue;
    }

    public SwagCartPage theCheckoutButton(){
        clickIt("CartPage.CheckoutButton");
        return this;
    }
}
