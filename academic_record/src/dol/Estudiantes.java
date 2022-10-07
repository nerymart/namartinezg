package dol;

import java.util.Date;



public class Estudiantes extends Person{
	private short fechaIngreso;
     



	public Estudiantes() {
		super();
	}


	public Estudiantes(short iD, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String genero, Date fechaNacimiento, int edad, short fechaIngreso) {
		super(iD, primerNombre, segundoNombre, primerApellido, segundoApellido, genero, fechaNacimiento, edad);
		this.fechaIngreso = fechaIngreso;
	}


	public short getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(short fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public void showMostrar() {
		System.out.printf("Id ", getID());
		System.out.printf("Primer nombre :", getPrimerNombre());
		System.out.printf("Segundo nombre :", getSegundoNombre());
		System.out.printf("Primer apellido :", getPrimerApellido());
		System.out.printf("Segunfo apellido :", getSegundoApellido());
		System.out.printf("Genero :", getGenero());
		System.out.printf("Fecha de nacimiento :", getFechaNacimiento());
		System.out.printf("Edad :", getEdad());
		System.out.printf("Fecha de ingreso :", getFechaIngreso());
		
	}



}
