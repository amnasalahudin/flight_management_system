
public class Booking {
	
	// intializing variables 
	private final int international_flight_cost = 20000 ;
	private  final int local_flight_cost = 10000;
	private final double local_tax = 0.05;
	private final double international_tax = 0.1;
	private double totalCost;
	
	// getter and setter for total number of seats
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	
	private int no_of_seats;
	private double duration;
	
	// intializing constructor 
	Booking(int no_of_seats){
		this.no_of_seats = no_of_seats;
	}
	
	// intializing constructor 
	Booking()
	{
		
	}
	
	// getter and setter for duration of flight 

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
		
	}
	
	// getter for local flight cost
	public int getLocal_flight_cost() {
		return local_flight_cost;
	}
	
	// getter for local flight tax
	public double getLocal_tax() {
		return local_tax;
	}
	
	// getter for international flight cost
	public int getInternational_flight_cost() {
		return international_flight_cost;
	}
	
	// getter for international flight tax
	public double getInternational_tax() {
		return international_tax;
	}
	
	// getter and setter for total cost
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
	

}
