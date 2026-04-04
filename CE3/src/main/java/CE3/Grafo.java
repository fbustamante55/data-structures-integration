/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CE3;

/**
 *
 * @author Fabia
 */

public class Grafo {
    private NodoGrafo[] nodos;
    private String[][] matriz;
    private int numNodos;
    
    public Grafo(int maxNodos) {
        nodos = new NodoGrafo[maxNodos];
        matriz = new String[maxNodos][maxNodos];
        numNodos = 0;
        // Inicializamos la matriz con "-"
        for (int i = 0; i < maxNodos; i++) {
            for (int j = 0; j < maxNodos; j++) {
                matriz[i][j] = "-";
            }
        }
    }
    
    public void insertarNodo(String etapa, String rol) {
        if(numNodos < nodos.length) {
            nodos[numNodos] = new NodoGrafo(etapa, rol);
            numNodos++;
        }
    }
    
    // Método para establecer la arista (relación) entre nodos, con la acción
    public void establecerArista(int origen, int destino, String accion) {
        if(origen < numNodos && destino < numNodos) {
            matriz[origen][destino] = accion;
        }
    }
    
    public void imprimirMatriz() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < numNodos; i++) {
            for (int j = 0; j < numNodos; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Método de recorrido para imprimir la información de cada nodo del grafo
    public void imprimirNodos() {
        System.out.println("Información de los nodos:");
        for (int i = 0; i < numNodos; i++) {
            System.out.println("Nodo " + i + ": " + nodos[i].toString());
        }
    }
}
