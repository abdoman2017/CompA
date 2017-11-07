package CompA;

import java.util.ArrayList;


public class Client {
private String nom;
private String prenom;
private int tel;
private String adr;
private ArrayList<Reservation> t;


public Client(String n, String prenom , int tel , String adr){
	this.nom=n;this.prenom=prenom; this.tel= tel ; this.adr=adr ; 
	t=new ArrayList();
}

public void setnom(String n){
	nom=n;
}

public void setprenom(String n){
	prenom=n;
}
public void settel(int t){
	tel=t;
}

public void setadr(String a){
	adr=a;
}


public String getnom(){
	return nom;
}

public String getprenom(){
	return prenom;
}

public int gettel(){
	return tel;
}

public String getadr(){
	return adr;
}


public void ajouterReservation(Reservation r){
	t.add(r);
}

public ArrayList<Reservation> getReservation(){
	return t;
}
}
