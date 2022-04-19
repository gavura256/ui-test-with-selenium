package org.gavura.pageobject.module;

import org.gavura.driver.LazyDriver;
import org.gavura.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileDropDownModule extends BasePage {
    public ProfileDropDownModule(LazyDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//strong[@class=\"css-truncate-target\"]")
    private WebElement profileName;

    public String getProfileName() {
        return waitForElementVisible(profileName).getText();
    }
}
