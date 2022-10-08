package ui;

import java.util.Scanner;

public class MenuPrincipal implements Interfaz   {
	public static Scanner x = new Scanner (System.in);
	
	public void showD () {
		
		
		boolean salir = false;
		int option=0;
		
		do {
			choose ();
			option = x.nextInt();
			
			switch (option) {
			case 1:
				MenuEstu n = new MenuEstu();
	             n.showD();
				break;
			case 2:
				MenuGru j = new MenuGru();
				j.showD();
				break;
			case 3:
				MenuProf h = new MenuProf();
				h.showD();
				break;
			case 4:
			
			             MenuAsig k = new MenuAsig ();
							k.showD();
				break;
			case 5:
				salir = true;
				break;
			
			
			}
			
		}while(!salir);
		
		
	}
	
	public void choose() {
		System.out.println("1: Estudiante");
		System.out.println("2: Grupos");
		System.out.println("3: Profesores");
		System.out.println("4: Estudiantes");
		System.out.println("5: Salir");
		
		
	}



}
