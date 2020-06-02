package oliv.form.e4.xtext;

public class VariableContext {
	String nom;
	double valeur;
	public VariableContext(String nom, double valeur) {
		this.nom = nom;
		this.valeur = valeur;
	}
	public String getNom() {
		return nom;
	}
	public double getValeur() {
		return valeur;
	}

}
