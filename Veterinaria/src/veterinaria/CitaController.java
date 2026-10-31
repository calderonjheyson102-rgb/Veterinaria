/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author Jherson
 */
public class CitaController {
    private ArrayList<Cita> citas;

    public CitaController() {
        citas = new ArrayList<>();
    }
    
    //Validar citas 
    public boolean validarId(int id) {

        if (id <= 0) {
            throw new IllegalArgumentException(
                "El ID de la cita debe ser mayor que cero."
            );
        }

        if (buscarPorId(id) != null) {
            throw new IllegalArgumentException(
                "ALERTA: EL ID DE CITA " + id + " YA EXISTE. INGRESE OTRO."
            );
        }

        return true;
    }

    // Registrar cita
    public void registrarCita(Cita cita) {

        if (cita == null) {
            throw new IllegalArgumentException("Cita inválida");
        }

        validarId(cita.getId_cita());

        citas.add(cita);

        System.out.println("Cita registrada correctamente");
    }   
    // Buscar cita
    public Cita buscarPorId(int id) {

        for (Cita c : citas) {
            if (c.getId_cita() == id) {
                return c;
            }
        }

        return null;
    }

    // Cambiar estado de cita
    public void cambiarEstado(int id, String nuevoEstado) {

        Cita cita = buscarPorId(id);

        if (cita != null) {
            cita.setEstado(nuevoEstado);
            System.out.println("Estado actualizado correctamente");
        } else {
            System.out.println("Cita no encontrada");
        }
    }
    
    // Listar citas
    public void listarCitas() {

        if (citas.isEmpty()) {
            System.out.println("No existen citas registradas");
            return;
        }

        for (Cita c : citas) {
            System.out.println(c);
        }
    }   
}
    
    
