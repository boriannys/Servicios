/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jjvg_
 */
public class JFrmOrdenServicio extends javax.swing.JFrame {

    public JFrmOrdenServicio() {
        initComponents();
    }

    public JButton getBtnAsignarRecursosOrden() {
        return btnAsignarRecursosOrden;
    }

    public JButton getBtnCancelarOrden() {
        return btnCancelarOrden;
    }

    public JButton getBtnDisponibilidad() {
        return btnDisponibilidad;
    }

    public JButton getBtnGenerarFacturaOrden() {
        return btnGenerarFacturaOrden;
    }

    public JButton getBtnGuardarOrden() {
        return btnGuardarOrden;
    }

    public JButton getBtnRechazarOrden() {
        return btnRechazarOrden;
    }

    public JButton getBtnSalirOrden() {
        return btnSalirOrden;
    }

    public JComboBox<String> getCmbCausasRechazoOrden() {
        return JCMBCausasRechazo;
    }

    public JTable getJtblRecursosServicioOrden() {
        return jtblRecursosServicioOrden;
    }

    public JTextField getTxtCodServicioObra() {
        return txtCodServicioObra;
    }

    public JTextField getTxtFechaFinOrden() {
        return txtFechaFinOrden;
    }

    public JTextField getTxtFechaIniOrden() {
        return txtFechaIniOrden;
    }

    public JTextField getTxtLugarOrden() {
        return txtLugarOrden;
    }

    public JTextField getTxtNombreClienteOrden() {
        return txtNombreClienteOrden;
    }

    public JTextField getTxtObraOrden() {
        return txtObraOrden;
    }

