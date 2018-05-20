/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app;

import albumestampas.app.sistema.Login;
import albumestampas.bean.Equipo;
import albumestampas.bean.Estampa;
import albumestampas.bean.Usuario;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bruno
 */
public class App {
    public static CardLayout cardLayout = new CardLayout();
    public static JPanel panel = new JPanel(cardLayout);
    public static JFrame ventana = new JFrame();
    
    public static ListaUsuarios listaUsuarios;
    public static ListaEstampas listaEstampas;
    
    private Login login = new Login();
    //public static Usuario usuarioLogeado;    
    
    public void inicializar() {
        inicializarUsuarios();
        inicializarContenido();
        inicializarVentana();
        login.mostrarLogin();
        ventana.setVisible(true);
    }

    private void inicializarUsuarios() {
        listaUsuarios = new ListaUsuarios();
        Usuario usuario = new Usuario("admin","admin",1);
        listaUsuarios.insertar(usuario);
    }

    private void inicializarVentana() {
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Album");
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setSize(900, 600);
       //ventana.pack();
    }
    
    private void inicializarContenido(){
//        //generar contenido de prueba
//        Equipo equipo1 = new Equipo("a", "a", "a", "a", 0);
//        Equipo equipo2 = new Equipo("b", "a", "a", "a", 0);
//        Equipo equipo3 = new Equipo("c", "a", "a", "a", 0);
//        
//        Estampa estampa1 = new Estampa("a", 0, "a", "a", "a", "a", 0,false,false);
//        Estampa estampa2 = new Estampa("a", 1, "b", "b", "b", "b", 1,false,false);
//        Estampa estampa3 = new Estampa("a", 2, "c", "c", "c", "c", 2,false,false);
//        Estampa estampa4 = new Estampa("b", 3, "d", "d", "d", "d", 0,false,false);
//        Estampa estampa5 = new Estampa("b", 4, "e", "e", "e", "e", 1,false,false);
//        Estampa estampa6 = new Estampa("b", 5, "f", "f", "f", "f", 2,false,false);
//        Estampa estampa7 = new Estampa("c", 6, "g", "g", "g", "g", 0,false,false);
//        Estampa estampa8 = new Estampa("c", 7, "h", "h", "h", "h", 1,false,false);
//        Estampa estampa9 = new Estampa("c", 8, "i", "i", "i", "i", 2,false,false);
//        
//        ListaEstampas listaEstampas1 = new ListaEstampas();
//        listaEstampas1.insertar(estampa1);
//        listaEstampas1.insertar(estampa2);
//        listaEstampas1.insertar(estampa3);
////        listaEstampas1.insertar(estampa4);
////        listaEstampas1.insertar(estampa5);
////        listaEstampas1.insertar(estampa6);
////        listaEstampas1.insertar(estampa7);
////        listaEstampas1.insertar(estampa8);
////        listaEstampas1.insertar(estampa9);
//        ListaEstampas listaEstampas2 = new ListaEstampas();
//        listaEstampas2.insertar(estampa4);
//        listaEstampas2.insertar(estampa5);
//        listaEstampas2.insertar(estampa6);
//        ListaEstampas listaEstampas3 = new ListaEstampas();
//        listaEstampas3.insertar(estampa7);
//        listaEstampas3.insertar(estampa8);
//        listaEstampas3.insertar(estampa9);
//        
//        equipo1.setListaEstampas(listaEstampas1);
//        equipo2.setListaEstampas(listaEstampas2);
//        equipo3.setListaEstampas(listaEstampas3);
//        
//        ListaEquipos listaEquipos = new ListaEquipos();
//        listaEquipos.insertar(equipo1);
//        listaEquipos.insertar(equipo2);
//        listaEquipos.insertar(equipo3);
//        
//        listaUsuarios.insertarContenidoAlAdministrador(listaEquipos);
//        
//        listaEstampas = new ListaEstampas();
//        listaEstampas.insertar(estampa1);
//        listaEstampas.insertar(estampa2);
//        listaEstampas.insertar(estampa3);
//        listaEstampas.insertar(estampa4);
//        listaEstampas.insertar(estampa5);
//        listaEstampas.insertar(estampa6);
//        listaEstampas.insertar(estampa7);
//        listaEstampas.insertar(estampa8);
//        listaEstampas.insertar(estampa9);
    }
}
