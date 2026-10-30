/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author JHEY
 */
public class MascotaController {
    private ArrayList<Mascota> mascotas;
    
    public MascotaController() {
        mascotas = new ArrayList<>();
    }
    public boolean existeId(int id) {
        for (Mascota m : mascotas) {
            if (m.getId_mascota() == id) {
                return true;
            }
        }
        return false;
    }
    // Registrar mascota
    public void registrarMascota(Mascota mascota) {

        if (mascota == null) {
            throw new IllegalArgumentException("Mascota inválida");
        }

        if (existeId(mascota.getId_mascota())) {
            throw new IllegalArgumentException("ALERTA: El ID de mascota ya existe.");
        }
        mascotas.add(mascota);
        System.out.println("Mascota registrada correctamente");
    }
    
    public boolean validarId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor que cero.");
        }

        if (buscarPorId(id) != null) {
            throw new IllegalArgumentException(
                "ALERTA: EL ID " + id + " YA EXISTE. INGRESE OTRO ID."
            );
        }

        return true;
    }
    
    
}
