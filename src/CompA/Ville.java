package CompA;

public class Ville 


{

	private Aeroport aeroport ; 

	private String nomV;
	
	
	
	public Ville (String nom ,Aeroport aeroport ){
	nomV=nom;
	this.aeroport=aeroport ;
	
	}
	
	public String getnomV(){
		return nomV;
	}
	
	

	
	
	public void setVille(String v){
		nomV=v ;
	}
	
	
	
}
