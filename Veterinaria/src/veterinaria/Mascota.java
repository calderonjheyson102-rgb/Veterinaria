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
}
