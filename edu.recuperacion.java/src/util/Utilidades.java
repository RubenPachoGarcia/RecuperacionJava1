package util;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Utilidades {
	
	public static String nombreFichero() {
		
		LocalDate fechaActual=LocalDate.now();
		DateTimeFormatter fechaFormato= DateTimeFormatter.ofPattern("ddMMyy");		
		
		String fechaFormateada=fechaActual.format(fechaFormato);
		
		String nombreLog="log-".concat(fechaFormateada).concat(".txt");
		
		return nombreLog;
	}
}
