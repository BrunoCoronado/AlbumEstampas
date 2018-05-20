/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app;

import albumestampas.bean.Equipo;

/**
 *
 * @author TrexT
 */
public class NodoEquipo {
    
    private Equipo equipo;
    private NodoEquipo siguiente;
    private NodoEquipo anterior;

    public NodoEquipo() {
        this.equipo = null;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoEquipo(Equipo equipo, NodoEquipo anterior) {
        this.equipo = equipo;
        this.anterior = anterior;
        this.siguiente = null;
    }
    
    public NodoEquipo(Equipo equipo) {
        this.equipo = equipo;
        this.anterior = null;
        this.siguiente = null;
    }
    
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public NodoEquipo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEquipo siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEquipo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEquipo anterior) {
        this.anterior = anterior;
    }
}
