package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		
	}
	
	public boolean resterPotion() {
		if(this.quantitePotion < 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public int prendreLouche() {
		return 0;
	}
}
