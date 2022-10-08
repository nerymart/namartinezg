package dol;

import java.io.Serializable;
import java.util.Date;


import misc.Fecha1;

public class Person  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9122642117007409380L;
	/**
	 * 
	 */

	private short ID;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String genero;
	private Date birthDate;
	private int edad;
	
	

	
	public Person() {
		super();
	}

	public Person(short iD, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String genero, Date fechaNacimiento, int edad) {
		super();
		ID = iD;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.genero = genero;
		this.birthDate = fechaNacimiento;
		this.edad = edad;
		
	}

	public short getID() {
		return ID;
	}

	public void setID(short iD) {
		ID = iD;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAge() {
		return Fecha1.getAge(birthDate);
	}
	
	

}
