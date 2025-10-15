public class Smartphone extends DispositivoElettronico{

    private int nSim;

    public Smartphone(String marca, String modello, int annoProd, int nSim){
        super(marca, modello, annoProd);
        this.nSim=nSim;
    }

    public int getnSim() {
        return nSim;
    }

    public void setnSim(int nSim) {
        this.nSim = nSim;
    }

    public String stampa(){
        return toString()+"Numero SIM: "+nSim;
    }

}
