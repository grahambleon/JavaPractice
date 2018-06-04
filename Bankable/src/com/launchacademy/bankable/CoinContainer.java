package com.launchacademy.bankable;
import java.util.ArrayList;

public abstract class CoinContainer {
	
	private int maxValue;
	private ArrayList<Coin> coins = new ArrayList<Coin>();
  
	CoinContainer(int maxValue) {
		this.maxValue = maxValue;
	}
  
	public int totalValue() {
		int total = 0;
		for (Coin c: coins) {
		total += c.getValue();
		}
		return total;
	}
	
	public void addNewCoin(Coin coin) {
		int newValue = totalValue() + coin.getValue();
		if (newValue <= maxValue) {
			coins.add(coin);
		} else {
			System.out.println("Can't fit that!");
		}
	}
}
