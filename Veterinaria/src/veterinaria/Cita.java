
package veterinaria;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Anderson
 */
public class Cita {
    private int id_cita;
    private String motivo;
    private String estado;
    private Mascota mascota;
    private Personal personal;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(String id_cita, String motivo, String estado,
        Mascota mascota, Personal personal,
        LocalDate fecha, LocalTime hora) {

        setId_cita(id_cita);
        setMotivo(motivo);
        setEstado(estado);
        setMascota(mascota);
        setPersonal(personal);
        setFecha(fecha);
        setHora(hora);
}


    public Cita(){
        
    }
    public Cita(int id_cita) {
        this.id_cita = id_cita;
    }
    public void setId_cita(int id_cita) {
        if (id_cita > 0){
            this.id_cita = id_cita;
        }else{
            System.out.println("ERROR: EL id-cita DEBE SER MAYOR QUE CERO");
        }
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        if(motivo != null && motivo.length() >= 5){
            this.motivo = motivo;
        }else{
            System.out.println("Error: El motivo debe de tener c5 caracteres ");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && (
            estado.equalsIgnoreCase("Pendiente")
            || estado.equalsIgnoreCase("Atendida")
            || estado.equalsIgnoreCase("Cancelada"))) {
            this.estado = estado;
        } else {
            System.out.println("Error: El estado debe ser Pendiente, Atendida o Cancelada.");
        }
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        if(mascota != null){
            this.mascota = mascota;
        }else{
            System.out.println("Error: Debe de asignar una mascota a la cita");
        }
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        if(personal != null){
            this.personal = personal;
        }else{
            System.out.println("Error: Debe de asignar un responsable a la cita");
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        if (fecha != null && !fecha.isBefore(LocalDate.now())) {
            this.fecha = fecha;
        } else {
            System.out.println("Error: La fecha de la cita no puede ser anterior a hoy.");
        }
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        if (hora != null) {
            this.hora = hora;
        } else {
            System.out.println("Error: Debe ingresar una hora válida.");
        }
    }

    @Override
    public String toString() {
        return "ID Cita: " + id_cita
            + "\nMotivo: " + motivo
            + "\nEstado: " + estado
            + "\nFecha: " + fecha
            + "\nHora: " + hora
            + "\nMascota: " + mascota
            + "\nPersonal: " + personal;
    }

    int getId_cita() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
