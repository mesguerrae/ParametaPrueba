package com.service.util;

import java.sql.Date;

public class Empleado {
	private String Nombres;
	private String Apellidos;
	private String Tipo_Documento;
	private String Numero_Documento;
	private String Fecha_Nacimiento;
	private String fecha_vincula;
	private String Cargo;
	private Double Salario;
	

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getTipo_Documento() {
		return Tipo_Documento;
	}

	public void setTipo_Documento(String tipo_Documento) {
		Tipo_Documento = tipo_Documento;
	}

	public String getNumero_Documento() {
		return Numero_Documento;
	}

	public void setNumero_Documento(String numero_Documento) {
		Numero_Documento = numero_Documento;
	}

	public String getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getFecha_vincula() {
		return fecha_vincula;
	}

	public void setFecha_vincula(String fecha_vincula) {
		this.fecha_vincula = fecha_vincula;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}
	
	// Creating toString 
    
}
