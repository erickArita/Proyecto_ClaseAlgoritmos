package Proyecto;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.JDOMException;

public class Eliminacion extends javax.swing.JFrame {

    Controlador controlador = new Controlador();

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
        jLabelDni = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        btnFind_Delete = new javax.swing.JButton();
        jTextNacionalidad = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jTextDni = new javax.swing.JTextField();
        jLabelLlenarAll = new javax.swing.JLabel();
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

        jLabelDni.setFont(new java.awt.Font("SimSun", 1, 27)); // NOI18N
        jLabelDni.setForeground(new java.awt.Color(249, 255, 255));
        jLabelDni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDni.setText("DNI:");
        jLabelDni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 500, -1));

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
        jTextNombre.setEnabled(false);
        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 350, -1));

        jTextApellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextApellido.setForeground(new java.awt.Color(0, 0, 28));
        jTextApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextApellido.setEnabled(false);
        jPanel1.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 350, -1));

        jTextEdad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextEdad.setForeground(new java.awt.Color(0, 0, 28));
        jTextEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEdad.setEnabled(false);
        jPanel1.add(jTextEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 350, -1));

        jTextDni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextDni.setForeground(new java.awt.Color(0, 0, 28));
        jTextDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 350, -1));

        jLabelLlenarAll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLlenarAll.setForeground(new java.awt.Color(51, 216, 78));
        jLabelLlenarAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLlenarAll.setText("Busqueda por DNI");
        jLabelLlenarAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelLlenarAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 360, 30));

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
        if (validarDatosVacios(jTextDni.getText())) {
            if (validarNumeros(jTextDni.getText())) {
                controlador.per.setDni(jTextDni.getText());
                if (null == controlador.per.getDni()) {
                    jLabelLlenarAll.setForeground(new java.awt.Color(255, 45, 0));
                    jLabelLlenarAll.setText("No existe base de datos");
                    jLabelLlenarAll.setVisible(true);
                } else {
                    try {
                        if (!validarPersonaExistente()) {
                            int selected = 0;
                            if (controlador.p.getSexo().equals("Masculino")) {
                                selected = 0;
                            } else if (controlador.p.getSexo().equals("Femenino")) {
                                selected = 1;
                            }
                            jTextNombre.setText(controlador.p.getNombre());
                            jTextNombre.setEnabled(true);
                            jTextApellido.setText(controlador.p.getApellido());
                            jTextApellido.setEnabled(true);
                            jTextEdad.setText(controlador.p.getEdad());
                            jTextEdad.setEnabled(true);
                            jTextNacionalidad.setText(controlador.p.getNacionalidad());
                            jTextNacionalidad.setEnabled(true);
                            jComboBoxSexo.setSelectedIndex(selected);
                            jComboBoxSexo.setEnabled(true);
                            
                            btnFind_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnEliminarPersona.png"))); // NOI18N
                            btnFind_Delete.setText("Eliminar");
                            btnFind_Delete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/images/btnEliminarPersona2.png"))); // NOI18N
                            jLabelLlenarAll.setText("Presione eliminar");
                            btnFind_Delete.addActionListener(new java.awt.event.ActionListener() {
                                @Override
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    try {  
                                        btnFind_DeleteActionPerformedDel(evt);
                                    } catch (IOException ex) {
                                        Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
                                    } catch (JDOMException ex) {
                                        Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                     
                                    
                                }
                            });
                        }
                    } catch (IOException | JDOMException ex) {
                        Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                
            }
        }
    }//GEN-LAST:event_btnFind_DeleteActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnFind_DeleteActionPerformedDel(java.awt.event.ActionEvent ev) throws IOException, JDOMException {
        controlador.deletePerson(jTextDni.getText());
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFind_Delete;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEditPerson;
    private javax.swing.JLabel jLabelLlenarAll;
    private javax.swing.JLabel jLabelNacionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNacionalidad;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables

    private boolean validarDatosVacios(String text) {
        if (text.equals("")) {
            jLabelLlenarAll.setText("Rellene todos los datos");
            jLabelLlenarAll.setVisible(true);
            return false;
        } else {
            jLabelLlenarAll.setForeground(new java.awt.Color(51, 216, 78));
            jLabelLlenarAll.setText("Escriba los nuevos datos");
            jLabelLlenarAll.setVisible(true);
            return true;
        }
    }

    private boolean validarNumeros(String text) {
        if (text.matches("[0-9]*")) {
            return true;
        } else {
            jLabelLlenarAll.setForeground(new java.awt.Color(255, 45, 0));
            jLabelLlenarAll.setText("Datos Incorrectos");
            return false;
        }
    }

    private boolean validarPersonaExistente() throws IOException, JDOMException {
        controlador.getPersons();
        if (controlador.getFind()) {
            jLabelLlenarAll.setForeground(new java.awt.Color(51, 216, 78));
            jLabelLlenarAll.setText("Coloque los nuevos datos");
            jLabelLlenarAll.setVisible(true);
            return false;
        } else {
            jLabelLlenarAll.setForeground(new java.awt.Color(255, 45, 0));
            jLabelLlenarAll.setText("Persona no encontrada");
            jLabelLlenarAll.setVisible(true);
            return true;
        }
    }
}
