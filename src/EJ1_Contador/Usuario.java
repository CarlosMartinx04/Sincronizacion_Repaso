package EJ1_Contador;

import javax.swing.*;

public class Usuario extends Thread{

    Contador contador;

    public Usuario(String nombre, Contador contador_) {
        super();
        contador = contador_;
    }


    @Override
    public void run() {
        super.run();
        for(int i = 1; i<=1000; i++){
            contador.incrementar();
        }
    }
}
