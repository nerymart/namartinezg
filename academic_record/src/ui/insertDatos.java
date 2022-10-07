package ui;

import java.util.Scanner;

import dol.Asignatura;
import dol.Estudiantes;
import dol.Grupo;
import dol.Profesores;

public class insertDatos {
	public static Scanner k = new Scanner (System.in);
	


	public Asignatura asignatura() {
		Asignatura ll = new Asignatura();
		
		System.out.println("Inserte un ID");
		ll.setID(k.nextLong());
		
		System.out.println("Nombre de la asignatura");
		ll.setNombreAsignatura(k.nextLine());
		return ll;
	}
	
	
	
	public Estudiantes estudiantes() {
		Estudiantes i = new Estudiantes();
		Scanner d = new Scanner (System.in);
			System.out.println("Ingrese ID");
			i.setID(d.nextShort());
			

			System.out.println("Fecha de ingreso");
			i.setFechaIngreso(d.nextShort());
			
			System.out.println("Primer nombre ");
			i.setPrimerApellido(d.next());
			
			System.out.println("Segundo nombre ");
			i.setSegundoApellido(d.next());
			
			System.out.println("Primer apellido ");
			i.setPrimerApellido(d.next());
		
		System.out.println("Segundo apellido ");
		i.setSegundoApellido(d.next());
		System.out.println("Edad");
		i.setEdad(d.nextInt());
		
		System.out.println("Genero ");
		i.setGenero(d.next());
		
		/*System.out.println("Fecha de nacimiento");
		i.setFechaNacimiento(null);*/
		
		
		
		return i;
		
		
	}
	
	
	
	
	public Grupo grupo() {
		Grupo l = new Grupo();
		
		System.out.println("Digijte ID");
		l.setID(k.nextShort());
		
		System.out.println("Asigne nombre al grupo");
		l.setnGrupo(k.nextLine());
		
		System.out.println("Seccion ( A - B ) ");
		l.setSeccion(k.nextLine());
		return l;
	}
	
	
	
	
	public Profesores profesores() {
		Profesores j = new Profesores();
		System.out.println("Ingrese ID");
		j.setID(k.nextShort());
		
		System.out.println("Primer nombre ");
		j.setPrimerNombre(k.nextLine());
		
		System.out.println("Segundo nombre ");
		j.setSegundoNombre(k.nextLine());
	
		System.out.println("Primer apellido ");
		j.setPrimerApellido(k.nextLine());
		
		System.out.println("Segundo apellido ");
		j.setSegundoApellido(k.nextLine());
		
		System.out.println("Genero ");
		j.setGenero(k.nextLine());
		
		System.out.println("Fecha de nacimiento");
		j.setFechaNacimiento(null);
		
		System.out.println("Edad");
	      j.setEdad(k.nextInt());
		
		System.out.println("Profesion");
		j.setProfesion(k.nextLine());
		
		System.out.println("Años de Experiencia");
		j.setAñosExperiencia(k.nextInt());
		
		System.out.println("Asignaturas asignadas");
		j.setAsignaturasAsignadas(k.nextLine());
		
		System.out.println("Grupos Asignados");
		j.setGruposAsignados(k.nextLine());
		
		return j;
		
	}
}	
