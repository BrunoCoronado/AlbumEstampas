/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.bean;

/**
 *
 * @author bruno
 */
public class Estampa {
    private String pais;
    private int noEstampa;
    private String nombre;
    private String posicion;
    private String fechaDeNacimiento;
    private String Club;
    private int rareza;
    private boolean obtenido;
    private boolean pegado;
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNoEstampa() {
        return noEstampa;
    }

    public void setNoEstampa(int noEstampa) {
        this.noEstampa = noEstampa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String Club) {
        this.Club = Club;
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    public boolean isObtenido() {
        return obtenido;
    }

    public void setObtenido(boolean obtenido) {
        this.obtenido = obtenido;
    }

    public boolean isPegado() {
        return pegado;
    }

    public void setPegado(boolean pegado) {
        this.pegado = pegado;
    }
    
    public Estampa(String pais, int noEstampa, String nombre, String posicion, String fechaDeNacimiento, String Club, int rareza) {
        this.pais = pais;
        this.noEstampa = noEstampa;
        this.nombre = nombre;
        this.posicion = posicion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.Club = Club;
        this.rareza = rareza;
        this.cantidad = 0;
    }

    public Estampa() {
    }

    public Estampa(String pais, int noEstampa, String nombre, String posicion, String fechaDeNacimiento, String Club, int rareza, boolean obtenido) {
        this.pais = pais;
        this.noEstampa = noEstampa;
        this.nombre = nombre;
        this.posicion = posicion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.Club = Club;
        this.rareza = rareza;
        this.obtenido = obtenido;
        this.cantidad = 0;
    }

    public Estampa(String pais, int noEstampa, String nombre, String posicion, String fechaDeNacimiento, String Club, int rareza, boolean obtenido, boolean pegado) {
        this.pais = pais;
        this.noEstampa = noEstampa;
        this.nombre = nombre;
        this.posicion = posicion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.Club = Club;
        this.rareza = rareza;
        this.obtenido = obtenido;
        this.pegado = pegado;
        this.cantidad = 0;
    }
}
