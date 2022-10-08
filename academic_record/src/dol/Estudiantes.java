package dol;

import java.util.Date;


import misc.Fecha1;
import misc.Fecha2;



public class Estudiantes extends Person{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6609542572152286516L;
	private Date ingreso;
     



	public Estudiantes() {
		super();
	}
	




	public Date getIngreso() {
		return ingreso;
	}





	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	public int getAge() {
		return Fecha2.getAge(ingreso);
	}





	public void showMostrar() {
		Person b = new Person();
		System.out.printf("Id ", getID());
		System.out.printf("Primer nombre :", getPrimerNombre());
		System.out.printf("Segundo nombre :", getSegundoNombre());
		System.out.printf("Primer apellido :", getPrimerApellido());
		System.out.printf("Segunfo apellido :", getSegundoApellido());
		System.out.printf("Genero :", getGenero());
		System.out.printf("Fecha de nacimiento: %s\n", Fecha1.dateToString(b.getBirthDate(), "dd/MM/yyyy"));
		System.out.printf("Edad :", getEdad());
		System.out.printf("Fecha de nacimiento: %s\n", Fecha2.dateToString(getIngreso(), "dd/MM/yyyy"));
		
	}



}
