/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.text.StyleConstants.setBackground;

/**
 *
 * @author JohnLennoN
 */
public class opcoesMesa extends javax.swing.JFrame {

    /**
     * Creates new form opcoesMesa
     */
    public opcoesMesa() {
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

        btReservaMesa = new javax.swing.JButton();
        btReservaMesaVoltar = new javax.swing.JButton();

        setTitle("Reserva");

        btReservaMesa.setText("Reservar Mesa");
        btReservaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservaMesaActionPerformed(evt);
            }
        });

        btReservaMesaVoltar.setText("Voltar");
        btReservaMesaVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservaMesaVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(435, Short.MAX_VALUE)
                .addComponent(btReservaMesaVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btReservaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(554, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReservaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReservaMesaVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        setSize(new java.awt.Dimension(716, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btReservaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservaMesaActionPerformed
        telaPrincipal principal = new telaPrincipal();
        JOptionPane.showMessageDialog(null, "Confirma a reserva desta mesa?");
        principal.setbt1().setBackground(new Color(255,0,0));
       // dispose();
      
    }//GEN-LAST:event_btReservaMesaActionPerformed

    private void btReservaMesaVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservaMesaVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btReservaMesaVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(opcoesMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opcoesMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opcoesMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opcoesMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opcoesMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReservaMesa;
    private javax.swing.JButton btReservaMesaVoltar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btReservaMesa
     */
    public javax.swing.JButton getBtReservaMesa() {
        return btReservaMesa;
    }

    /**
     * @param btReservaMesa the btReservaMesa to set
     */
    public void setBtReservaMesa(javax.swing.JButton btReservaMesa) {
        this.btReservaMesa = btReservaMesa;
    }
}
