package ui;

import java.util.Date;
import java.util.Scanner;

import dol.Asignatura;
import dol.Estudiantes;
import dol.Grupo;
import dol.Profesores;

import misc.Fecha1;
import misc.Fecha2;

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

			Date ingreso = Fecha2.catchValidDate(k, "Fecha de nacimiento (dd/MM/yyyy): ");
			i.setBirthDate(ingreso);
				
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
		
		Date date = Fecha1.catchValidDate(k, "Fecha de nacimiento (dd/MM/yyyy): ");
		i.setBirthDate(date);
			
		
		
		return i;
		
		
	}
	
	
	
	
	public Grupo grupo() {
		Grupo l = new Grupo();
		
		System.out.println("Digijte ID");
		l.setID(k.nextShort());
		System.out.println("Seccion ( A - B ) ");
		l.setSeccion(k.next());
		System.out.println("Asigne nombre al grupo");
		l.setnGrupo(k.next());
		
		return l;
	}
	
	
	
	
	public Profesores profesores() {
		Profesores j = new Profesores();
		System.out.println("Ingrese ID");
		j.setID(k.nextShort());
		
		System.out.println("Primer nombre ");
		j.setPrimerNombre(k.next());
		
		System.out.println("Segundo nombre ");
		j.setSegundoNombre(k.next());
	
		System.out.println("Primer apellido ");
		j.setPrimerApellido(k.next());
		
		System.out.println("Segundo apellido ");
		j.setSegundoApellido(k.next());
		
		System.out.println("Genero ");
		j.setGenero(k.next());
		
			
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
