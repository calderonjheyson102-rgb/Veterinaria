/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author cristofer
 */
public class PersonaController {
    private ArrayList<Persona> personas;

    public PersonaController() {
        personas = new ArrayList<>();
    }
    
    public boolean validarDocumento(String documento) {

        if (documento == null || documento.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El documento no puede estar vacío."
            );
        }

        if (buscarPorDocumento(documento.trim()) != null) {
            throw new IllegalArgumentException(
                "ALERTA: EL DOCUMENTO " + documento + " YA ESTÁ REGISTRADO."
            );
        }

        return true;
    }
    

    // Registrar persona
    public void registrarPersona(Persona persona) {

        if (persona == null) {
            throw new IllegalArgumentException("Persona inválida");
        }

        validarDocumento(persona.getNro_documento());

        personas.add(persona);

        System.out.println("Persona registrada correctamente");
    }

    // Buscar persona por documento
    public Persona buscarPorDocumento(String documento) {

        for (Persona p : personas) {
            if (p.getNro_documento().equals(documento)) {
                return p;
            }
        }

        return null;
    }

    // Listar personas
    public void listarPersonas() {

        if (personas.isEmpty()) {
            System.out.println("No existen personas registradas");
            return;
        }

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
    