package veterinaria;

import java.time.LocalDate;

/**
 *
 * @author JHEY
 */
public class RegistroClinico {
    private final LocalDate fecha;
    private final String diagnostico;
    private final String tratamiento;
 
    RegistroClinico(String diagnostico, String tratamiento) {
        if (diagnostico == null || diagnostico.trim().length() < 3) {
            throw new IllegalArgumentException("El diagnostico debe tener al menos 3 caracteres.");
        }
        if (tratamiento == null || tratamiento.trim().length() < 3) {
            throw new IllegalArgumentException("El tratamiento debe tener al menos 3 caracteres.");
        }
        this.fecha = LocalDate.now();
        this.diagnostico = diagnostico.trim();
        this.tratamiento = tratamiento.trim();
    }
 
    public LocalDate getFecha() {
        return fecha;
    }
 
    public String getDiagnostico() {
        return diagnostico;
    }
 
    public String getTratamiento() {
        return tratamiento;
    }
 
    @Override
    public String toString() {
        return "Fecha: " + fecha + " | Diagnostico: " + diagnostico
                + " | Tratamiento: " + tratamiento;
    }
}