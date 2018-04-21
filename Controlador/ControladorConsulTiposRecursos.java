
package Controlador;
/**
 *
 * @author Conni
 */

import Modelo.TipoRecurso;
import Modelo.Listas;
import Vista.JFrmConsultarTiposRecursos;

public class ControladorConsulTiposRecursos 
{
     
    private JFrmConsultarTiposRecursos frmConsultarTiposRecursos;
    private Listas listaTiposRecursos;
            
    public ControladorConsulTiposRecursos(Listas lisTipoRecurso) 
    {
        listaTiposRecursos=lisTipoRecurso;
        frmConsultarTiposRecursos = new JFrmConsultarTiposRecursos();
        frmConsultarTiposRecursos.setVisible(true);
        CargarGrid();
    }
  //------------------------------------
    
private void CargarGrid()    
{
    Integer Fila;
      TipoRecurso tiporecurso=new TipoRecurso();
    
    for (Fila=0;Fila<listaTiposRecursos.getListaTiposRecursos().size();Fila++)
     {
       tiporecurso=listaTiposRecursos.getListaTiposRecursos().get(Fila);  
       frmConsultarTiposRecursos.getTableTiposRecursos().setValueAt(tiporecurso.getCodigo(), Fila, 0); 
       frmConsultarTiposRecursos.getTableTiposRecursos().setValueAt(tiporecurso.getNombre(), Fila, 1);        
       frmConsultarTiposRecursos.getTableTiposRecursos().setValueAt(tiporecurso.getDescripcion(), Fila, 2); 
       frmConsultarTiposRecursos.getTableTiposRecursos().setValueAt(tiporecurso.getTasa(), Fila, 2); 

     }   
}  
    
}
