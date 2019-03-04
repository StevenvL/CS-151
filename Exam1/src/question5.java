//Uses the Day class from day3

public class question5 {
	
	public static void main (String args[]) {
		Day current = new Day(2019,2,20);
		Day birthdate = new Day(1999,3,22);
		System.out.println(current.daysFrom(birthdate));
	}
	
	
}


