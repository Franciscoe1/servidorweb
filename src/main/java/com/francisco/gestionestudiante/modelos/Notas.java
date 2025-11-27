package com.francisco.gestionestudiante.modelos;

public class Notas {

    private Long idEstudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double examen;
    private double promedio;
    private String estado;

    public Notas() {
    }

    public Notas(Long idEstudiante, double nota1, double nota2, double nota3, double examen, double promedio, String estado) {
        this.idEstudiante = idEstudiante;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.examen = examen;
        this.promedio = promedio;
        this.estado = estado;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}