package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	Connection cn;
	Statement st;
	ResultSet rs;
	
	public Conexion(){
		
		try {
			Class.forName("org.h2.Driver");
			cn = DriverManager.getConnection("jdbc:h2:..\\Roket_Motors\\lib\\base1","sa","");
			st = cn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void Prueva(){
		try {
			rs = st.executeQuery("select * from roket_motors.usuarios");
			while(rs.next()) {
				System.out.print("ID:"+rs.getInt("id_usuario")+"\t"+"Nombre: "+rs.getString("nombre")+"\t"+"Apellido: "+rs.getString("apellidos")+" ");
				System.out.println("E-mail: "+rs.getString("e-mail")+"\t"+"Contraseña: "+rs.getString("contraseña"));
				//System.out.println(rs.getString("name")+" ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}