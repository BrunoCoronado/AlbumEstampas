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
public class NodoEstampa {
    
    private Estampa estampa;
    private NodoEstampa siguiente;
    private NodoEstampa anterior;

    public NodoEstampa() {
        this.estampa = null;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoEstampa(Estampa estampa, NodoEstampa anterior) {
        this.estampa = estampa;
        this.anterior = anterior;
        this.siguiente = null;
    }
    
    public NodoEstampa(Estampa estampa) {
        this.estampa = estampa;
        this.anterior = null;
        this.siguiente = null;
    }
    
    public Estampa getEstampa() {
        return estampa;
    }

    public void setEstampa(Estampa estampa) {
        this.estampa = estampa;
    }

    public NodoEstampa getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEstampa siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEstampa getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEstampa anterior) {
        this.anterior = anterior;
    }
}
