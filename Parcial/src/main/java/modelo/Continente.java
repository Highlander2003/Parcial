/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LUIS UNIAJC
 */
public class Continente {
    private String nombre;
    private Pais[] paises;

    public Continente(int numPaises, int numDepartamentos, int numMunicipios) {
        paises = new Pais[numPaises];
        for (int i = 0; i < numPaises; i++) {
            paises[i] = new Pais("Pais " + (i + 1), numDepartamentos, numMunicipios);
        }
    }

    public Continente(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public Pais[] getPaises() {
        return paises;
    }
}
