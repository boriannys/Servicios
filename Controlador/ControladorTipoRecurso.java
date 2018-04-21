
package Controlador;

/**
 *
 * @author Conni
 */

import Modelo.Categorias;
import Modelo.TipoRecurso;
import Modelo.Listas;
import Modelo.Rutinas;
import Vista.JFrmTipoRecurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorTipoRecurso implements ActionListener,KeyListener
{
   private JFrmTipoRecurso frmTipoRecurso;  
   private Listas lisTipoRecurso;
           
    public ControladorTipoRecurso(Listas lisTiposRecursos) 
    {
       lisTipoRecurso=lisTiposRecursos;
       frmTipoRecurso = new JFrmTipoRecurso();
       frmTipoRecurso.agregarListener(this);
       frmTipoRecurso.setVisible(true);
       Enabled(false);
       CargarComboCategorias(); 
       //Programacion de los KeyListener
       frmTipoRecurso.getTxtCodigo().addKeyListener(new KeyAdapter()
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
       frmTipoRecurso.getTxtNombre().addKeyListener(new KeyAdapter()
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
        frmTipoRecurso.getTxtDescripcion().addKeyListener(new KeyAdapter()
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
          //-------------------------------
        frmTipoRecurso.getTxtTasa().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                TasakeyTyped(e);  
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
  
  cadena=frmTipoRecurso.getTxtCodigo().getText().trim();
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
  
  cadena=frmTipoRecurso.getTxtNombre().getText().trim();
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
  
  cadena=frmTipoRecurso.getTxtDescripcion().getText().trim();
  if (cadena.length()==30)
  {
    e.consume();  
    return;
  }  
  } 

 //--------------------------
private void TasakeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=frmTipoRecurso.getTxtTasa().getText().trim();
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
   TipoRecurso tiporecurso=new TipoRecurso();
   Tecla=e.getKeyCode();
   if (Tecla==10 && frmTipoRecurso.getTxtCodigo().getText().trim().length() > 0)
    {
      posiCodigo=lisTipoRecurso.ExisteServicio(frmTipoRecurso.getTxtCodigo().getText().trim());
      if (posiCodigo>=0)
       {
         tiporecurso=lisTipoRecurso.getListaTiposRecursos().get(posiCodigo);
         frmTipoRecurso.getTxtNombre().setText(tiporecurso.getNombre());
       }  
        
      Enabled(true); 
      frmTipoRecurso.getTxtNombre().requestFocusInWindow();
    }  
}        
//--------------------------
private void CargarComboCategorias()
{
  frmTipoRecurso.getCmbCategoria().addItem("Seleccione");  
    
  Categorias categoria=new Categorias();  
  for (int i=0;i<lisTipoRecurso.getListaCategorias().size();i++)  
  {
    categoria=lisTipoRecurso.getListaCategorias().get(i);    
    frmTipoRecurso.getCmbCategoria().addItem(categoria.getCodCategoria()+"-"+categoria.getNombre());    
  }  
  
}        
//----------------------------
private void Enabled(boolean status)
{
   frmTipoRecurso.getTxtCodigo().setEditable(!status);
   frmTipoRecurso.getTxtNombre().setEditable(status);  
   frmTipoRecurso.getTxtDescripcion().setEditable(status);  
   frmTipoRecurso.getTxtTasa().setEditable(status); 
}        
//--------------------------
private void Limpiar()    
{
  frmTipoRecurso.getTxtCodigo().setText("");  
  frmTipoRecurso.getTxtNombre().setText("");  
  frmTipoRecurso.getTxtDescripcion().setText("");  
  frmTipoRecurso.getTxtTasa().setText("");  
  frmTipoRecurso.getTxtCodigo().requestFocusInWindow();
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
    
    
    
   TipoRecurso tiporecurso=new TipoRecurso();
   
   if (frmTipoRecurso.getTxtCodigo().getText().trim().length()==0)
   {
      Rutinas.Aviso("Codigo Vacio", "");  
      frmTipoRecurso.getTxtCodigo().requestFocusInWindow();
      return;
   }  
   
   if (frmTipoRecurso.getTxtNombre().getText().trim().length()==0)
   {
      Rutinas.Aviso("Nombre Vacio", "");  
      frmTipoRecurso.getTxtNombre().requestFocusInWindow();
      return;
   }  
    if (frmTipoRecurso.getTxtDescripcion().getText().trim().length()==0)
   {
      Rutinas.Aviso("Descripcion Vacia", "");  
      frmTipoRecurso.getTxtDescripcion().requestFocusInWindow();
      return;
   }  
     if (frmTipoRecurso.getTxtTasa().getText().trim().length()==0)
   {
      Rutinas.Aviso("Tasa Vacia", "");  
      frmTipoRecurso.getTxtTasa().requestFocusInWindow();
      return;
   }  

     
   if (frmTipoRecurso.getCmbCategoria().getSelectedIndex()==0)  
    {
      Rutinas.Aviso("Debe Escoger una Categoria", "");  
      frmTipoRecurso.getCmbCategoria().requestFocusInWindow();
      return;
    }  
       
     //--Accesando el codigo del combo
    String codCategoria;
     
    codCategoria=(String)frmTipoRecurso.getCmbCategoria().getSelectedItem(); 
    codCategoria=codCategoria.substring(0, 2);
    
   tiporecurso.TipoRecurso(frmTipoRecurso.getTxtCodigo().getText(),
                    frmTipoRecurso.getTxtNombre().getText(),
                    frmTipoRecurso.getTxtDescripcion().getText(),
                    frmTipoRecurso.getTxtTasa().getText()); 
   
   lisTipoRecurso.getListaTiposRecursos().add(tiporecurso);
   Rutinas.Aviso("Grabacion Realizada", "");
   Limpiar();
   Enabled(false);
}        
//--------------------------    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(frmTipoRecurso.getBtnGuardar())) 
       {
          Guardar(); 
       }  
       
       //----------
       if (e.getSource().equals(frmTipoRecurso.getBtnCancelar())) 
       {
          Limpiar(); 
       }        
       // -----
     if (e.getSource().equals(frmTipoRecurso.getBtnConsultar())) 
       {
         new ControladorConsulServicios(lisTipoRecurso);  
       }  
     //--------  
     if (e.getSource().equals(frmTipoRecurso.getBtnSalir())) 
       {
          frmTipoRecurso.dispose(); 
       }  
       
    }   
    
}
