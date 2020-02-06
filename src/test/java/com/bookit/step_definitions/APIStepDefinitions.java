package com.bookit.step_definitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class APIStepDefinitions {
    private Response response;



    @Given("authorization token is provided for {string}")
    public void authorization_token_is_provided_for(String string) {

    }

    @Given("user accepts content type as {string}")
    public void user_accepts_content_type_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user sends GET request to {string}")
    public void user_sends_GET_request_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to see {int} rooms")
    public void user_should_be_able_to_see_rooms(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies that response status code is {int}")
    public void user_verifies_that_response_status_code_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
