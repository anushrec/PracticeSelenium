package automationTest.stepDefinitions;

import io.cucumber.java.en.When;

import java.io.IOException;

public class LogIn
{
    CommonTest commonTest = new CommonTest();

    @When("User enters {string} and {string} to {string}")
    public void user_enters_and_to(String username, String password, String actionToPerform) throws IOException
    {
        commonTest.logInToApplication(username,password,actionToPerform);
    }

}
