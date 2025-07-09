package Grafo;

public class GrafoAdcia_Robinzon {
    private int maxVerts;
    private int numVerts;
    private VerticeAdy_Robinzon[] verts;

    public GrafoAdcia_Robinzon(int maxVerts) {
        this.maxVerts = maxVerts;
        this.numVerts = 0;
        this.verts = new VerticeAdy_Robinzon[maxVerts];
    }

    public void nuevoVertice(String nombre) {
        if (numVerts < maxVerts && numVertice(nombre) == -1) {
            verts[numVerts] = new VerticeAdy_Robinzon(nombre);
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

    public void nuevoArco(String a, String b, int peso) {
        int va = numVertice(a);
        int vb = numVertice(b);
        if (va != -1 && vb != -1) {
            verts[va].lad.add(new Arco_Robinzon(vb, peso));
        }
    }

    public void mostrarListas() {
        for (int i = 0; i < numVerts; i++) {
            System.out.print(verts[i].nomVertice() + " -> ");
            for (Arco_Robinzon arco : verts[i].lad) {
                System.out.print(verts[arco.destino].nomVertice() + "(" + arco.peso + ") ");
            }
            System.out.println();
        }
    }
}
