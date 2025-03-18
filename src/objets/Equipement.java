package objets;

public enum Equipement {
	CASQUE("Casque"), BOUCLIER("Bouclier");
	private String nom;
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String ToString() {
		return nom;
	}
	
}
