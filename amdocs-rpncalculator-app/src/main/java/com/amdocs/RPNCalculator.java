package com.amdocs;

import java.util.Stack;

public class RPNCalculator {
	
	private Stack<Double>numberStack;
	private double firstNumber,secondNumber,result;
	
	public RPNCalculator() {
		numberStack=new Stack<Double>();
		firstNumber=secondNumber=result=0.0;
	}
	

	public double evaluate(String rpnMathExpression) {
		String[] rpnTokens=rpnMathExpression.split(" ");
		for(String token:rpnTokens) {
			if(token.equals("+")) {
				firstNumber=numberStack.pop();
				secondNumber=numberStack.pop();
				result=firstNumber+secondNumber;
				
				numberStack.push(result);
			}
			else if (token.equals("-")) {
				firstNumber=numberStack.pop();
				secondNumber=numberStack.pop();
				result=firstNumber-secondNumber;
					
				numberStack.push(result);
			}
			else
				numberStack.push(Double.parseDouble(token));
		}
		return numberStack.pop();
	}

}
