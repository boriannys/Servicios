
package Controlador;

/**
 *
 * @author Conni
 */


import Modelo.Servicio;
import Modelo.Listas;
import Modelo.Rutinas;
import Vista.JFrmServicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorServicio implements ActionListener,KeyListener
{
   private JFrmServicio frmServicio;  
   private Listas lisSer;
           
    public ControladorServicio(Listas lisServicios) 
    {
       lisSer=lisServicios;
       frmServicio = new JFrmServicio();
       frmServicio.agregarListener(this);
       frmServicio.setVisible(true);
       Enabled(false);
      
       //Programacion de los KeyListener
       frmServicio.getTxtCodigo().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                CodigokeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
             {
               CodigokeyPressed(e);  
             }   
      }
     );   
             
      //--------------------------------
       frmServicio.getTxtNombre().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                NombrekeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
               {
               }   
       }
     );        
       
       //-------------------------------
        frmServicio.getTxtDescripcion().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                DescripcionkeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
               {
               }   
       }
     );  
    }
//---------------------------
private void CodigokeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=frmServicio.getTxtCodigo().getText().trim();
  if (cadena.length()==5)
  {
    e.consume();  
    return;
  }  
}        
//--------------------------
private void NombrekeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=frmServicio.getTxtNombre().getText().trim();
  if (cadena.length()==10)
  {
    e.consume();  
    return;
  }  
 
    
}  

 //--------------------------
private void DescripcionkeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=frmServicio.getTxtDescripcion().getText().trim();
  if (cadena.length()==30)
  {
    e.consume();  
    return;
  }  
  } 
//--------------------------
private void CodigokeyPressed(KeyEvent e)
{
   Integer Tecla;
   Integer posiCodigo;
   Servicio serv=new Servicio();
   Tecla=e.getKeyCode();
   if (Tecla==10 && frmServicio.getTxtCodigo().getText().trim().length() > 0)
    {
      posiCodigo=lisSer.ExisteServicio(frmServicio.getTxtCodigo().getText().trim());
      if (posiCodigo>=0)
       {
         serv=lisSer.getListaServicios().get(posiCodigo);
         frmServicio.getTxtNombre().setText(serv.getNombre());
       }  
        
      Enabled(true); 
      frmServicio.getTxtNombre().requestFocusInWindow();
    }  
}        
//--------------------------
private void Enabled(boolean status)
{
   frmServicio.getTxtCodigo().setEditable(!status);
   frmServicio.getTxtNombre().setEditable(status);  
   frmServicio.getTxtDescripcion().setEditable(status);  
}        
//--------------------------
private void Limpiar()    
{
  frmServicio.getTxtCodigo().setText("");  
  frmServicio.getTxtNombre().setText("");  
  frmServicio.getTxtDescripcion().setText("");  
  frmServicio.getTxtCodigo().requestFocusInWindow();
}        
//--------------------------
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
//-------------------------
private void Guardar()    
{
   Servicio servicio=new Servicio();
   
   if (frmServicio.getTxtCodigo().getText().trim().length()==0)
   {
      Rutinas.Aviso("Codigo Vacio", "");  
      frmServicio.getTxtCodigo().requestFocusInWindow();
      return;
   }  
   
   if (frmServicio.getTxtNombre().getText().trim().length()==0)
   {
      Rutinas.Aviso("Nombre Vacio", "");  
      frmServicio.getTxtNombre().requestFocusInWindow();
      return;
   }  
    if (frmServicio.getTxtDescripcion().getText().trim().length()==0)
   {
      Rutinas.Aviso("Descripcion Vacia", "");  
      frmServicio.getTxtDescripcion().requestFocusInWindow();
      return;
   }  
 
   servicio.Servicio(frmServicio.getTxtCodigo().getText(),
                    frmServicio.getTxtNombre().getText(),
                    frmServicio.getTxtDescripcion().getText()); 
   
   lisSer.getListaServicios().add(servicio);
   Rutinas.Aviso("Grabacion Realizada", "");
   Limpiar();
   Enabled(false);
}        
//--------------------------    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(frmServicio.getBtnGuardar())) 
       {
          Guardar(); 
       }  
       
       //----------
       if (e.getSource().equals(frmServicio.getBtnCancelar())) 
       {
          Limpiar(); 
       }        
       // -----
     if (e.getSource().equals(frmServicio.getBtnConsultar())) 
       {
         new ControladorConsulServicios(lisSer);  
       }  
     //--------  
     if (e.getSource().equals(frmServicio.getBtnSalir())) 
       {
          frmServicio.dispose(); 
       }  
       
    }   
}
