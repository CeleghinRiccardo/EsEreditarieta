public class Televisore extends DispositivoElettronico{

    private int nPol;

    public Televisore(String marca, String modello, int annoProd, int nPol){
        super(marca, modello, annoProd);
        this.nPol =nPol;
    }

    public int getnPol() {
        return nPol;
    }

    public void setnPol(int nPol) {
        this.nPol = nPol;
    }

    public String stampa(){
        return toString()+"Numero Pollici: "+nPol;
    }


}
