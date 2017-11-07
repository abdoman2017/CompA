package CompA;

import java.sql.Date;
import java.util.ArrayList;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;

public class Vol {

	private String numvol;
	private ArrayList<Reservation> t;
	private ArrayList<CompagnieA> c;
	private Aeroport aeroportdepart;
	private Aeroport aeroportarrive;
	private Aeroport A;
	private Date datedepart;
	private Date datearrive;

	
	public Vol() {

	}

	public Vol(String numv, Aeroport d, Aeroport a, Date de, Date ar){
		numvol=numv;
		aeroportdepart=d;
		aeroportarrive=a;
		datedepart=de;
		datearrive=ar;
		t=new ArrayList();
		c=new ArrayList();
	}
	
	public String getnumerovol(){
		return numvol;
	}
	
	public Aeroport getaeroportdepart(){
		return aeroportdepart;
	}
	
	public Aeroport getaeroportarrive(){
		return aeroportarrive;
	}
	
	public Date getdatedepart(){
		return datedepart;
	}
	
	public Date getdatearrive(){
		return datearrive;
	}
	
	public void setaeroportdepart(Aeroport d){
		aeroportdepart=d;
	}
	
	public void setaeroportarrive(Aeroport d){
		aeroportarrive=d;
	}
	
	public void setdatedepart(Date d){
		datedepart=d;
	}
	
	public void setdatearrive(Date d){
		datearrive=d;
	}
	
	public void setnumvol(String n){
		numvol=n;
	}
	
	public void ajouterReservation(Reservation r){
		t.add(r);
	}
	public void ajoutercompagnie(CompagnieA ca){
		c.add(ca);
	}
	public ArrayList<Reservation> getReservation(){
		return t;
		}
	public void escale(Aeroport a){
		a=A;
	
		
		
	}

	

		
		


}


	

