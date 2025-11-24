package EJ3_Pedidos;

import java.awt.event.PaintEvent;
import java.util.ArrayList;

public class ColaPedidos extends Thread {

    ArrayList<String> pedidos = new ArrayList<>();

    public synchronized void generarPedido() throws InterruptedException {
        for(int i = 0; i < 5; i++){
            pedidos.add("Pedido "+(i+1));
            System.out.println(pedidos.get(i) +" ha sido agregado");
            notifyAll();
        }
    }

    public synchronized void consumirPedido() throws InterruptedException {



    }

    @Override
    public void run() {
        super.run();
        while(pedidos.size()<=5){
            try {
                generarPedido();
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
