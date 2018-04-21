
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JMenuItem;


public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemServicios = new javax.swing.JMenuItem();
        jMenuItemRecursos = new javax.swing.JMenuItem();
        jMenuItemObras = new javax.swing.JMenuItem();
        jMenuItemTipoRecursos = new javax.swing.JMenuItem();
        JMenCausas = new javax.swing.JMenuItem();
        jMenuIRanking = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMenOrden = new javax.swing.JMenuItem();
        jMenuCausaRecursos = new javax.swing.JMenuItem();
        jMenuFactura = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/sddefault.jpg"))); // NOI18N

        jMenu1.setText("Maestros");

        jMenuItemClientes.setText("Clientes");
        jMenu1.add(jMenuItemClientes);

        jMenuItemServicios.setText("Servicios");
        jMenu1.add(jMenuItemServicios);

        jMenuItemRecursos.setText("Recursos");
        jMenu1.add(jMenuItemRecursos);

        jMenuItemObras.setText("Obras");
        jMenu1.add(jMenuItemObras);

        jMenuItemTipoRecursos.setText("Tipo Recursos");
        jMenu1.add(jMenuItemTipoRecursos);

        JMenCausas.setText("Causas");
        JMenCausas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenCausasActionPerformed(evt);
            }
        });
        jMenu1.add(JMenCausas);

        jMenuIRanking.setText("Ranking de usuarios ");
        jMenu1.add(jMenuIRanking);

        jMenuItemUsuarios.setText("Usuarios");
        jMenu1.add(jMenuItemUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimientos");

        JMenOrden.setText("Orden de Servicio");
        jMenu2.add(JMenOrden);

        jMenuCausaRecursos.setText("Causas por Recursos");
        jMenu2.add(jMenuCausaRecursos);

        jMenuFactura.setText("Facturas");
        jMenu2.add(jMenuFactura);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(703, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMenCausasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenCausasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMenCausasActionPerformed

    public JMenuItem getjMenuItemTipoRecursos() {
        return jMenuItemTipoRecursos;
    }

    
    
    //----------------------
    public JMenuItem getjMenuItemClientes() 
    {
        return jMenuItemClientes;
    }
//----------------------------
    public JMenuItem getjMenuItemObras() 
    {
        return jMenuItemObras;
    }
//-------------------------
    public JMenuItem getjMenuItemRecursos() 
    {
        return jMenuItemRecursos;
    }
//-------------------------
    public JMenuItem getjMenuItemServicios() 
    {
        return jMenuItemServicios;
    }
//--------------------------------------------

    public JMenuItem getJMenOrden() 
    {
        return JMenOrden;
    }

    public JMenuItem getJMenCausas() {
        return JMenCausas;
    }

    public JMenuItem getjMenuCausaRecursos() {
        return jMenuCausaRecursos;
    }

    public JMenuItem getjMenuIRanking() {
        return jMenuIRanking;
    }

    public JMenuItem getjMenuFactura() {
        return jMenuFactura;
    }

    public JMenuItem getjMenuItemUsuarios() {
        return jMenuItemUsuarios;
    }
    
    
//-------------------------------
public void agregarListener (ActionListener accion)
{
    this.jMenuItemClientes.addActionListener(accion);
    this.jMenuItemObras.addActionListener(accion);
    this.jMenuItemRecursos.addActionListener(accion);
    this.jMenuItemServicios.addActionListener(accion);
    this.jMenuItemTipoRecursos.addActionListener(accion);
    this.JMenOrden.addActionListener(accion);
    this.JMenCausas.addActionListener(accion);
    this.jMenuCausaRecursos.addActionListener(accion);
    this.jMenuIRanking.addActionListener(accion);
    this.jMenuFactura.addActionListener(accion);
    this.jMenuItemUsuarios.addActionListener(accion);
}    
       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenCausas;
    private javax.swing.JMenuItem JMenOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCausaRecursos;
    private javax.swing.JMenuItem jMenuFactura;
    private javax.swing.JMenuItem jMenuIRanking;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemObras;
    private javax.swing.JMenuItem jMenuItemRecursos;
    private javax.swing.JMenuItem jMenuItemServicios;
    private javax.swing.JMenuItem jMenuItemTipoRecursos;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    // End of variables declaration//GEN-END:variables
}
