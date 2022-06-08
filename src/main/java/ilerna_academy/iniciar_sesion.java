/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ilerna_academy;

/**
 *
 * @author alumno
 */
public class iniciar_sesion extends javax.swing.JFrame {

    /**
     * Creates new form iniciar_sesion
     */
    public iniciar_sesion() {
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

        ilerna = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        curso = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ilerna.setBackground(new java.awt.Color(255, 255, 255));
        ilerna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ilernasevilla (1).png"))); // NOI18N
        ilerna.setBorder(null);
        getContentPane().add(ilerna, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 90));

        ingresar.setBackground(new java.awt.Color(255, 255, 255));
        ingresar.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        ingresar.setText("Iniciar sesión");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 150, 60));

        curso.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        curso.setText("Bienvenido a nuestro curso especializado en programación en java");
        getContentPane().add(curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\alumno\\Downloads\\logo_ilerna (1).png")); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 200, 170));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -43, 630, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blanco.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
        
        this.dispose();
    }//GEN-LAST:event_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciar_sesion().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel curso;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ilerna;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}