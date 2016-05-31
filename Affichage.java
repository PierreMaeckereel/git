package senCity;

public class Affichage {
	
	public String fichier;
	public String timestamp1;
	public String timestamp2;
	
	public Affichage(String fichier,String timestamp1,String timestamp2) {
		this.fichier = fichier;
		this.timestamp1 = timestamp1;
		this.timestamp2 = timestamp2;
	}
	
	public String getFichier(){
		return this.fichier;
	}
	
	public String getTimestamp1() {
		return this.timestamp1;
	}
	
	public String getTimestamp2() {
		return this.timestamp2;
	}

}
