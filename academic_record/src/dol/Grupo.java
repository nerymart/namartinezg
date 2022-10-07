package dol;
public class Grupo implements Present{
	private String nGrupo;
	private String seccion;
	private short ID;
	public Grupo(String nGrupo, String seccion, short iD) {
		super();
		this.nGrupo = nGrupo;
		this.seccion = seccion;
		ID = iD;
	}
	public Grupo() {
		super();
	}
	public String getnGrupo() {
		return nGrupo;
	}
	public void setnGrupo(String nGrupo) {
		this.nGrupo = nGrupo;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String secB) {
		this.seccion = secB;
	}
	public short getID() {
		return ID;
	}
	public void setID(short iD) {
		ID = iD;
	}
	@Override
	public void showMostrar() {
		System.out.printf("Id ", getID());
		System.out.printf("Nombre del grupo :", getnGrupo());
		System.out.printf("Seccion  :", getSeccion());
		

	}
	

}
