package EJ2_Reloj;

import EJ1_Contador.Contador;

public class Main {

    public static void main(String[] args){

        Reloj r = new Reloj();
        Usuario u1 = new Usuario(r);
        r.start();
        u1.start();

    }

}
