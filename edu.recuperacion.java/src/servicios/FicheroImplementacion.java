package servicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import controladores.Inicio;
import dtos.AlumnoDto;

public class FicheroImplementacion implements FicheroInterfaz {

	public void cargarFichero() throws IOException {
	}
	
	public void escribirFicheroLog(String mensaje) {		
		
		FileWriter escribir;
		
		try {
			escribir = new FileWriter(Inicio.rutaCompletaLog, true);
			escribir.write(mensaje.concat("\n"));
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void escribirAlumnoLog() {		
		
		FileWriter escribir;
		
		try {
			escribir = new FileWriter(Inicio.rutaAlumnoLog, true);
			
			for(AlumnoDto alumno: Inicio.listaAlumnos) {
				
				escribir.write(alumno.toString().concat("\n"));
			}
			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
