package exo8java;
import java.util.*;

public class Bibliotheque {
	private List<Livre> livre;
	private List<CD> cd;
	private List<Periodique> periodique;
	public Bibliotheque() {
		livre = new Vector<Livre>();
		cd = new Vector<CD>();  
		periodique =new Vector<Periodique>();  
		
		setLivre(livre);
		setCd(cd);
		setPeriodique(periodique);
	}
	
	public List<Livre> getLivre() {
		return livre;
	}

	public void setLivre(List<Livre> livre) {
		this.livre = livre;
	}

	public List<CD> getCd() {
		return cd;
	}

	public void setCd(List<CD> cd) {
		this.cd = cd;
	}

	public List<Periodique> getPeriodique() {
		return periodique;
	}

	public void setPeriodique(List<Periodique> periodique) {
		this.periodique = periodique;
	}
	
	public void addLivre(Livre livre, int i) {
		this.livre.add(i, livre);
	}
	
	public void addCd(CD cd, int i) {
		getCd().add(i, cd);
	}
	
	public void addPeriodique(Periodique periodique, int i) {
		getPeriodique().add(i, periodique);
	}
	
	public String toString() {
		String str = "";
		str += "Livre : \n";
		for(int i = 0; i<getLivre().size(); i++) {
			str += getLivre().get(i).toString() + "\n";
		}
		str += "CD : \n";
		for(int i = 0; i<getCd().size(); i++) {
			str += getCd().get(i).toString() + "\n";
		}
		str += "Periodique : \n";
		for(int i = 0; i<getPeriodique().size(); i++) {
			str += getPeriodique().get(i).toString() + "\n";
		}
		return str;
	}
	
	public static void main(String[] argv) {
		Bibliotheque b = new Bibliotheque();
		Livre l1 = new Livre("jem'enfou","moi","lafac");
		Livre l2 = new Livre("balek", "pasmoi", "richard");
		CD c1 = new CD("jetaime","moipa");
		CD c2 = new CD("jetaimePAS","oklm");
		Periodique p1 = new Periodique("nom", 1, 7);
		Periodique p2 = new Periodique("nom", 2, 7);
		
		b.addLivre(l1, 0);
		b.addLivre(l2, 1);
		b.addCd(c1, 0);
		b.addCd(c2, 1);
		b.addPeriodique(p1, 0);
		b.addPeriodique(p2, 1);
		System.out.println(b);
	}
}
