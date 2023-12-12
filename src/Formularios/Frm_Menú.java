package Formularios;



import java.awt.Color;
import javax.swing.UIManager;

public class Frm_Menú extends javax.swing.JFrame {

    
    public Frm_Menú() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        txt_menu.requestFocus();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contenedor = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_menu2 = new javax.swing.JLabel();
        txt_menu = new javax.swing.JLabel();
        Productosbtn = new javax.swing.JPanel();
        Productostxt = new javax.swing.JLabel();
        Entradasbtn = new javax.swing.JPanel();
        Entradastxt = new javax.swing.JLabel();
        Salidasbtn = new javax.swing.JPanel();
        Salidastxt = new javax.swing.JLabel();
        Inventeriobtn = new javax.swing.JPanel();
        Inventariotxt = new javax.swing.JLabel();
        Salirbtn = new javax.swing.JPanel();
        Salirtxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(195, 233, 199));
        jPanel1.setForeground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(255, 204, 153));
        contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1038, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jPanel1.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 1040, 550));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sistema de Inventario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stir.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 10, 230, 100));

        txt_menu2.setBackground(new java.awt.Color(204, 204, 204));
        txt_menu2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt_menu2.setForeground(new java.awt.Color(0, 0, 0));
        txt_menu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Esmirma (1).png"))); // NOI18N
        jPanel1.add(txt_menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 50));

        txt_menu.setBackground(new java.awt.Color(204, 204, 204));
        txt_menu.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txt_menu.setForeground(new java.awt.Color(0, 0, 0));
        txt_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_menu.setText("MENU PRINCIPAL");
        jPanel1.add(txt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, -1));

        Productosbtn.setBackground(new java.awt.Color(204, 204, 204));

        Productostxt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Productostxt.setForeground(new java.awt.Color(0, 0, 0));
        Productostxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Productostxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Food Receiver.png"))); // NOI18N
        Productostxt.setText("Productos");
        Productostxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductostxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductostxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductostxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ProductosbtnLayout = new javax.swing.GroupLayout(Productosbtn);
        Productosbtn.setLayout(ProductosbtnLayout);
        ProductosbtnLayout.setHorizontalGroup(
            ProductosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Productostxt, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        ProductosbtnLayout.setVerticalGroup(
            ProductosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Productostxt, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel1.add(Productosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, -1));

        Entradasbtn.setBackground(new java.awt.Color(204, 204, 204));

        Entradastxt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Entradastxt.setForeground(new java.awt.Color(0, 0, 0));
        Entradastxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entradastxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paquete 1.png"))); // NOI18N
        Entradastxt.setText("Entradas");
        Entradastxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradastxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntradastxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntradastxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EntradasbtnLayout = new javax.swing.GroupLayout(Entradasbtn);
        Entradasbtn.setLayout(EntradasbtnLayout);
        EntradasbtnLayout.setHorizontalGroup(
            EntradasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entradastxt, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        EntradasbtnLayout.setVerticalGroup(
            EntradasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entradastxt, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel1.add(Entradasbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        Salidasbtn.setBackground(new java.awt.Color(204, 204, 204));

        Salidastxt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Salidastxt.setForeground(new java.awt.Color(0, 0, 0));
        Salidastxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salidastxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras 1.png"))); // NOI18N
        Salidastxt.setText("Salidas");
        Salidastxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalidastxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalidastxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalidastxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalidasbtnLayout = new javax.swing.GroupLayout(Salidasbtn);
        Salidasbtn.setLayout(SalidasbtnLayout);
        SalidasbtnLayout.setHorizontalGroup(
            SalidasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salidastxt, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        SalidasbtnLayout.setVerticalGroup(
            SalidasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salidastxt, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel1.add(Salidasbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        Inventeriobtn.setBackground(new java.awt.Color(204, 204, 204));

        Inventariotxt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Inventariotxt.setForeground(new java.awt.Color(0, 0, 0));
        Inventariotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventariotxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.png"))); // NOI18N
        Inventariotxt.setText("Inventario");
        Inventariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventariotxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InventariotxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InventariotxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout InventeriobtnLayout = new javax.swing.GroupLayout(Inventeriobtn);
        Inventeriobtn.setLayout(InventeriobtnLayout);
        InventeriobtnLayout.setHorizontalGroup(
            InventeriobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inventariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        InventeriobtnLayout.setVerticalGroup(
            InventeriobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inventariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel1.add(Inventeriobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        Salirbtn.setBackground(new java.awt.Color(204, 204, 204));

        Salirtxt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Salirtxt.setForeground(new java.awt.Color(0, 0, 0));
        Salirtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salirtxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida 1.png"))); // NOI18N
        Salirtxt.setText("Cerrar Sesión");
        Salirtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirtxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalirbtnLayout = new javax.swing.GroupLayout(Salirbtn);
        Salirbtn.setLayout(SalirbtnLayout);
        SalirbtnLayout.setHorizontalGroup(
            SalirbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salirtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        SalirbtnLayout.setVerticalGroup(
            SalirbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salirtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel1.add(Salirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductostxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductostxtMouseClicked
          Frm_Productos f = new Frm_Productos();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_ProductostxtMouseClicked

    private void ProductostxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductostxtMouseEntered
        Productosbtn.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_ProductostxtMouseEntered

    private void ProductostxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductostxtMouseExited
         Productosbtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_ProductostxtMouseExited

    private void EntradastxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradastxtMouseClicked
          Frm_Entrada f = new Frm_Entrada();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_EntradastxtMouseClicked

    private void EntradastxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradastxtMouseEntered
        Entradasbtn.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_EntradastxtMouseEntered

    private void EntradastxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradastxtMouseExited
         Entradasbtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_EntradastxtMouseExited

    private void SalidastxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidastxtMouseClicked
       Frm_Salida f = new Frm_Salida();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_SalidastxtMouseClicked

    private void SalidastxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidastxtMouseEntered
        Salidasbtn.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_SalidastxtMouseEntered

    private void SalidastxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidastxtMouseExited
         Salidasbtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_SalidastxtMouseExited

    private void InventariotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariotxtMouseClicked
          Frm_Inventario f = new Frm_Inventario();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_InventariotxtMouseClicked

    private void InventariotxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariotxtMouseEntered
        Inventeriobtn.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_InventariotxtMouseEntered

    private void InventariotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariotxtMouseExited
         Inventeriobtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_InventariotxtMouseExited

    private void SalirtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirtxtMouseClicked
                    Frm_Login ing = new Frm_Login();
            ing.setVisible(true);
            ing.show();
            dispose();
    }//GEN-LAST:event_SalirtxtMouseClicked

    private void SalirtxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirtxtMouseEntered
        Salirbtn.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_SalirtxtMouseEntered

    private void SalirtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirtxtMouseExited
         Salirbtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_SalirtxtMouseExited

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
            java.util.logging.Logger.getLogger(Frm_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Entradasbtn;
    private javax.swing.JLabel Entradastxt;
    private javax.swing.JLabel Inventariotxt;
    private javax.swing.JPanel Inventeriobtn;
    private javax.swing.JPanel Productosbtn;
    private javax.swing.JLabel Productostxt;
    private javax.swing.JPanel Salidasbtn;
    private javax.swing.JLabel Salidastxt;
    private javax.swing.JPanel Salirbtn;
    private javax.swing.JLabel Salirtxt;
    public static javax.swing.JDesktopPane contenedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_menu;
    private javax.swing.JLabel txt_menu2;
    // End of variables declaration//GEN-END:variables
}
