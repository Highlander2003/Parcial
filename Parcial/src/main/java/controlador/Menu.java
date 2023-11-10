package controlador;

import java.util.Scanner;
import modelo.*;


public class Menu {
    
    private static Pais[] paises;
    private static Departamento[] departamentos;
    private static Municipio[] municipios;
    private static Continente[] continentes;
    
    private Scanner scanner;
    private Consultar consultar;
    private Crear crear;
    private Eliminar eliminar;
    private Actualizar actualizar;

    public Menu() {
        scanner = new Scanner(System.in);
        consultar = new Consultar();
        crear = new Crear();
        eliminar = new Eliminar();
        actualizar = new Actualizar();    
    }
    public void menuPrinciapl(){
        Scanner Tc = new Scanner(System.in);

        // Inicializar los arreglos
        continentes = new Continente[3];          //LONGITUD DEFINE LA CANTIDAD DE CONTINENTES EN ESTE CASO 3
        paises = new Pais[4];                     // LOGITUD DEFINE LA CANTIDA EN ESTE CASO 4
        departamentos = new Departamento[2];      // LOGITUD DEFINE LA CANTIDAD DE DEPARTAMENTO EN ESTE CASO 2
        municipios = new Municipio[3];            //LONGITUD DEFINE LA CANTIDAD DE MUNICIOPIO EN ESTE CASO 3

        System.out.println("\n«♂ S441B Parcial☼3Corte ♀»");

        int opcion;
        
            System.out.println("\n▼-------- Menú Principal --------▲\n");
            System.out.println("• Digite 1 para Gestionar Continentes");
            System.out.println("• Digite 2 para Gestionar Paises");
            System.out.println("• Digite 3 para Gestionar Departamentos");
            System.out.println("• Digite 4 para Gestionar Municipios");
            System.out.println("• Digite 5 para Salir");

            System.out.print("\n ► ☼ Ingrese su opción: ");
            opcion = Tc.nextInt();
            System.out.println("\n-------↨ Cargando ↨-------\n");

            switch (opcion) {
                case 1:
                    System.out.println("► Ha seleccionado Gestionar Continentes");
                    menu.gestionarContinentes(continentes);
                    break;

                case 2:
                    System.out.println("► Ha seleccionado Gestionar Paises");
                    menu.gestionarPaises(paises);
                    break;

                case 3:
                    System.out.println("► Ha seleccionado Gestionar Departamentos");
                    menu.gestionarDepartamentos(departamentos);
                    break;

                case 4:
                    System.out.println("► Ha seleccionado Gestionar Municipios");
                    menu.gestionarMunicipios(municipios);
                    break;

                case 5:
                    System.out.println(" ♂ HASTA LA PROXIMAAAAAAAAAAAAAAAAAAAAAAA GOODBYE");
                    System.exit(opcion);
                default:
                    System.out.println(" ☺ Solo numeros entre 1 y 5 ingrese una opcion nuevamente ☻");

            }
        
    }
    public void gestionarContinentes(Continente[] continentes) {
        int opcion;
        do {
            System.out.println("Menú de Gestión de Continentes");
            System.out.println("1. Crear Continente");
            System.out.println("2. Consultar Continentes");
            System.out.println("3. Actualizar Continente");
            System.out.println("4. Eliminar Continente");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crear.crearContinente(continentes);
                    break;
                case 2:
                    consultar.consultarContinentes(continentes);
                    break;
                case 3:
                    actualizar.actualizarContinente(continentes);
                    break;
                case 4:
                    eliminar.eliminarContinente(continentes);
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

    }
    
    public void gestionarPaises(Pais[] paises) {
        int opcion;
        do {
            System.out.println("Menú de Gestión de Paises");
            System.out.println("1. Crear Pais");
            System.out.println("2. Consultar Paises");
            System.out.println("3. Actualizar Pais");
            System.out.println("4. Eliminar Pais");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crear.crearPaises(paises);
                    break;
                case 2:
                    consultar.consultarPaises(paises);
                    break;
                case 3:
                    actualizar.actualizarPaises(paises);
                    break;
                case 4:
                    eliminar.eliminarPaises(paises);
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }
    
    public void gestionarDepartamentos(Departamento[] departamentos) {
        int opcion;
        do {
            System.out.println("Menú de Gestión de Departamentos");
            System.out.println("1. Crear Departamento");
            System.out.println("2. Consultar Departamentos");
            System.out.println("3. Actualizar Departamento");
            System.out.println("4. Eliminar Departamento");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crear.crearDepartamento(departamentos);
                    break;
                case 2:
                    consultar.consultarDepartamento(departamentos);
                    break;
                case 3:
                    actualizar.actualizarDepartamento(departamentos);
                    break;
                case 4:
                    eliminar.eliminarDepartamento(departamentos);
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }
    
    public void gestionarMunicipios(Municipio[] municipios) {
        int opcion;
        do {
            System.out.println("Menú de Gestión de Municipios");
            System.out.println("1. Crear Municipio");
            System.out.println("2. Consultar Municipios");
            System.out.println("3. Actualizar Municipio");
            System.out.println("4. Eliminar Municipio");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crear.crearMunicipios(municipios);
                    break;
                case 2:
                    consultar.consultarMunicipios(municipios);
                    break;
                case 3:
                    actualizar.actualizarMunicipios(municipios);
                    break;
                case 4:
                    eliminar.eliminarMunicipios(municipios);
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }
      
}
