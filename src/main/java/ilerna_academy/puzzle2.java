/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ilerna_academy;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alumno
 */
public class puzzle2 extends javax.swing.JFrame {

    ImageIcon fondoIcon = new ImageIcon("./images/fondo_pizarra.png");
    JLabel fondo = new JLabel(fondoIcon);
    
    boolean Pulsado = false;
    
    public puzzle2() {
        initComponents();
        this.setSize(1280,720);
        this.setResizable(false);
        this.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 690));
        confetti.setVisible(false);
        MADERA.setIcon(new ImageIcon("./images/madera.png"));
        Interrogante.setToolTipText("<html>\nPista:\n<br>Cuando una variable es acompañado con ++ significa que al valor de la variable se le esta sumando uno.\n<br>Ejemplo:\n<br>numero=12;\n<br>numero++\n<br>Ahora numero es 13</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confetti = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        Interrogante = new javax.swing.JLabel();
        VERIFICAR = new javax.swing.JButton();
        MADERA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(confetti, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 330, 210));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("}");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("(");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mientras numero sea menor a 100, numero se incrementa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 52, 1050, 60));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mientras numero sea menor a 100, numero se incrementa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 1060, 70));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText(")");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel7.setText("+");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel8.setText("100");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setText("<");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel10.setText("while");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel11.setText("numero");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel12.setText("{");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel13.setText("+");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel14.setText(";");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel15.setText("numero");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel15MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 110, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        Interrogante.setIcon(new javax.swing.ImageIcon("C:\\Users\\alumno\\Documents\\NetBeansProjects\\bootcamp_retos\\images\\interrogante.gif")); // NOI18N
        Interrogante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Interrogante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InterroganteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InterroganteMouseExited(evt);
            }
        });
        getContentPane().add(Interrogante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 100, 100));

        VERIFICAR.setBackground(new java.awt.Color(51, 0, 0));
        VERIFICAR.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        VERIFICAR.setForeground(new java.awt.Color(255, 255, 255));
        VERIFICAR.setText("VERIFICAR");
        VERIFICAR.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        VERIFICAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VERIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VERIFICARActionPerformed(evt);
            }
        });
        getContentPane().add(VERIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 160, 60));

        MADERA.setIcon(new javax.swing.ImageIcon("C:\\Users\\alumno\\Documents\\NetBeansProjects\\bootcamp_retos\\images\\madera.png")); // NOI18N
        getContentPane().add(MADERA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 1100, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
   
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
       Pulsado = true;
       moverLabel(jLabel1);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        Pulsado=false;
        incrustar(jLabel1);
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        Pulsado = true;
        moverLabel(jLabel2);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        Pulsado=false;
        incrustar(jLabel2);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
       //=
       Pulsado = true;
       moverLabel(jLabel3);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        Pulsado=false;
        incrustar(jLabel3);
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        Pulsado = true;
       moverLabel(jLabel6);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        Pulsado=false;
        incrustar(jLabel6);
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
       Pulsado = true;
       moverLabel(jLabel7);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        Pulsado=false;
        incrustar(jLabel7);
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        Pulsado = true;
        moverLabel(jLabel8);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        Pulsado=false;
        incrustar(jLabel8);
    }//GEN-LAST:event_jLabel8MouseReleased

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
       Pulsado = true;
       moverLabel(jLabel10);
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
        Pulsado=false;
        incrustar(jLabel10);
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
       Pulsado = true;
       moverLabel(jLabel11);
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
        Pulsado=false;
        incrustar(jLabel11);
    }//GEN-LAST:event_jLabel11MouseReleased

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
       Pulsado = true;
       moverLabel(jLabel12);
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
       Pulsado=false;
       incrustar(jLabel12);
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
       Pulsado = true;
       moverLabel(jLabel13);
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        Pulsado=false;
        incrustar(jLabel13);
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
       Pulsado = true;
       moverLabel(jLabel14);
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
       Pulsado=false;
       incrustar(jLabel14);
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
       Pulsado=true;
       moverLabel(jLabel15);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseReleased
        Pulsado=false;
        incrustar(jLabel15);
    }//GEN-LAST:event_jLabel15MouseReleased

    private void InterroganteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InterroganteMouseEntered
        Interrogante.setIcon(new ImageIcon("./images/interrogante.gif"));
    }//GEN-LAST:event_InterroganteMouseEntered

    private void InterroganteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InterroganteMouseExited
        Interrogante.setIcon(new ImageIcon("./images/interroganteQuieto.png"));
    }//GEN-LAST:event_InterroganteMouseExited

    private void VERIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VERIFICARActionPerformed
        try {
            if (panel1.equals("while") && panel2.equals("(") && panel3.equals("numero") && panel4.equals("<") && panel5.equals("100") && panel6.equals(")")
                    && panel7.equals("{") && panel8.equals("numero") && panel9.equals("+") && panel10.equals("+") && panel11.equals(";") && panel12.equals("}")) {
                System.out.println("BIEN");
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            confetti.setVisible(true);
                            confetti.setIcon(new ImageIcon("./images/confetti.gif"));
                            AudioInputStream inputConfetti;
                            try {
                                inputConfetti = AudioSystem.getAudioInputStream(new File("./audios/Confetti.wav").getAbsoluteFile());
                                Clip clipConfetti = AudioSystem.getClip();
                                clipConfetti.open(inputConfetti);
                                clipConfetti.start();
                            } catch (UnsupportedAudioFileException ex) {
                                Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (LineUnavailableException ex) {
                                Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            sleep(2000);
                            confetti.setVisible(false);
                             fin();
                            this.stop();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }.start();
            } else {
                System.out.println("MAL");
                AudioInputStream inputError;
                try {
                    inputError = AudioSystem.getAudioInputStream(new File("./audios/Error.wav").getAbsoluteFile());
                    Clip clipError = AudioSystem.getClip();
                    clipError.open(inputError);
                    clipError.start();
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }catch(Exception e){
            System.out.println("MAL");
            AudioInputStream inputError;
                try {
                    inputError = AudioSystem.getAudioInputStream(new File("./audios/Error.wav").getAbsoluteFile());
                    Clip clipError = AudioSystem.getClip();
                    clipError.open(inputError);
                    clipError.start();
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(puzzle3.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_VERIFICARActionPerformed

    public void moverLabel(JLabel LABEL) {
       new Thread() {
            @Override
            public void run() {
                try {
                    while (Pulsado) {
                        Point b = getMousePosition();
                        int x = (int) b.getX();
                        int y = (int) b.getY();
                        LABEL.setLocation(x - 20, y - 50);
                        sleep(1);
                    }
                    this.stop();
                } catch (InterruptedException ex) {
                    Logger.getLogger(puzzle2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
    
    public void fin(){
    puzzle3 puzzle3 = new puzzle3();
                        puzzle3.setVisible(true);
                        this.dispose();
    }
   
    
    String panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel9,panel10,panel11,panel12;
    public void incrustar(JLabel LABEL){
        if((LABEL.getX()>jPanel1.getX() && LABEL.getX()<jPanel1.getX()+jPanel1.getWidth())
            && (LABEL.getY()>jPanel1.getY() && LABEL.getY()<jPanel1.getY()+jPanel1.getHeight())){
            System.out.println("PANEL 1");
            panel1 = LABEL.getText();
            LABEL.setLocation(jPanel1.getX()+10,jPanel1.getY()+10);
        }
         if((LABEL.getX()>jPanel2.getX() && LABEL.getX()<jPanel2.getX()+jPanel2.getWidth())
            && (LABEL.getY()>jPanel2.getY() && LABEL.getY()<jPanel2.getY()+jPanel2.getHeight())){
            System.out.println("PANEL 2");
            panel2 = LABEL.getText();
            LABEL.setLocation(jPanel2.getX()+10,jPanel2.getY()+10);
        }
         if((LABEL.getX()>jPanel3.getX() && LABEL.getX()<jPanel3.getX()+jPanel3.getWidth())
            && (LABEL.getY()>jPanel3.getY() && LABEL.getY()<jPanel3.getY()+jPanel3.getHeight())){
            System.out.println("PANEL 3");
            panel3 = LABEL.getText();
            LABEL.setLocation(jPanel3.getX()+10,jPanel3.getY()+10);
        }
         
          if((LABEL.getX()>jPanel4.getX() && LABEL.getX()<jPanel4.getX()+jPanel4.getWidth())
            && (LABEL.getY()>jPanel4.getY() && LABEL.getY()<jPanel4.getY()+jPanel4.getHeight())){
            System.out.println("PANEL 4");
            panel4 = LABEL.getText();
            LABEL.setLocation(jPanel4.getX()+10,jPanel4.getY()+10);
        }
     
        if ((LABEL.getX() > jPanel5.getX() && LABEL.getX() < jPanel5.getX() + jPanel5.getWidth())
                && (LABEL.getY() > jPanel5.getY() && LABEL.getY() < jPanel5.getY() + jPanel5.getHeight())) {
            System.out.println("PANEL 5");
            panel5 = LABEL.getText();
            LABEL.setLocation(jPanel5.getX()+10,jPanel5.getY()+10);
        }
        if ((LABEL.getX() > jPanel6.getX() && LABEL.getX() < jPanel6.getX() + jPanel6.getWidth())
                && (LABEL.getY() > jPanel6.getY() && LABEL.getY() < jPanel6.getY() + jPanel6.getHeight())) {
            System.out.println("PANEL 6");
            panel6 = LABEL.getText();
            LABEL.setLocation(jPanel6.getX()+10,jPanel6.getY()+10);
        }
        if ((LABEL.getX() > jPanel7.getX() && LABEL.getX() < jPanel7.getX() + jPanel7.getWidth())
                && (LABEL.getY() > jPanel7.getY() && LABEL.getY() < jPanel7.getY() + jPanel7.getHeight())) {
            System.out.println("PANEL 7");
            panel7 = LABEL.getText();
            LABEL.setLocation(jPanel7.getX()+10,jPanel7.getY()+10);
        }
        if ((LABEL.getX() > jPanel8.getX() && LABEL.getX() < jPanel8.getX() + jPanel8.getWidth())
                && (LABEL.getY() > jPanel8.getY() && LABEL.getY() < jPanel8.getY() + jPanel8.getHeight())) {
            System.out.println("PANEL 8");
            panel8 = LABEL.getText();
            LABEL.setLocation(jPanel8.getX()+10,jPanel8.getY()+10);
        }
        if ((LABEL.getX() > jPanel9.getX() && LABEL.getX() < jPanel9.getX() + jPanel9.getWidth())
                && (LABEL.getY() > jPanel9.getY() && LABEL.getY() < jPanel9.getY() + jPanel9.getHeight())) {
            System.out.println("PANEL 9");
            panel9 = LABEL.getText();
            LABEL.setLocation(jPanel9.getX()+10,jPanel9.getY()+10);
        }
        if ((LABEL.getX() > jPanel10.getX() && LABEL.getX() < jPanel10.getX() + jPanel10.getWidth())
                && (LABEL.getY() > jPanel10.getY() && LABEL.getY() < jPanel10.getY() + jPanel10.getHeight())) {
            System.out.println("PANEL 10");
            panel10 = LABEL.getText();
            LABEL.setLocation(jPanel10.getX()+10,jPanel10.getY()+10);
        }
         if ((LABEL.getX() > jPanel11.getX() && LABEL.getX() < jPanel11.getX() + jPanel11.getWidth())
                && (LABEL.getY() > jPanel11.getY() && LABEL.getY() < jPanel11.getY() + jPanel11.getHeight())) {
            System.out.println("PANEL 11");
            panel11 = LABEL.getText();
            LABEL.setLocation(jPanel11.getX()+10,jPanel11.getY()+10);
        }
          if ((LABEL.getX() > jPanel12.getX() && LABEL.getX() < jPanel12.getX() + jPanel12.getWidth())
                && (LABEL.getY() > jPanel12.getY() && LABEL.getY() < jPanel12.getY() + jPanel12.getHeight())) {
            System.out.println("PANEL 12");
            panel12 = LABEL.getText(); 
            LABEL.setLocation(jPanel12.getX()+10,jPanel12.getY()+10);
        }
    }
    
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
            java.util.logging.Logger.getLogger(puzzle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puzzle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puzzle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puzzle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puzzle2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Interrogante;
    private javax.swing.JLabel MADERA;
    private javax.swing.JButton VERIFICAR;
    private javax.swing.JLabel confetti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
