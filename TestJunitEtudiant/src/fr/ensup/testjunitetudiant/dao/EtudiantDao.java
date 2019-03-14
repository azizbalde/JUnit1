package fr.ensup.testjunitetudiant.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantDao extends ConnexionStatement{
	private Statement statement = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int id;
	private String nom,prenom,email;
	
	

	@Override
	public String toString() {
		return "EtudiantDao [statement=" + statement + ", ps=" + ps + ", rs=" + rs + ", id=" + id + ", nom=" + nom
				+ ", prenom=" + prenom + ", email=" + email + "]";
	}

	public void listerEtudiant() throws Exception {
		statement = this.getStatement();
		try {
			this.rs = statement.executeQuery("SELECT * FROM etudiant");
			while (rs.next()) {
				this.id = rs.getInt("id");
				this.nom = rs.getString("nom");
				this.nom = rs.getString("prenom");
				this.email = rs.getString("email");
				toString();
			}
		} catch (Exception e) {
			System.out.println("requête ou saisie d'éléments non correcte");
		}
	}
	
	public int voirEtudiant(int id) throws Exception {
		statement = this.getStatement();
		try {
			this.rs = statement.executeQuery("SELECT id FROM etudiant where id="+id);
			while (rs.next()) {
				this.id = rs.getInt("id");
				this.nom = rs.getString("nom");
				this.nom = rs.getString("prenom");
				this.email = rs.getString("email");
				toString();
				return id;
			}
		} catch (Exception e) {
			System.out.println("requête ou saisie d'éléments non correcte");
		}
		return id;
	}
	
	public void creerEtudiant(int id2,String nom,String prenom,String email) throws Exception, SQLException {
		
		try {
			ps = this.getConnect().prepareStatement("INSERT INTO etudiant values (?,?,?,?)");
			ps.setInt(1, id2);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, email);
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public PreparedStatement getPs() {
		return ps;
	}

	public void setPs(PreparedStatement ps) {
		this.ps = ps;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
