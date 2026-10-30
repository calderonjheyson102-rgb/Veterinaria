/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import java.time.LocalDate;

/**
 *
 * @author natal
 */
public class Persona {
    private String tipo_documento;
    private String nro_documento;
    private String nombre;
    private String paterno;
    private String materno;
    private LocalDate fecha_nacimiento;
    
    public Persona(String tipo_documento, String nro_documento,
        String nombre, String paterno, String materno,
        LocalDate fecha_nacimiento) {

        setTipo_documento(tipo_documento);
        setNro_documento(nro_documento);
        setNombre(nombre);
        setPaterno(paterno);
        setMaterno(materno);
        setFecha_nacimiento(fecha_nacimiento);
    }

    public Persona() {
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        if (tipo_documento != null && (tipo_documento.equalsIgnoreCase("dni") || tipo_documento.equalsIgnoreCase("c.e"))) {
            this.tipo_documento = tipo_documento;
        } else {
            System.out.println("Error: El tipo de documento debe ser DNI o C.E.");
        }
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        if (nro_documento != null && nro_documento.matches("\\d+")) {

            if (tipo_documento != null && tipo_documento.equalsIgnoreCase("dni")
                    && nro_documento.length() == 8) {

                this.nro_documento = nro_documento;

            } else if (tipo_documento != null && tipo_documento.equalsIgnoreCase("c.e")
                && nro_documento.length() == 10) {

                this.nro_documento = nro_documento;

            } else {
                System.out.println("Error: El DNI debe tener 8 digitos y el C.E. 10 digitos");
            }

        } else {
            System.out.println("Error: El numero de documento debe contener solo números");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    @Override
    public String toString() {
        return "Documento: " + tipo_documento + " " + nro_documento
                + " | Nombre: " + nombre + " " + paterno + " " + materno
                + " | Fecha de nacimiento: " + fecha_nacimiento;
    }
}
