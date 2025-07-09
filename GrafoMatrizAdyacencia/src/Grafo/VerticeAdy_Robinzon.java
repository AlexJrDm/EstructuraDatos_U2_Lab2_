package Grafo;

import java.util.LinkedList;

public class VerticeAdy_Robinzon {
    private String nombre;
    private int numVertice;
    public LinkedList<Arco_Robinzon> lad;

    public VerticeAdy_Robinzon(String nombre) {
        this.nombre = nombre;
        this.numVertice = -1;
        this.lad = new LinkedList<>();
    }

    public String nomVertice() {
        return nombre;
    }

    public void asigVert(int n) {
        this.numVertice = n;
    }

    public int getNumVertice() {
        return numVertice;
    }
}
