
package Controlador;

/**
 *
 * @author Conni
 */

import Modelo.TipoRecursoServicio;
import Modelo.Listas;
import Vista.JFrmConsultaTipoRecursoServicio;

public class ControladorConsulTiposRecursosServicios 
{
    
     
    private JFrmConsultaTipoRecursoServicio frmConsultaTiposRecursosServicios;
    private Listas listaTiposRecursosServicios;
            
    public ControladorConsulTiposRecursosServicios(Listas lisTipoRecursoServicio) 
    {
        listaTiposRecursosServicios=lisTipoRecursoServicio;
        frmConsultaTiposRecursosServicios = new JFrmConsultaTipoRecursoServicio();
        frmConsultaTiposRecursosServicios.setVisible(true);
        CargarGrid();
    }
  //------------------------------------
    
private void CargarGrid()    
{
    Integer Fila;
      TipoRecursoServicio tiporecursoservicio=new TipoRecursoServicio();
    
    for (Fila=0;Fila<listaTiposRecursosServicios.getListaTiposRecursosServicios().size();Fila++)
     {
       tiporecursoservicio=listaTiposRecursosServicios.getListaTiposRecursosServicios().get(Fila);  
       frmConsultaTiposRecursosServicios.getTableTiposRecursosServicios().setValueAt(tiporecursoservicio.getCodigo(), Fila, 0); 
       frmConsultaTiposRecursosServicios.getTableTiposRecursosServicios().setValueAt(tiporecursoservicio.getCantidadsugerida(), Fila, 5);   

     }   
} 
    
}
