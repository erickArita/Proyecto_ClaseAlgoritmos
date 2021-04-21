package Proyecto;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import javax.swing.table.DefaultTableModel;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import org.jdom2.JDOMException;

public class Consulta extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    Controlador dom = new Controlador();

    public Consulta() throws IOException, JDOMException {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        Shape roundEdges = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 50);
        AWTUtilities.setWindowShape(this, roundEdges);
        llenarTabla();
    }

    private void llenarTabla() throws IOException, JDOMException {

        dom.getPersons().forEach((person) -> 
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

        jScrollPane2.setBackground(new java.awt.Color(255, 51, 51));

        tabla.setBackground(new java.awt.Color(84, 91, 109));
        tabla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(249, 255, 255));
        tabla.setModel(model
        );
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");
        model.addColumn("Edad");
        model.addColumn("Sexo");
        model.addColumn("Nacionalidad");
        tabla.setEnabled(false);
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setRowHeight(50);
        tabla.setSelectionBackground(new java.awt.Color(37, 35, 49));
        jScrollPane2.setViewportView(tabla);

        jPanelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 960, -1));

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
