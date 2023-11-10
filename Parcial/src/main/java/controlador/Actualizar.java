package controlador;

import java.util.Scanner;
import modelo.*;


public class Actualizar {
    
    private Scanner scanner;

    public Actualizar() {
        scanner = new Scanner(System.in);
    }
    
    public void actualizarContinente(Continente[] continentes) {
        System.out.print("Ingrese el número del continente que desea actualizar: ");
        int numeroContinente = scanner.nextInt();

        if (numeroContinente >= 1 && numeroContinente <= continentes.length) {
            // El usuario ingresó un número de continente válido
            int indiceContinente = numeroContinente - 1; // Ajustar el índice

            System.out.print("Ingrese el nuevo nombre del continente: ");
            String nuevoNombre = scanner.next();

            continentes[indiceContinente].setNombre(nuevoNombre);
            System.out.println("Continente actualizado exitosamente.");
        } else {
            System.out.println("Número de continente no válido. Por favor, intente de nuevo.");
        }
    }
    
    public void actualizarPaises(Pais[] paises) {
        System.out.print("Ingrese el número del país que desea actualizar: ");
        int numeroPais = scanner.nextInt();

        if (numeroPais >= 1 && numeroPais <= paises.length) {
            int indicePais = numeroPais - 1; // Ajustar el índice

            System.out.print("Ingrese el nuevo nombre del país: ");
            String nuevoNombre = scanner.next();

            paises[indicePais].setNombre(nuevoNombre);
            System.out.println("País actualizado exitosamente.");
        } else {
            System.out.println("Número de país no válido. Por favor, intente de nuevo.");
        }
    }
    
    public void actualizarDepartamento(Departamento[] departamentos) {
        System.out.print("Ingrese el número del departamento que desea actualizar: ");
        int numeroDepartamento = scanner.nextInt();

        if (numeroDepartamento >= 1 && numeroDepartamento <= departamentos.length) {
            int indiceDepartamento = numeroDepartamento - 1; // Ajustar el índice

            System.out.print("Ingrese el nuevo nombre del departamento: ");
            String nuevoNombre = scanner.next();

            departamentos[indiceDepartamento].setNombre(nuevoNombre);
            System.out.println("Departamento actualizado exitosamente.");
        } else {
            System.out.println("Número de departamento no válido. Por favor, intente de nuevo.");
        }
    }
    
    public void actualizarMunicipios(Municipio[] municipios) {
        System.out.print("Ingrese el número del municipio que desea actualizar: ");
    int numeroMunicipio = scanner.nextInt();

    if (numeroMunicipio >= 1 && numeroMunicipio <= municipios.length) {
        int indiceMunicipio = numeroMunicipio - 1; // Ajustar el índice

        System.out.print("Ingrese el nuevo nombre del municipio: ");
        String nuevoNombre = scanner.next();

        municipios[indiceMunicipio].setNombre(nuevoNombre);
        System.out.println("Municipio actualizado exitosamente.");
    } else {
        System.out.println("Número de municipio no válido. Por favor, intente de nuevo.");
    }
    }
    
}
