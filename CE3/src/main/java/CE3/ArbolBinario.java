/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CE3;

/**
 *
 * @author Fabia
 */

public class ArbolBinario {

    private Nodo raiz;
    
    public ArbolBinario() {
        this.raiz = null;
    }
    
    // Inserta un nodo en el árbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }
    
    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if(valor < nodo.getValor()) {
            nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), valor));
        } else if(valor > nodo.getValor()){
            nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), valor));
        }
        return nodo;
    }
    
    // Recorrido inorden del árbol
    public void imprimir() {
        imprimirRecursivo(raiz);
        System.out.println();
    }
    
    private void imprimirRecursivo(Nodo nodo) {
        if(nodo != null) {
            imprimirRecursivo(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " ");
            imprimirRecursivo(nodo.getDerecha());
        }
    }
    
    // Método para verificar si el árbol contiene un valor dado
    public boolean contiene(int valor) {
        return contieneRecursivo(raiz, valor);
    }
    
    private boolean contieneRecursivo(Nodo nodo, int valor) {
        if(nodo == null) return false;
        if(nodo.getValor() == valor) return true;
        if(valor < nodo.getValor()) {
            return contieneRecursivo(nodo.getIzquierda(), valor);
        } else {
            return contieneRecursivo(nodo.getDerecha(), valor);
        }
    }
    
    // Método que retorna un arreglo con los nodos impares
    public int[] obtenerImpares() {
        int count = contarImpares(raiz);
        int[] impares = new int[count];
        int[] idx = new int[1]; // índice mutable para llenar el arreglo
        llenarImpares(raiz, impares, idx);
        return impares;
    }
    
    private int contarImpares(Nodo nodo) {
        if(nodo == null) return 0;
        int count = contarImpares(nodo.getIzquierda()) + contarImpares(nodo.getDerecha());
        if(nodo.getValor() % 2 != 0) count++;
        return count;
    }
    
    private void llenarImpares(Nodo nodo, int[] arr, int[] idx) {
        if(nodo != null) {
            llenarImpares(nodo.getIzquierda(), arr, idx);
            if(nodo.getValor() % 2 != 0) {
                arr[idx[0]] = nodo.getValor();
                idx[0]++;
            }
            llenarImpares(nodo.getDerecha(), arr, idx);
        }
    }
}
