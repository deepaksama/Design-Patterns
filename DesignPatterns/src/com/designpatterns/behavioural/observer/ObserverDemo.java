package com.designpatterns.behavioural.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		
		Stock stock = new Stock("TATA Motors",100.00F,10000L);
		TradeVolumeObserver observer1 = new TradeVolumeObserver();
		PriceObserver observer2 = new PriceObserver();
		stock.addObserver(observer1);
		stock.addObserver(observer2);
		
		stock.setPrice(110.00F);
		stock.setVolume(20000L);
		stock.setPrice(120.00F);
	}
}
