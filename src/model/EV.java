package model;

import java.time.Duration;

//$6 per hour + $2 charging fee
public class EV extends Vehicle{

	public double calculateFee(Duration duration) {
		long minutes = duration.toMinutes();
		return (Math.ceil(minutes/60)*6) + 2;
	}
}
