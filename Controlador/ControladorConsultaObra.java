/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Obra;
import Modelo.Listas;
import Vista.jfrmConsulObras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Orlando Cuervo
 */
public class ControladorConsultaObra implements ActionListener,KeyListener
{
    
    
     private jfrmConsulObras frmConsultaObra;
    private Listas listaServicios;
            
    public ControladorConsultaObra(Listas lisSer) 
    {
             listaServicios=lisSer;
       frmConsultaObra = new jfrmConsulObras();
       frmConsultaObra.agregarListener(this);
         frmConsultaObra.setVisible(true);
        CargarGrid();
    }
  //------------------------------------
    
private void CargarGrid()    
{
    Integer Fila;
    Obra obr=new Obra();
    
    for (Fila=0;Fila<listaServicios.getListaObras().size();Fila++)
     {
       obr=listaServicios.getListaObras().get(Fila);  
       frmConsultaObra.getTablaObras().setValueAt(obr.getRifCliente(), Fila, 0); 
       frmConsultaObra.getTablaObras().setValueAt(obr.getNombre(), Fila, 1); 
       frmConsultaObra.getTablaObras().setValueAt(obr.getDescripcion(), Fila, 2); 

     }   
}      

    //------------------------------------------------
 public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(frmConsultaObra.getBtnAgregar())) 
       {
         new ControladorObra(listaServicios);  
       }  
      
     //--------  
     if (e.getSource().equals(frmConsultaObra.getBtnSalir())) 
       {
          frmConsultaObra.dispose(); 
       }
    
    
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
