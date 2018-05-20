/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app;

import albumestampas.bean.Equipo;
import albumestampas.bean.Estampa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author bruno
 */
public class CargaMasiva {
    private final String SEPARADOR = ",";
    
    private BufferedReader br = null;
    
    private ListaEquipos equipos = new ListaEquipos();
    private ListaEstampas estampas = new ListaEstampas();
    
    public void leerArchivo(File file){
        try {
            br = new BufferedReader(new FileReader(file));
            String linea = br.readLine();
            while (linea != null) {
                String[] parametros = linea.split(SEPARADOR);
                obtenerDatos(parametros);
                linea = br.readLine();
            }
            agregarContenidoAlbum();
        } catch (Exception e) {
        }
    }
    
    private void obtenerDatos(String[] datos){
        try {
            switch(datos.length){
                case 5:
                    try {
                        equipos.insertar(new Equipo(datos[0],datos[1],datos[2],datos[3],Integer.parseInt(datos[4])));
                    } catch (Exception e) {}
                    break;
                case 7:
                    try {
                        estampas.insertar(new Estampa(datos[0], Integer.parseInt(datos[1]), datos[2], datos[3], datos[4], datos[5], Integer.parseInt(datos[6]),false,false));
                    } catch (Exception e) {
                    }
                    break;
                default:
                    System.out.println("datos invalidos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void agregarContenidoAlbum() {
        equipos.insertarListaEstampas(estampas);
        App.listaUsuarios.insertarContenidoAlAdministrador(equipos);
        App.listaEstampas = estampas;
    }
}
