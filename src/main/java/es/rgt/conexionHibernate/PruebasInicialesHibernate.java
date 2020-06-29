package es.rgt.conexionHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class PruebasInicialesHibernate {

   public static void main (String[] args)
   {
      String jdbcUrl = "jdbc:mysql://localhost:3306/PruebasHibernate?SSL=false&serverTimezone=UTC";
      String usuario = "root";
      String contra = "";
      try {
         System.out.println("Intentando conectar con la base de datos: " + jdbcUrl);
         Connection connection = DriverManager.getConnection(jdbcUrl, usuario, contra);
         System.out.println("Conexión con exito");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   /*
	 * Muestra el PUERTO de mysql 
	 * show VARIABLES where variable_name in ('hostname', 'port'); 
	 * 
	 * Si existe un error con la zona horaria 
	 * Comprobar si la hora de la base de datos es la misma que la del equipo 
	 * SELECT NOW (); 
	 * 
	 * Comprobar el time zone de la base de datos, deberia de salir SYSTEM, 
	 * pero aun asi falla
	 * SELECT @@global. Time_zone; 
	 * 
	 * Cambiar time_zone en la base de datos (recomendable) 
	 * SET GLOBAL time_zone = '-1:00'; 
	 * 
	 * Cambiar time_zone desde la url (menos recomdable)
	 * value="jdbc: mysql://localhost:3306/nombreBaseDatos?serverTimezone=UTC"
    */
}
