
package Controlador;

import Modelo.Listas;
import Modelo.Causa;
import Modelo.Rutinas;
import Vista.JFrmCausa;
import Vista.JFrmConsulCausas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @author jjvg_
 */
public class ControladorConsulCausas {
     private JFrmConsulCausas frmConsulCausas;
    private Listas listCausas;
    public Integer codiEnviar;
    public JFrmCausa framecausa;
    
     public ControladorConsulCausas(Listas lisCau)
    {
       listCausas = lisCau;
        frmConsulCausas = new JFrmConsulCausas();
        frmConsulCausas.setVisible(true);
        CargarGrid();
        frmConsulCausas.getjtblConsulCausas().addMouseListener(new MouseAdapter()
        {       
          
            public void  mouseClicked(MouseEvent e) 
             {
               MousClicked(e);  
             }
            }
          );
        
    }
     private void CargarGrid()    
    {
    Integer Fila;
    Causa causas=new Causa();
    
         for (Fila=0;Fila<listCausas.getListaCausas().size();Fila++)
            {
                causas=listCausas.getListaCausas().get(Fila);  
                frmConsulCausas.getjtblConsulCausas().setValueAt(causas.getCacod(), Fila, 0); 
                frmConsulCausas.getjtblConsulCausas().setValueAt(causas.getCaNombre(), Fila, 1);         
                frmConsulCausas.getjtblConsulCausas().setValueAt(causas.getCaduracion(), Fila, 2); 
                 
            }   
    }
     private Integer ClienteSeleccionado(int fila,int columna)
    {
        Integer codiSelec;
        codiSelec = Integer.parseInt(frmConsulCausas.getjtblConsulCausas().getValueAt(fila, columna).toString());
        return codiSelec;
    }
     private void MousClicked(final MouseEvent e)
{
    Integer Opcion; 
    JTable Tabla = frmConsulCausas.getjtblConsulCausas();
    if(e.getClickCount()==2)
    {
        int fila =Tabla.rowAtPoint(e.getPoint());// Determina la fila en donde se realizo la accion
        int columna = Tabla.columnAtPoint(e.getPoint());
        if ((fila > -1) && (columna > -1))
        System.out.println(Tabla.getColumnName(columna));
        
        if(Tabla.getColumnName(columna)=="Codigo")// Valida la columna sobre la cual se hace la accion
        {
            codiEnviar=ClienteSeleccionado(fila,columna);//Llama al metodo que obtiene el valor de la celda
            System.out.println(codiEnviar);
            Opcion=Rutinas.Opciones("Modificar", "Eliminar", "Salir");//Llama a las opciones del sistema    
                switch (Opcion)
                    {
                        case 0:
                        { // No hace esto
                             ControladorCausas contro=new ControladorCausas();
                             framecausa = new JFrmCausa();
                             framecausa.getTxtCaCodigo1().setText(Integer.toString(codiEnviar));
                             framecausa.setVisible(true);
                             e.consume();
                        }
                             break;
                        case 1:
                            break;
                        case 2: 
                            break;
                    }
        }
        else
        {
            e.consume();
            return;
        }
    }
}

}