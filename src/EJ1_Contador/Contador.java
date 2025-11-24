package EJ1_Contador;

public class Contador extends Thread{
    int valor;

    public synchronized void incrementar(){
        valor++;
    }

    public synchronized int getValor() {
        return valor;
    }
}