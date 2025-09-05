package model;

import java.time.Duration;

//$7 per hour
public class Van extends Vehicle{

	@Override
	public double calculateFee(Duration duration) {
		long minutes = duration.toMinutes();
		return Math.ceil(minutes/60)*7;
	}

}
