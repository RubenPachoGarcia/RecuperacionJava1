package servicios;

import java.io.IOException;

public interface FicheroInterfaz {

	public void escribirFicheroLog(String mensaje);
	
	public void escribirAlumnoLog();
	
	public void cargarFichero() throws IOException;
}