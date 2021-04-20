package Proyecto;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import javax.swing.table.DefaultTableModel;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.JDOMException;

public class Consulta extends javax.swing.JFrame {

    ArrayList<Persona> listaDePersonas;
    DefaultTableModel model = new DefaultTableModel();

    public Consulta() throws IOException, JDOMException {
        this.listaDePersonas = new GeneradorDOM().getPersons();
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        Shape roundEdges = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 50);
        AWTUtilities.setWindowShape(this, roundEdges);
        llenarTabla();
    }

    private void llenarTabla() {

        listaDePersonas.forEach((person) -> 
            model.addRow(new Object[]{
                person.getNombre(),
                person.getApellido(),
                person.getDni(),
                person.getEdad(),
                person.getSexo(),
                person.getNacionalidad()}
            )
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabelConsulta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

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

        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");
        model.addColumn("Edad");
        model.addColumn("Sexo");
        model.addColumn("Nacionalidad");
        tabla.setModel(model);
        jScrollPane2.setViewportView(tabla);

        jPanelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 940, -1));

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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
