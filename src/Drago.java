public class Drago implements Runnable {
    String nome;
    int nBattiti;

    public Drago(String nome, int nBattiti) {
        this.nome = nome;
        this.nBattiti = nBattiti;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            for (int i = 0; i < nBattiti; i++) {
                System.out.println(this.nome + " Vola per la: " + (i + 1) + " volta");
                System.out.println(this.nome + " Vola per la: " + (i + 1) + " volta");
                System.out.println(this.nome + " Vola per la: " + (i + 1) + " volta");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Sleep interrotto" + e);
                }
            }
        }
    }
}