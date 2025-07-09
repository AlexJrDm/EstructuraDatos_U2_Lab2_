package main;

import Grafo.GrafoMatriz_Robinzon;
import java.util.Scanner;

public class MainMatriz_Robinzon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GrafoMatriz_Robinzon grafo = new GrafoMatriz_Robinzon(10);

        System.out.println("Ingrese nombres de vertices:");
        while (true) {
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) break;
            grafo.nuevoVertice(nombre);
        }
        System.out.println("Matriz");
        System.out.println("Ingrese pares de vértices para crear arcos:");
        while (true) {
            String linea = sc.nextLine();
            if (linea.equalsIgnoreCase("fin")) break;
            String[] partes = linea.split(" ");
            if (partes.length == 2) {
                grafo.nuevoArco(partes[0], partes[1]);
            }
        }

        System.out.println("Matriz de adyacencia:");
        grafo.mostrarMatriz();
        sc.close();
    }
}
