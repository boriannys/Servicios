package Controlador;

import Modelo.Clientes;
import Modelo.Listas;
import Modelo.Rutinas;
import Vista.jfrmClientes;
import Vista.jfrmConsulClientes;
import Controlador.ControladorClientes;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.security.AccessController;

public class ControladorConsulClientes {

    private jfrmConsulClientes formConsulClientes;
    public Listas listaServicios;
    private jfrmClientes jfrmClientes;
    public ControladorClientes ControlClientes;
    public String rifEnviar;

    public ControladorConsulClientes(Listas lisSer) {
        listaServicios = lisSer;
        formConsulClientes = new jfrmConsulClientes();
        formConsulClientes.setVisible(true);
        CargarGrid();

        formConsulClientes.getjTableClientes().addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                MousClicked(e);
            }
        }
        );

    }
    //------------------------------------

    private void CargarGrid() {
        Integer Fila;
        Clientes cli = new Clientes();

        for (Fila = 0; Fila < listaServicios.getListaClientes().size(); Fila++) {
            cli = listaServicios.getListaClientes().get(Fila);
            formConsulClientes.getjTableClientes().setValueAt(cli.getRif(), Fila, 0);
            formConsulClientes.getjTableClientes().setValueAt(cli.getRazonSocial(), Fila, 1);
            formConsulClientes.getjTableClientes().setValueAt(cli.getDireccion(), Fila, 2);
            formConsulClientes.getjTableClientes().setValueAt(cli.getTelefono(), Fila, 3);
            formConsulClientes.getjTableClientes().setValueAt(cli.getCorreo(), Fila, 4);

        }
    }

// Metodo que obtiene el valor que esta contenido en una celda indicada en particular
    private String ClienteSeleccionado(int fila, int columna) {
        String rifSelec;
        rifSelec = (String) formConsulClientes.getjTableClientes().getValueAt(fila, columna);
        return rifSelec;
    }
//----------------------------------------------------------------------------------

//-- Metodo que raliza la accion del evento del boton enter sobre una celda de la tabla
//-- Le faltan validaciones y el llamado de el formulario
//-- Falta insertar valor obtenido en el formulario;
    private void MousClicked(final MouseEvent e) {
        Integer Opcion;
        JTable Tabla = formConsulClientes.getjTableClientes();
        if (e.getClickCount() == 2) {
            int fila = Tabla.rowAtPoint(e.getPoint());// Determina la fila en donde se realizo la accion
            int columna = Tabla.columnAtPoint(e.getPoint());
            if ((fila > -1) && (columna > -1)) {
                System.out.println(Tabla.getColumnName(columna));
            }

            if (Tabla.getColumnName(columna) == "Rif")// Valida la columna sobre la cual se hace la accion
            {
                rifEnviar = ClienteSeleccionado(fila, columna);//Llama al metodo y se resta uno a la fila porque es un vector
                System.out.println(rifEnviar);
                Opcion = Rutinas.Opciones("Modificar", "Eliminar", "Salir");//Llama a las opciones del sistema    
                switch (Opcion) {
                    case 0: {
                        // Yaa hace esto \o/
                        formConsulClientes.dispose();
                        ControlClientes = new ControladorClientes();
                        ControlClientes.BuscarCliente(rifEnviar, listaServicios);
                        e.consume();

                        break;
                    }
                    //break;
                    case 1:
                    {   formConsulClientes.dispose();
                        ControlClientes = new ControladorClientes();
                        ControlClientes.Eliminar(rifEnviar, listaServicios);
                        Rutinas.Aviso("Eliminacion Exitosa", "");
                        formConsulClientes = new jfrmConsulClientes();
                        formConsulClientes.setVisible(true);
                        CargarGrid();
                        e.consume();
                        break;
                    }
                    case 2:
                        break;
                }
            } else {
                e.consume();
                return;
            }
        }
    }

}

//------------------------------------------------------------------------------

