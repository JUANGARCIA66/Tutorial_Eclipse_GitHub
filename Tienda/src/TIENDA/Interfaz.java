package TIENDA;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Interfaz {

    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";
    
    public static void refrescar() {
    	
    	
    	try {
    		TimeUnit.SECONDS.sleep(1);
    	}catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    	
    	for(int i = 0; i<50;i++) {
    		System.out.println("");
    	}
    }

    public static void main(String[] args) {

        boolean menu = true;

        do {

            System.out.println("MENU: \n "+ CYAN +"1.Agregar un producto \n 2.Ver el inventario de los productos\n 3.Comprar un producto\n 4.Vender un producto\n 5.Valor Absoluto del inventario y distintos productos\n 6.Salir"+ RESET);
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();

            switch (m) {

            case 1:
            	
            	break;

            case 2:

                break;
            case 3:

                break;
           
            case 4:

                break;
            
            case 5:
            	
                break;
            
            case 6:
                menu = false;
                break;

            default:

                System.err.println("Valor no valido, vuelve a introducir un valor del menu.");
                continue;
            }
            if(!Seguir.continuar()){
            menu = false;
            }
   

        }while(menu);

        System.out.println(RED + "Sistema apagado");

    }

}