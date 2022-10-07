package ui;

import java.util.Scanner;

public class MenuProf implements Interfaz {
  Scanner x;
	@Override
	public void showD() {
		x = new Scanner (System.in);
		boolean salir = false;
		int option=0;
		
		do {
			choose ();
			option = x.nextInt();
			
			switch (option) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				MenuEstu n = new MenuEstu();
			             n.showD();
				break;
			case 5:
				break;
			case 6:
				MenuPrincipal g= new MenuPrincipal();
				g.showD();
				break;
			
			
			}
			
		}while(!salir);
		
		
	}

	@Override
	public void choose() {
		System.out.println("1: Abrir");
		System.out.println("2: Agregar");
		System.out.println("3: Asignar grupo");
		System.out.println("4: Asignar asignatura");
		System.out.println("5: Guardar");
		System.out.println("6: Volver al menu principal");
		
		
	}

}
