package com.penguins.bankingsystemerp.Facade;

public class MainClass {
	
	public static void main(String [] args) {
		Boolean a = new AdminFacade("asdf@asdfr.com", "").authenticate("1234");
		System.out.println(a);
	}
}
