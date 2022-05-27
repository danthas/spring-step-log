package org.balicki.RegistroPorPasos.model;

import java.time.LocalDate;
import java.util.List;

public class Usuario {
    // Personal
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private String siglasGenero;
    private List<String> estado;
    private List<String> nacionalidades;
    // Profesional
    private String departamentos;
    private float salario;
    private String comentarios;
    // Bancario
    private String cuenta;

    public Usuario() {
    }

    public Usuario(String nombre,
                   String apellidos,
                   LocalDate fechaNac,
                   String siglasGenero,
                   List<String> estado,
                   List<String> nacionalidades) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.siglasGenero = siglasGenero;
        this.estado = estado;
        this.nacionalidades = nacionalidades;
    }

    public Usuario(String departamentos,
                   float salario,
                   String comentarios) {
        this.departamentos = departamentos;
        this.salario = salario;
        this.comentarios = comentarios;
    }

    public Usuario(String cuenta) {
        this.cuenta = cuenta;
    }

    public Usuario(String nombre,
                   String apellidos,
                   LocalDate fechaNac,
                   String siglasGenero,
                   List<String> estado,
                   List<String> nacionalidades,
                   String departamentos,
                   float salario,
                   String comentarios,
                   String cuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.siglasGenero = siglasGenero;
        this.estado = estado;
        this.nacionalidades = nacionalidades;
        this.departamentos = departamentos;
        this.salario = salario;
        this.comentarios = comentarios;
        this.cuenta = cuenta;
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSiglasGenero() {
        return siglasGenero;
    }

    public void setSiglasGenero(String siglasGenero) {
        this.siglasGenero = siglasGenero;
    }

    public List<String> getEstado() {
        return estado;
    }

    public void setEstado(List<String> estado) {
        this.estado = estado;
    }

    public List<String> getNacionalidades() {
        return nacionalidades;
    }

    public void setNacionalidades(List<String> nacionalidades) {
        this.nacionalidades = nacionalidades;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
