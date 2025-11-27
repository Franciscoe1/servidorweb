package com.francisco.gestionestudiante.modelos;

public class Estudiantes {

    private Long idEstudiante;
    private String nombre;
    private String apellido;
    private String correo;
    private String dirección;
    private String telefono;
    private Notas notas;

    public Estudiantes() {
    }

    public Estudiantes(Long idEstudiante, String nombre, String apellido, String correo, String dirección, String telefono) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.dirección = dirección;
        this.telefono = telefono;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Notas getNotas() {
        return notas;
    }
}