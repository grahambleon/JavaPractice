package com.launchacademy.bankable;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		
		System.out.println("How much change would you like");
		Scanner in = new Scanner(System.in);
		int changeRequest = in.nextInt();
		in.close();
		
		Register register = new Register(0);

		ArrayList<Coin> change = new ArrayList<Coin>();
		change.addAll(register.provideChange(changeRequest));
		
		for (Coin c: change) {
			int value = c.getValue();
			System.out.println(value);
		}
	}
}
