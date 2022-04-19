package org.gavura.pageobject;

import io.cucumber.java.After;
import org.gavura.driver.LazyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected LazyDriver driver;

    public BasePage(LazyDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @After
    public void afterScenario() {
        driver.dispose();
    }

    protected WebElement waitForElementClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        return element;
    }

    protected WebElement waitForElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));

        return element;
    }
}
