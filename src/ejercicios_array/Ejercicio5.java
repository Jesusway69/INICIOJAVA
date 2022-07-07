package ejercicios_array;

import ejercicios.Entrada;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cantidadObreros = Entrada.entradaNumeroEntero("Cantidad Obreros? ");
       String[] nombre = new String[cantidadObreros];
       String[] fecha = new String[cantidadObreros];//12a07/2022
       int[] horas = new int[cantidadObreros];
       
       for(int i=0; i<cantidadObreros; i++) {
           System.out.println("Obrero " + (i+1) + ":");
           System.out.println("Ingrese nombre? ");
           nombre[i] = sc.next();
           System.out.println("Ingrese fecha? ");
           fecha[i] = sc.next();
           horas[i] = Entrada.entradaNumeroEntero("Ingrese horas? ");
           
       }
       
       
        
    }

}
