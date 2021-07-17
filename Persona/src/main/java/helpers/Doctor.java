/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

public final class Doctor {
	
	private String id;
	private String nombre;
	private String apellidos;
	private String especialidad;
	
	public Doctor(String id, String nombre, String apellidos, String especialidad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	}

    public Doctor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	/**
	 * Muestra por consola todos los datos del Doctor
	 */
	public void mostrar() {
		System.out.println("\n\t---------------");
		System.out.println("ID:Doctor    Q    " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Especialidad: " + especialidad);
		System.out.println("\t---------------");
	}

}
