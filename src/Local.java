
public class Local extends Flights{
	
    protected String source;
	protected String destination;
	protected String route;
	
	// getter and setter for source
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	// getter and setter for destination
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	
	
	// intialzing the constructor 
	public Local(String departure_Time, String arrival_Time, double distance, int totalSeats, String status,
			int seats_Available_current, Airplane airplane, String source, String destination, String route, double duration_hours) {
		super(departure_Time, arrival_Time, distance, totalSeats, status, seats_Available_current, airplane, duration_hours);
		this.source = source;
		this.destination = destination;
		this.route = route;
	}
	
	// getter for plane id 
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
