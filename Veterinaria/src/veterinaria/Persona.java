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
            throw new IllegalArgumentException("Error: El tipo de documento debe ser DNI o C.E.");
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
                throw new IllegalArgumentException("Error: El DNI debe tener 8 digitos y el C.E. 10 digitos");
            }

        } else {
            throw new IllegalArgumentException("Error: El numero de documento debe contener solo numeros");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) // Valida que sean solo letras
        {
            if (nombre.trim().length() >= 2) 
            {
                this.nombre = nombre;
            } else 
            {
                throw new IllegalArgumentException("ERROR: EL NOMBRE DEBE TENER MINIMO 2 CARACTERES");
            }
        } else 
        {
            throw new IllegalArgumentException("ERROR, EL NOMBRE DEBE CONTENER SOLO LETRAS");
        } 
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        if (paterno != null && paterno.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) // Valida que sean solo letras
        {
            if(paterno.trim().length()>=2)
            {
                this.paterno = paterno.trim();
            }else{
                
                throw new IllegalArgumentException("ERROR, El apellido paterno debe tener al menos 2 caracteres");
            }
        }else 
        {
            throw new IllegalArgumentException("ERROR, EL APELLIDO PATERNO DEBE CONTENER SOLO LETRAS");
        }
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        if (materno != null && materno.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) // Valida que sean solo letras
        {
            if(materno.trim().length()>=2)
            {
                this.materno = materno.trim();
            }else{
                
                throw new IllegalArgumentException("ERROR, El apellido materno debe tener al menos 2 caracteres");
            }
        }else 
        {
            throw new IllegalArgumentException("ERROR, EL APELLIDO MATERNO DEBE CONTENER SOLO LETRAS");
        }
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        if (fecha_nacimiento != null
            && !fecha_nacimiento.isAfter(LocalDate.now())
            && !fecha_nacimiento.isBefore(LocalDate.of(1900, 1, 1))) {

        this.fecha_nacimiento = fecha_nacimiento;

        } else {
            throw new IllegalArgumentException("Error: La fecha de nacimiento no es valida.");
        }
    }
    
    @Override
    public String toString() {
        return "Documento: " + tipo_documento + " " + nro_documento
                + " | Nombre: " + nombre + " " + paterno + " " + materno
                + " | Fecha de nacimiento: " + fecha_nacimiento;
    }
}