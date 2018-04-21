/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Listas;
import Modelo.Usuario;
import Vista.jfrmConsulUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 *
 * @author Boriannys
 */
public class ControladorConsulUsuarios implements ActionListener,KeyListener
{
    private jfrmConsulUsuarios formConsultarUsuarios;
    private Listas listaUsuarios;
    
      public ControladorConsulUsuarios(Listas lisSer) 
    {
        listaUsuarios=lisSer;
        formConsultarUsuarios = new jfrmConsulUsuarios();
        formConsultarUsuarios.agregarListener(this);
        formConsultarUsuarios.setVisible(true);
        CargarGrid();

    }
 
 //-------------------------------------    
    
    private void CargarGrid() 
    {
        Integer Fila;
    Usuario usu =new Usuario();
    
    for (Fila=0;Fila<listaUsuarios.getListaUsuarios().size();Fila++)
     {
       usu=listaUsuarios.getListaUsuarios().get(Fila);  
       formConsultarUsuarios.getjTableUsuarios().setValueAt(usu.getRif(), Fila, 0); 
       formConsultarUsuarios.getjTableUsuarios().setValueAt(usu.getContrasena(), Fila, 1);        
       formConsultarUsuarios.getjTableUsuarios().setValueAt(usu.getRol(), Fila, 2); 
      

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
    
      @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(formConsultarUsuarios.getbtnAgregarNuevo())) 
       {
          new ControladorUsuario(listaUsuarios); 
       }  
       
       //------------------------------------
       if (e.getSource().equals(formConsultarUsuarios.getbtnSalir())) 
       {
          formConsultarUsuarios.dispose();
       }        
       
    }
    
}
