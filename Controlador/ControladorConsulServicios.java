
package Controlador;

/**
 *
 * @author Conni
 */

import Modelo.Servicio;
import Modelo.Listas;
import Vista.JFrmConsultarServicios;

public class ControladorConsulServicios 
{
    
    private JFrmConsultarServicios frmConsultarServicios;
    private Listas listaServicios;
            
    public ControladorConsulServicios(Listas lisSer) 
    {
        listaServicios=lisSer;
        frmConsultarServicios = new JFrmConsultarServicios();
        frmConsultarServicios.setVisible(true);
        CargarGrid();
    }
  //------------------------------------
    
private void CargarGrid()    
{
    Integer Fila;
      Servicio servicio=new Servicio();
    
    for (Fila=0;Fila<listaServicios.getListaServicios().size();Fila++)
     {
       servicio=listaServicios.getListaServicios().get(Fila);  
       frmConsultarServicios.getTableServicios().setValueAt(servicio.getCodigo(), Fila, 0); 
       frmConsultarServicios.getTableServicios().setValueAt(servicio.getNombre(), Fila, 1);        
       frmConsultarServicios.getTableServicios().setValueAt(servicio.getDescripcion(), Fila, 2); 

     }   
}     
    
}
