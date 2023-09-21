
public class International extends Flights{
	
	// International flight extends flight class 
	protected String source;
	protected String destination;
	protected String route;
	
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}


	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}


	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}


	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}


	


	

   // intialzing the constructor 
	public International(String departure_Time, String arrival_Time, double distance, int totalSeats, String status,
			int seats_Available_current, Airplane airplane, String source, String destination, String route, double duration_hours) {
		super(departure_Time, arrival_Time, distance, totalSeats, status, seats_Available_current, airplane, duration_hours);
		this.source = source;
		this.destination = destination;
		this.route = route;
	}

	
	// getter and setter for plane id 
	public String getid()
	{
		return (airplane.getPlaneID());
	}

	// getter and setter for route
	public String getRoute() {
		return route;
	}


	public void setRoute(String route) {
		this.route = route;
	}
	
	

	
}