package com.klu.service;
public class Calservice{
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a+b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public double divide(int a , int b) {
		if(b==0) {
			throw new ArithmeticException("Divide");
		}
		return (double) a/b;
	}
	public int modulo(int a, int b) {
		return a%b;
	}
}