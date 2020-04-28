package it.polito.tdp.esempioSQL.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnect {
	
	public static Connection getConnection() throws SQLException {
		String jdbcURL = "jdbc:mysql://localhost/babs?user=root&password=MaXiMuS_gla@00" ;
		return DriverManager.getConnection(jdbcURL) ;
		//FACTORY: creazione di un oggetto di una classe, senza
		//conoscere il tipo della classe (NON si può usare new)
		//Viene usato un metodo fornito da un'altra classe che
		//internamente faccia new, conoscendo il tipo di classe effettivo.
		//In questo caso la FACTORY è DriverManager che fabbrica connessioni.
	}

}
