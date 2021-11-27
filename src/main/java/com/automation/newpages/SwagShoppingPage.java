package com.automation.newpages;

import com.automationByArjun.Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class SwagShoppingPage extends BaseActions {

    WebDriver driver;

    public SwagShoppingPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

   public SwagShoppingPage clickBackPack(){
        clickIt("ShoppingPage.Backpack");
        return this;
   }

   public String cartValue1(){
        String value1=getTextFromElement("ShoppingPage.Cart");
        return value1;
   }

    public SwagShoppingPage clickFleeceJacket(){
        clickIt("ShoppingPage.FleeceJacket");
        return this;
    }

    public String cartValue2(){
        String value2 = getTextFromElement("ShoppingPage.Cart");
        return value2;
    }

    public SwagShoppingPage theCartButton()throws Exception{
        clickIt("ShoppingPage.CartButton");
        return this ;
    }
}
