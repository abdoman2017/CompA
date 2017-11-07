package CompA;


public class Reservation {

	private String numeroR;
	private Client c;
	private Vol numV;
	private Passager p;
	private String DR;
	
	public Reservation (String DR , String num,Vol nv, Client c,Passager p){
	numeroR=num;
	numV=nv;
	this.c=c;
	this.p=p;
	this.DR=DR;
	}
	
	public String getnumeroR(){
		return numeroR;
	}
	public String getDR(){
		return DR;
	}
	
	public Client getclient(){
		return c;
	}
	
	public Vol getVol(){
		return numV;
	}
	
	public Passager getpassager(){
		return p;
	}
	
	public void setPassager(Passager p1){
		p=p1;
	}
	
	
	
}
