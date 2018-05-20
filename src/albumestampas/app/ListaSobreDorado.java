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
public class ListaSobreDorado {
    private NodoSobreDorado primero;
    private NodoSobreDorado ultimo;
    private NodoSobreDorado actual;
    
    private int tamaño;
    
    public ListaSobreDorado() {
        primero = null;
        actual = null;
        tamaño = 0;
    }
    
    public void setActual(NodoSobreDorado actual) {
        this.actual = actual;
    }
    
    public NodoSobreDorado getActual(){
        return actual;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public boolean vacio(){
        return primero == null;
    }
    
    public void insertar(Estampa estampa){
        NodoSobreDorado nuevoNodo = new NodoSobreDorado(estampa);
        if (vacio()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            setActual(nuevoNodo);
        }else{
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        tamaño++;
    }
    
    public NodoSobreDorado obtenerSiguiente(){
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
    
    public void mostrar(){
        NodoSobreDorado aux = primero;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("----------NODO INICIO--------");
            System.out.println(aux.getEstampa().getRareza());
            System.out.println(aux.getEstampa().getNoEstampa());
            System.out.println(aux.getEstampa().isObtenido());
//            if(i>0)
//            {
//                System.out.println(aux.getUsuario().getUsuario());
//            }
//            if(i<tamaño-1)
//            {
//                System.out.println(aux.getUsuario().getUsuario());
//            }
            System.out.println("----------NODO FIN--------");
            
            aux = aux.getSiguiente();
        }
    }
}
