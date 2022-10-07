package dol;

import java.io.Serializable;

public class Asignatura implements Serializable,Present{

	private static final long serialVersionUID = -565670219107573223L;
	
	private long ID ;
	private String nombreAsignatura;
	
	public Asignatura() {
		super();
	}
	public Asignatura(long iD, String nombreAsignatura) {
		super();
		ID = iD;
		this.nombreAsignatura = nombreAsignatura;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	@Override
	public void showMostrar() {
		System.out.printf("Id ", getID());
		System.out.printf("Primer nombre :", getNombreAsignatura());
		
		
		
	}
	
	

}
