package com.amazon;

public class Calculator {
	int result;
	
	public void clear() {
		result = 0;
	}
	
	public void enter(int num) {
		result = num;
	}
	
	public void add(int num1, int num2) {
		result = num1+ num2;
	}
	
	public void subtract(int num1, int num2) {
		result = num1-num2;
	}
	public void multiply(int num1, int num2) {
		result = num1 * num2;
	}
	
	public void division(int num1, int num2) {
		result = (int)num1/num2;
	}
	
	public int getResult() {
		return this.result;
	}
}
