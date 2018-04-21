
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Boriannys
 */
public class jfrmRecurso extends javax.swing.JFrame {

    /**
     * Creates new form jfrmRecurso
     */
    public jfrmRecurso() {
        initComponents();
    }
//-------------------------------------
    public JButton getBtnCancelar()
    {
        return btnCancelar;
    }
//-----------------------------------
    public JButton getBtnGuardar() 
    {
        return btnGuardar;
    }
//----------------------------------
    public JButton getBtnSalir() 
    {
        return btnSalir;
    }
//---------------------------------
    public JComboBox getCmbAnno() 
    {
        return cmbAnno;
    }
//---------------------------------
    public JTextField getTxtCodigo() 
    {
        return txtCodigo;
    }
//-------------------------------------
    public JTextField getTxtEstado()
    {
        return txtEstado;
    }
//------------------------------------
    public JTextField getTxtModelo() 
    {
        return txtCantidadExistente;
    }
//-----------------------------------

    public JTextField getTxtTipo()
    {
        return txtTipo;
    }
//---------------------------------------

    public JTextField getTxtCantidadExistente()
    {
        return txtCantidadExistente;
    }
//------------------------------------------    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmUsuario = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblCantidadExistente = new javax.swing.JLabel();
        txtCantidadExistente = new javax.swing.JTextField();
        lblCausa = new javax.swing.JLabel();
        cmbAnno = new javax.swing.JComboBox();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        frmOpciones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frmUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recurso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCodigo.setText("Código");

        lblCantidadExistente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCantidadExistente.setText("Cantidad Existente");

        lblCausa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCausa.setText("Causa");

        cmbAnno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        lblEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEstado.setText("Estado");

        lblTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTipo.setText("Tipo");

        javax.swing.GroupLayout frmUsuarioLayout = new javax.swing.GroupLayout(frmUsuario);
        frmUsuario.setLayout(frmUsuarioLayout);
        frmUsuarioLayout.setHorizontalGroup(
            frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(lblEstado)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo)
                    .addComponent(txtEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAnno, 0, 145, Short.MAX_VALUE)
                    .addComponent(lblCantidadExistente)
                    .addComponent(txtCantidadExistente))
                .addGap(45, 45, 45))
        );
        frmUsuarioLayout.setVerticalGroup(
            frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUsuarioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblCausa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblTipo)
                .addGap(18, 18, 18)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmUsuarioLayout.createSequentialGroup()
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstado)
                            .addComponent(txtCantidadExistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCantidadExistente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        frmOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setText("Salir");

        javax.swing.GroupLayout frmOpcionesLayout = new javax.swing.GroupLayout(frmOpciones);
        frmOpciones.setLayout(frmOpcionesLayout);
        frmOpcionesLayout.setHorizontalGroup(
            frmOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmOpcionesLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        frmOpcionesLayout.setVerticalGroup(
            frmOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmOpcionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(frmOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frmUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frmOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frmUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frmOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void agregarListener (ActionListener accion)
{
    this.btnCancelar.addActionListener(accion);
    this.btnGuardar.addActionListener(accion);
    this.btnSalir.addActionListener(accion);
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbAnno;
    private javax.swing.JPanel frmOpciones;
    private javax.swing.JPanel frmUsuario;
    private javax.swing.JLabel lblCantidadExistente;
    private javax.swing.JLabel lblCausa;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtCantidadExistente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
