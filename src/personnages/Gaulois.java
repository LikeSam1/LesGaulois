package personnages;

public class Gaulois {
	/* Attributs_Class */
	private String nom;
	private int force;
	
	/* Main */
	public static void main(String[] args) {		
		/* Cr�ation_Gaulois */
		Gaulois Asterix =  new Gaulois("Asterix", 8);
		
		System.out.println(Asterix);
	}
	
	/* Functions */
	@Override
	public String toString() {
		return nom;
	}
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	public void boirePotion(int forcePotion) {

		
	}
	
}
