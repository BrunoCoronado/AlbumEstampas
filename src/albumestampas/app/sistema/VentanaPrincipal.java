/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumestampas.app.sistema;

import albumestampas.app.App;
import albumestampas.app.ListaEstampasSinPegar;

/**
 *
 * @author TrexT
 */
public class VentanaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }
    
    public void mostrar(){
        App.panel.add(this, "ventanaPrincipal");
        App.cardLayout.show(App.panel, "ventanaPrincipal");
        App.ventana.add(App.panel);
        
        if (App.listaUsuarios.getActual().getUsuario().getTipo()==1) {
            btnEstampasSinPegar.setVisible(false);
            btnAccion1.setText("Reportes");
            btnAccion2.setText("Limpiar Memoria");
            btnAccion3.setText("Carga Masiva");
        }else{
            btnEstampasSinPegar.setVisible(true);
        }
        verificarDatosUsuarios();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAlbum = new javax.swing.JButton();
        btnAccion1 = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnAccion2 = new javax.swing.JButton();
        btnAccion3 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEstampasSinPegar = new javax.swing.JButton();

        jLabel1.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(421, 421, 421))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        btnAlbum.setText("Ver Àlbum");
        btnAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlbumActionPerformed(evt);
            }
        });

        btnAccion1.setText("Intercambiar");
        btnAccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccion1ActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnAccion2.setText("Abrir Sobre Normal");
        btnAccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccion2ActionPerformed(evt);
            }
        });

        btnAccion3.setText("abrir Sobre Dorado");
        btnAccion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccion3ActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEstampasSinPegar.setText("Ver Estampas Sin Pegar");
        btnEstampasSinPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstampasSinPegarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogOut)
                    .addComponent(btnAccion1)
                    .addComponent(btnAlbum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAccion2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAccion3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEstampasSinPegar)
                .addGap(402, 402, 402))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlbum)
                    .addComponent(btnAccion2))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccion1)
                    .addComponent(btnAccion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstampasSinPegar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        App.listaUsuarios.setActual(null);
        Login login = new Login();
        login.mostrarLogin();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlbumActionPerformed
        PanelAlbum panelAlbum = new PanelAlbum();
        App.panel.add(panelAlbum, "panelAlbum");
        App.cardLayout.show(App.panel, "panelAlbum");
        App.ventana.add(App.panel);
    }//GEN-LAST:event_btnAlbumActionPerformed

    private void btnAccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccion2ActionPerformed
        if (App.listaUsuarios.getActual().getUsuario().getTipo()==1) {
            System.out.println("Limpiar Memoria");
        }else{
            PanelSobre panelSobre = new PanelSobre(0);
            App.panel.add(panelSobre, "panelSobre");
            App.cardLayout.show(App.panel, "panelSobre");
            App.ventana.add(App.panel);
        }
    }//GEN-LAST:event_btnAccion2ActionPerformed

    private void btnAccion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccion3ActionPerformed
        if (App.listaUsuarios.getActual().getUsuario().getTipo()==1) {
            PanelCargaMasiva panelCargaMasiva = new PanelCargaMasiva();
            App.panel.add(panelCargaMasiva, "panelCargaMasiva");
            App.cardLayout.show(App.panel, "panelCargaMasiva");
            App.ventana.add(App.panel);
        }else{
            PanelSobre panelSobre = new PanelSobre(1);
            App.panel.add(panelSobre, "panelSobre");
            App.cardLayout.show(App.panel, "panelSobre");
            App.ventana.add(App.panel);
        }
    }//GEN-LAST:event_btnAccion3ActionPerformed

    private void btnEstampasSinPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstampasSinPegarActionPerformed
        PanelEstampasSinPegar panelEstampasSinPegar = new PanelEstampasSinPegar(App.listaUsuarios.obtenerEstampasSinPegar());
        App.panel.add(panelEstampasSinPegar, "panelEstampaSinPegar");
        App.cardLayout.show(App.panel, "panelEstampaSinPegar");
        App.ventana.add(App.panel);
    }//GEN-LAST:event_btnEstampasSinPegarActionPerformed

    private void btnAccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccion1ActionPerformed
      if (App.listaUsuarios.getActual().getUsuario().getTipo()==1) {
            System.out.println("Reportes");
        }else{
            PanelIntercambio panelIntercambio = new PanelIntercambio();
            App.panel.add(panelIntercambio, "panelIntercambio");
            App.cardLayout.show(App.panel, "panelIntercambio");
            App.ventana.add(App.panel);
        }
    }//GEN-LAST:event_btnAccion1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion1;
    private javax.swing.JButton btnAccion2;
    private javax.swing.JButton btnAccion3;
    private javax.swing.JButton btnAlbum;
    private javax.swing.JButton btnEstampasSinPegar;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void verificarDatosUsuarios() {
        App.listaUsuarios.getActual().getUsuario().setListaEquipos(App.listaUsuarios.getPrimero().getUsuario().getListaEquipos());
    }
}
