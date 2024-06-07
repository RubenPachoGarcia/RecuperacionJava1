package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.AlumnoDto;
import servicios.AlumnoImplementacion;
import servicios.AlumnoInterfaz;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import util.Utilidades;

public class Inicio {
	
	public static final String rutaRaizLogs="C:\\Users\\ruben\\eclipse-workspace\\workspace-recuperacion-java\\logs\\";
	
	public static String alumnoFichero="alumno.txt";
	
	public static final String rutaAlumnoLog=rutaRaizLogs.concat(alumnoFichero);
	
	public static final String rutaCompletaLog=rutaRaizLogs.concat(Utilidades.nombreFichero());
	
	public static List<AlumnoDto> listaAlumnos=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuInterfaz mi=new MenuImplementacion();
		FicheroInterfaz fi=new FicheroImplementacion();
		AlumnoInterfaz ai=new AlumnoImplementacion();
		
		int opcion;
		boolean cerrarMenu=false;
		
		try
		{
		    fi.escribirFicheroLog("HAS ENTRADO");
		}catch(Exception ex)
		{
		    System.out.println("ERROR " + ex);
		}
		
		do {
			
			try {
				opcion=mi.menuPrincipal();
				
				switch(opcion) {
				case 0:
					System.out.println("SE CIERRA EL MENU");
					fi.escribirFicheroLog("SE CIERRA EL MENU");
					cerrarMenu=true;
					break;
				case 1:
					System.out.println("OPCION 1");
					fi.escribirFicheroLog("ALTA ALUMNO");
					
					ai.altaAlumno();
					break;
				case 2:
					System.out.println("OPCION 2");
					fi.escribirFicheroLog("MOSTRAR LISTA ALUMNOS");
					
					ai.ordenarYMostrarAlumno();
					break;
				case 3:
					System.out.println("OPCION 3");
					fi.escribirFicheroLog("ESCRIBIR ALUMNOS EN FICHERO");
					
					fi.escribirAlumnoLog();
					break;
				default:
					System.out.println("LA OPCION SELECCIONADA NO EXISTE");
					fi.escribirFicheroLog("LA OPCION SELECCIONADA NO EXISTE");
					break;
				}
			}catch(Exception ex1) {
				
				try {
					System.out.println("ERROR");
					fi.escribirFicheroLog("ERROR");
				}catch(Exception ex2) {
					System.out.println("ERROR" + ex2.toString());
					fi.escribirFicheroLog("ERROR");
				}
			}
		}while(!cerrarMenu);
		
	}

}
