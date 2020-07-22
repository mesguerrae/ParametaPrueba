package com.service.soap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.sql.*;
import java.util.Calendar;

import com.service.util.*;

public class SaveEmpleadoImpl implements SaveEmpleado {

	private static Map<Integer, Empleado> persons = new HashMap<Integer, Empleado>();

	@Override
	public boolean addEmpleado(Empleado p) {
		return this.addEmpleado(p);
	}

	private boolean saveInDB(Empleado p) {
		try {
			// create a mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost/test";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "control123");

			// create a sql date object so we can use it in our INSERT statement
			Calendar calendar = Calendar.getInstance();
			java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

			// the mysql insert statement
			String query = " insert into empleados (Nombres, Apellidos, Cargo, Salario, Fecha_vincula,Fecha_Nacimiento,Tipo_Documento, Numero_Documento)"
					+ " values (?, ?, ?, ?, ?, ?, ?, ?')";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, p.getNombres());
			preparedStmt.setString(2, p.getApellidos());
			preparedStmt.setString(3, p.getCargo());
			preparedStmt.setDouble(4, p.getSalario());
			preparedStmt.setString(5, p.getFecha_vincula());
			preparedStmt.setString(6, p.getFecha_Nacimiento());
			preparedStmt.setString(7, p.getTipo_Documento());
			preparedStmt.setString(8, p.getNumero_Documento());

			// execute the preparedstatement
			preparedStmt.execute();

			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());

			return false;
		}

	}

}