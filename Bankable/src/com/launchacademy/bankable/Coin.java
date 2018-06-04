package com.launchacademy.bankable;

public abstract class Coin {
  private int value;
  
  Coin(int value) {
	this.value = value;
  }
  
  public int getValue() {
    return value;
  }
}
