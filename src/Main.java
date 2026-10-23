import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner intTastiera = new Scanner(System.in);
        System.out.println("INSERISCI IL NUMERO BATTITI: ");
        int nBattiti = intTastiera.nextInt();
        Cacciatore Mariangela = new Cacciatore("Mariangela");

        Thread drago1 = new Thread(new Drago("Paolo" , nBattiti ));

        drago1.start();
        Mariangela.colpisciDrago(drago1);
        for(int i = 0; i <=5; i++){
            System.out.println("sta succendendo qualcosa" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrotto" + e);
            }
        }
        }
    }
