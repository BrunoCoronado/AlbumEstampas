/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app;

import albumestampas.bean.Usuario;

/**
 *
 * @author bruno
 */
public class NodoUsuario {
    private Usuario usuario;
    private NodoUsuario siguiente;
    private NodoUsuario anterior;

    public NodoUsuario() {
        this.usuario = null;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoUsuario(Usuario usuario, NodoUsuario anterior) {
        this.usuario = usuario;
        this.anterior = anterior;
        this.siguiente = null;
    }
    
    public NodoUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.anterior = null;
        this.siguiente = null;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

    public NodoUsuario getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoUsuario anterior) {
        this.anterior = anterior;
    }
}
