package Grafo;

public class GrafoMatriz_Robinzon {
    private int maxVerts;
    int numVerts;
    Vertice_Robinzon[] verts;
    int[][] matAd;

    public GrafoMatriz_Robinzon(int maxVerts) {
        this.maxVerts = maxVerts;
        this.numVerts = 0;
        this.verts = new Vertice_Robinzon[maxVerts];
        this.matAd = new int[maxVerts][maxVerts];
        for (int i = 0; i < maxVerts; i++)
            for (int j = 0; j < maxVerts; j++)
                matAd[i][j] = 0;
    }

    public void nuevoVertice(String nombre) {
        if (numVerts < maxVerts && numVertice(nombre) == -1) {
            verts[numVerts] = new Vertice_Robinzon(nombre);
            verts[numVerts].asigVert(numVerts);
            numVerts++;
        }
    }

    public int numVertice(String nombre) {
        for (int i = 0; i < numVerts; i++)
            if (verts[i].nomVertice().equals(nombre))
                return i;
        return -1;
    }

    public void nuevoArco(String a, String b) {
        int va = numVertice(a);
        int vb = numVertice(b);
        if (va != -1 && vb != -1)
            matAd[va][vb] = 1;
    }

    public boolean adyacente(String a, String b) {
        int va = numVertice(a);
        int vb = numVertice(b);
        return (va != -1 && vb != -1) && (matAd[va][vb] == 1);
    }

    public void mostrarMatriz() {
        System.out.print("   ");
        for (int i = 0; i < numVerts; i++)
            System.out.print(verts[i].nomVertice() + " ");
        System.out.println();
        for (int i = 0; i < numVerts; i++) {
            System.out.print(verts[i].nomVertice() + " ");
            for (int j = 0; j < numVerts; j++) {
                System.out.print(" " + matAd[i][j] + " ");
            }
            System.out.println();
        }
    }
}
