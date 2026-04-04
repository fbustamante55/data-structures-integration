/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CE3;

/**
 *
 * @author Fabia
 */

public class NodoGrafo {
    private String etapa;
    private String rol;
    
    public NodoGrafo(String etapa, String rol) {
        this.etapa = etapa;
        this.rol = rol;
    }
    
    public String getEtapa() {
        return etapa;
    }
    
    public String getRol() {
        return rol;
    }
    
    @Override
    public String toString() {
        return etapa + " (" + rol + ")";
    }
}

