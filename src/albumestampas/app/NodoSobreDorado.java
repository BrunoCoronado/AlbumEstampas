/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app;

import albumestampas.bean.Estampa;

/**
 *
 * @author TrexT
 */
public class NodoSobreDorado {
    private Estampa estampa;
    private NodoSobreDorado siguiente;

    public NodoSobreDorado() {
        this.estampa = null;
        this.siguiente = null;
    }

    public NodoSobreDorado(Estampa estampa) {
        this.estampa = estampa;
        this.siguiente = null;
    }
    
    public Estampa getEstampa() {
        return estampa;
    }

    public void setEstampa(Estampa estampa) {
        this.estampa = estampa;
    }

    public NodoSobreDorado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSobreDorado siguiente) {
        this.siguiente = siguiente;
    }
}
