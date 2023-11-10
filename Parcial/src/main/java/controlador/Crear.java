package controlador;

import java.util.Scanner;
import modelo.*;


public class Crear {
    
    private Scanner scanner;

    public Crear() {
        scanner = new Scanner(System.in);
    }

    public void crearContinente(Continente[] continentes) {

        System.out.print("Ingrese el nombre del continente: ");
        String nombreContinente = scanner.next();

        // Encuentra un índice disponible para el nuevo continente
        int indiceDisponible = -1;
        for (int i = 0; i < continentes.length; i++) {
            if (continentes[i] == null) {
                indiceDisponible = i;
                break;
            }
        }

        if (indiceDisponible != -1) {
            continentes[indiceDisponible] = new Continente(0, 0, 0); // No se especifica el número de países, departamentos o municipios aquí.
            System.out.println("Continente creado exitosamente.");
        } else {
            System.out.println("No hay espacio disponible para crear un nuevo continente.");
        }
    }

    public void crearPaises(Pais[] paises) {

        System.out.print("Ingrese el nombre del país: ");
        String nombrePais = scanner.next();

        // Encuentra un índice disponible para el nuevo país
        int indiceDisponible = -1;
        for (int i = 0; i < paises.length; i++) {
            if (paises[i] == null) {
                indiceDisponible = i;
                break;
            }
        }

        if (indiceDisponible != -1) {
            paises[indiceDisponible] = new Pais(nombrePais, 0, 0); // No se especifica el número de departamentos o municipios aquí.
            System.out.println("País creado exitosamente.");
        } else {
            System.out.println("No hay espacio disponible para crear un nuevo país.");
        }
    }

    public void crearDepartamento(Departamento[] departamentos) {
        System.out.print("Ingrese el nombre del departamento: ");
        String nombreDepartamento = scanner.next();

        // Encuentra un índice disponible para el nuevo departamento
        int indiceDisponible = -1;
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] == null) {
                indiceDisponible = i;
                break;
            }
        }

        if (indiceDisponible != -1) {
            departamentos[indiceDisponible] = new Departamento(nombreDepartamento, 0); // No se especifica el número de municipios aquí.
            System.out.println("Departamento creado exitosamente.");
        } else {
            System.out.println("No hay espacio disponible para crear un nuevo departamento.");
        }
    }

    public void crearMunicipios(Municipio[] municipio) {
        System.out.print("Ingrese el nombre del municipio: ");
        String nombreMunicipio = scanner.next();

        // Encuentra un índice disponible para el nuevo municipio
        int indiceDisponible = -1;
        for (int i = 0; i < municipio.length; i++) {
            if (municipio[i] == null) {
                indiceDisponible = i;
                break;
            }
        }

        if (indiceDisponible != -1) {
            municipio[indiceDisponible] = new Municipio(nombreMunicipio);
            System.out.println("Municipio creado exitosamente.");
        } else {
            System.out.println("No hay espacio disponible para crear un nuevo municipio.");
        }
    }

}
