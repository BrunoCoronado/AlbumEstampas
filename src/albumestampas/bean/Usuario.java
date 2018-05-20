/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.bean;

import albumestampas.app.ListaEquipos;
import albumestampas.app.ListaEstampasSinPegar;

/**
 *
 * @author bruno
 */
public class Usuario {
    private String usuario;
    private String contraseña;
    private int tipo;
    
    private ListaEquipos listaEquipos;

    private ListaEstampasSinPegar listaEstampasSinPegar;
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ListaEquipos getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ListaEquipos listaEquipos) {
        this.listaEquipos = listaEquipos;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ListaEstampasSinPegar getListaEstampasSinPegar() {
        return listaEstampasSinPegar;
    }

    public void setListaEstampasSinPegar(ListaEstampasSinPegar listaEstampasSinPegar) {
        this.listaEstampasSinPegar = listaEstampasSinPegar;
    }
    
    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, int tipo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.listaEquipos = null;
        this.listaEstampasSinPegar = null;
    }
}
