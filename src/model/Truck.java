package model;

import java.time.Duration;

//$10 per hour
public class Truck extends Vehicle{

	@Override
	public double calculateFee(Duration duration) {
		long minutes = duration.toMinutes();
		return Math.ceil(minutes/60)*10;
	}

}
