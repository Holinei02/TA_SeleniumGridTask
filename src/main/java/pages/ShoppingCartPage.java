package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {


    @FindBy(xpath = "//div[contains(@class, 'basket-container--header')]")
    private WebElement shoppingCartTitle;

    @FindBy(xpath = "//p[contains(@class,'basket-empty')]")
    private WebElement shoppingCartEmptyMessage;

    @FindBy(xpath = "//button[@class='checkout-order-summary__continue-btn']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//div[contains(@class, 'shopping-cart-item--shopping-cart-your-order')]|//section[@data-code or @data-product-code]")
    private WebElement shoppingCartItem;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getShoppingCartTitle() {
        return shoppingCartTitle;
    }

    public boolean isShoppingCartTitleVisible() {
        return shoppingCartTitle.isDisplayed();
    }

    public boolean isShoppingCartEmpty() { return shoppingCartEmptyMessage.isDisplayed();}

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public WebElement getShoppingCartItem() {
        return shoppingCartItem;
    }

}
