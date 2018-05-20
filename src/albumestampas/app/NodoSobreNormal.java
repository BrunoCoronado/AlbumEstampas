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
public class NodoSobreNormal {
    
    private Estampa estampa;
    private NodoSobreNormal siguiente;
    private NodoSobreNormal anterior;

    public NodoSobreNormal() {
        this.estampa = null;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoSobreNormal(Estampa estampa, NodoSobreNormal anterior) {
        this.estampa = estampa;
        this.anterior = anterior;
        this.siguiente = null;
    }
    
    public NodoSobreNormal(Estampa estampa) {
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

    public NodoSobreNormal getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSobreNormal siguiente) {
        this.siguiente = siguiente;
    }

    public NodoSobreNormal getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoSobreNormal anterior) {
        this.anterior = anterior;
    }
}
