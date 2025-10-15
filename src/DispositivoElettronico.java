public class DispositivoElettronico {

    private String marca, modello;
    private int annoProd;

    public DispositivoElettronico(String marca, String modello, int annoProd){
        this.marca=marca;
        this.modello=modello;
        this.annoProd=annoProd;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnnoProd() {
        return annoProd;
    }

    public void setAnnoProd(int annoProd) {
        this.annoProd = annoProd;
    }
    public String toString(){
        return "marca: "+marca+"\n"+"modello: "+modello+"\n"+"Anno Produzione: "+annoProd+"\n";

    }

}
