package veterinaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author JHEY
 */
public class HistorialClinico {
    private final ArrayList<RegistroClinico> registros = new ArrayList<>();
 
    // package-private: solo Mascota puede crear un historial
    HistorialClinico() {
    }
 
    // El registro se crea AQUÍ dentro, no llega desde afuera.
    void agregarRegistro(String diagnostico, String tratamiento) {
        registros.add(new RegistroClinico(diagnostico, tratamiento));
    }
 
    public List<RegistroClinico> getRegistros() {
        return Collections.unmodifiableList(registros);
    }
 
    public int cantidad() {
        return registros.size();
    }
 
    public void mostrar() {
        if (registros.isEmpty()) {
            System.out.println("   (sin registros clinicos)");
            return;
        }
        for (RegistroClinico r : registros) {
            System.out.println("   - " + r);
        }
    }
}
    