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
public class Cliente extends Persona{
    private String telefono;
    private String correo;
    
    public Cliente(String tipo_documento, String nro_documento,
               String nombre, String paterno, String materno,
               LocalDate fecha_nacimiento,
               String telefono, String correo) {

    super(tipo_documento, nro_documento, nombre, paterno,
            materno, fecha_nacimiento);
    }

    public Cliente() {
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\d{9}")) {
            this.telefono = telefono;
        }else 
            System.out.println("EL TELEFONO DEBE TENER 9 DIGITOS");
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.correo = correo;
        } else {
            System.out.println("Error: El correo electrónico no tiene un formato válido.");
        }
    }
    
    @Override
    public String toString() {
        return super.toString()
                + " | Teléfono: " + telefono
                + " | Correo: " + correo;
    }
}
