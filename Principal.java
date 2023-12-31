/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paquete;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        btnEquipos = new javax.swing.JButton();
        btnExperimentos = new javax.swing.JButton();
        btnIntegrantes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        integrantesMenu = new javax.swing.JPanel();
        top1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonesIntegrantes = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnIngresarInt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(3, 2));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        principal.setBackground(new java.awt.Color(204, 204, 204));

        top.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel1.setText("SISTEMA DE EXPERIMENTOS");
        top.add(jLabel1);

        botones.setBackground(new java.awt.Color(204, 204, 204));
        botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEquipos.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnEquipos.setText("Experimentos");
        btnEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquiposActionPerformed(evt);
            }
        });
        botones.add(btnEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 40));

        btnExperimentos.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnExperimentos.setText("Equipos");
        btnExperimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExperimentosActionPerformed(evt);
            }
        });
        botones.add(btnExperimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 40));

        btnIntegrantes.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnIntegrantes.setText("Integrantes");
        btnIntegrantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIntegrantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIntegrantesMouseExited(evt);
            }
        });
        btnIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrantesActionPerformed(evt);
            }
        });
        botones.add(btnIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONO100.100.PNG"))); // NOI18N
        botones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
        );

        getContentPane().add(principal, "card2");

        integrantesMenu.setBackground(new java.awt.Color(204, 204, 204));

        top1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel2.setText("SISTEMA DE EXPERIMENTOS");
        top1.add(jLabel2);

        botonesIntegrantes.setBackground(new java.awt.Color(204, 204, 204));
        botonesIntegrantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnVolver.setText("Volver...");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        botonesIntegrantes.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 30));

        btnIngresarInt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnIngresarInt.setText("Ingresar cientificos");
        btnIngresarInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarIntActionPerformed(evt);
            }
        });
        botonesIntegrantes.add(btnIngresarInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 40));

        javax.swing.GroupLayout integrantesMenuLayout = new javax.swing.GroupLayout(integrantesMenu);
        integrantesMenu.setLayout(integrantesMenuLayout);
        integrantesMenuLayout.setHorizontalGroup(
            integrantesMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonesIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        integrantesMenuLayout.setVerticalGroup(
            integrantesMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(integrantesMenuLayout.createSequentialGroup()
                .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonesIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
        );

        getContentPane().add(integrantesMenu, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEquiposActionPerformed

    private void btnExperimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExperimentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExperimentosActionPerformed

    private void btnIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrantesActionPerformed
        // TODO add your handling code here:
        
        integrantesMenu.setVisible(true);
        principal.setVisible(false);
    }//GEN-LAST:event_btnIntegrantesActionPerformed

    private void btnIngresarIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarIntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarIntActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        integrantesMenu.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnIntegrantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntegrantesMouseEntered
        // TODO add your handling code here:
        int h = btnIntegrantes.getSize().height;
        int w = btnIntegrantes.getSize().width;
        int hFin = (int) Math.ceil(h*1.05);
        int wFin = (int) Math.ceil(w*1.05);
        Timer timer = new Timer();
        timer.schedule(new TimerTask()
                {
            @Override
            public void run() {
                if(btnIntegrantes.getSize().width<wFin)
                 btnIntegrantes.setSize(btnIntegrantes.getSize().width+1,btnIntegrantes.getSize().height+1);
                if(btnIntegrantes.getSize().width>=wFin)
                    this.cancel();
                
                }
                
            
                    
                },0,30);                                         

        
    }//GEN-LAST:event_btnIntegrantesMouseEntered

    private void btnIntegrantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntegrantesMouseExited
        // TODO add your handling code here:
         int hInit = 22;
        int wInit = 89;
        int h = btnIntegrantes.getSize().height;
        int w = btnIntegrantes.getSize().width;
        Timer timer = new Timer();
        timer.schedule(new TimerTask()
                {
            @Override
            public void run() {
                if(btnIntegrantes.getSize().width>=wInit)
                 btnIntegrantes.setSize(btnIntegrantes.getSize().width-1,btnIntegrantes.getSize().height-1);
                if(btnIntegrantes.getSize().width<wInit || btnIntegrantes.getSize().height<hInit)
                    this.cancel();
                
                }
                
            
                    
                },0,30);
        
    }//GEN-LAST:event_btnIntegrantesMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JPanel botonesIntegrantes;
    private javax.swing.JButton btnEquipos;
    private javax.swing.JButton btnExperimentos;
    private javax.swing.JButton btnIngresarInt;
    private javax.swing.JButton btnIntegrantes;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel integrantesMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel top;
    private javax.swing.JPanel top1;
    // End of variables declaration//GEN-END:variables
}
