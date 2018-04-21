
package Controlador;

import Modelo.Listas;
import Modelo.Recurso;
import Vista.jfrmConsulRecursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Boriannys
 */
public class ControladorConsulRecursos implements ActionListener,KeyListener
{
    private jfrmConsulRecursos formConsultarRecursos;
    private Listas listaRecursos;
    
     public ControladorConsulRecursos(Listas lisRec) 
    {
        listaRecursos=lisRec;
        formConsultarRecursos = new jfrmConsulRecursos();
        formConsultarRecursos.agregarListener(this);
        formConsultarRecursos.setVisible(true);
        CargarGrid();

    }
    //-------------------------------------    
    
    private void CargarGrid() 
    {
        Integer Fila;
    Recurso usu =new Recurso();
    
    for (Fila=0;Fila<listaRecursos.getListaUsuarios().size();Fila++)
     {
       usu=listaRecursos.getListaRecurso().get(Fila);  
       formConsultarRecursos.getjTableRecursos().setValueAt(usu.getCodigo(), Fila, 0); 
       formConsultarRecursos.getjTableRecursos().setValueAt(usu.getTipo(), Fila, 1);        
       formConsultarRecursos.getjTableRecursos().setValueAt(usu.getEstado(), Fila, 2);
       formConsultarRecursos.getjTableRecursos().setValueAt(usu.getCausa(), Fila, 3);
       formConsultarRecursos.getjTableRecursos().setValueAt(usu.getCantidadExistente(), Fila, 4);
      

     }
    }
  
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource().equals(formConsultarRecursos.getBtnAgregarNuevo())) 
       {
          new ControladorRecurso(listaRecursos); 
       }  
       
       //------------------------------------
       if (e.getSource().equals(formConsultarRecursos.getBtnSalir())) 
       {
          formConsultarRecursos.dispose();
       } 
    }

    @Override
    public void keyTyped(KeyEvent ke)
    {
        
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        
    }
    
    
}
