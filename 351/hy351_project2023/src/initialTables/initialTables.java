package initialTables;


import java.sql.*;
import Graphics.*;


public class initialTables {
	   private static final String DB_URL = "jdbc:mysql://localhost/";
	   private static final int port = 3306;
	   private static final String USER = "root";
	   private static final String PASS = "";

	  
       
	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		   initialTables init = new initialTables();  
		   init.initialTables();
		  
		   
		   Connection con = getConnection();
		   init.createStuffTable(con);
		   init.createUserTable(con);
		   init.createhistoryTable(con);
		   init.createAithousaTable(con);
		   first_window first=new first_window();
		   
		   // Close the ResultSet                 4 
	      
			
		  
	   }
	   
	   //dimiourgoume ti vasi
	   public void initialTables() throws SQLException, ClassNotFoundException {
	        Connection conn = getInitialConnection();
	        Statement stmt = conn.createStatement();
	        stmt.execute("CREATE DATABASE IF NOT EXISTS roomking");

	        
	      
	        stmt.close();
	        conn.close();
	    }
	   //kanoume sunvesi sti vasi
	   public static Connection getConnection() throws SQLException, ClassNotFoundException {
	        
		  // Class.forName("com.mysql.jdbc.Driver");
		           String url = new String("jdbc:mysql://localhost");
				   String databaseName = new String("roomking");
				   String username = new String("root");
				   String password = new String(""); 
				  
				return  DriverManager.getConnection( url + ":" + port + "/" + databaseName + "?characterEncoding=UTF-8", username, password);	  
	   }
	   //kanoume initial ti vasi
	   public static Connection getInitialConnection() throws SQLException, ClassNotFoundException {
	    		 Class.forName("com.mysql.cj.jdbc.Driver");
		    	return DriverManager.getConnection(DB_URL, USER, PASS);
		       
	    	}
	   
	   //dimiourgoume to stuff table me 5 atoma
	   public void createStuffTable(Connection con) throws SQLException, ClassNotFoundException {

	        Statement stmt = con.createStatement();

	        String query = "CREATE TABLE IF NOT EXISTS stuff "
	                + "(stuff_id INTEGER not NULL AUTO_INCREMENT, "
	                + "    name VARCHAR(30) not null  ,"
	                + "    phone VARCHAR(11) not null,"
	                + " PRIMARY KEY ( stuff_id))";
	        stmt.execute(query);
	        
	        String insertIndiv = "INSERT IGNORE INTO stuff(name,phone)"
	        		+ " VALUES ('xhras Ioannis', '696969696')";
	        stmt.executeUpdate(insertIndiv);
	 
			
	        stmt.close();
	    }
		public void createUserTable(Connection con) throws SQLException, ClassNotFoundException {

	        Statement stmt = con.createStatement();

	        String query = "CREATE TABLE IF NOT EXISTS user "
	                + "(user_id INTEGER not NULL AUTO_INCREMENT, "
	                + "    name VARCHAR(30) not null ,"
					+ "    username VARCHAR(30) not null unique ,"
					+ "    password VARCHAR(50) not null unique,"
	                + "    email VARCHAR(255) not null,"
	                + "    phone VARCHAR(11) not null,"
	                + " PRIMARY KEY ( user_id))";
	        stmt.execute(query);
	        
	        String insertIndiv = "INSERT IGNORE INTO user(name,username,password,email,phone)"
	        		+ " VALUES ('Vlachogiannakis Ioannis','vlax','33333','ioanvlach@gmail.com', '696969696')";
	        stmt.executeUpdate(insertIndiv);

			insertIndiv = "INSERT IGNORE INTO user(name,username,password,email,phone)"
	        		+ " VALUES ('fusarakis xristos','fusfus','33233', 'ofimono@gmail.com', '696969696')";
	        stmt.executeUpdate(insertIndiv);

			insertIndiv = "INSERT IGNORE INTO user(name,username,password,email,phone)"
	        		+ " VALUES ('toni ivanov', 'mariamouleipeis','1233332','ivanommagas@gmail.com', '696969696')";
	        stmt.executeUpdate(insertIndiv);
	        
	      
			
	        stmt.close();
	    }
	   
	   //dimiourgoume table gia ta 5 atoma
	   public void createAithousaTable(Connection con) throws SQLException, ClassNotFoundException {

	      
	        Statement stmt = con.createStatement();

	        String query = "CREATE TABLE IF NOT EXISTS aithousa_data "
	                + "(aithousa_id INTEGER not NULL AUTO_INCREMENT, "

					+ "    xwritikotita  VARCHAR(11) not null,"
					+ "    timi VARCHAR(11) not null,"
	                + "    diathesimotita DATE not null ,"
	                + " PRIMARY KEY (aithousa_id))";
	        
	        stmt.execute(query);
	        
	        
	        String insertPay= "INSERT IGNORE INTO aithousa_data(xwritikotita,timi,diathesimotita)"
	        		+ " VALUES ('1500', '10.000', '2022-12-30')";
	        stmt.executeUpdate(insertPay);
	        
	        insertPay= "INSERT IGNORE INTO aithousa_data(xwritikotita,timi,diathesimotita)"
					+ " VALUES ('200', '200', '2023-12-30')";
	        stmt.executeUpdate(insertPay);
	        
	        insertPay= "INSERT IGNORE INTO aithousa_data(xwritikotita,timi,diathesimotita)"
					+ " VALUES ('1400', '8000', '2021-12-30')";
	        stmt.executeUpdate(insertPay);

			insertPay= "INSERT IGNORE INTO aithousa_data(xwritikotita,timi,diathesimotita)"
					+ " VALUES ('1000', '3.000', '2022-11-30')";
	        stmt.executeUpdate(insertPay);

			insertPay= "INSERT IGNORE INTO aithousa_data(xwritikotita,timi,diathesimotita)"
					+ " VALUES ('1000', '3.000', '2022-12-30')";
	        stmt.executeUpdate(insertPay);
	        
	      
	        
	        
	        stmt.close();
	    }
	   
	   
	   //dimiourgoume to payrolltable gia ta 5 ayta atoma
	   public void createhistoryTable(Connection con) throws SQLException, ClassNotFoundException {
	       
	        Statement stmt = con.createStatement();

	        String query = "CREATE TABLE IF NOT EXISTS history_data "
	                +  "(history_id INTEGER not NULL AUTO_INCREMENT, "
					+ "    user_id  INTEGER not NULL unique, "
	                + "    date  DATE not null ,"
	                + " PRIMARY KEY ( history_id))";
	        stmt.execute(query);
	       
	        String insertAllo = "INSERT IGNORE INTO history_data(user_id, date)"
	        		+ " VALUES ('1', '2022-11-30')";
	        stmt.executeUpdate(insertAllo);
	        
	        
	        
	        
	        stmt.close();
	    }
	   
	   

	   
	    	 
	}