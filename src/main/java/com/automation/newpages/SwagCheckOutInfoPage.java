package com.automation.newpages;

import com.automationByArjun.Components.BaseActions;
import org.openqa.selenium.WebDriver;

import java.util.zip.ZipEntry;

public class SwagCheckOutInfoPage extends BaseActions {
    WebDriver driver;

    public SwagCheckOutInfoPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public SwagCheckOutInfoPage firstName(String FirstName){
        typeInto("CheckoutInfoPage.fName",FirstName);
        return this;
    }
    public SwagCheckOutInfoPage lastName(String LastName){
        typeInto("CheckoutInfoPage.lName",LastName);
        return this;
    }
    public SwagCheckOutInfoPage zipCode(String zipcode){
        typeInto("CheckoutInfoPage.zCode",zipcode);
        return this;
    }
    public SwagCheckOutInfoPage continueBtn(){
        clickIt("CheckoutInfoPage.continueBtn");
        return this;
    }

}
