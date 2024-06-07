package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc=new Scanner(System.in);
	
	public int menuPrincipal() {
		
		int opcionUsuario;
		
		System.out.println("MENU PRINCIPAL");
		System.out.println("------------------------");
		System.out.println("0. CERRAR MENU");
		System.out.println("1. ALTA ALUMNO");
		System.out.println("2. MOSTRAR LISTA ALUMNOS");
		System.out.println("3. ESCRIBIR ALUMNOS EN FICHERO");
		System.out.println("------------------------");
		System.out.println("SELECCIONE LA OPCION QUE DESEE: ");
		
		opcionUsuario=sc.nextInt();
		
		return opcionUsuario;
	}
}
