package CompA;

import java.util.ArrayList;


public class Aeroport {

	private String nomA;
	private ArrayList<Vol> depart;
	private ArrayList<Vol> arrive;
	private ArrayList<Ville> Ville;
	
	public Aeroport(String n){
		nomA=n;
		depart=new ArrayList();
		arrive=new ArrayList();
		Ville=new ArrayList();
	}
	
	public String getnomA(){
		return nomA;
	}
	
	
	
	
}
