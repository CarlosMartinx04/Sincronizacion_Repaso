package EJ2_Reloj;

public class Reloj extends Thread{

    Contador c = new Contador(0,0,0);

    @Override
    public void run() {
        super.run();
        try {
            while (Usuario.activo){
                c.incrementar();
                System.out.println(c.getHora()+":"+c.getMinuto()+":"+c.getSegundo());
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
