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
public class ListaEstampasSinPegar {
    private NodoEstampaSinPegar primero;
    private NodoEstampaSinPegar ultimo;
    private NodoEstampaSinPegar actual;
    
    private int tamaño;
    
    public ListaEstampasSinPegar() {
        primero = null;
        ultimo = null;
        actual = null;
        tamaño = 0;
    }
    
    public NodoEstampaSinPegar getPrimero(){
        return primero;
    }
    
    public void setActual(NodoEstampaSinPegar actual) {
        this.actual = actual;
    }
    
    public NodoEstampaSinPegar getActual(){
        return actual;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public boolean vacio(){
        return primero == null;
    }
    
    public void insertar(Estampa estampa){
        NodoEstampaSinPegar nuevoNodo = new NodoEstampaSinPegar(estampa);
        if (vacio()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            setActual(nuevoNodo);
        }else{
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
            ultimo.setSiguiente(primero);
            primero.setAnterior(ultimo);
        }
        tamaño++;
    }
    
    public NodoEstampaSinPegar obtenerSiguiente(){
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
    
    public NodoEstampaSinPegar obtenerAnterior(){
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
        NodoEstampaSinPegar aux = primero;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("----------NODO INICIO--------");
            System.out.println(aux.getEstampa().getNombre());
            System.out.println(aux.getEstampa().getNoEstampa());
            System.out.println("----------NODO FIN--------");
            
            aux = aux.getSiguiente();
        }
    }
    
//    public void marcarEstampaComoObtenida(Estampa estampa){
//        NodoEstampaSinPegar aux = primero;
//        end:
//        for (int i = 0; i < tamaño; i++) {
//            if (!aux.getEstampa().isObtenido() && aux.getEstampa().getNoEstampa() == estampa.getNoEstampa()) {
//                aux.getEstampa().setObtenido(true);
//                break end;
//            }
//            aux = aux.getSiguiente();
//        }
//    }
    
//    public boolean marcarEstampaComoPegada(Estampa estampa){
//        NodoEstampaSinPegar aux = primero;
//        for (int i = 0; i < tamaño; i++) {
//            if (aux.getEstampa().getNoEstampa() == estampa.getNoEstampa()) {
//                if (!aux.getEstampa().isPegado()) {
//                    aux.getEstampa().setPegado(true);
//                    return true;
//                }else{
//                    return false;
//                }
//            }
//            aux = aux.getSiguiente();
//        }
//        return false;
//    }
}
