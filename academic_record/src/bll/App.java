package bll;

import dol.Asignatura;
import dol.Estudiantes;
import dol.Grupo;
import dol.ListaRegistro;
import dol.Profesores;
import ui.MenuAsig;
import ui.MenuEstu;
import ui.MenuGru;
import ui.MenuProf;

public class App {
	
	public static  ListaRegistro ll = new ListaRegistro();
	
	 public static void addEstu(Estudiantes m ) {
  	   ll.addEstu(m);
     }
	 public static void  addAsig(Asignatura e ) {
		 ll.addAsig(e);
	  	   
	     }
	
	 public static void addGru(Grupo r) {
			ll.addGru(r);
		}
	 public static void addProf(Profesores t) {
	ll.addProf(t);
		}
			
		//* Metodos de mostrar las lista *//
	public static void mostrarAsig () {
		ll.mostrarAsig();
		
	                  }
          public static void mostrarGrup() {
	    ll.mostrarGrup();
                 	}
                    public static void mostrarEstu() {
                 ll.mostrarEstu();	
                                  }
                              public static void mostrarProf() {
	                      ll.mostrarProf();
                                    }//* Datos Ingresado por el usuario*//
                              
                        public static void menuGru () {
                        	MenuGru j = new MenuGru();
            			j.showD();
                          		
                          	                  }
                  public static void menuEstu() {
                	  MenuProf h = new MenuProf();
      				
                          		
                          	                  }
                  public static void menuAsig() {
                   	  MenuAsig k = new MenuAsig ();
                     	k.showD();
                 	                  }
       public static void menuProf () {
    	   MenuEstu n = new MenuEstu();
          n.showD();
          
                          	
                          	                  }
      
	}
 
