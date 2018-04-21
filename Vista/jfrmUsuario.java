/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Boriannys
 */
public class jfrmUsuario extends javax.swing.JFrame {

    /**
     * Creates new form jfrmUsuario
     */
    public jfrmUsuario() {
        initComponents();
    }    public JButton getBtnCancelar() {

        return btnCancelar;
    }

    //public JButton getBtnEliminar() {
       // return btnEliminar;
    //}

    public JButton getBtnGuardar()
    {
        return btnGuardar;
    }
//--------------------------------------
   

    public JButton getBtnSalir() 
    {
        return btnSalir;
    }
//--------------------------------------
    public JTextField getTxtContrasena() 
    {
        return txtContrasena;
    }
//---------------------------------------
    public JComboBox getCmbRol()
    {
        return cmbRol;
    }
//------------------------------------------
    public JTextField getTxtRif()
    {
        return txtRif;
    }

     
    //-------------------------------
    
    @SuppressWarnings("unchecked")
    
    
 public void agregarListener (ActionListener accion)
{
    this.btnCancelar.addActionListener(accion);
    //this.btnEliminar.addActionListener(accion);
    this.btnGuardar.addActionListener(accion);
    this.btnSalir.addActionListener(accion);
    
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmUsuario = new javax.swing.JPanel();
        txtRif = new javax.swing.JTextField();
        lblRif = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        lblRol = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox();
        frmOpciones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        frmUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblRif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRif.setText("Cedula");

        lblContrasena.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblContrasena.setText("Contraseña");

        lblRol.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRol.setText("Rol");

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "01", "02", "03" }));

        javax.swing.GroupLayout frmUsuarioLayout = new javax.swing.GroupLayout(frmUsuario);
        frmUsuario.setLayout(frmUsuarioLayout);
        frmUsuarioLayout.setHorizontalGroup(
            frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContrasena)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frmUsuarioLayout.createSequentialGroup()
                        .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(frmUsuarioLayout.createSequentialGroup()
                                .addComponent(lblRif, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(238, 238, 238))
                            .addGroup(frmUsuarioLayout.createSequentialGroup()
                                .addComponent(txtRif)
                                .addGap(123, 123, 123)))
                        .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        frmUsuarioLayout.setVerticalGroup(
            frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUsuarioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRif)
                    .addComponent(lblRol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(60, 60, 60)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(31, 31, 31)
                .addComponent(frmOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(518, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbRol;
    private javax.swing.JPanel frmOpciones;
    private javax.swing.JPanel frmUsuario;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblRif;
    private javax.swing.JLabel lblRol;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtRif;
    // End of variables declaration//GEN-END:variables

   
}
