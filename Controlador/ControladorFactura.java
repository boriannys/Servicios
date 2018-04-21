/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.Listas;
import Vista.jfrmClientes;
import Vista.jfrmFactura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Orlando Cuervo
 */
public class ControladorFactura implements ActionListener,KeyListener

        

{

    
     private jfrmFactura frmFactura;  
            private Listas lisSer;
            
            
            
          public ControladorFactura(Listas lisServicios) 
    {
       lisSer=lisServicios;
       frmFactura = new jfrmFactura();
       frmFactura.agregarListener(this);
       frmFactura.setVisible(true);
      
      
       
       
          frmFactura.getTxtRif().addKeyListener(new KeyAdapter()
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
  
  cadena=frmFactura.getTxtRif().getText().trim();
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
   if (Tecla==10 && frmFactura.getTxtRif().getText().trim().length() > 0)
    {
      posiRif=lisSer.ExisteCliente(frmFactura.getTxtRif().getText().trim());
      if (posiRif>=0)
       {
         cli=lisSer.getListaClientes().get(posiRif);
         frmFactura.getTxtNombre().setText(cli.getRazonSocial());
       }  
        
     // Enabled(true); 
      //formClientes.getjTextFieldRazonSocial().requestFocusInWindow();
    }  
}        
//--------------------------
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
          if (e.getSource().equals(frmFactura.getBtnImprimir())) 
       {
         // Grabar(); 
       }  
       
       //----------
      
    
     //--------  
     if (e.getSource().equals(frmFactura.getBtnSalir())) 
       {
          frmFactura.dispose(); 
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
