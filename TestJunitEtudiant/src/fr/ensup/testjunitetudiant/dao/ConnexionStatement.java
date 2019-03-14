package fr.ensup.testjunitetudiant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnexionStatement {
		
		private Statement statement = null;
		private Connection connect = null;
		
		public ConnexionStatement () {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				this.connect = DriverManager.getConnection("jdbc:mysql://localhost/etudiants?user=root&password=");
				this.statement = connect.createStatement();
			} catch (Exception e) {
				System.out.println("Erreur "+e);
			}
		}
		

		public Connection getConnect() {
			return connect;
		}

		public void setConnect(Connection connect) {
			this.connect = connect;
		}

		public Statement getStatement() {
			return statement;
		}

		public void setStatement(Statement statement) {
			this.statement = statement;
		}
		
}
