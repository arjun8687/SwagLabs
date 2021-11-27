package com.automation.newpages;

import com.automationByArjun.Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class SwagCheckoutCompletePage extends BaseActions {
    WebDriver driver;
    public SwagCheckoutCompletePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public String finalMessage(){
        String theMessage = getTextFromElement("CheckoutCompletePage.finalMsg");
        return theMessage;
    }
}
