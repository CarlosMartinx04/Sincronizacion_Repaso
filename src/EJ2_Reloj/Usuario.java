package EJ2_Reloj;

import java.util.Scanner;

public class Usuario extends Thread{
    Scanner sc = new Scanner(System.in);
    static boolean activo=true;
    String palabra = "";

    Reloj r;

    public Usuario( Reloj r) {
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        while (!palabra.equals("parar")){
            palabra=sc.nextLine();
            if(palabra.equals("parar")){
                activo=false;
            }
        }
    }
}
