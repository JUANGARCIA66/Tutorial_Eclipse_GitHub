package TIENDA;

import java.util.Scanner;

public class Seguir {

    static Scanner sc = new Scanner(System.in);

    public static boolean continuar() {
    	
        if (validar().equals("y")) {
            return true;
        } else {
            return false;
        }

    }

    public static String validar() {
        System.out.println(Interfaz.GREEN+"Deseas continuar en este apartado? Presiona "+Interfaz.YELLOW+"'y'"+Interfaz.GREEN+" para quedarte o "+Interfaz.YELLOW+"'n'"+Interfaz.GREEN+" para salir"+Interfaz.RESET);
        String c = sc.next().toLowerCase();
        
        while (!(c.equals("y") || c.equals("n"))){

            System.err.println("Valor no valido, vuelve a introducirlo:");

            c = sc.next().toLowerCase();
        }
        return c;
    }
}