Feature: Develop a RPN Calculator application in Java.

	Scenario: Simple addition
		Given I have deployed the RPNCalculator SOAP api at URL "http://localhost:8080/rpncalculator-ws/services/rpncalculator?wsdl"
		And the input is "10 15 +"
		When I invoke the SOAP api
		Then I expect the response as "25.0"