package org.gavura.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.gavura.pageobject.module.ProfileDropDownModule;
import org.gavura.pageobject.page.HomePage;
import org.gavura.pageobject.page.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.testng.Assert.assertTrue;

public class GitHubLoginSteps {
    private final LoginPage loginPage;
    private final HomePage homePage;
    private final ProfileDropDownModule profileDropDownModule;

    public GitHubLoginSteps(LoginPage loginPage, HomePage homePage, ProfileDropDownModule profileDropDownModule) {
        this.loginPage = loginPage;
        this.homePage = homePage;
        this.profileDropDownModule = profileDropDownModule;
    }

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        loginPage.open();
    }

    @When("User fulfills email as {string} and password as {string}")
    public void user_fulfills_email_as_and_password_as(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("User see Home Page")
    public void user_see_home_page() {
        assertTrue(homePage.atPage());
    }

    @Then("User signed in as {string}")
    public void user_signed_in_as(String userName) {
        homePage.openProfileDropDown();
        String gitHubProfileName = profileDropDownModule.getProfileName();

        assertThat(gitHubProfileName, is(equalTo(userName)));
    }
}
