package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectBuilder.shouty_Objects.Person;
import org.junit.Assert;

import static java.util.Arrays.asList;

public class Shouty_StepDefinitions {

    private Person lucy;
    private Person sean;
    private String messageFromSean;
    @Given("Lucy is located {int} meters from Sean")
    public void lucyIsLocatedMetersFromSean(int distance) {
        System.out.println("Lucy is at "+distance+" meters from sean's");
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);
    }

    @When("Sean shouts free {string}")
    public void seanShoutsFree(String message) {
        sean.shout(message);
        messageFromSean = message;
    }

    @Then("Lucy hears Sean's message")
    public void lucyHearsSeanSMessage() {
        Assert.assertEquals(asList(messageFromSean),lucy.getMessagesHeard());
    }

}
