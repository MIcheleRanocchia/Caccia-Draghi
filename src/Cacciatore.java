public class Cacciatore {
    private String nome;


    public Cacciatore(String nome) {
        this.nome = nome;
    }


    public void colpisciDrago(Thread d){

        for(int i = 0; i <=50; i++){
            System.out.println("Il cacciatore: " + nome + " sta lanciando il dardo= " + i);
            d.interrupt();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
