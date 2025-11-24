package EJ1_Contador;

public class Contador extends Thread{
    int valor;

    public synchronized void incrementar(){
        valor++;
    }

    public synchronized int getValor(){
        return valor;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            try {
                incrementar();
                System.out.println("");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
