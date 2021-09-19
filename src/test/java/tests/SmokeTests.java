package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {


    private static final long DEFAULT_WAITING_TIME = 90;

    @Test
    public void checkMainComponentsOnHomePage() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().isSearchFieldVisible();
        getHomePage().isCartIconVisible();
        getHomePage().isLoginButtonVisible();
        getHomePage().clickLoginButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getLoginPopUp());
        assertTrue(getHomePage().isLoginFieldVisible());
        assertTrue(getHomePage().isPasswordFieldVisible());
        getHomePage().clickLoginPopUpCloseButton();

    }

    @Test
    public void checkAddToCart() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickCartButton();
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getShoppingCartPage().getShoppingCartTitle());
        assertTrue(getShoppingCartPage().isShoppingCartEmpty());
        getHomePage().clickStoreButton();
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertTrue(getDriver().getCurrentUrl().contains("shop"));

        getHomePage().isSearchFieldVisible();
        getHomePage().enterTextToSearchField("Компресор");
        getProductPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getProductPage().getAddToCartButton());
        getProductPage().clickAddToCartButton();

        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getProductPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getProductPage().getAddToCartPopupHeader());
        assertTrue(getProductPage().isAddToCartPopupVisible());
        getProductPage().isContinueShoppingButtonVisible();
        getProductPage().isContinueToCartButtonVisible();
    }
}
