package com.launchacademy.bankable;

import java.util.ArrayList;

public class Register extends CoinContainer {

	public Register(int maxValue) {
		super(1000);
	}
	

	public ArrayList<Coin> provideChange(int amount) {
		ArrayList<Coin> coins = new ArrayList<Coin>();
		if (amount - 25 > 0) {
			amount -= 25;
			coins.add(new Quarter());
		} else if (amount - 10 > 0) {
			amount -= 10;
			coins.add(new Dime());
		} else if (amount - 5 > 0) {
			amount -= 5;
			coins.add(new Nickel());
		} else if (amount - 1 > 0) {
			amount -= 1;
			coins.add(new Penny());
		} 
		return coins;
	}
}
