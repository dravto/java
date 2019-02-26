package exo8java;

public class Livre extends Ouvrage{
	private String auteur, editeur;
	private static int nbrLivre = 0;
	
	public Livre(String titre, String auteur, String editeur, DateEmprunt dateEmprunt) {
		super(titre, dateEmprunt);
		setNbrLivre(getNbrLivre() + 1);
		setAuteur(auteur);
		setEditeur(editeur);
	}
	public Livre(String titre, String auteur, String editeur) {
		super(titre);
		setNbrLivre(getNbrLivre() + 1);
		setCote(getNbrLivre());
		setAuteur(auteur);
		setEditeur(editeur);
	}
	
	
	public String getAuteur() {return auteur;}
	public String getEditeur() {return editeur;}
	
	public void setAuteur(String str) {auteur = str;}
	public void setEditeur(String str) {editeur = str;}
	
	public static int getNbrLivre() {
		return nbrLivre;
	}
	public static void setNbrLivre(int nbrLivre) {
		Livre.nbrLivre = nbrLivre;
	} 
	
	public String toString() {
		String str;
		str = "le livre " + getNom() + " de " + getAuteur() + " publié par " + getEditeur() + " prit le " + getDate() + "\ncote " + getCote(); 
		return str;
	}
}
