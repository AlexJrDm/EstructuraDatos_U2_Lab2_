package Grafo;

public class Arco_Robinzon {
    public int destino;
    public int peso;

    public Arco_Robinzon(int destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public Arco_Robinzon(int destino) {
        this(destino, 1);
    }
}
