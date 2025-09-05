package model;

import java.time.Duration;

public class Bus extends Vehicle{

	@Override
	public double calculateFee(Duration duration) {
		long minutes = duration.toMinutes();
		return Math.ceil(minutes/60)*2;
	}

}

