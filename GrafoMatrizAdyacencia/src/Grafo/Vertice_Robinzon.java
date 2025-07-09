package Grafo;

public class Vertice_Robinzon {
    private String nombre;
    private int numVertice;

    public Vertice_Robinzon(String nombre) {
        this.nombre = nombre;
        this.numVertice = -1;
    }

    public String nomVertice() {
        return nombre;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Vertice_Robinzon) {
            Vertice_Robinzon v = (Vertice_Robinzon) obj;
            return nombre.equals(v.nombre);
        }
        return false;
    }

    public void asigVert(int n) {
        this.numVertice = n;
    }

    public int getNumVertice() {
        return numVertice;
    }
}
