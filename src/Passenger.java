

public class Passenger extends User {
	
	
	private String CNIC, passport;
	
	Booking booking;
	Flights flighthistory;
	
	private String accountNo;
	
   public Passenger(String name, String email, String password, String reEnterPass, String cNIC, String passport, String accountNo) {
		super(name, email, password, reEnterPass);
		CNIC = cNIC;
		this.passport = passport;
		this.accountNo = accountNo;
	}


   
   

   


	public String getCNIC() {
		return CNIC;
	}
	
	public void setCNIC(String cNIC) {
		CNIC = cNIC;
	}








	public String getPassport() {
		return passport;
	}








	public void setPassport(String passport) {
		this.passport = passport;
	}








	public String getAccountNo() {
		return accountNo;
	}








	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
		
		
		

}
