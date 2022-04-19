package org.gavura.pageobject.page;

import org.gavura.driver.LazyDriver;
import org.gavura.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "login_field")
    private WebElement loginField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(name = "commit")
    private WebElement signInButton;

    public LoginPage(LazyDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get("https://github.com/login");

        return this;
    }

    public LoginPage login(String email, String password) {
        loginField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();

        return new HomePage(driver);
    }
}
