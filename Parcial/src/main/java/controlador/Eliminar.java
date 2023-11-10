package controlador;

import java.util.Scanner;
import modelo.*;

public class Eliminar {
    
    private Scanner scanner;

    public Eliminar() {
        scanner = new Scanner(System.in);
    }
    
    public void eliminarContinente(Continente[] continentes) {
        System.out.print("Ingrese el número del continente que desea eliminar: ");
        int numeroContinente = scanner.nextInt();

        if (numeroContinente >= 1 && numeroContinente <= continentes.length) {
            // El usuario ingresó un número de continente válido
            int indiceContinente = numeroContinente - 1; // Ajustar el índice

            // Marca el continente como eliminado
            continentes[indiceContinente] = null;
            System.out.println("Continente eliminado exitosamente.");
        } else {
            System.out.println("Número de continente no válido. Por favor, intente de nuevo.");
        }
    }
    
    public void eliminarPaises(Pais[] paises) {
        System.out.print("Ingrese el número del país que desea eliminar: ");
        int numeroPais = scanner.nextInt();

        if (numeroPais >= 1 && numeroPais <= paises.length) {
            int indicePais = numeroPais - 1; // Ajustar el índice

            paises[indicePais] = null; // Establece la instancia en null para eliminarla del arreglo
            System.out.println("País eliminado exitosamente.");
        } else {
            System.out.println("Número de país no válido. Por favor, intente de nuevo.");
        }
    }
    
    public void eliminarDepartamento(Departamento[] departamentos) {
        System.out.print("Ingrese el número del departamento que desea eliminar: ");
        int numeroDepartamento = scanner.nextInt();

        if (numeroDepartamento >= 1 && numeroDepartamento <= departamentos.length) {
            int indiceDepartamento = numeroDepartamento - 1; // Ajustar el índice

            departamentos[indiceDepartamento] = null; // Establece la instancia en null para eliminarla del arreglo
            System.out.println("Departamento eliminado exitosamente.");
        } else {
            System.out.println("Número de departamento no válido. Por favor, intente de nuevo.");
        }
    }
    
    public void eliminarMunicipios(Municipio[] municipios) {
        System.out.print("Ingrese el número del municipio que desea eliminar: ");
    int numeroMunicipio = scanner.nextInt();

    if (numeroMunicipio >= 1 && numeroMunicipio <= municipios.length) {
        int indiceMunicipio = numeroMunicipio - 1; // Ajustar el índice

        municipios[indiceMunicipio] = null; // Establece la instancia en null para eliminarla del arreglo
        System.out.println("Municipio eliminado exitosamente.");
    } else {
        System.out.println("Número de municipio no válido. Por favor, intente de nuevo.");
    }
    }
}
