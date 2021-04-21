package Proyecto;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class Eliminacion extends javax.swing.JFrame {

    public Eliminacion() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        Shape roundEdges = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 50);
        AWTUtilities.setWindowShape(this, roundEdges);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEditPerson = new javax.swing.JLabel();
        jLabelNacionalidad = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        btnFind_Delete = new javax.swing.JButton();
        jTextNacionalidad = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jLabelMessage = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 35, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEditPerson.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabelEditPerson.setForeground(new java.awt.Color(249, 255, 255));
        jLabelEditPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditPerson.setText("Eliminar Persona");
        jLabelEditPerson.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelEditPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 60));

        jLabelNacionalidad.setFont(new java.awt.Font("SimSun", 1, 27)); // NOI18N
        jLabelNacionalidad.setForeground(new java.awt.Color(249, 255, 255));
        jLabelNacionalidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNacionalidad.setText("Nacionalidad:");
        jLabelNacionalidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 500, -1));

        jLabelApellido.setFont(new java.awt.Font("SimSun", 1, 27)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(249, 255, 255));
        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelApellido.setText("Apellido:");
        jLabelApellido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 500, -1));

        jLabelEdad.setFont(new java.awt.Font("SimSun", 1, 27)); // NOI18N
        jLabelEdad.setForeground(new java.awt.Color(249, 255, 255));
        jLabelEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEdad.setText("Edad:");
        jLabelEdad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 500, -1));

        jLabelID.setFont(new java.awt.Font("SimSun", 1, 27)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(249, 255, 255));
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelID.setText("ID:");
        jLabelID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 500, -1));

        jLabelSexo.setFont(new java.awt.Font("SimSun", 1, 27)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(249, 255, 255));
        jLabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSexo.setText("Sexo:");
        jLabelSexo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 500, -1));

        jLabelNombre.setFont(new java.awt.Font("SimSun", 1, 27)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(249, 255, 255));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre:");
        jLabelNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, -1));

        btnFind_Delete.setBackground(new java.awt.Color(37, 35, 49));
        btnFind_Delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFind_Delete.setForeground(new java.awt.Color(249, 255, 255));
        btnFind_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnBuscarPersona.png"))); // NOI18N
        btnFind_Delete.setText("Buscar");
        btnFind_Delete.setBorderPainted(false);
        btnFind_Delete.setContentAreaFilled(false);
        btnFind_Delete.setFocusPainted(false);
        btnFind_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFind_Delete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnBuscarPersona2.png"))); // NOI18N
        btnFind_Delete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFind_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnFind_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 160, 130));

        jTextNacionalidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextNacionalidad.setForeground(new java.awt.Color(0, 0, 28));
        jTextNacionalidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNacionalidad.setEnabled(false);
        jPanel1.add(jTextNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 350, -1));

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        jComboBoxSexo.setEnabled(false);
        jPanel1.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 350, -1));

        jTextNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(0, 0, 28));
        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 350, -1));

        jTextApellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextApellido.setForeground(new java.awt.Color(0, 0, 28));
        jTextApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 350, -1));

        jTextEdad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextEdad.setForeground(new java.awt.Color(0, 0, 28));
        jTextEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEdad.setEnabled(false);
        jPanel1.add(jTextEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 350, -1));

        jTextID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextID.setForeground(new java.awt.Color(0, 0, 28));
        jTextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 350, -1));

        jLabelMessage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(255, 45, 0));
        jLabelMessage.setText("Rellene los datos de la persona a eliminar");
        jLabelMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 360, 30));

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
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFind_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind_DeleteActionPerformed
        jTextEdad.setEnabled(true);
        jTextNacionalidad.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        btnFind_Delete.setBackground(new java.awt.Color(37, 35, 49));
        btnFind_Delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFind_Delete.setForeground(new java.awt.Color(249, 255, 255));
        btnFind_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnAddPersona.png"))); // NOI18N
        btnFind_Delete.setText("Eliminar");
        jLabelMessage.setText("Presione eliminar");
        jLabelMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 350, 30));
        btnFind_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind_DeleteActionPerformedDel(evt);
            }
        });
    }//GEN-LAST:event_btnFind_DeleteActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnFind_DeleteActionPerformedDel(java.awt.event.ActionEvent ev) {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFind_Delete;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEditPerson;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelNacionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNacionalidad;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
