package fr.ensup.testjunitetudiant.domaine;

public class Etudiant {
	public int id;
	public String nom;
	public String prenom;
	public String email;
	
	public Etudiant(int id, String n, String p, String e){
		this.nom = n;
		this.prenom = p;
		this.id = id;
		this.email = e;
	}
	
	public Etudiant(int id, String n, String p) {
		this.id = id;
		this.nom = n;
		this.prenom = p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
