package Formularios;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Frm_Login extends javax.swing.JFrame {
        int xMouse, yMouse;
    
    public Frm_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }


    
    private void login(){
        String usuario ="grupo7";
        String clave = "12345";
        
        String user = txt_usuario.getText();
        String pass = txt_password.getText();
        
        if(usuario.equals(user) && clave.equals(pass)){
            Frm_Menú ing = new Frm_Menú();
            ing.setVisible(true);
            ing.show();
            dispose();
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Datos incorrectos.");
            txt_usuario.setText("");
            txt_password.setText("");
            txt_usuario.requestFocus();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entrarbtn = new javax.swing.JPanel();
        entrartxt = new javax.swing.JLabel();
        iniciarsesion = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        usuario2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        exitbtn = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Inventario");
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entrarbtn.setBackground(new java.awt.Color(255, 204, 102));
        entrarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        entrarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarbtnMouseClicked(evt);
            }
        });

        entrartxt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        entrartxt.setForeground(new java.awt.Color(255, 255, 255));
        entrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrartxt.setText("ENTRAR");
        entrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarbtnLayout = new javax.swing.GroupLayout(entrarbtn);
        entrarbtn.setLayout(entrarbtnLayout);
        entrarbtnLayout.setHorizontalGroup(
            entrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarbtnLayout.createSequentialGroup()
                .addComponent(entrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        entrarbtnLayout.setVerticalGroup(
            entrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entrarbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(entrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(entrarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 140, 40));

        iniciarsesion.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        iniciarsesion.setForeground(new java.awt.Color(0, 0, 0));
        iniciarsesion.setText("INICIAR SESIÓN");
        jPanel1.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        usuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("USUARIO");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(153, 153, 153));
        txt_usuario.setText("Ingrese su usuario");
        txt_usuario.setBorder(null);
        txt_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 350, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 340, 20));

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("CONTRASEÑA");
        usuario2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setText("*******");
        txt_password.setBorder(null);
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passwordMousePressed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 340, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 340, 20));

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));

        exittxt.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        exittxt.setForeground(new java.awt.Color(0, 0, 0));
        exittxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exittxt.setText("X");
        exittxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exittxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exittxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exittxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exittxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exittxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exittxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exittxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image 3 (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 360, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stir.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Esmirma (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 190, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseClicked
        this.  login();
    }//GEN-LAST:event_entrartxtMouseClicked

    private void entrartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseEntered
        entrarbtn.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_entrartxtMouseEntered

    private void entrartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseExited
        entrarbtn.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_entrartxtMouseExited

    private void entrarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarbtnMouseClicked

    }//GEN-LAST:event_entrarbtnMouseClicked

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if(txt_usuario.getText().equals("Ingrese su usuario")){
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if(String.valueOf(txt_password.getPassword()).isEmpty()){
            txt_password.setText("*******");
            txt_password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            txt_password.requestFocus();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMousePressed
        if(String.valueOf(txt_password.getPassword()).equals("*******")){
            txt_password.setText("");
            txt_password.setForeground(Color.black);
        }
        if(txt_usuario.getText().isEmpty()){
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_passwordMousePressed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.  login();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void exittxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exittxtMouseClicked

    private void exittxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseEntered
        exitbtn.setBackground(Color.red);
        exittxt.setForeground(Color.white);
    }//GEN-LAST:event_exittxtMouseEntered

    private void exittxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseExited
        exitbtn.setBackground(Color.white);
        exittxt.setForeground(Color.black);
    }//GEN-LAST:event_exittxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

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
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel entrarbtn;
    private javax.swing.JLabel entrartxt;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel exittxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario2;
    // End of variables declaration//GEN-END:variables
}
