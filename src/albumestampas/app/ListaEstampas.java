/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app;

import albumestampas.bean.Estampa;
import java.util.Random;

/**
 *
 * @author bruno
 */
public class ListaEstampas {
    private NodoEstampa primero;
    private NodoEstampa ultimo;
    private NodoEstampa actual;
    
    private int tamaño;
    
    public ListaEstampas() {
        primero = null;
        ultimo = null;
        actual = null;
        tamaño = 0;
    }
    
    public NodoEstampa getPrimero(){
        return primero;
    }
    
    public void setActual(NodoEstampa actual) {
        this.actual = actual;
    }
    
    public NodoEstampa getActual(){
        return actual;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public boolean vacio(){
        return primero == null;
    }
    
    public void insertar(Estampa estampa){
        NodoEstampa nuevoNodo = new NodoEstampa(estampa);
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
    
    public NodoEstampa obtenerSiguiente(){
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
    
    public void siguienteEstampa(){
        try {
            if(getActual().getSiguiente() != null)
            {
                setActual(getActual().getSiguiente());
            }
        } catch (Exception e) {
        }
    }
    
    public void volverAlInicio(){
        setActual(primero);
    }
    
    public NodoEstampa obtenerAnterior(){
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
        NodoEstampa aux = primero;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("----------NODO INICIO--------");
            System.out.println(aux.getEstampa().getNombre());
            System.out.println(aux.getEstampa().getNoEstampa());
            System.out.println(aux.getEstampa().isObtenido());
//            if(i>0)
//            {
//                System.out.println(aux.getEstampa().getNombre());
//            }
//            if(i<tamaño-1)
//            {
//                System.out.println(aux.getEstampa().getNombre());
//            }
            System.out.println("----------NODO FIN--------");
            
            aux = aux.getSiguiente();
        }
    }
    
    public boolean buscarPorNombreDeEstampa(String estampa){
        NodoEstampa aux = primero;
        try {
            for (int i = 0; i < tamaño; i++) {
                if (aux.getEstampa().getNombre().equals(estampa)) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    
    public NodoEstampa buscarEstampaPorReferencia(String estampa){
       NodoEstampa aux = primero;
        try {
            for (int i = 0; i < tamaño; i++) {
                if (aux.getEstampa().getNombre().equals(estampa)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        } catch (Exception e) {
            return null;
        }
        return null;     
    }
    
    public NodoEstampa obtenerEstampaSobre(int tipo){
        Random numeroAleatorio = new Random();
        int probabilidad = 1+numeroAleatorio.nextInt(101);
        //1 dorado-0 normal
        switch(tipo){
            case 0:
                if (probabilidad<=60) {
                    return obtenerEstampaPorRareza(0);
                }if (60<probabilidad && probabilidad<=90) {
                    return obtenerEstampaPorRareza(1);
                }if (90<probabilidad) {
                    return obtenerEstampaPorRareza(2);
                }
                break;
            case 1:
                if (probabilidad<=10) {
                    return obtenerEstampaPorRareza(0);
                }if (10<probabilidad && probabilidad<=70) {
                    return obtenerEstampaPorRareza(1);
                }if (70<probabilidad) {
                    return obtenerEstampaPorRareza(2);
                }
                break;
        }
        return null;
    }
    
    private NodoEstampa obtenerEstampaPorRareza(int rareza){
        ListaEstampas listaEstampasPorRareza = new ListaEstampas();
        NodoEstampa aux = primero;
        try {
            for (int i = 0; i < tamaño; i++) {
                if (aux.getEstampa().getRareza() == rareza ) {
                    listaEstampasPorRareza.insertar(aux.getEstampa());
                }
                aux=aux.getSiguiente();
            }
            return obtenerEstampaPorRarezaRandom(listaEstampasPorRareza);
        } catch (Exception e) {
            System.err.println("error al juntar estampas segun su rareza");
            return null;
        }
    }
    
    public NodoEstampa obtenerEstampaPorRarezaRandom(ListaEstampas listaEstampasPorRareza){
        try {
            Random numeroAleatorio = new Random();
            NodoEstampa aux = listaEstampasPorRareza.getActual();
            int posicionEstampa = numeroAleatorio.nextInt(listaEstampasPorRareza.getTamaño());
            for (int i = 0; i <= (posicionEstampa); i++) {
                if (i==posicionEstampa) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        } catch (Exception e) {
            System.out.println("hola");
            return null;
        }
        System.out.println("hola1");
        return null;
    }
    
    public void marcarEstampaComoObtenida(Estampa estampa){
        NodoEstampa aux = primero;
        end:
        for (int i = 0; i < tamaño; i++) {
            if (aux.getEstampa().getNoEstampa() == estampa.getNoEstampa()) {
                aux.getEstampa().setCantidad(aux.getEstampa().getCantidad()+1);
                if (!aux.getEstampa().isObtenido()) {
                    aux.getEstampa().setObtenido(true);
                    break end;
                }
            }
            aux = aux.getSiguiente();
        }
    }
    
    public boolean marcarEstampaComoPegada(Estampa estampa){
        NodoEstampa aux = primero;
        for (int i = 0; i < tamaño; i++) {
            if (aux.getEstampa().getNoEstampa() == estampa.getNoEstampa()) {
                if (!aux.getEstampa().isPegado()) {
                    aux.getEstampa().setPegado(true);
                    return true;
                }else{
                    return false;
                }
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
}
