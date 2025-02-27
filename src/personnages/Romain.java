package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		this.force -= forceCoup;
		if(this.force < 1) {
			System.out.println("J'abandonne !");
		} else {
			System.out.println("Aie !");
		}
		
	}
	
	
}
