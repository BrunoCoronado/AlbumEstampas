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
public class NodoEstampaSinPegar {
    private Estampa estampa;
    private NodoEstampaSinPegar siguiente;
    private NodoEstampaSinPegar anterior;

    public NodoEstampaSinPegar() {
        this.estampa = null;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoEstampaSinPegar(Estampa estampa, NodoEstampaSinPegar anterior) {
        this.estampa = estampa;
        this.anterior = anterior;
        this.siguiente = null;
    }
    
    public NodoEstampaSinPegar(Estampa estampa) {
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

    public NodoEstampaSinPegar getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEstampaSinPegar siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEstampaSinPegar getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEstampaSinPegar anterior) {
        this.anterior = anterior;
    }
    
}
