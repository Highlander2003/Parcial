/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LUIS UNIAJC
 */
public class Municipio {
    private String nombre;
    private Municipio[] municipio;
    
    public Municipio(String nombre, int numMunicipios) {
        municipio = new Municipio[numMunicipios];
        for (int i = 0; i < numMunicipios; i++) {
            municipio[i] = new Municipio("Municipio " + (i + 1));
        }
    }

    public Municipio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}