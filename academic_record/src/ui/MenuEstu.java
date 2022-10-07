package ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import bll.App;
import dal.Archivos;

import dol.Estudiantes;

public class MenuEstu extends App implements Interfaz {
	public static FileReader arc;

	public static Scanner entrada = new Scanner (System.in);
	private ArrayList<Estudiantes> agg = new ArrayList<Estudiantes>();
	
	public void Appp() {
		
		
	}
    
	
	public void showD() {
		
		boolean salir = false;
		int option=0;
		
		do {
			choose ();
			option = entrada.nextInt();
			
			switch (option) {
			case 1:
			   open();
				break;
			case 2:
				insertDatos s = new insertDatos();
				s.estudiantes();
		
				break;
			case 3:
				break;
			case 4:
			    save();
				break;
			case 5:
				MenuPrincipal m = new MenuPrincipal();
				m.showD();
				break;
			
		
			}
			
		}while(!salir);
		
	}

	public void choose() {
		System.out.println("1: Abrir");
		System.out.println("2: Agregar");
		System.out.println("3: Matricula");
		System.out.println("4: Guardar");
		System.out.println("5: Volver al menu principal");
		
	}
	public void agregar() {
		insertDatos mo = new insertDatos();
		agg.add(mo.estudiantes());
		
		
	}
	public void save() {

		Archivos al = new Archivos();
			
		System.out.println("Por favor indica la ruta para guardar el archivo: ");
		al.setFileEntry(entrada.next());
		
		System.out.println("Por favor indica el nombre del archivo: ");		
		al.setFileName(entrada.next());
		
		al.getRejistro();
		
		al.saveList();
	}
	public FileReader open() {
		System.out.println("Por favor indica la ruta del archivo a abrir: ");
		String fileEntry = entrada.next();
		
		try {
			arc = new FileReader(fileEntry);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arc;
	}
	

}
