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
    
    
    public boolean validarId(int id) {

        if (id <= 0) {
            throw new IllegalArgumentException(
                "El ID de la cita debe ser mayor que cero."
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
}
    
    
