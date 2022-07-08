package libreria;

import java.util.Scanner;

public class Entrada {

    public static String entradaCadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String cadena = sc.nextLine();
        return cadena;
    }

    public static int entradaNumeroEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String er = "[0-9]+";
        String sNumeroEntero;
        int iNumeroEntero;
        boolean correcto;
        do {
            System.out.print(mensaje);
            sNumeroEntero = sc.next();
            correcto = sNumeroEntero.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        iNumeroEntero = Integer.parseInt(sNumeroEntero);
        return iNumeroEntero;
    }

}
