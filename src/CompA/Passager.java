package CompA;


public class Passager {

	private String nomp;
	private String prenomp;
	private Reservation r;
	
	
	public Passager(String n, String p){
		nomp=n;
		prenomp=p;
		
		
	}
	
	public String getnomp(){
		return nomp;
	}
	
	public String getprenomp(){
		return prenomp;
	}
	
	public Reservation getres(){
		return r;
	}
	
	public void setReservation(Reservation r1){
		r=r1;
	}
}
