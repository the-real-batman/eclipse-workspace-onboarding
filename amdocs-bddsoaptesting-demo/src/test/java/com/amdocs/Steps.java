package com.amdocs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	private String soapWSDLURL;
	private String rpnMathExpression;
	
	@Given("I have deployed the RPNCalculator SOAP api at URL {string}")
	public void setSOAPWSDLURL(String wsdlURL) {
		soapWSDLURL=wsdlURL;
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Given("the input is {string}")
	public void setInput(String rpnMathExpression) {
		this.rpnMathExpression=rpnMathExpression;
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I invoke the SOAP api")
	public void invokeRPNCalculatorSOAPAPI() {
		RPNCalculatorSoap rpnWebService = new RPNCalculatorSoap();
		RPNCalculator rpnCalculator = rpnWebService.getCalculator();
		
		actualResult = rpnCalculator.evaluate(rpnMathExpression);
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I expect the response as {string}")
	public void verifyExpectedResult(String expectedResult) {
		assertEquals(expectedResult,actualResult);
	    // Write code here that turns the phrase above into concrete actions
	}


}
