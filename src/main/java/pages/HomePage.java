package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//span[contains(@class,'header__cart-icon')]")
    private WebElement cartIcon;

    @FindBy(xpath = "//span[contains(@class,'login-opener-icon')]")
    private WebElement loginButton;

    @FindBy(xpath = "//button[contains(@class, 'enterprise-account__button_register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//div[@id='popup-login']")
    private WebElement loginPopUp;

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@id='user_pass']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class, 'fancybox-close')]")
    private WebElement loginPopUpCloseButton;

    @FindBy(xpath = "//a[contains(@class, 'basket-empty__message--link')]")
    private WebElement storeButton;

    @FindBy(xpath = "//div[@class='global-store__popup-wrapper']//div[@class='store-search']")
    private WebElement storePopup;

    @FindBy(xpath = "//input[contains(@class,'field-container')]")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(@class,'field-container')]")
    private WebElement searchButton;

    @FindBy(xpath = "//div[contains(@class,'wishlist-button')]//div[contains(@class,'items-count')]")
    private WebElement wishListProductsCount;

    @FindBy(xpath = "//h1")
    private WebElement productsToCompare;


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void isCartIconVisible() {
        cartIcon.isDisplayed();
    }

    public void isLoginButtonVisible() {
        loginButton.isDisplayed();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void isRegisterButtonVisible() {
        registerButton.isDisplayed();
    }

    public boolean isLoginFieldVisible() {
        return loginField.isDisplayed();
    }

    public boolean isPasswordFieldVisible() {
        return passwordField.isDisplayed();
    }

    public WebElement getLoginPopUp() {
        return loginPopUp;
    }

    public WebElement getCartIcon(){return cartIcon;}

    public void clickLoginPopUpCloseButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", loginPopUpCloseButton);
    }

    public void clickStoreButton() {
        storeButton.click();
    }

    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }

    public void clickCartButton() {
        cartIcon.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText, Keys.ENTER);
    }


}
