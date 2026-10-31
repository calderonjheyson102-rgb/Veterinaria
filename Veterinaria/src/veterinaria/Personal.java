
package veterinaria;

import java.time.LocalDate;

/**
 *
 * @author Anderson
 */
public class Personal extends Persona {
    private String id_personal;
    private String cargo;
    private String especialidad;
    private double sueldo;

    public Personal(String tipo_documento, String nro_documento,
        String nombre, String paterno, String materno,
        LocalDate fecha_nacimiento,
        String id_personal, String cargo,
        String especialidad, double sueldo) {

    super(tipo_documento, nro_documento, nombre, paterno,
            materno, fecha_nacimiento);

    setId_personal(id_personal);
    setCargo(cargo);
    setEspecialidad(especialidad);
    setSueldo(sueldo);
}
    public Personal(){
        
    }
    
    public String getId_personal() {
        return id_personal;
    }

    public void setId_personal(String id_personal) {
        if (id_personal != null && id_personal.matches("[a-zA-Z0-9-]{2,10}")) {
            this.id_personal = id_personal;
        } else {
            System.out.println("Error: El ID debe tener entre 2 y 10 caracteres.");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo != null && cargo.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{3,}")) {
            this.cargo = cargo;
        } else {
            System.out.println("Error: Ingrese un cargo válido.");
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad != null && especialidad.length() >= 3) {
            this.especialidad = especialidad;
        } else {
            System.out.println("Error: La especialidad debe tener mínimo 3 caracteres.");
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        } else {
            System.out.println("Error: El sueldo debe ser mayor que cero.");
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " ID Personal: " + id_personal
                + " Cargo: " + cargo
                + " Especialidad: " + especialidad
                + " Sueldo: S/ " + sueldo;
    }
}
