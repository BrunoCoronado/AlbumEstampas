/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.bean;

import albumestampas.app.ListaEstampas;

/**
 *
 * @author bruno
 */
public class Equipo {
    private String nombre;
    private String codigoFIFA;
    private String capitan;
    private String directorTecnico;
    private int mundialesGanados;
    
    private ListaEstampas listaEstampas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoFIFA() {
        return codigoFIFA;
    }

    public void setCodigoFIFA(String codigoFIFA) {
        this.codigoFIFA = codigoFIFA;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public int getMundialesGanados() {
        return mundialesGanados;
    }

    public void setMundialesGanados(int mundialesGanados) {
        this.mundialesGanados = mundialesGanados;
    }

    public ListaEstampas getListaEstampas() {
        return listaEstampas;
    }

    public void setListaEstampas(ListaEstampas listaEstampas) {
        this.listaEstampas= listaEstampas;
    }

    public Equipo(String nombre, String codigoFIFA, String capitan, String directorTecnico, int mundialesGanados) {
        this.nombre = nombre;
        this.codigoFIFA = codigoFIFA;
        this.capitan = capitan;
        this.directorTecnico = directorTecnico;
        this.mundialesGanados = mundialesGanados;
        this.listaEstampas = new ListaEstampas();
    }

    public Equipo(String nombre, String codigoFIFA, String capitan, String directorTecnico, int mundialesGanados, ListaEstampas listaEstampas) {
        this.nombre = nombre;
        this.codigoFIFA = codigoFIFA;
        this.capitan = capitan;
        this.directorTecnico = directorTecnico;
        this.mundialesGanados = mundialesGanados;
        this.listaEstampas = listaEstampas;
    }

    public Equipo() {
    }
}
