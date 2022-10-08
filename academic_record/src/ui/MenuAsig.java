package ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import dal.Archivos;
import dol.Asignatura;

public class MenuAsig {
public static Scanner o = new Scanner (System.in);
public static  FileReader jj;
public static ArrayList <Asignatura> u = new ArrayList<Asignatura>();
	public void showD () {
		
		
		boolean salir = false;
		int option=0;
		
		do {
			choose ();
			option = o.nextInt();
			
			switch (option) {
			case 1:
				open();
	
				break;
			case 2:
				agregar();
				break;
			case 3:
				
				break;
			case 4:
			save();
				break;
			case 5:
				MenuPrincipal p = new MenuPrincipal();
				p.showD();
				break;
			
			
			}
			
		}while(!salir);
		
		
	}
	
	public void choose() {
		System.out.println("1: Abrir");
		System.out.println("2: Agregar");
		System.out.println("3: Asignar docente");
		System.out.println("4: Guardar");
		System.out.println("5: Volver al menu principal");
		
		
	}
	public void agregar() {
		insertDatos mo = new insertDatos();
		u.add(mo.asignatura());
		
		
	}
	public void save() {

		Archivos al = new Archivos();
			
		System.out.println("Ruta para guardar : ");
		al.setFileEntry(o.next());
		
		System.out.println("Por favor indica el nombre del archivo: ");		
		al.setFileName(o.next());
		
		al.getRejistro();
		
		al.saveList();
	}
	public FileReader open() {
		System.out.println("Indique la ruta para abrir el archivo : ");
		String fileEntry = o.next();
		
		try {
			jj = new FileReader(fileEntry);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jj;
	}
	





}
