package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceDemoLoginPage extends BasePage {

    public SauceDemoLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#user-name")
    WebElement usernameInput;

    @FindBy(css = "#password")
    WebElement passwordInput;

    @FindBy(css = "#login-button")
    WebElement loginButton;

    @FindBy(css = "#react-burger-menu-btn")
    WebElement menu;

    @FindBy(css= ".title")
        WebElement title;

    @FindBy(css = "h3")
    WebElement errorMessage;
    public void enterUsername(String username) throws Exception {
        typeText(usernameInput, username, "Username " + username + " has been typed into the field!");
    }

    public void enterPassword(String password) throws Exception {
        typeText(passwordInput, password, "Password " + password + " has been typed into the field!");
    }

    public void clickLogin() throws Exception {
        click(loginButton, "Button " + loginButton + " has been clicked!");
    }

    public void menuShouldBeVisible() {
        Assert.assertTrue(menu.isDisplayed());
    }

    public void titleShouldBeVisible() {
        Assert.assertTrue(title.isDisplayed());
    }

    public void verifyErrorMessage(String errorMessageText) {
        Assert.assertEquals(errorMessage.getText(), errorMessageText);
    }
}
