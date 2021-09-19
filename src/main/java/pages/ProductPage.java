package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'ng-star')]/button[contains(@class,'add-product card__button')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[contains(@class,'basket-container--header')]")
    private WebElement addToCartPopupHeader;

    @FindBy(xpath = "//button[contains(@class,'btn--3')]")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//button[contains(@class,'purchase-btn')]")
    private WebElement continueToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCartButton);
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public boolean isAddToCartPopupVisible() {
        return addToCartPopupHeader.isDisplayed();
    }

    public void isContinueShoppingButtonVisible() {
        continueShoppingButton.isDisplayed();
    }

    public void isContinueToCartButtonVisible() {
        continueToCartButton.isDisplayed();
    }

    public WebElement getAddToCartPopupHeader() {
        return addToCartPopupHeader;
    }
}
