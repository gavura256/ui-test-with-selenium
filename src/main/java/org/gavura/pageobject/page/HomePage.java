package org.gavura.pageobject.page;

import org.gavura.driver.LazyDriver;
import org.gavura.pageobject.module.ProfileDropDownModule;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends LoginPage {
    @FindBy(xpath = "//img[@class=\"avatar avatar-small circle\"]")
    private WebElement profileMenu;

    public HomePage(LazyDriver driver) {
        super(driver);
    }

    public boolean atPage() {
        String homePageLink = "https://github.com/";

        return driver.getCurrentUrl().equals(homePageLink);
    }

    public ProfileDropDownModule openProfileDropDown() {
        profileMenu.click();

        return new ProfileDropDownModule(driver);
    }

}
