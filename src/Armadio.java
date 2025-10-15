import java.util.Scanner;

public class Armadio {


    public Scanner sc = new Scanner(System.in);
    public static final int dimensione=10;
    private Smartphone smart[] = new Smartphone[dimensione];
    private int puntatore;


    public Armadio(int puntatore){
        puntatore=0;
    }

    public void pushSmart (String marca, String modello, int annoProd, int nSim){
        if (puntatore<dimensione){

            System.out.println("inserisci marca: ");
            marca=sc.next();
            System.out.println("inserisci modello: ");
            modello=sc.next();
            System.out.println("inserisci Anno di produzione: ");
            annoProd=sc.nextInt();
            System.out.println("inserisci Numero di SIM: ");
            nSim=sc.nextInt();

            smart[puntatore]=new Smartphone(smart[puntatore].getMarca(), smart[puntatore].getModello(), smart[puntatore].getAnnoProd(), smart[puntatore].getnSim());
            puntatore++;


        }else{
            System.out.println("Armadio Pieno");
        }
    }

    public int cercaSmart(String marca, String modello){
        for (int i = 0; i < smart.length; i++){
            if(smart[i] != null) {
                if (smart[i].getMarca().equals(marca) && smart[i].getModello().equals(modello)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
