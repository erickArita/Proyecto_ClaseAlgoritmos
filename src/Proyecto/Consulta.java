
package Proyecto;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.WindowConstants;

public class Consulta extends javax.swing.JFrame {

    public Consulta() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Shape roundEdges = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,50,50);
        AWTUtilities.setWindowShape(this, roundEdges);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabelConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setBackground(new java.awt.Color(37, 35, 49));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnCerrar.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setFocusPainted(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnCerrar2.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        jLabelConsulta.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabelConsulta.setForeground(new java.awt.Color(249, 255, 255));
        jLabelConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConsulta.setText("Consultar Datos");
        jLabelConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelPrincipal.add(jLabelConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 60));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
