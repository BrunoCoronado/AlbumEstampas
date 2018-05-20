/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app;

import albumestampas.bean.Equipo;

/**
 *
 * @author bruno
 */
public class ListaEquipos {
    private NodoEquipo primero;
    private NodoEquipo ultimo;
    private NodoEquipo actual;
    
    private int tamaño;
    
    public ListaEquipos() {
        primero = null;
        ultimo = null;
        actual = null;
        tamaño = 0;
    }
    
    public NodoEquipo getPrimer(){
        return primero;
    }
    
    public void setActual(NodoEquipo actual) {
        this.actual = actual;
    }
    
    public NodoEquipo getActual(){
        return actual;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public boolean vacio(){
        return primero == null;
    }
    
    public void insertar(Equipo equipo){
        NodoEquipo nuevoNodo = new NodoEquipo(equipo);
        if (vacio()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            setActual(nuevoNodo);
        }else{
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
        }
        tamaño++;
    }
    
    public NodoEquipo obtenerSiguiente(){
        try {
            if(getActual().getSiguiente() != null)
            {
                setActual(getActual().getSiguiente());
            }
            else
            {
                return null;
            }
            return getActual();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public NodoEquipo obtenerAnterior(){
        try {
            if(getActual().getAnterior()!= null)
            {
                setActual(getActual().getAnterior());
            }
            else
            {
                return null;
            }
            return getActual();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void mostrar(){
        NodoEquipo aux = primero;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("----------NODO INICIO--------");
            System.out.println(aux.getEquipo().getNombre());
            if(i>0)
            {
                System.out.println(aux.getEquipo().getNombre());
            }
            if(i<tamaño-1)
            {
                System.out.println(aux.getEquipo().getNombre());
            }
            System.out.println("----------NODO FIN--------");
            
            aux = aux.getSiguiente();
        }
    }
    
    public boolean buscarPorNombreDeEquipo(String equipo){
        NodoEquipo aux = primero;
        try {
            for (int i = 0; i < tamaño; i++) {
                if (aux.getEquipo().getNombre().equals(equipo)) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    
    public NodoEquipo buscarEquipoPorReferencia(String equipo){
       NodoEquipo aux = primero;
        try {
            for (int i = 0; i < tamaño; i++) {
                if (aux.getEquipo().getNombre().equals(equipo)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        } catch (Exception e) {
            return null;
        }
        return null;     
    }
    
    public void insertarListaEstampas(ListaEstampas estampas){
        NodoEquipo auxEquipo = primero;
        try {
            for (int i = 0; i < getTamaño(); i++) {
                NodoEstampa auxEstampa = estampas.getPrimero();
                for (int j = 0; j < estampas.getTamaño(); j++) {
                    if (auxEquipo.getEquipo().getNombre().equals(auxEstampa.getEstampa().getPais())) {
                        auxEquipo.getEquipo().getListaEstampas().insertar(auxEstampa.getEstampa());
                    }
                    auxEstampa = auxEstampa.getSiguiente();
                }
                auxEquipo = auxEquipo.getSiguiente();
            }
        } catch (Exception e) {}
    }
}
