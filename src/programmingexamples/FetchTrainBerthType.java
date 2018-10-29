package programmingexamples;

public class FetchTrainBerthType {
	// Program to fetch the berth type(U/M/L/SL/SU) based on random # assigned with total 72 berths available in a coach.
			/*Enter any number between 1-72, and the o/p will say what berth type is assigned
			Approach: Since every 8th seat the berth number changes, so the reminder(%-Modulus) of each num on dividing with 8 will
			ensure the type of assigned berth. In this way
			Check if seat number is valid seat number or not(i.e in range of 1 to 72).
			if (seat_number % 8) equals 1 or 4, then berth is a lower berth
			if (seat_number % 8) equals 2 or 5, then berth is a middle berth
			if (seat_number % 8) equals 3 or 6, then berth is an upper berth
			if (seat_number % 8) equals 7, then berth is a side lower berth
			if (seat_number % 8) equals 0 then berth is a side upper berth*/


	
	public static void main(String[] args) {
		
		
		FetchTrainBerthType bt = new FetchTrainBerthType();
		int s = 63;
		bt.berthType(s);
		s = 19;
		bt.berthType(s);
		s = 4;
		bt.berthType(s);

	}

	public void berthType(int seatnum) {		
		
		if (seatnum > 0 && seatnum <73) {
			if (seatnum % 8 == 1 || seatnum % 8 == 4) {
				System.out.println(seatnum +" is assigned LB");
			} else if (seatnum % 8 == 2 || seatnum % 8 == 5) {
				System.out.println(seatnum +" is assigned MB");
			} else if (seatnum % 8 == 3 || seatnum % 8 == 6) {
				System.out.println(seatnum +" is assigned UB");
			} else if (seatnum % 8 == 7) {
				System.out.println(seatnum +" is assigned SL");
			} else {
				System.out.println(seatnum +" is assigned SU");
			} 			
		} else {
			System.out.println("Invalid seat number entered");
		}		
	}
	
}
