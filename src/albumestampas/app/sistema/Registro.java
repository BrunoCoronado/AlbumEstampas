/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app.sistema;

import albumestampas.app.App;
import albumestampas.bean.Usuario;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author bruno
 */
public class Registro {
    
    private JTextField usuario;
    private JPasswordField contraseña;
    private JLabel lblUsuario,lblContraseña;
    private JButton registrarse = new JButton("Registrarse");
    private JButton cancelar = new JButton("Cancelar");

    public Registro() {
        usuario =  new JTextField(20);
        contraseña = new JPasswordField(20);
        lblUsuario = new JLabel("Usuario");
        lblContraseña = new JLabel("Contraseña");
        
        cancelar.addActionListener(new Cancelar());
        registrarse.addActionListener(new Registrarse());
    }
    
    
    
    public void mostrarRegistro(){
        JPanel contenidoRegistro = new JPanel(new BorderLayout());
        
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        
        App.ventana.setTitle("Registro");
        
        JPanel panelTitulo = new JPanel();
        JLabel labelTitulo = new JLabel("REGISTRO");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        panelTitulo.add(labelTitulo);
        contenidoRegistro.add(panelTitulo, BorderLayout.NORTH);
        
        JPanel formularioRegistro = new JPanel();
        formularioRegistro.setLayout(new GridBagLayout());
        gridBagConstraints.gridx=6;
        gridBagConstraints.gridy=0;
        formularioRegistro.add(usuario, gridBagConstraints);
        gridBagConstraints.gridx=3;
        gridBagConstraints.gridy=0;
        formularioRegistro.add(lblUsuario, gridBagConstraints);
        gridBagConstraints.gridx=6;
        gridBagConstraints.gridy=1;
        formularioRegistro.add(contraseña, gridBagConstraints);
        gridBagConstraints.gridx=3;
        gridBagConstraints.gridy=1;
        formularioRegistro.add(lblContraseña, gridBagConstraints);
        contenidoRegistro.add(formularioRegistro, BorderLayout.CENTER);
        
        JPanel botonesFormulario = new JPanel();
        botonesFormulario.add(registrarse);
        botonesFormulario.add(cancelar);
        contenidoRegistro.add(botonesFormulario, BorderLayout.SOUTH);
        
        App.panel.add(contenidoRegistro, "contenidoRegistro");
        App.cardLayout.show(App.panel, "contenidoRegistro");
    }
    
    class Registrarse implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                if (validarCampos()) {
                    if(!App.listaUsuarios.buscarPorNombreDeUsuario(usuario.getText())){
                        agregarUsuarioRegistrado();
                        reiniciarTexto();
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuario no registrado! Nombre de usuario no disponible.");
                        reiniciarTexto();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no registrado! Llenar todos los campos");
                    reiniciarTexto();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        private void agregarUsuarioRegistrado(){
                App.listaUsuarios.insertar(new Usuario(usuario.getText(), String.valueOf(contraseña.getPassword()), 0));
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
                App.cardLayout.show(App.panel, "contenidoLogin");
        }

        private void reiniciarTexto() {
            usuario.setText("");
            contraseña.setText("");
        }

        private boolean validarCampos() {
            if(usuario.getText().equals("")||String.valueOf(contraseña.getPassword()).equals("")){
                return false;
            }
            return true;
        }
    }
    
    class Cancelar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            App.cardLayout.show(App.panel, "contenidoLogin");
        }
    }
}
