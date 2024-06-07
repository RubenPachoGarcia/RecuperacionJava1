package dtos;

import java.time.LocalDate;

public class AlumnoDto {

	long id;
	String nombre = "aaaaa";
	String apellido1 = "aaaaa";
	String apellido2 = "aaaaa";
	String dni = "aaaaa";
	String direccion = "aaaaa";
	String email = "aaaaa";
	String telefono = "aaaaa";
	LocalDate fechaNacimiento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public AlumnoDto()
	{
	}
	
	@Override
	public String toString() {
		String objetoString=nombre.concat(";").concat(dni).concat(";").concat(telefono).concat(";") + fechaNacimiento;		
		return objetoString;
	}	
	
	
}
