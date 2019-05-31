/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import java.util.Scanner;

/**
 *
 * @author INSPIRON
 */
public class ListaDeJugadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        String apellido;
        int goles = 0;
        int total_Goles = 0;
        double sueldo = 0;
        double promedio_Sueldo = 0;
        int c = 0;
        String valorUsuario = "";
        boolean bandera = true;
        String cadena = "";
        cadena = String.format("%s%s\n", cadena, 
                "\n\n-----------------------LISTADO JUGADORES"
                        + "----------------------\n");
        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\n", cadena, 
                "NOMBRE", "APELLIDO", "GOLES", "SUELDO");
     
        do{ 
            c= c+1;
            System.out.println("Ingrese sus nombres: ");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese sus apellidos: ");
            apellido = entrada.nextLine();
            
            System.out.println("Ingrese el número de goles: ");
            goles = entrada.nextInt();
            
            System.out.println("Ingrese el sueldo");
            sueldo = entrada.nextDouble();
            entrada.nextLine();
            
            System.out.println("¿Desea salir? ingrese 'si' "
                    + "en caso de que quiera salir, ingrese 'no' "
                    + "en caso de que quiera seguir.");
            valorUsuario = entrada.nextLine();
            
            cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%d\t\t\t\t%.2f\n", 
                    cadena, nombre, apellido, goles, sueldo);
            
            total_Goles = goles + total_Goles;
             promedio_Sueldo = sueldo + promedio_Sueldo;
           
            if (valorUsuario.equals ("si") || valorUsuario.equals ("Si") || 
                    valorUsuario.equals ("SI")){
                bandera = false;
            }
        }while (bandera == true) ;
        
        promedio_Sueldo = promedio_Sueldo / c;
        cadena = String.format("%s%s: %d\n%s: %.2f\n", cadena, 
                "Total Goles", total_Goles, "Promedio Sueldo", 
                promedio_Sueldo, "Goles");
        System.out.printf("%s", cadena);
    }
}