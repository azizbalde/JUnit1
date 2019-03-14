package fr.ensup.testjunitetudiant.services;

import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import fr.ensup.testjunitetudiant.dao.EtudiantDao;
import fr.ensup.testjunitetudiant.domaine.*;

public class EtudiantService implements EtudiantInterface{

	
	EtudiantDao dao = new EtudiantDao();
	List<EtudiantDao> listes = new ArrayList<>();
	Iterator<EtudiantDao> it;
	
	public void listerEtudiant() throws Exception {
		dao.listerEtudiant();
	}
	
	public void creerEtudiant(int id,String nom,String prenom,String email) throws Exception, SQLException {
		dao.creerEtudiant(id, nom, prenom, email);
		listes.add(dao);
		System.out.println("success");
		System.out.println(listes.size());
	}
	
	public int etudiantId() {
		return dao.getId();
	}

	public EtudiantDao getDao() {
		return dao;
	}
	

	public void setDao(EtudiantDao dao) {
		this.dao = dao;
	}

	/*public void addEtudiants() {
		listes.add(dao);
	}*/
	
	public void afficherTousLesEtudiants() {
		for(int i=0; i<listes.size(); i++) 
            System.out.println(listes.get(i));  
	}

	@Override
	public int voirEtudiant(int id) throws Exception, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
