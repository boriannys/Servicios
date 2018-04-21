
package Controlador;

/**
 *
 * @author Conni
 *
 */


import Modelo.TipoRecursoServicio;
import Modelo.Listas;
import Modelo.Rutinas;
import Vista.JFrmTipoRecursoServicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorTipoRecursoServicio implements ActionListener,KeyListener
{
    
    
   private JFrmTipoRecursoServicio frmTipoRecursoServicio;  
   private Listas lisTipoRecurServ;
           
    public ControladorTipoRecursoServicio(Listas lisTipoRecursosServicios) 
    {
       lisTipoRecurServ=lisTipoRecursosServicios;
       frmTipoRecursoServicio = new JFrmTipoRecursoServicio();
       frmTipoRecursoServicio.agregarListener(this);
       frmTipoRecursoServicio.setVisible(true);
       Enabled(false);
      
       //Programacion de los KeyListener
       frmTipoRecursoServicio.getTxtCodigo().addKeyListener(new KeyAdapter()
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
       frmTipoRecursoServicio.getTxtCantidadSugerida().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                CantidadSugeridakeyTyped(e);  
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
  
  cadena=frmTipoRecursoServicio.getTxtCodigo().getText().trim();
  if (cadena.length()==5)
  {
    e.consume();  
    return;
  }  
}        
//--------------------------
private void CantidadSugeridakeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=frmTipoRecursoServicio.getTxtCantidadSugerida().getText().trim();
  if (cadena.length()==10)
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
   TipoRecursoServicio tiprecursoservicio=new TipoRecursoServicio();
   Tecla=e.getKeyCode();
   if (Tecla==10 && frmTipoRecursoServicio.getTxtCodigo().getText().trim().length() > 0)
    {
      posiCodigo=lisTipoRecurServ.ExisteServicio(frmTipoRecursoServicio.getTxtCodigo().getText().trim());
      if (posiCodigo>=0)
       {
         tiprecursoservicio =lisTipoRecurServ.getListaTiposRecursosServicios().get(posiCodigo);
         frmTipoRecursoServicio.getTxtCantidadSugerida().setText(tiprecursoservicio.getCantidadsugerida());
       }  
        
      Enabled(true); 
      frmTipoRecursoServicio.getTxtCantidadSugerida().requestFocusInWindow();
    }  
}        
//--------------------------
private void Enabled(boolean status)
{
   frmTipoRecursoServicio.getTxtCodigo().setEditable(!status);
   frmTipoRecursoServicio.getTxtCantidadSugerida().setEditable(status);  
}        
//--------------------------
private void Limpiar()    
{
  frmTipoRecursoServicio.getTxtCodigo().setText("");  
  frmTipoRecursoServicio.getTxtCantidadSugerida().setText("");  
  frmTipoRecursoServicio.getTxtCodigo().requestFocusInWindow();
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
   TipoRecursoServicio tiprecursoservicio=new TipoRecursoServicio();
   
   if (frmTipoRecursoServicio.getTxtCodigo().getText().trim().length()==0)
   {
      Rutinas.Aviso("Codigo Vacio", "");  
      frmTipoRecursoServicio.getTxtCodigo().requestFocusInWindow();
      return;
   }  
    if (frmTipoRecursoServicio.getTxtCantidadSugerida().getText().trim().length()==0)
   {
      Rutinas.Aviso("Descripcion Vacia", "");  
      frmTipoRecursoServicio.getTxtCantidadSugerida().requestFocusInWindow();
      return;
   }  
 
   tiprecursoservicio.TipoRecursoServicio(frmTipoRecursoServicio.getTxtCodigo().getText(),
                    frmTipoRecursoServicio.getTxtCantidadSugerida().getText()); 
   
   lisTipoRecurServ.getListaTiposRecursosServicios().add(tiprecursoservicio);
   Rutinas.Aviso("Grabacion Realizada", "");
   Limpiar();
   Enabled(false);
}        
//--------------------------    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(frmTipoRecursoServicio.getBtnGuardar())) 
       {
          Guardar(); 
       }  
       
       //----------
       if (e.getSource().equals(frmTipoRecursoServicio.getBtnCancelar())) 
       {
          Limpiar(); 
       }        
       // -----
     if (e.getSource().equals(frmTipoRecursoServicio.getBtnConsultar())) 
       {
         new ControladorConsulTiposRecursosServicios(lisTipoRecurServ);  
       }  
     //--------  
     if (e.getSource().equals(frmTipoRecursoServicio.getBtnSalir())) 
       {
          frmTipoRecursoServicio.dispose(); 
       }  
       
    }   
    
}
