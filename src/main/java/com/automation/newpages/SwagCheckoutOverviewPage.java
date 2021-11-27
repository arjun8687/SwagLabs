package com.automation.newpages;

import com.automationByArjun.Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class SwagCheckoutOverviewPage extends BaseActions {
    WebDriver driver;
    public SwagCheckoutOverviewPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public String shippingInformation(){
        String shipInfo = getTextFromElement("CheckoutOverviewPage.shippingInfo");
        System.out.println(shipInfo);
        return shipInfo;
    }

    public String paymentInformation(){
        String payInfo = getTextFromElement("CheckoutOverviewPage.paymentInfo");
        System.out.println(payInfo);
        return payInfo;
    }

    public Float priceBackpack(){
        String pBackpack =getTextFromElement("CheckoutOverviewPage.backpackPrice");
        String pBackpackAct = pBackpack.replaceAll("[$]","");
        Float priceBackpackFl = Float.valueOf(pBackpackAct);
        System.out.println(priceBackpackFl);
        return priceBackpackFl;
    }

    public Float priceJacket(){
        String pJacket =getTextFromElement("CheckoutOverviewPage.jacketPrice");
        String pJacketAct = pJacket.replaceAll("[$]","");
        Float priceJacketFl = Float.valueOf(pJacketAct);
        System.out.println(priceJacketFl);
        return priceJacketFl;
    }

    public Float totalBefore(){
        Float theFinalTotal = priceJacket()+priceBackpack();
        return theFinalTotal;
    }

    public Float itemTotalValue(){
        String iTotal = getTextFromElement("CheckoutOverviewPage.itemTotal");
        String iTotalAct = iTotal.replaceAll("[Item total: $]","");
        Float theTotalValue = Float.valueOf(iTotalAct);
        System.out.println(theTotalValue);
        return theTotalValue;
    }

    public SwagCheckoutOverviewPage finishButton()throws Exception{
      clickIt("CheckoutOverviewPage.finishBtn");
        return this;
    }
}
