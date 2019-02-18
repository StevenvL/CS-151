package lab1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Lab1 {
	public static void main(String args[]) {
		ZonedDateTime today = ZonedDateTime.now();
		ZoneId timezone = today.getZone();
		ZonedDateTime birthdate = ZonedDateTime.of(1999, 03, 22, 9, 9, 9, 9, timezone);
		
		ChronoUnit unit = ChronoUnit.DAYS;
		long differenceInDays = unit.between(birthdate, today);
		System.out.println(differenceInDays);
	}
	
}
