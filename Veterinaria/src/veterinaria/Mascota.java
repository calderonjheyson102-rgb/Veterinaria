/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author JHEY
 */
public class Mascota {
    private int id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private double peso;
    private String sexo;
    private Cliente duenio;
    
    private final HistorialClinico historial = new HistorialClinico();

    public Mascota(int id_mascota, String nombre, String especie,
        String raza, double peso, String sexo, Cliente duenio) {

        setId_mascota(id_mascota);
        setNombre(nombre);
        setEspecie(especie);
        setRaza(raza);
        setPeso(peso);
        setSexo(sexo);
        setDuenio(duenio);
    }
    

    public Mascota() {
    }
    
    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        if (id_mascota > 0) {
            this.id_mascota = id_mascota;
        } else {
            throw new IllegalArgumentException("Error: El ID debe ser mayor que cero.");
        }
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.trim().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,}")) {
            this.nombre = nombre.trim();
        } else {
            throw new IllegalArgumentException("Error: El nombre debe contener al menos 2 letras.");
        }
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie != null && especie.trim().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{3,}")) {
            this.especie = especie.trim();
        } else {
            throw new IllegalArgumentException("Error: Ingrese una especie valida. EJ (PERRO, GATO) ");
        }
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza != null && !raza.trim().isEmpty()) {
            this.raza = raza.trim();
        } else {
            throw new IllegalArgumentException("Error: La raza no puede estar vacia.");
        }
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (Double.isFinite(peso) && peso > 0 && peso <= 155) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("Error: El peso debe ser mayor que cero y no superar los 155 kg.");
        }
    }
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo != null && (
                sexo.equalsIgnoreCase("Macho")
                || sexo.equalsIgnoreCase("Hembra"))) {
            this.sexo = sexo;
        } else {
            throw new IllegalArgumentException("Error: El sexo debe ser Macho o Hembra.");
        }
    }
    public Cliente getDuenio() {
        return duenio;
    }

    public void setDuenio(Cliente duenio) {
        if (duenio != null) {
            this.duenio = duenio;
        } else {
            throw new IllegalArgumentException("Error: La mascota debe tener un dueño.");
        }
    }
    public void agregarRegistroClinico(String diagnostico, String tratamiento) {
        historial.agregarRegistro(diagnostico, tratamiento);
    }
 
    public HistorialClinico getHistorial() {
        return historial;
    }
    @Override
    public String toString() {
        return "ID: " + id_mascota
                + " | Nombre: " + nombre
                + " | Especie: " + especie
                + " | Raza: " + raza
                + " | Peso: " + peso + " kg"
                + " | Sexo: " + sexo
                + " | Dueño: " + duenio.getNombre()
                + " " + duenio.getPaterno()
                + " | DNI: " + duenio.getNro_documento();
    }
    public void verDatos() {
        System.out.println(this);
        System.out.println("   Historial clinico (" + historial.cantidad() + " registros):");
        historial.mostrar();
    }      
}
