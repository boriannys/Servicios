
package Vista;

/**
 *
 * @author Conni
 */
import Controlador.ControladorTipoRecursoServicio;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JFrmTipoRecursoServicio extends javax.swing.JFrame 
{

    //----------CONSTRUCTOR-------------
    public JFrmTipoRecursoServicio() {
        initComponents();
    }

    //-----------METODOS GET BOTONES------------

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }
    
    //-----------METODOS GET TEXTO------------

    public JTextField getTxtCantidadSugerida() {
        return txtCantidadSugerida;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmOpciones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        frmServicios = new javax.swing.JPanel();
        txtCantidadSugerida = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblCantidadSugerida = new javax.swing.JLabel();
        lblCausa = new javax.swing.JLabel();
        cmbCausa = new javax.swing.JComboBox<String>();
        lblUnidadMedida = new javax.swing.JLabel();
        lblCausa1 = new javax.swing.JLabel();
        cmbTipoRecurso = new javax.swing.JComboBox<String>();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        cmbServicio = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frmOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setText("Salir");

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setText("Grabar");
        btnEliminar.setActionCommand("Guardar");

        btnModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setActionCommand("Guardar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmOpcionesLayout = new javax.swing.GroupLayout(frmOpciones);
        frmOpciones.setLayout(frmOpcionesLayout);
        frmOpcionesLayout.setHorizontalGroup(
            frmOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmOpcionesLayout.setVerticalGroup(
            frmOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frmServicios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO RECURSO/ SERVICIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        txtCantidadSugerida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadSugeridaActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblCantidadSugerida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCantidadSugerida.setText("Cantidad Sugerida");

        lblCausa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCausa.setText("Causa");

        cmbCausa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCausaActionPerformed(evt);
            }
        });

        lblUnidadMedida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUnidadMedida.setText("Servicio");

        lblCausa1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCausa1.setText("Tipo Recurso");

        cmbTipoRecurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipoRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoRecursoActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCodigo.setText("Código");

        btnConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout frmServiciosLayout = new javax.swing.GroupLayout(frmServicios);
        frmServicios.setLayout(frmServiciosLayout);
        frmServiciosLayout.setHorizontalGroup(
            frmServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmServiciosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmServiciosLayout.createSequentialGroup()
                        .addGroup(frmServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadSugerida)
                            .addGroup(frmServiciosLayout.createSequentialGroup()
                                .addComponent(lblCausa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbCausa, 0, 204, Short.MAX_VALUE)
                            .addComponent(cmbTipoRecurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(253, 253, 253))
                    .addGroup(frmServiciosLayout.createSequentialGroup()
                        .addComponent(lblCantidadSugerida)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(frmServiciosLayout.createSequentialGroup()
                        .addGroup(frmServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblUnidadMedida)
                            .addComponent(lblCausa1)
                            .addGroup(frmServiciosLayout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultar))
                            .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        frmServiciosLayout.setVerticalGroup(
            frmServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmServiciosLayout.createSequentialGroup()
                .addGroup(frmServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmServiciosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblNombre1))
                    .addGroup(frmServiciosLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultar)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblUnidadMedida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCausa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCausa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidadSugerida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidadSugerida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(frmServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frmOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(frmServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(frmOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCantidadSugeridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadSugeridaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadSugeridaActionPerformed

    private void cmbCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCausaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCausaActionPerformed

    private void cmbTipoRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoRecursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoRecursoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCausa;
    private javax.swing.JComboBox cmbServicio;
    private javax.swing.JComboBox<String> cmbTipoRecurso;
    private javax.swing.JPanel frmOpciones;
    private javax.swing.JPanel frmServicios;
    private javax.swing.JLabel lblCantidadSugerida;
    private javax.swing.JLabel lblCausa;
    private javax.swing.JLabel lblCausa1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblUnidadMedida;
    private javax.swing.JTextField txtCantidadSugerida;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    public void agregarListener(ControladorTipoRecursoServicio aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
