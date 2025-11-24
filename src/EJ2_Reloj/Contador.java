package EJ2_Reloj;

public class Contador {

    int hora, minuto, segundo;

    public Contador(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void incrementar(){
        segundo++;
        if(segundo==60){
            segundo=0;
            minuto++;
            if (minuto==60){
                hora++;
                minuto=0;
                if(hora==24){
                    hora=0;
                }
            }
        }
    }


    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
}
