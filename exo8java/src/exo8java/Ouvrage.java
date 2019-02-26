package exo8java;

public abstract class Ouvrage {
	protected int cote;
	protected DateEmprunt dateEmprunt = null;
	protected String nom;
	
	public Ouvrage(String nom, DateEmprunt dateEmprunt) {
		setDate(dateEmprunt);
		setCote(cote);
	}
	public Ouvrage(String nom) {
		setCote(cote);
	}
	
	public DateEmprunt getDate() {return dateEmprunt;}
	public int getCote() {return cote;}
	public void setDate(DateEmprunt date) {dateEmprunt = date;}
	public void setDate(int j, int m, int a) {dateEmprunt = new DateEmprunt(j,m,a);}
	public void setCote(int val) {cote = val;}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
