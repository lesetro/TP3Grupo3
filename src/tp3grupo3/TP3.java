/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp3grupo3;

import javax.swing.JOptionPane;

/**
 *
 * @author Charly Cimino
 */
public class TP3 extends javax.swing.JFrame {

    private String correo;
    private String contraseña;
    private boolean PasswordVisible = true;
    /**
     * Creates new form TP3
     */
    public TP3() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPpanalPrincipal = new javax.swing.JPanel();
        JLnombre = new javax.swing.JLabel();
        jTCorreo = new javax.swing.JTextField();
        JLContraseña = new javax.swing.JLabel();
        jPpanelSecundario = new javax.swing.JPanel();
        jBrecuperarContraseña = new javax.swing.JButton();
        jBverificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBGenerarCredenciales = new javax.swing.JButton();
        jPasswordTexto = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBIconoOjo = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabajo Practico 3 lado A");
        setForeground(new java.awt.Color(102, 51, 255));

        jPpanalPrincipal.setBackground(new java.awt.Color(102, 102, 255));
        jPpanalPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray));

        JLnombre.setBackground(new java.awt.Color(153, 153, 255));
        JLnombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLnombre.setForeground(new java.awt.Color(0, 0, 153));
        JLnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLnombre.setText("Usuario");
        JLnombre.setAlignmentY(0.1F);
        JLnombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(153, 153, 255), java.awt.Color.white, new java.awt.Color(102, 102, 255)));
        JLnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTCorreo.setBackground(new java.awt.Color(204, 204, 255));
        jTCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jTCorreo.setText("Ingrese su correo electronico");
        jTCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCorreoFocusGained(evt);
            }
        });
        jTCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCorreoActionPerformed(evt);
            }
        });

        JLContraseña.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLContraseña.setForeground(new java.awt.Color(0, 0, 153));
        JLContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLContraseña.setText("Contraseña");
        JLContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(102, 102, 255), java.awt.Color.white, java.awt.Color.gray));
        JLContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPpanelSecundario.setBackground(new java.awt.Color(153, 153, 255));
        jPpanelSecundario.setForeground(new java.awt.Color(102, 102, 255));

        jBrecuperarContraseña.setText("Recuperar contraseña");
        jBrecuperarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrecuperarContraseñaActionPerformed(evt);
            }
        });

        jBverificar.setText("Verificar");
        jBverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBverificarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp3grupo3/information_3157922.png"))); // NOI18N

        jBGenerarCredenciales.setText("Generar credenciales");
        jBGenerarCredenciales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jBGenerarCredencialesStateChanged(evt);
            }
        });
        jBGenerarCredenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenerarCredencialesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPpanelSecundarioLayout = new javax.swing.GroupLayout(jPpanelSecundario);
        jPpanelSecundario.setLayout(jPpanelSecundarioLayout);
        jPpanelSecundarioLayout.setHorizontalGroup(
            jPpanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPpanelSecundarioLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPpanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBrecuperarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jBGenerarCredenciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
            .addGroup(jPpanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPpanelSecundarioLayout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(jBverificar, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addGap(98, 98, 98)))
        );
        jPpanelSecundarioLayout.setVerticalGroup(
            jPpanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPpanelSecundarioLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPpanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPpanelSecundarioLayout.createSequentialGroup()
                        .addComponent(jBGenerarCredenciales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBrecuperarContraseña)))
                .addGap(19, 19, 19))
            .addGroup(jPpanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPpanelSecundarioLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jBverificar)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );

        jPasswordTexto.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordTexto.setForeground(new java.awt.Color(102, 102, 255));
        jPasswordTexto.setText("jPasswordField1");

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio de sesión");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese las credenciales");

        jBIconoOjo.setBackground(new java.awt.Color(153, 51, 255));
        jBIconoOjo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp3grupo3/eye_.png"))); // NOI18N
        jBIconoOjo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jBIconoOjoComponentHidden(evt);
            }
        });
        jBIconoOjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIconoOjoActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(102, 102, 255));
        jTextField1.setForeground(new java.awt.Color(102, 102, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPpanalPrincipalLayout = new javax.swing.GroupLayout(jPpanalPrincipal);
        jPpanalPrincipal.setLayout(jPpanalPrincipalLayout);
        jPpanalPrincipalLayout.setHorizontalGroup(
            jPpanalPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpanalPrincipalLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPpanalPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPpanelSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPpanalPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPpanalPrincipalLayout.createSequentialGroup()
                        .addGroup(jPpanalPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(jPpanalPrincipalLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPasswordTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBIconoOjo)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPpanalPrincipalLayout.setVerticalGroup(
            jPpanalPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPpanalPrincipalLayout.createSequentialGroup()
                .addGroup(jPpanalPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPpanalPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPpanalPrincipalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPpanalPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPpanalPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPpanalPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPpanalPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPpanalPrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBIconoOjo)))
                .addGap(42, 42, 42)
                .addComponent(jPpanelSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPpanalPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPpanalPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBverificarActionPerformed
        // TODO add your handling code here:
        try {
            String verificoCorreo = jTCorreo.getText();
            String verificoContraseña = jPasswordTexto.getText();

            if (verificoCorreo.equalsIgnoreCase(this.correo)) {

                if (verificoContraseña.equalsIgnoreCase(this.contraseña)) {
                    JOptionPane.showMessageDialog(this, "Su correo y contraseña son correctos");
                    jTCorreo.setText("");
                    jPasswordTexto.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, "su contraseña es incorrecta");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Su correo es incorrecto");
            }

        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, "Correo y contraseña incorrectos");
        }


    }//GEN-LAST:event_jBverificarActionPerformed

    private void jBGenerarCredencialesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jBGenerarCredencialesStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGenerarCredencialesStateChanged

    private void jBGenerarCredencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenerarCredencialesActionPerformed
        // Validación del correo
        try {
            correo = jTCorreo.getText();
            contraseña = jPasswordTexto.getText();

            if (!correo.contains("@")) {
                JOptionPane.showMessageDialog(this, "Correo inválido. Debe contener un '@'.");
                throw new IllegalArgumentException("Correo inválido"); // Lanza una excepción para detener la ejecución

            }
            JOptionPane.showMessageDialog(this, "Correo: " + correo + "\nContraseña: " + "*********** " + "\nSe guardo sactifactoriamente");

            jTCorreo.setText("");
            jPasswordTexto.setText("");

            System.out.println("Correo: " + correo);
            System.out.println("Contraseña: " + contraseña);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar datos: " + e.getMessage());
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_jBGenerarCredencialesActionPerformed

    private void jTCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCorreoFocusGained
        // TODO add your handling code here:
        if (jTCorreo.getText().equals("Ingrese su correo electronico")) {
            jTCorreo.setText(""); // Borra el texto solo si es el mensaje predeterminado
            jPasswordTexto.setText("");
        }
    }//GEN-LAST:event_jTCorreoFocusGained

    private void jTCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCorreoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jBIconoOjoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jBIconoOjoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIconoOjoComponentHidden

    private void jBIconoOjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIconoOjoActionPerformed
        // TODO add your handling code here:
         if (PasswordVisible) {
        // La contraseña es visible, ocultarla
        jPasswordTexto.setEchoChar('*'); // Mostrar asteriscos
        jBIconoOjo.setIcon(new javax.swing.ImageIcon(getClass().getResource("eye_.png"))); // Cambiar el ícono
        PasswordVisible = false;
    } else {
        // La contraseña está oculta, mostrarla
        jPasswordTexto.setEchoChar((char) 0); // Mostrar texto sin máscara
        jBIconoOjo.setIcon(new javax.swing.ImageIcon(getClass().getResource("eye_15430196.png"))); // Cambiar el ícono a uno de "ojo abierto"
        PasswordVisible = true;
    }
               
    }//GEN-LAST:event_jBIconoOjoActionPerformed

    private void jBrecuperarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrecuperarContraseñaActionPerformed
       JOptionPane.showConfirmDialog(this, "¿Desea enviar la contraseña a su correo?", "Recuperacion de Contraseña", JOptionPane.ERROR_MESSAGE); // TODO add your handling code here:
    }//GEN-LAST:event_jBrecuperarContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(TP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TP3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLContraseña;
    private javax.swing.JLabel JLnombre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBGenerarCredenciales;
    private javax.swing.JButton jBIconoOjo;
    private javax.swing.JButton jBrecuperarContraseña;
    private javax.swing.JButton jBverificar;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordTexto;
    private javax.swing.JPanel jPpanalPrincipal;
    private javax.swing.JPanel jPpanelSecundario;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
