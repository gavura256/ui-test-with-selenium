package org.gavura.pageobject.module;

import org.gavura.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileDropDownModule extends BasePage {
    public ProfileDropDownModule(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//strong[@class=\"css-truncate-target\"]")
    private WebElement profileName;

    public String getProfileName() {
        return profileName.getText();
    }
}
