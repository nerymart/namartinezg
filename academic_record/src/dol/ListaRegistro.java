package dol;

import java.util.ArrayList;
import java.util.List;


public class ListaRegistro {
	
	private List  <Asignatura> asignatura;
	private List <Estudiantes> estudiantes;
	private List<Grupo> grupo;
	private List <Profesores> profesores;
	public ListaRegistro() {
		asignatura= new ArrayList<Asignatura>();
		estudiantes = new ArrayList<Estudiantes>();
		grupo= new ArrayList<Grupo>();
		profesores = new ArrayList<Profesores>();
	}
	public ListaRegistro(List<Asignatura> asignatura, List<Estudiantes> estudiantes, List<Grupo> grupo,
			List<Profesores> profesores) {
		super();
		this.asignatura = asignatura;
		this.estudiantes = estudiantes;
		this.grupo = grupo;
		this.profesores = profesores;
	}
	public List<Asignatura> getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(List<Asignatura> asignatura) {
		this.asignatura = asignatura;
	}
	public List<Estudiantes> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(List<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public List<Grupo> getGrupo() {
		return grupo;
	}
	public void setGrupo(List<Grupo> grupo) {
		this.grupo = grupo;
	}
	public List<Profesores> getProfesores() {
		return profesores;
	}
	public void setProfesores(List<Profesores> profesores) {
		this.profesores = profesores;
	}
	public void addEstu(Estudiantes m) {
		this.estudiantes.add(m);
	}
	public void addAsig(Asignatura h) {
		this.asignatura.add(h);
	}
	public void addGru(Grupo r) {
		this.grupo.add(r);
	}
	public void addProf(Profesores t) {
		this.profesores.add(t);
	}
	public void mostrarAsig() {
		
		System.out.println("*************************Lista de asignaturas*********************");
		System.out.println("");
		for(int i=0; i<asignatura.size(); i++) {
			asignatura.get(i).showMostrar();
			
		}
	}
		public void mostrarGrup() {
			
			System.out.println("*************************Lista de grupos*********************");
			System.out.println("");
			for(int i=0; i<grupo.size(); i++) {
				grupo.get(i).showMostrar();
				
		         	}
		               }
            public void mostrarEstu() {
			
			System.out.println("*************************Lista de estudiantes*********************");
			System.out.println("");
			for(int i=0; i<estudiantes.size(); i++) {
				estudiantes.get(i).showMostrar();
		                	}
		                       	}

            	public void mostrarProf() {
					
					System.out.println("*************************Lista de profesores*********************");
					System.out.println("");
					for(int i=0; i<profesores.size(); i++) {
						profesores.get(i).showMostrar();
						
				        	}
	                           }

	
	

}
