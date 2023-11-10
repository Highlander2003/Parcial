package Controlador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian_Garay
 */
public class Matriz {

    public static Scanner teclado = new Scanner(System.in);
    public static Scanner letras = new Scanner(System.in);
    public static int x = 0, y = 0, z = 0, j = 0, k = 0;
    public static String sParametro = "", sResultante = "", sResultante1 = "";
    public static ArrayList<String> sCabecera = new ArrayList<>();
    public static ArrayList<String> sDatos = new ArrayList<>();
    public static String[][] sContinentes;
    public static String[][] sPais;
    public static String[][] sDepartamento;
    public static String[][] sMunicipio;

    public void PedirArray() {
        do {
            System.out.println("Digite el parametro #" + x);
            sParametro = letras.nextLine();
            sCabecera.add(sParametro);
            x++;
            System.out.println("Desea ingresar otro parametro Si <1> o No <2>");
            do {
                j = teclado.nextInt();
                if (j < 1 || j > 2) {
                    System.out.println("Error 401. :(");
                }
                else {
                break;
                }
            } while (j != 1 );
        } while (j != 2); 
    }
    
    public void ContarArray(){
         k = sCabecera.size();
         System.out.println("Número de columnas #" + k);
         
    }
    
    public void LlenarArray (){
        do {
            for (int i = 0; i < sCabecera.size(); i++) {
                System.out.println("Parametro # " + i + ": " + sCabecera.get(i));
                sParametro = letras.nextLine();
                sDatos.add(sParametro);
            }
            y++;
            System.out.println("Desea ingresar otra fila Si <1> o No <2>");
            do {
                j = teclado.nextInt();
                if (j < 1 || j > 2) {
                    System.out.println("Error 402. :(");
                }
                else {
                break;
                }
            } while (j != 1 );
        } while (j != 2); 
    }
    
    public void RepartirArray (){
        for (int i = 0; i < sDatos.size(); i++) {
            System.out.println("["+i+"]"+sDatos.get(i));
        }
        sContinentes = new String[y][2];
        for (int i = 0; i < y; i++) {
            for (int l = 0; l < sDatos.size(); l++) {
                sResultante1 = sDatos.get(l);
                
                switch(l){
                    case 0:
                        sContinentes [i][l] = sResultante1;
                    case 1:
                        sContinentes [i][l] = sResultante1;
                }
            }
            
        }
        
        for (int i = 0; i < sContinentes.length; i++) {
            for (int l = 0; l < sContinentes[i].length; l++) {
                System.out.println("["+i+"]"+"["+l+"]"+sContinentes[i][l]);
            }
        }
    }
}
