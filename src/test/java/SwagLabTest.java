import com.automation.newpages.*;
import com.automationByArjun.Components.TestActions;
import com.automationByArjun.Helpers.TestAsserts;
import org.testng.annotations.Test;

public class SwagLabTest extends TestActions {
    @Test
    ////////////////////////////////login page/////////////////////////////////////////
    public void validateLoginFunctionality() throws Exception{
        SwagLoginPage loginPage = new SwagLoginPage(driver);
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        Thread.sleep(3000);

        /////////////////////////////shopping page/////////////////////////////////////
        SwagShoppingPage swagShoppingPage = new SwagShoppingPage(driver);
        swagShoppingPage.clickBackPack();
        swagShoppingPage.cartValue1();
        swagShoppingPage.clickFleeceJacket();
        swagShoppingPage.cartValue2();
        swagShoppingPage.theCartButton();

        //////////////////////////swag cart page////////////////////////////////////////
        SwagCartPage swagCartPage = new SwagCartPage(driver);
        String backpackCheck = swagCartPage.backPackVerify();
        TestAsserts.checkIfContains(backpackCheck,"Sauce Labs Backpack");
        swagCartPage.fleeceJacketVerify();
        String fleeceJacketCheck= swagCartPage.fleeceJacketVerify();
        TestAsserts.checkIfContains(fleeceJacketCheck,"Sauce Labs Fleece Jacket");
        swagCartPage.theCheckoutButton();

        ////////////////////////////////checkout info page//////////////////////////////
        SwagCheckOutInfoPage swagCheckOutInfoPage = new SwagCheckOutInfoPage(driver);
        swagCheckOutInfoPage.firstName("Steve");
        swagCheckOutInfoPage.lastName("Rogers");
        swagCheckOutInfoPage.zipCode("L6Y3Z2");
        swagCheckOutInfoPage.continueBtn();

        ////////////////////////////////THE CHECKOUT OVERVIEW PAGE/////////////////////
        SwagCheckoutOverviewPage swagCheckoutOverviewPage = new SwagCheckoutOverviewPage(driver);
        String shipInfo = swagCheckoutOverviewPage.shippingInformation();
        TestAsserts.checkIfContains(shipInfo,"FREE PONY EXPRESS DELIVERY!");
        String payInfo = swagCheckoutOverviewPage.paymentInformation();
        TestAsserts.checkIfContains(payInfo,"SauceCard #31337");
        swagCheckoutOverviewPage.priceBackpack();
        swagCheckoutOverviewPage.priceJacket();
        String totalValueBefore = String.valueOf(swagCheckoutOverviewPage.totalBefore());
        String totalValue =String.valueOf(swagCheckoutOverviewPage.itemTotalValue());
        TestAsserts.checkValuesAreEqual(totalValue,totalValueBefore);
        swagCheckoutOverviewPage.finishButton();
        Thread.sleep(3000);

        //////////////////////////////////CHECKOUT COMPLETE PAGE///////////////////////////////
        SwagCheckoutCompletePage swagCheckoutCompletePage = new SwagCheckoutCompletePage(driver);
        String theMessage = swagCheckoutCompletePage.finalMessage();
        TestAsserts.checkIfContains(theMessage,"THANK YOU FOR YOUR ORDER");
    }
}

