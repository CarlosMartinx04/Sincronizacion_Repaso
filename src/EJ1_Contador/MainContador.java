package EJ1_Contador;

public class MainContador {

    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        Usuario u1 = new Usuario("Carlos", contador);
        Usuario u2 = new Usuario("Sergio", contador);
        Usuario u3 = new Usuario("Guillermo", contador);
        u1.start();
        u2.start();
        u3.start();

        u1.join();
        u2.join();
        u3.join();

        System.out.println("Contador: "+contador.getValor());

    }

}
