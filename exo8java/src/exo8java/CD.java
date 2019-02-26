package exo8java;

public class CD extends Ouvrage {
	private String auteur;
	private static int nbrCD = 0;
	
	public CD(String titre, String auteur, DateEmprunt dateEmprunt) {
		super(titre, dateEmprunt);
		setNbrCD(getNbrCD() + 1);
		setAuteur(auteur);
	}
	public CD(String titre, String auteur) {
		super(titre);
		setNbrCD(getNbrCD() + 1);
		setCote(getNbrCD());
		setAuteur(auteur);
	}
	
	public String getAuteur() {return auteur;}
	
	public void setAuteur(String str) {auteur = str;}
	
	public static int getNbrCD() {
		return nbrCD;
	}
	public static void setNbrCD(int nbrCD) {
		CD.nbrCD = nbrCD;
	}
	
	
	public String toString() {
		String str;
		str = "le CD " + getNom() + " de " + getAuteur() + " prit le " + getDate() + "\ncote " + getCote(); 
		return str;
	}
}
