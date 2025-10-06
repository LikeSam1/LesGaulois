package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariant();
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
		int forceS = this.force;
		force -= forceCoup;
		if (force < 1) {
			this.parler("J'abandonne !");
		} else {
			this.parler("Aie");
		}
		
		assert isInvariant();
		assert isInvariantSucces(forceS);
	}
	
	public boolean isInvariant() {
		return force >= 0;
	}
	
	public boolean isInvariantSucces(int forceS) {
		return this.force != forceS;
	}

	@Override
	public String toString() {
		return nom;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", -6);
		
	}
}
