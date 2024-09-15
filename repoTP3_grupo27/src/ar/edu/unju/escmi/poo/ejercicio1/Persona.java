package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.time.Period;


public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String domicilio;
	private String provincia;
	
	public Persona() {
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String domicilio, String provincia) {
		this.dni =dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni =dni;
		this.nombre = nombre;
		this.fechaNacimiento =fechaNacimiento;
		this.provincia = "Jujuy";
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre =nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento =fechaNacimiento;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	//Calcular la edad
	public int calcularEdad() {
		return Period.between(this.fechaNacimiento,  LocalDate.now()).getYears();
	}
	
	//Verificar si es mayor de edad
	public boolean esMayorDeEdad() {
		return this.calcularEdad() >= 18;
	}
	
	public void mostrarDatos() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Provincia: " + this.provincia);
		System.out.println("Edad: " + this.calcularEdad());
	if (this.esMayorDeEdad()) {
		System.out.println("La persona es mayor de edad.");
	} else {
		System.out.println("La persona no es mayor de edad.");
	}	
  }
}
