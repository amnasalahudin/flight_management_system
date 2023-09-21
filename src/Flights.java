
public class Flights {
	
	
	// declaring variables
	protected static int ID;
	protected String departure_Time, arrival_Time;
	protected double distance;
	protected int totalSeats;
	protected String status;
	protected int seats_Available_current;
	protected double duration_hours;
	
	// getter and setters for duration of flight
	public double getDuration_hours() {
		return duration_hours;
	}



	public void setDuration_hours(double duration_hours) {
		this.duration_hours = duration_hours;
	}


	Airplane airplane;
	//association beacuse flight contains airplane information
	
	
	
    // intializing constructor 
	public Flights(String departure_Time, String arrival_Time, double distance,
			int totalSeats, String status, int seats_Available_current, Airplane airplane,double duration_hours) {
		super();
		
		this.departure_Time = departure_Time;
		this.arrival_Time = arrival_Time;
		this.distance = distance;
		this.totalSeats = totalSeats;
		this.status = status;
		this.seats_Available_current = seats_Available_current;
		this.airplane = airplane;
		this.duration_hours = duration_hours;
	}


	// getter and setter for id
	public static int getID() {
		return ID;
	}


	public static void setID(int iD) {
		ID = iD;
	}


   // getter and setter for departure time
	public String getDeparture_Time() {
		return departure_Time;
	}


	public void setDeparture_Time(String departure_Time) {
		this.departure_Time = departure_Time;
	}


	// getter and setter for arrival time
	public String getArrival_Time() {
		return arrival_Time;
	}


	public void setArrival_Time(String arrival_Time) {
		this.arrival_Time = arrival_Time;
	}

	// getter and setter for distance
	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}

	// getter and setter for total seats

	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	// getter and setter for airplane status

	public String isStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	// getter and setter for current seats available
	public int getSeats_Available_current() {
		return seats_Available_current;
	}


	public void setSeats_Available_current(int seats_Available_current) {
		this.seats_Available_current = seats_Available_current;
	}
	
	
	
	
	
	
}