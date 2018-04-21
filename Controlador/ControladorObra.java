/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.Obra;
import Modelo.Listas;
import Modelo.Rutinas;
import Vista.jfrmObra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Orlando Cuervo
 */
public class ControladorObra implements ActionListener,KeyListener


{
    
       private jfrmObra frmObra;  
       private Listas lisSer;
    
    
        public ControladorObra(Listas lisServicios) 
  {
       lisSer=lisServicios;
       frmObra = new jfrmObra();
       frmObra.agregarListener(this);
       frmObra.setVisible(true);
       Enabled(false);
       
       
        frmObra.getTxtRifCliente().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                RifkeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
             {
               RifkeyPressed(e);  
             }   
       }
     );  
       
      
  }
       
//---------------------------
private void RifkeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=frmObra.getTxtRifCliente().getText().trim();
  if (cadena.length()==12)
  {
    e.consume();  
    return;
  }  
}        
//--------------------------
 private void RifkeyPressed(KeyEvent e)
{
   Integer Tecla;
   Integer posiRif;
   Clientes cli=new Clientes();
   Tecla=e.getKeyCode();
   if (Tecla==10 && frmObra.getTxtRifCliente().getText().trim().length() > 0)
    {
      posiRif=lisSer.ExisteCliente(frmObra.getTxtRifCliente().getText().trim());
      if (posiRif>=0)
       {
         cli=lisSer.getListaClientes().get(posiRif);
         Enabled(true);
         frmObra.getTxtNombre().requestFocusInWindow();
         frmObra.getTxtNombreCliente().setText(cli.getRazonSocial());
       }  
      else
      {
          Rutinas.Aviso("Este Cliente no está registrado en el sistema", "");
      }
   
    }  
}


//--------------------------
 private void Limpiar()    
         {
  frmObra.getTxtNombre().setText("");  
  frmObra.getTxtDescripcion().setText(""); 
  frmObra.getTxtNombreCliente().setText("");
  frmObra.getTxtRifCliente().setText("");
  frmObra.getTxtRifCliente().requestFocusInWindow();
   Enabled(false);
          }   

//--------------------------
 
 
private void Enabled(boolean status)
{
  frmObra.getTxtRifCliente().setEditable(!status);
  frmObra.getTxtNombre().setEditable(status);  
  frmObra.getTxtDescripcion().setEditable(status); 
  
}        
//--------------------------
       
       private void Grabar()    
{
   Obra obra=new Obra();
   
   if (frmObra.getTxtNombre().getText().trim().length()==0)
   {
      Rutinas.Aviso("Nombre Vacio", "");  
      frmObra.getTxtNombre().requestFocusInWindow();
      return;
   }  
   
   if (frmObra.getTxtDescripcion().getText().trim().length()==0)
   {
     Rutinas.Aviso("Descripción Vacia", "");  
      frmObra.getTxtDescripcion().requestFocusInWindow();
      return;
   }
   
    if (frmObra.getTxtRifCliente().getText().trim().length()==0)
   {
     Rutinas.Aviso("Rif Vacio", "");  
      frmObra.getTxtRifCliente().requestFocusInWindow();
      return;
   }  
   
   obra.Obra(frmObra.getTxtRifCliente().getText(),
             frmObra.getTxtNombre().getText(),
             frmObra.getTxtDescripcion().getText());
   
   lisSer.getListaObras().add(obra);

   Rutinas.Aviso("Grabacion Realizada", "");
   Limpiar();
     frmObra.dispose(); 
  // Enabled(false);
}        
//--------------------------   
       
       
       
       
    
 
    
//------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource().equals(frmObra.getBtnGuardar())) 
       {
          Grabar(); 
       }  
       
       //----------
       if (e.getSource().equals(frmObra.getBtnCancelar())) 
       {
          Limpiar(); 
       }        
     
     //--------  
     if (e.getSource().equals(frmObra.getBtnSalir())) 
       {
          frmObra.dispose(); 
       }
        
        
        
        
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }
    
}