    public JTextField getTxtRifClienteOrden() {
        return txtRifClienteOrden;
    }
 public void agregarListener(ActionListener accion)
  {
    this.btnGenerarFacturaOrden.addActionListener(accion);
    this.btnGuardarOrden.addActionListener(accion);
    this.btnCancelarOrden.addActionListener(accion);
    this.btnSalirOrden.addActionListener(accion);
  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmOrdenServicio = new javax.swing.JPanel();
        frmDatosClienteOrdenServicio = new javax.swing.JPanel();
        lblNombreClienteOrdenServicio = new javax.swing.JLabel();
        lblRifClienteOrdenServicio = new javax.swing.JLabel();
        txtNombreClienteOrden = new javax.swing.JTextField();
        txtRifClienteOrden = new javax.swing.JTextField();
        lblObraOrdenServicio = new javax.swing.JLabel();
        txtObraOrden = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnAceptarOrden = new javax.swing.JButton();
        btnRechazarOrden = new javax.swing.JButton();
        frmDatosServiosOrden = new javax.swing.JPanel();
        lblNombreservicioOrden = new javax.swing.JLabel();
        lblLugarservicioObra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        txtCodServicioObra = new javax.swing.JTextField();
        txtFechaIniOrden = new javax.swing.JTextField();
        txtFechaFinOrden = new javax.swing.JTextField();
        lblCodServicioOrden = new javax.swing.JLabel();
        txtLugarOrden = new javax.swing.JTextField();
        btnDisponibilidad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRecursosServicioOrden = new javax.swing.JTable();
        lblRecursosugeridoservicioOrden = new javax.swing.JLabel();
        btnAsignarRecursosOrden = new javax.swing.JButton();
        JCMBCausasRechazo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnGenerarFacturaOrden = new javax.swing.JButton();
        btnGuardarOrden = new javax.swing.JButton();
        btnCancelarOrden = new javax.swing.JButton();
        btnSalirOrden = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frmOrdenServicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OrdenServicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        frmDatosClienteOrdenServicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblNombreClienteOrdenServicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreClienteOrdenServicio.setText("Nombre/Razon social");

        lblRifClienteOrdenServicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRifClienteOrdenServicio.setText("Rif");

        txtNombreClienteOrden.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombreClienteOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteOrdenActionPerformed(evt);
            }
        });

        lblObraOrdenServicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblObraOrdenServicio.setText("Obra");

        txtObraOrden.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtObraOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObraOrdenActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jToolBar1.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnAceptarOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAceptarOrden.setText("Aceptar");
        btnAceptarOrden.setFocusable(false);
        btnAceptarOrden.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarOrden.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAceptarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarOrdenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAceptarOrden);

        btnRechazarOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRechazarOrden.setText("Rechazar");
        btnRechazarOrden.setFocusable(false);
        btnRechazarOrden.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRechazarOrden.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnRechazarOrden);

        javax.swing.GroupLayout frmDatosClienteOrdenServicioLayout = new javax.swing.GroupLayout(frmDatosClienteOrdenServicio);
        frmDatosClienteOrdenServicio.setLayout(frmDatosClienteOrdenServicioLayout);
        frmDatosClienteOrdenServicioLayout.setHorizontalGroup(
            frmDatosClienteOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmDatosClienteOrdenServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmDatosClienteOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmDatosClienteOrdenServicioLayout.createSequentialGroup()
                        .addComponent(lblRifClienteOrdenServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreClienteOrdenServicio)
                        .addGap(61, 61, 61))
                    .addGroup(frmDatosClienteOrdenServicioLayout.createSequentialGroup()
                        .addGroup(frmDatosClienteOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblObraOrdenServicio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtObraOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRifClienteOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(frmDatosClienteOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmDatosClienteOrdenServicioLayout.createSequentialGroup()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmDatosClienteOrdenServicioLayout.createSequentialGroup()
                                .addComponent(txtNombreClienteOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        frmDatosClienteOrdenServicioLayout.setVerticalGroup(
            frmDatosClienteOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmDatosClienteOrdenServicioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(frmDatosClienteOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRifClienteOrdenServicio)
                    .addComponent(lblNombreClienteOrdenServicio))
                .addGap(2, 2, 2)
                .addGroup(frmDatosClienteOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRifClienteOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreClienteOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(frmDatosClienteOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmDatosClienteOrdenServicioLayout.createSequentialGroup()
                        .addComponent(lblObraOrdenServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObraOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        frmDatosServiosOrden.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblNombreservicioOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreservicioOrden.setText("Nombre");

        lblLugarservicioObra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLugarservicioObra.setText("Lugar");

        jLabel4.setText("Fecha de Inicio");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Fecha Finalizacion");

        jTextField4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtCodServicioObra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFechaIniOrden.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFechaFinOrden.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblCodServicioOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCodServicioOrden.setText("Codigo");

        txtLugarOrden.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnDisponibilidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisponibilidad.setText("Ver Disponibilidad de Recursos");

        javax.swing.GroupLayout frmDatosServiosOrdenLayout = new javax.swing.GroupLayout(frmDatosServiosOrden);
        frmDatosServiosOrden.setLayout(frmDatosServiosOrdenLayout);
        frmDatosServiosOrdenLayout.setHorizontalGroup(
            frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmDatosServiosOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmDatosServiosOrdenLayout.createSequentialGroup()
                        .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLugarservicioObra)
                            .addGroup(frmDatosServiosOrdenLayout.createSequentialGroup()
                                .addComponent(txtLugarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDisponibilidad)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmDatosServiosOrdenLayout.createSequentialGroup()
                        .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmDatosServiosOrdenLayout.createSequentialGroup()
                                .addComponent(jTextField4)
                                .addGap(126, 126, 126))
                            .addGroup(frmDatosServiosOrdenLayout.createSequentialGroup()
                                .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtFechaIniOrden)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblNombreservicioOrden))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmDatosServiosOrdenLayout.createSequentialGroup()
                                    .addComponent(txtFechaFinOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)))
                            .addGroup(frmDatosServiosOrdenLayout.createSequentialGroup()
                                .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodServicioOrden)
                                    .addComponent(txtCodServicioObra, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)))
                        .addContainerGap())))
        );
        frmDatosServiosOrdenLayout.setVerticalGroup(
            frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmDatosServiosOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreservicioOrden)
                    .addComponent(lblCodServicioOrden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodServicioObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaIniOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaFinOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmDatosServiosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmDatosServiosOrdenLayout.createSequentialGroup()
                        .addComponent(lblLugarservicioObra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtLugarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmDatosServiosOrdenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDisponibilidad)))
                .addGap(9, 9, 9))
        );

        jtblRecursosServicioOrden.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtblRecursosServicioOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Tasa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtblRecursosServicioOrden.setEnabled(false);
        jScrollPane1.setViewportView(jtblRecursosServicioOrden);

        lblRecursosugeridoservicioOrden.setText("Recursos sugeridos para el Servicio");

        btnAsignarRecursosOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAsignarRecursosOrden.setText("Asignar Recursos a la Orden");
        btnAsignarRecursosOrden.setEnabled(false);

        JCMBCausasRechazo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JCMBCausasRechazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout frmOrdenServicioLayout = new javax.swing.GroupLayout(frmOrdenServicio);
        frmOrdenServicio.setLayout(frmOrdenServicioLayout);
        frmOrdenServicioLayout.setHorizontalGroup(
            frmOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmOrdenServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frmDatosClienteOrdenServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(frmOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmOrdenServicioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblRecursosugeridoservicioOrden)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(frmOrdenServicioLayout.createSequentialGroup()
                        .addComponent(frmDatosServiosOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
            .addGroup(frmOrdenServicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(frmOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAsignarRecursosOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(JCMBCausasRechazo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        frmOrdenServicioLayout.setVerticalGroup(
            frmOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmOrdenServicioLayout.createSequentialGroup()
                .addGroup(frmOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frmDatosServiosOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(frmOrdenServicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(frmDatosClienteOrdenServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRecursosugeridoservicioOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmOrdenServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frmOrdenServicioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAsignarRecursosOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCMBCausasRechazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        btnGenerarFacturaOrden.setText("Generar Factura");

        btnGuardarOrden.setText("Guardar");

        btnCancelarOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarOrden.setText("Cancelar");

        btnSalirOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalirOrden.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnGuardarOrden)
                .addGap(34, 34, 34)
                .addComponent(btnGenerarFacturaOrden)
                .addGap(37, 37, 37)
                .addComponent(btnCancelarOrden)
                .addGap(32, 32, 32)
                .addComponent(btnSalirOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarOrden)
                    .addComponent(btnGenerarFacturaOrden)
                    .addComponent(btnCancelarOrden)
                    .addComponent(btnSalirOrden))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frmOrdenServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frmOrdenServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteOrdenActionPerformed

    private void btnAceptarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarOrdenActionPerformed

    private void txtObraOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObraOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObraOrdenActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCMBCausasRechazo;
    private javax.swing.JButton btnAceptarOrden;
    private javax.swing.JButton btnAsignarRecursosOrden;
    private javax.swing.JButton btnCancelarOrden;
    private javax.swing.JButton btnDisponibilidad;
    private javax.swing.JButton btnGenerarFacturaOrden;
    private javax.swing.JButton btnGuardarOrden;
    private javax.swing.JButton btnRechazarOrden;
    private javax.swing.JButton btnSalirOrden;
    private javax.swing.JPanel frmDatosClienteOrdenServicio;
    private javax.swing.JPanel frmDatosServiosOrden;
    private javax.swing.JPanel frmOrdenServicio;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtblRecursosServicioOrden;
    private javax.swing.JLabel lblCodServicioOrden;
    private javax.swing.JLabel lblLugarservicioObra;
    private javax.swing.JLabel lblNombreClienteOrdenServicio;
    private javax.swing.JLabel lblNombreservicioOrden;
    private javax.swing.JLabel lblObraOrdenServicio;
    private javax.swing.JLabel lblRecursosugeridoservicioOrden;
    private javax.swing.JLabel lblRifClienteOrdenServicio;
    private javax.swing.JTextField txtCodServicioObra;
    private javax.swing.JTextField txtFechaFinOrden;
    private javax.swing.JTextField txtFechaIniOrden;
    private javax.swing.JTextField txtLugarOrden;
    private javax.swing.JTextField txtNombreClienteOrden;
    private javax.swing.JTextField txtObraOrden;
    private javax.swing.JTextField txtRifClienteOrden;
    // End of variables declaration//GEN-END:variables
}
