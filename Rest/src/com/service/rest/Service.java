package com.service.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.service.util.Empleado;
import com.service.client.*;

@Path("/service")
public class Service {

	@POST
	@Path("/empleadorest")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Empleado(InputStream incomingData) {
		Empleado empleado;
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {

				Gson gson = new Gson();
				empleado = gson.fromJson(line, Empleado.class);

				if (empleado.getNombres().isEmpty()) {
					return Response.status(400).entity("Parametro vacio (Nombres)").build();
				}
				if (empleado.getApellidos().isEmpty()) {
					return Response.status(400).entity("Parametro vacio (Apellidos)").build();
				}
				if (empleado.getCargo().isEmpty()) {
					return Response.status(400).entity("Parametro vacio (Cargo)").build();
				}
				if (empleado.getSalario().isNaN() || empleado.getSalario().toString().isEmpty()) {
					return Response.status(400).entity("Parametro vacio (Salario)").build();
				}
				if (empleado.getFecha_Nacimiento().isEmpty()) {
					return Response.status(400).entity("Parametro vacio (Fecha Nacimiento)").build();
				} else {
					if (!this.correctDate(empleado.getFecha_Nacimiento())) {
						return Response.status(400).entity("Formato invalido (Fecha Nacimiento)").build();
					}
				}
				if (empleado.getFecha_vincula().isEmpty()) {
					return Response.status(400).entity("Parametro vacio (Fecha Vinculacion)").build();
				} else {
					if (!this.correctDate(empleado.getFecha_vincula())) {
						return Response.status(400).entity("Formato invalido (Fecha Vinculacion)").build();
					}
				}
				if (empleado.getTipo_Documento().isEmpty()) {
					return Response.status(400).entity("Parametro vacio (Tipo Documento)").build();
				}
				if (empleado.getNumero_Documento().isEmpty()) {
					return Response.status(400).entity("Parametro vacio (Numero Documento)").build();
				}
				
				SaveEmpleadoImpl x = null;
				boolean result = x.addEmpleado(empleado);
				if(result) {
					return Response.status(200).entity("Empleado guardado de manera satisfactoria").build();
				}else {
					return Response.status(400).entity("algo ha pasado al momento de guardar el empleado)").build();
				}
			}
		} catch (Exception e) {
			return Response.status(400).entity(e.getMessage()).build();
		}
		return Response.status(200).entity(crunchifyBuilder.toString()).build();

	}



	private boolean correctDate(String date) {
		boolean correct = false;
		try {
			java.util.Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(date);
			correct = true;
		} catch (ParseException e) {
			e.printStackTrace();
			correct = false;
		}
		return correct;

	}
}