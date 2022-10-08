package dol;

import java.util.Date;

import misc.Fecha1;


public class Profesores extends Person  implements Present{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2452421880983451211L;
	private String profesion;
	private int a�osExperiencia;
	private String asignaturasAsignadas;
	private String gruposAsignados;



	public Profesores() {
		super();
	}



	public Profesores(short iD, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String genero, Date birthDate, int edad, String profesion,
			int a�osExperiencia, String asignaturasAsignadas, String gruposAsignados) {
		super(iD, primerNombre, segundoNombre, primerApellido, segundoApellido, genero, birthDate, edad);
		this.profesion = profesion;
		this.a�osExperiencia = a�osExperiencia;
		this.asignaturasAsignadas = asignaturasAsignadas;
		this.gruposAsignados = gruposAsignados;
	}



	public String getProfesion() {
		return profesion;
	}



	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}



	public int getA�osExperiencia() {
		return a�osExperiencia;
	}



	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}



	public String getAsignaturasAsignadas() {
		return asignaturasAsignadas;
	}



	public void setAsignaturasAsignadas(String asignaturasAsignadas) {
		this.asignaturasAsignadas = asignaturasAsignadas;
	}



	public String getGruposAsignados() {
		return gruposAsignados;
	}



	public void setGruposAsignados(String gruposAsignados) {
		this.gruposAsignados = gruposAsignados;
	}



	@Override
	public void showMostrar() {
		// TODO Auto-generated method stub
		Person b = new Person();
		System.out.printf("Id ", getID());
		System.out.printf("Primer nombre :", getPrimerNombre());
		System.out.printf("Segundo nombre :", getSegundoNombre());
		System.out.printf("Primer apellido :", getPrimerApellido());
		System.out.printf("Segunfo apellido :", getSegundoApellido());
		System.out.printf("Genero :", getGenero());
		System.out.printf("Edad :", getEdad());
		System.out.printf("Profesion :", getProfesion());
		System.out.printf("A�os de Experiencia :", getA�osExperiencia());
		System.out.printf("Asignaturas asignadas :", getAsignaturasAsignadas());
		System.out.printf("Grupos asignados :", getGruposAsignados());
		
		
	}




	

	

	

}
