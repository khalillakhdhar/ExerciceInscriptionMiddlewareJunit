package exercice;

public class User {
private String nom,mdp;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

public User(String nom, String mdp) {
	super();
	this.nom = nom;
	this.mdp = mdp;
}

public User() {
	super();
}

}
