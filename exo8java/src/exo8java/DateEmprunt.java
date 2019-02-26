package exo8java;

public class DateEmprunt {
	private int jour, mois, annee;
	public DateEmprunt(int jour, int mois, int annee) {
		setJour(jour);
		setMois(mois);
		setAnnee(annee);
	}
	
	public int getJour() {return jour;}
	public void setJour(int jour) {this.jour = jour;}
	
	public int getMois() {return mois;}
	public void setMois(int mois) {this.mois = mois;}
	
	public int getAnnee() {return annee;}
	public void setAnnee(int annee) {this.annee = annee;}
	
	public String toString() {
		return getJour() +"/"+ getMois() +"/" + getAnnee();
	}
}
