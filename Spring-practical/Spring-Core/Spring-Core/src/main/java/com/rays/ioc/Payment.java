package com.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Payment {
	@Value(value = "100")
	double balance = 0;
	
	public double makePayment(double amt) {
		balance = balance- amt;
		return balance;
	}
	
	public double deposit(double amt) {
		balance = balance+amt;
		return balance;
	}
	
	

}
