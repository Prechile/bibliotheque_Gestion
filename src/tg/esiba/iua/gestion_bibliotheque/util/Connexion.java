/*
 * Interface de connexion a la base de donnée mysql
 */
package tg.esiba.iua.gestion_bibliotheque.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Prechil_13
 */
public class Connexion {
      public static String server="localhost";  // Nom du serveur 
   public static String dbname="db_bibliotheque"; // Affectation du nom de la
                                                  //  bd a la variable "dbname"
   public static String user="root";              
    public static String password="";
    public Connection con=null;
    public  Connection getConnexion()
    {
                    try {
                        //Chargement du pilote de mysql
             Class.forName("com.mysql.jdbc.Driver");
             }
             catch (ClassNotFoundException e) {
             System.err.println("Driver loading error : " + e);
             }
       
        String url="jdbc:mysql://"+server+"/"+dbname;
        
        try {
            con=DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
              System.err.println("Erreur de connexion à la base  de donnée"+ex);
        }
        return con;
    }    
    
   public  Statement getStatement() throws SQLException
   {
       con=getConnexion();
       return con.createStatement();
   }
}
