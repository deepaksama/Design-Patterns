package com.designpatterns.behavioural.observer;

import java.util.Observable;
import java.util.Observer;


public class TradeVolumeObserver implements Observer{
	private Long volume;
	
	public TradeVolumeObserver() {
		this.volume = null;
	}
	
	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public void update(final Observable o, final Object arg) {
		if(arg instanceof Long) {
			this.volume = (Long) arg;
			System.out.println("TradeVolumeObserver : Trading volume changed..." + this.volume);
		} else {
			System.out.println("TradeVolumeObserver : Some property changed on Subject");
		}
			
	}

}
