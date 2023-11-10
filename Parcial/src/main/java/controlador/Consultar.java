package controlador;

import modelo.*;

public class Consultar {
    
    public void consultarContinentes(Continente[] continentes) {
        System.out.println("» Continentes disponibles : ");
        for (int i = 0; i < continentes.length; i++) {
            if (continentes[i] != null) {
                System.out.println((i + 1) + ". " + continentes[i].getNombre());
            }
        }
    }
    
    public void consultarPaises(Pais[] paises) {
        System.out.println("» Paises disponibles : ");
        for (int i = 0; i < paises.length; i++) {
            if (paises[i] != null) {
                System.out.println((i + 1) + ". " + paises[i].getNombre());
            }
        }
    }
    
    public void consultarDepartamento(Departamento[] departamentos) {
        System.out.println("» Departamentos disponibles : ");
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] != null) {
                System.out.println((i + 1) + ". " + departamentos[i].getNombre());
            }
        }
    }
    
    public void consultarMunicipios(Municipio[] municipios) {
        System.out.println("» Municipios disponibles : ");
        for (int i = 0; i < municipios.length; i++) {
            if (municipios[i] != null) {
                System.out.println((i + 1) + ". " + municipios[i].getNombre());
            }
        }
    }
    
}
