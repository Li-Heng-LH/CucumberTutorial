package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.Foo;

import java.util.List;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^createFoo$")
    public void createFoo(List<Foo> foos) throws Throwable {
        for (Foo foo : foos) {
            System.out.println(foo);
        }
    }

    @Given("^createIncompleteFoo$")
    public void createIncompleteFoo(List<Foo> foos) throws Throwable {
        for (Foo foo : foos) {
            System.out.println(foo);
        }
        System.out.println("== :" + (foos.get(0) == foos.get(1)));
        System.out.println("equals: " + foos.get(0).equals(foos.get(1)));
    }

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("User on landing page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("User logged in");
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        System.out.println("Hompage populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("Cards displayed");
    }

}