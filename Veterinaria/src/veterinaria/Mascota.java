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
            System.out.println("Error: El ID debe ser mayor que cero.");
        }
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.trim().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,}")) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("Error: El nombre debe contener al menos 2 letras.");
        }
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie != null && especie.trim().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{3,}")) {
            this.especie = especie.trim();
        } else {
            System.out.println("Error: Ingrese una especie valida. EJ (PERRO, GATO) ");
        }
    }
}
