package com.automation.newpages;

import com.automationByArjun.Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class SwagLoginPage extends BaseActions {

    WebDriver driver;

    public SwagLoginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public SwagLoginPage enterUserName(String username){
        typeInto("LoginPage.txtBoxUsername",username);
        return this;
    }

    public SwagLoginPage enterPassword(String password){
        typeInto("LoginPage.txtBoxPassword",password);
        return this;
    }

    public SwagShoppingPage clickLogin(){
        clickIt("LoginPage.Btn_Submit");
        return new SwagShoppingPage(driver);
    }
}
