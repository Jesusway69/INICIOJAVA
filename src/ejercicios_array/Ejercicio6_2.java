package ejercicios_array;

import java.util.ArrayList;
import java.util.List;
import sql_alumno3.Entrada;

public class Ejercicio6_2 {

    public static void main(String[] args) {
        List<Ejercicio6_2_Clase> objetos_al = new ArrayList<>();
        
        int cantidadCalles = Entrada.entradaNumeroEntero("Ingrese cantidad calles? ");
        
        for(int i=0; i<cantidadCalles; i++) {
           String calle = Entrada.entradaCadena("Ingrese nombre calle? ");
           int portales = Entrada.entradaNumeroEntero("Ingrse cantidad portales? ");
           for(int j=0; j<portales; j++) {
               matrizCantidadPortales[i][j] = Entrada.entradaNumeroEntero("Ingrese cantidad habitantes del portal? ");
           }
           Ejercicio6_2_Clase objeto = new Ejercicio6_2_Clase();
           objeto.setCalle(calle);
           objeto.setPortales(portales);
           objeto.setHabitantes(habitantes);
           
       }
        
    }

}
