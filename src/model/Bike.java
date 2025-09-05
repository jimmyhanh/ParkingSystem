package model;

import java.time.Duration;

//$2 per 30 mins
public class Bike extends Vehicle{

	@Override
	public double calculateFee(Duration duration) {
		long minutes = duration.toMinutes();
		return Math.ceil(minutes/30)*2;
	}

}

