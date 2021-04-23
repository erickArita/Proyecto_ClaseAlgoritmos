package Proyecto;

import com.sun.awt.AWTUtilities;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
import org.jdom2.JDOMException;

public class Menu extends javax.swing.JFrame {

    int x, y;
    App app = new App();
    public Menu() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Shape roundEdges = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 50);
        AWTUtilities.setWindowShape(this, roundEdges);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBarra = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jTextPrincipal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarra.setBackground(new java.awt.Color(32, 30, 42));
        jPanelBarra.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarraMouseDragged(evt);
            }
        });
        jPanelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarraMousePressed(evt);
            }
        });
        jPanelBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnCerrar.png"))); // NOI18N
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setFocusPainted(false);
        btnClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnCerrar2.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanelBarra.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1051, 6, 28, 28));

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnMinimizar.png"))); // NOI18N
        btnMinimize.setBorderPainted(false);
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setFocusPainted(false);
        btnMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnMinimizar2.png"))); // NOI18N
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });
        jPanelBarra.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 6, 28, 28));

        getContentPane().add(jPanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1098, -1));

        jPanelPrincipal.setBackground(new java.awt.Color(32, 30, 42));
        jPanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setBackground(new java.awt.Color(32, 30, 42));
        btnDelete.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(249, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnEliminar.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setFocusPainted(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnEliminar3.png"))); // NOI18N
        btnDelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnEliminar2.png"))); // NOI18N
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 180, 220));

        btnEditar.setBackground(new java.awt.Color(32, 30, 42));
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(249, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnEditar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setFocusPainted(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnEditar3.png"))); // NOI18N
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnEditar2.png"))); // NOI18N
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 180, 220));

        btnAdd.setBackground(new java.awt.Color(32, 30, 42));
        btnAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(249, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnAdd.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setFocusPainted(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnAdd3.png"))); // NOI18N
        btnAdd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnAdd2.png"))); // NOI18N
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 180, 220));

        btnConsultar.setBackground(new java.awt.Color(32, 30, 42));
        btnConsultar.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(249, 255, 255));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnConsultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorderPainted(false);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setFocusPainted(false);
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnConsultar3.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnConsultar2.png"))); // NOI18N
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 180, 220));

        jTextPrincipal.setEditable(false);
        jTextPrincipal.setBackground(new java.awt.Color(32, 30, 42));
        jTextPrincipal.setFont(new java.awt.Font("Bahnschrift", 1, 60)); // NOI18N
        jTextPrincipal.setForeground(new java.awt.Color(249, 255, 255));
        jTextPrincipal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPrincipal.setText("Registro de Personas");
        jTextPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPrincipal.setVerifyInputWhenFocusTarget(false);
        jPanelPrincipal.add(jTextPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 650, 120));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        m.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed
    //Para poder mover la ventana.
    private void jPanelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanelBarraMousePressed

    private void jPanelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraMouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y);
    }//GEN-LAST:event_jPanelBarraMouseDragged

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        new Edicion().setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        new Registro().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            new Consulta().setVisible(true);
        } catch (IOException | JDOMException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnConsultarActionPerformed

    

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        new Eliminacion().setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTextField jTextPrincipal;
    // End of variables declaration//GEN-END:variables
}
