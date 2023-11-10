/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LUIS UNIAJC
 */
public class Pais {
    private String nombre;
    private Departamento[] departamentos;

    public Pais(String nombre, int numDepartamentos, int numMunicipios) {
        this.nombre = nombre;
        departamentos = new Departamento[numDepartamentos];
        for (int i = 0; i < numDepartamentos; i++) {
            departamentos[i] = new Departamento("Departamento " + (i + 1), numMunicipios);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }
    
}
