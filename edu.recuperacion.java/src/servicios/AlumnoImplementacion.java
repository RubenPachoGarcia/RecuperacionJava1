package servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import controladores.Inicio;
import dtos.AlumnoDto;

public class AlumnoImplementacion implements AlumnoInterfaz{

	Scanner sc=new Scanner(System.in);
	
	public AlumnoDto altaAlumno() {
		
		AlumnoDto alumno=new AlumnoDto();
		
		long idAlumno = idAutomatico();
		alumno.setId(idAlumno);
		
		System.out.println("Introduzca su nombre: ");
		String nombre=sc.next();
		alumno.setNombre(nombre);
		
		System.out.println("Introduzca su primer apellido: ");
		String apellido1=sc.next();
		alumno.setApellido1(apellido1);
		
		System.out.println("Introduzca su segundo apellido: ");
		String apellido2=sc.next();
		alumno.setApellido2(apellido2);
		
		System.out.println("Introduzca su DNI: ");
		String dni=sc.next();
		alumno.setDni(dni);
		
		System.out.println("Introduzca su direccion: ");
		String direccion=sc.next();
		alumno.setDireccion(direccion);
		
		System.out.println("Introduzca su email: ");
		String email=sc.next();
		alumno.setEmail(email);
		
		System.out.println("Introduzca su telefono: ");
		String telefono=sc.next();
		alumno.setTelefono(telefono);
		
		System.out.println("Introduzca su fecha de nacimiento (yyyy-MM-dd): ");
		String fechaStringNacimiento=sc.next();
		DateTimeFormatter fechaFormatoNacimiento = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fechaNacimiento = LocalDate.parse(fechaStringNacimiento, fechaFormatoNacimiento);
		alumno.setFechaNacimiento(fechaNacimiento);
		
        Inicio.listaAlumnos.add(alumno);
		
		return alumno;
	}
	
	private long idAutomatico() {
		
		long id;
		int tamanioLista=Inicio.listaAlumnos.size();
		
		if(tamanioLista==0)
		{
		    id=1;
		}
		else
		{
		    id = tamanioLista - 1;
		}

		return id;
	}
	
	public void ordenarYMostrarAlumno() {
		boolean intercambiado = true;

	    while (intercambiado) {
	        intercambiado = false;

	        for (int i = 0; i < Inicio.listaAlumnos.size() - 1; i++) {
	            AlumnoDto alumnoActual = Inicio.listaAlumnos.get(i);
	            AlumnoDto siguienteAlumno = Inicio.listaAlumnos.get(i + 1);

	            if (alumnoActual.getFechaNacimiento().compareTo(siguienteAlumno.getFechaNacimiento()) > 0) {
	            	Inicio.listaAlumnos.set(i, siguienteAlumno);
	            	Inicio.listaAlumnos.set(i + 1, alumnoActual);
	                intercambiado = true;
	            }
	        }
	    }
	    
	    for(AlumnoDto alumnos: Inicio.listaAlumnos) {
	    	
	    	System.out.println(alumnos.toString());
	    }	    	
	}
}
