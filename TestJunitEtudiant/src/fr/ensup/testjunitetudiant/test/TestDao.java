package fr.ensup.testjunitetudiant.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import fr.ensup.testjunitetudiant.services.*;
import fr.ensup.testjunitetudiant.dao.ConnexionStatement;
import fr.ensup.testjunitetudiant.dao.EtudiantDao;
import fr.ensup.testjunitetudiant.domaine.*;

public class TestDao {
	EtudiantService es = new EtudiantService();
	ConnexionStatement cs =  new ConnexionStatement();
	EtudiantService creer = new EtudiantService();
	EtudiantDao ed = new EtudiantDao();
	
	@Test
	public void TestEtu() throws SQLException, Exception {
		int id = creer.voirEtudiant(1);
		assertEquals(1, id);
	}

	@Test
	public void testConn() {
		assertNotNull(cs.getStatement());
	}
	
	@Test
	public void creation() throws SQLException, Exception {
		es.creerEtudiant(2, "balde", "abdou", "abdou@a.com");
		int id = es.voirEtudiant(2);
		assertEquals(2, id);
	}
}
