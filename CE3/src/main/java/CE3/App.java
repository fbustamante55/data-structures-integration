/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CE3;

/**
 *
 * @author Fabia
 */

public class App {
    public static void main(String[] args) {
        // ----- ÁRBOL BINARIO -----
        
        System.out.println("------------ ARBOL BINARIO ------------");
        ArbolBinario arbol = new ArbolBinario();
        
        //50, 30, 80, 25, 17, 38, 65, 90, 78
        
        int[] valores = {50, 30, 80, 25, 17, 38, 65, 90, 78};
        for (int valor : valores) {
            arbol.insertar(valor);
        }
        System.out.print("Árbol (inorden): ");
        arbol.imprimir();
        
        
        // Prueba del método contiene:
        System.out.println("-------------------------------------------");
        
        int test1 = 17;
        int test2 = 63;
        if (arbol.contiene(test1)) {
            System.out.println("El " + test1 + " sí se encuentra en el árbol.");
        } else {
            System.out.println("El " + test1 + " no se encuentra en el árbol.");
        }
        if (arbol.contiene(test2)) {
            System.out.println("El " + test2 + " sí se encuentra en el árbol.");
        } else {
            System.out.println("El " + test2 + " no se encuentra en el árbol.");
        }
       
        
        // Prueba del método obtenerImpares:
        System.out.println("-------------------------------------------");
        int[] nodosImpares = arbol.obtenerImpares();
        System.out.print("Los nodos impares del árbol son: ");
        for (int i = 0; i < nodosImpares.length; i++) {
            System.out.print(nodosImpares[i]);
            if(i < nodosImpares.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        
        // -----  GRAFO MVP BPM -----
        System.out.println("----- PARTE 2: GRAFO MVP BPM -----");
        Grafo grafo = new Grafo(5);
        // Insertar nodos según el diagrama:
        grafo.insertarNodo("Inicio", "NA");
        grafo.insertarNodo("Recibir Documentos", "Técnico");
        grafo.insertarNodo("Analizar Solicitud", "Analista");
        grafo.insertarNodo("Avanzar Continuar", "Aprobar");
        grafo.insertarNodo("Solicitud", "Jefe");
        
        // Establecer aristas (grafo dirigido) con las acciones correspondientes:
        grafo.establecerArista(0, 1, "Recibir");
        grafo.establecerArista(1, 2, "Analizar");
        grafo.establecerArista(2, 3, "Avanzar");
        grafo.establecerArista(3, 4, "Continuar");
        
        // Imprimir la matriz de adyacencia y la información de los nodos:
        grafo.imprimirMatriz();
        grafo.imprimirNodos();
    }
}

