package exo8java;

public class Periodique extends Ouvrage{
	private int numero, periodicite;
	private static int nbrPeriodicite = 0;
	
	public Periodique(String nom, int numero, int periodicite, DateEmprunt dateEmprunt) {
		super(nom, dateEmprunt);
		setNbrPeriodicite(getNbrPeriodicite() + 1);
		setNumero(numero);
		setPeriodicite(periodicite);
	}
	public Periodique(String nom, int numero, int periodicite) {
		super(nom);
		setNbrPeriodicite(getNbrPeriodicite() + 1);
		setCote(getNbrPeriodicite());
		setNumero(numero);
		setPeriodicite(periodicite);
	}
	
	
	public int getNumero() {return numero;}
	public int getPeriodicite() {return periodicite;}
	
	public void setNumero(int var) {numero = var;}
	public void setPeriodicite(int var) {periodicite = var;}
	
	public static int getNbrPeriodicite() {
		return nbrPeriodicite;
	}
	public static void setNbrPeriodicite(int nbrPeriodicite) {
		Periodique.nbrPeriodicite = nbrPeriodicite;
	}
	
	
	public String toString() {
		String str;
		str = "le periodique " + getNom() + " numero " + getNumero() + " publier tout les " + getPeriodicite() + " jours  prit le " + getDate() + "\ncote " + getCote(); 
		return str;
	}
}
