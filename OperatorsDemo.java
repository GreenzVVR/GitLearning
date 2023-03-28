package com.operators;

public class OperatorsDemo {
	public static void Arithmetic_Operators(int a, int b) {
		// addition operator
		System.out.println("a + b = " + (a + b));
		// subtraction operator
		System.out.println("a - b = " + (a - b));
		// multiplication operator
		System.out.println("a * b = " + (a * b));
		// division operator
		System.out.println("a / b = " + (a / b));
		// modulo operator
		System.out.println("a % b = " + (a % b));
	}
	public static void Assignment_Operators(int a, int b) {
		System.out.println("a += b -->" + (a += b));
		System.out.println("a -= b -->" + (a -= b));
		System.out.println("a *= b -->" + (a *= b));
		System.out.println("a /= b -->" + (a /= b));
		System.out.println("a %= b -->" + (a %= b));
	}
	
	public static void Logical_Operators(int i) {
		// Logical AND
		boolean result1 = ((i > 5) && (i > 10));
		System.out.println("AND result: " + result1);
		// Logical OR
		boolean result2 = ((i > 5) || (i > 10));
		System.out.println("OR result: " + result2);
		// Logical NOT
		boolean result3 = !(i > 5);
		System.out.println("NOT result: " + result3);
	}
	public static void ternary_operator(int a) {
		// ternary operator
		String result = (a > 0) ? "a is positive " : "a is Negative";
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		System.out.println("---Arithmetic Operators---");
		Arithmetic_Operators(10, 5);
		System.out.println("---Assignment Operators---");
		Assignment_Operators(10, 10);
		System.out.println("---Logical Operators---");
		Logical_Operators(10);
		System.out.println("---Ternary operator---");
		ternary_operator(20);
	}
}
