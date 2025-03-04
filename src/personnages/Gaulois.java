package personnages;

public class Gaulois {
	/* Attributs_Class */
	private String nom;
	private int force;
	private int forcePotion = 1;
	
	/* Main */
	public static void main(String[] args) {		
		/* Création_Gaulois */
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
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		int frappe = this.force * this.forcePotion; 
		romain.recevoirCoup(frappe / 3);
		if (this.forcePotion > 1) {
			this.forcePotion --;
		}
	}

	public void boirePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}
	
}
