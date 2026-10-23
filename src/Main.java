import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner intTastiera = new Scanner(System.in);
        System.out.println("INSERISCI IL NUMERO BATTITI: ");
        int nBattiti = intTastiera.nextInt();

        Drago Paolo = new Drago("Paolo" , nBattiti );

        Paolo.run();
        for(int i = 0; i <=5; i++){
            System.out.println("sta succendendo qualcosa");
        }
        }
    }
