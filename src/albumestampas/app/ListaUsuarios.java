/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app;

import albumestampas.bean.Estampa;
import albumestampas.bean.Usuario;

/**
 *
 * @author bruno
 */
public class ListaUsuarios {
    private NodoUsuario primero;
    private NodoUsuario ultimo;
    private NodoUsuario actual;
    
    private int tamaño;
    
    public ListaUsuarios() {
        primero = null;
        ultimo = null;
        actual = null;
        tamaño = 0;
    }
    
    public NodoUsuario getPrimero(){
        return primero;
    }
    
    public void setActual(NodoUsuario actual) {
        this.actual = actual;
    }
    
    public NodoUsuario getActual(){
        return actual;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public boolean vacio(){
        return primero == null;
    }
    
    public void insertar(Usuario usuario){
        NodoUsuario nuevoNodo = new NodoUsuario(usuario);
        if (vacio()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            setActual(nuevoNodo);
        }else{
            nuevoNodo.getUsuario().setListaEquipos(primero.getUsuario().getListaEquipos());
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
        }
        tamaño++;
    }
    
    public NodoUsuario obtenerSiguiente(){
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
    
    public NodoUsuario obtenerAnterior(){
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
        NodoUsuario aux = primero;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("----------NODO INICIO--------");
            System.out.println(aux.getUsuario().getUsuario());
            if(i>0)
            {
                System.out.println(aux.getUsuario().getUsuario());
            }
            if(i<tamaño-1)
            {
                System.out.println(aux.getUsuario().getUsuario());
            }
            System.out.println("----------NODO FIN--------");
            
            aux = aux.getSiguiente();
        }
    }
    
    public boolean buscarPorNombreDeUsuario(String usuario){
        NodoUsuario aux = primero;
        try {
            for (int i = 0; i < tamaño; i++) {
                if (aux.getUsuario().getUsuario().equals(usuario)) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    
    public NodoUsuario buscarUsuarioPorReferencia(String usuario){
       NodoUsuario aux = primero;
        try {
            for (int i = 0; i < tamaño; i++) {
                if (aux.getUsuario().getUsuario().equals(usuario)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        } catch (Exception e) {
            return null;
        }
        return null;     
    }
    
    public boolean  validarUsuario(String usuario, String contraseña){
        NodoUsuario aux = primero;
        try {
            for (int i = 0; i < tamaño; i++) {
                if (aux.getUsuario().getUsuario().equals(usuario) && aux.getUsuario().getContraseña().equals(contraseña)) {
                   return true; 
                }
                aux = aux.getSiguiente();
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    
    public void insertarContenidoAlAdministrador(ListaEquipos listaEquipos){
        primero.getUsuario().setListaEquipos(listaEquipos);        
    }
    
    public void agregarEstampasObtenidas(ListaSobreDorado listaEstampas){
        NodoSobreDorado estampaAux = listaEstampas.getActual();
        for (int i = 0; i < listaEstampas.getTamaño(); i++) {
            NodoEquipo equipoAux = actual.getUsuario().getListaEquipos().getActual();
            end:
            for (int j = 0; j < actual.getUsuario().getListaEquipos().getTamaño(); j++) {
                if (estampaAux.getEstampa().getPais().equals(equipoAux.getEquipo().getNombre())) {
                    equipoAux.getEquipo().getListaEstampas().marcarEstampaComoObtenida(estampaAux.getEstampa());
                    break end;
                }
                equipoAux = equipoAux.getSiguiente();
            }
        estampaAux.getSiguiente();
        }
    }
    
    public void agregarEstampasObtenidas(ListaSobreNormal listaEstampas){
        NodoSobreNormal estampaAux = listaEstampas.getActual();
        for (int i = 0; i < listaEstampas.getTamaño(); i++) {
            NodoEquipo equipoAux = actual.getUsuario().getListaEquipos().getActual();
            end:
            for (int j = 0; j < actual.getUsuario().getListaEquipos().getTamaño(); j++) {
                if (estampaAux.getEstampa().getPais().equals(equipoAux.getEquipo().getNombre())) {
                    equipoAux.getEquipo().getListaEstampas().marcarEstampaComoObtenida(estampaAux.getEstampa());
                    break end;
                }
                equipoAux = equipoAux.getSiguiente();
            }
        estampaAux = estampaAux.getSiguiente();
        }
    }
    
    public boolean pegarEstampa(Estampa estampa){
        NodoEquipo equipoAux = actual.getUsuario().getListaEquipos().getActual();
        for (int j = 0; j < actual.getUsuario().getListaEquipos().getTamaño(); j++) {
                if (estampa.getPais().equals(equipoAux.getEquipo().getNombre())) {
                    return equipoAux.getEquipo().getListaEstampas().marcarEstampaComoPegada(estampa);
                }
                equipoAux = equipoAux.getSiguiente();
            }
        return false;
    }
    
    public ListaEstampasSinPegar obtenerEstampasSinPegar(){
        ListaEstampasSinPegar listaEstampasSinPegar = new ListaEstampasSinPegar();
        NodoEquipo auxEquipo = actual.getUsuario().getListaEquipos().getPrimer();
        for (int i = 0; i < actual.getUsuario().getListaEquipos().getTamaño(); i++) {
            NodoEstampa auxEstampa = auxEquipo.getEquipo().getListaEstampas().getPrimero();
            for (int j = 0; j < auxEquipo.getEquipo().getListaEstampas().getTamaño(); j++) {
                if (!auxEstampa.getEstampa().isPegado() && auxEstampa.getEstampa().isObtenido()) {
                    for (int k = 0; k < auxEstampa.getEstampa().getCantidad(); k++) {
                        listaEstampasSinPegar.insertar(auxEstampa.getEstampa());
                    }
                    
                }
                auxEstampa = auxEstampa.getSiguiente();
            }
            auxEquipo = auxEquipo.getSiguiente();
        }
        return listaEstampasSinPegar;
    }
    
    public NodoEstampa[] obtenerEstampasFaltante(){
        NodoEstampa[] estampas = new NodoEstampa[cantidadDeEstampasFaltantes()];
        int posicion = 0;
        NodoEquipo auxEquipo = actual.getUsuario().getListaEquipos().getPrimer();
        for (int i = 0; i < actual.getUsuario().getListaEquipos().getTamaño(); i++) {
            NodoEstampa auxEstampa = auxEquipo.getEquipo().getListaEstampas().getPrimero();
            for (int j = 0; j < auxEquipo.getEquipo().getListaEstampas().getTamaño(); j++) {
                if (!auxEstampa.getEstampa().isPegado() && !auxEstampa.getEstampa().isObtenido()) {
                    estampas[posicion] = auxEstampa;
                    posicion++;
                }
                auxEstampa = auxEstampa.getSiguiente();
            }
            auxEquipo = auxEquipo.getSiguiente();
        }
        return estampas;
    }
    
    public int cantidadDeEstampasFaltantes(){
        int contador = 0;
        NodoEquipo auxEquipo = actual.getUsuario().getListaEquipos().getPrimer();
        for (int i = 0; i < actual.getUsuario().getListaEquipos().getTamaño(); i++) {
            NodoEstampa auxEstampa = auxEquipo.getEquipo().getListaEstampas().getPrimero();
            for (int j = 0; j < auxEquipo.getEquipo().getListaEstampas().getTamaño(); j++) {
                if (!auxEstampa.getEstampa().isPegado() && !auxEstampa.getEstampa().isObtenido()) {
                    contador++;
                }
                auxEstampa = auxEstampa.getSiguiente();
            }
            auxEquipo = auxEquipo.getSiguiente();
        }
        return contador;
    }
    
    public NodoUsuario[] listarUsuarios(){
        try {
            NodoUsuario[] usuarios = new NodoUsuario[(getTamaño()-2)];
            NodoUsuario aux = primero;
            int posicion = 0;
            for (int i = 0; i < getTamaño(); i++) {
                if (aux.getUsuario().getTipo()!=1 && !aux.getUsuario().getUsuario().equals(getActual().getUsuario().getUsuario())) {
                    usuarios[posicion] = aux;
                    posicion++;
                }
                aux = aux.getSiguiente();
            }
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public NodoUsuario[] usuariosConEstampaRepetida(String estampa){
        NodoUsuario[] usuarios = new NodoUsuario[noUsuariosConEstampaRepetida(estampa)];
        NodoUsuario auxUsuario = primero;
        int posicion = 0;
        for (int i = 0; i < getTamaño(); i++) {
            if (auxUsuario.getUsuario().getTipo()!=1 && auxUsuario!=actual) {
                NodoEquipo auxEquipo = actual.getUsuario().getListaEquipos().getPrimer();
                for (int k = 0; k < actual.getUsuario().getListaEquipos().getTamaño(); k++) {
                    NodoEstampa auxEstampa = auxEquipo.getEquipo().getListaEstampas().getPrimero();
                    end:
                    for (int j = 0; j < auxEquipo.getEquipo().getListaEstampas().getTamaño(); j++) {
                        if (auxEstampa.getEstampa().getNoEstampa() == Integer.parseInt(estampa) && auxEstampa.getEstampa().isObtenido() && auxEstampa.getEstampa().getCantidad()>1) {
                            usuarios[posicion] = auxUsuario;
                            posicion++;
                            break;
                        }
                        auxEstampa = auxEstampa.getSiguiente();
                    }
                    auxEquipo = auxEquipo.getSiguiente();
                }
            }
            auxUsuario = auxUsuario.getSiguiente();
        }
        return usuarios;
    }
    
    public int noUsuariosConEstampaRepetida(String estampa){
        int contador = 0;
        NodoUsuario auxUsuario = primero;
        for (int i = 0; i < getTamaño(); i++) {
            if (auxUsuario.getUsuario().getTipo()!=1 && auxUsuario!=actual) {
                NodoEquipo auxEquipo = auxUsuario.getUsuario().getListaEquipos().getPrimer();
                for (int k = 0; k < auxUsuario.getUsuario().getListaEquipos().getTamaño(); k++) {
                    NodoEstampa auxEstampa = auxEquipo.getEquipo().getListaEstampas().getPrimero();
                    for (int j = 0; j < auxEquipo.getEquipo().getListaEstampas().getTamaño(); j++) {
                        if (auxEstampa.getEstampa().getNoEstampa() == Integer.parseInt(estampa) && auxEstampa.getEstampa().isObtenido() && auxEstampa.getEstampa().getCantidad()>1) {
                            contador++;
                        }
                        auxEstampa = auxEstampa.getSiguiente();
                    }
                    auxEquipo = auxEquipo.getSiguiente();
                }
            }
            auxUsuario = auxUsuario.getSiguiente();
        }
        return contador;
    }
}
