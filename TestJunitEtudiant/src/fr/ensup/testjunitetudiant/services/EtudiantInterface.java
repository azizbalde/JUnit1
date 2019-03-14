package fr.ensup.testjunitetudiant.services;

import java.sql.SQLException;

public interface EtudiantInterface {
	void listerEtudiant() throws Exception;
	public void creerEtudiant(int id,String nom,String prenom,String email) throws Exception, SQLException;
	public int voirEtudiant(int id) throws Exception, SQLException;
		
}
