
package Controlador;

import Modelo.Listas;
import Modelo.Recurso;
import Modelo.Rutinas;
import Vista.jfrmRecurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Boriannys
 */
public class ControladorRecurso implements ActionListener,KeyListener
{
    private jfrmRecurso formRecursos;  
    private Listas lisRecurso;
    public ControladorRecurso(Listas lisRecur) 
    {
       lisRecurso=lisRecur;
       formRecursos = new jfrmRecurso();
       formRecursos.agregarListener(this);
       formRecursos.setVisible(true);
       Enabled(false);
       //CargarComboRoles();
      
       //Programacion de los KeyListener

       formRecursos.getTxtCodigo().addKeyListener(new KeyAdapter()
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

           private void CodigokeyTyped(KeyEvent e) 
           {
               
           }

           private void CodigokeyPressed(KeyEvent e) 
           {
              
           }

          
       }
     );        
      //--------------------------------
       formRecursos.getTxtCantidadExistente().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                CantidadExistentekeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
               {
               }   


           private void CantidadExistentekeyTyped(KeyEvent e)
           {
               
           }

        
       }
     ); 
       
       //---------------------------------
       formRecursos.getTxtEstado().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
               EstadokeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
               {
               }   

           private void EstadokeyTyped(KeyEvent e)
           {
               
           }

        
       }
     );
       
       //-------------------------------
       formRecursos.getTxtTipo().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
               TipokeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
               {
               }   

           private void TipokeyTyped(KeyEvent e)
           {
               
           }

        
       }
     );
       //----------------------------------
    }
    
      private void CodigokeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=formRecursos.getTxtCodigo().getText().trim();
  if (cadena.length()==12)
  {
    e.consume();  
    return;
  }  
}
      
 private void CantidadExistentekeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=formRecursos.getTxtCantidadExistente().getText().trim();
  if (cadena.length()==6)
  {
    e.consume();  
    return;
  }  
    
}
 private void EstadokeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=formRecursos.getTxtEstado().getText().trim();
  if (cadena.length()==30)
  {
    e.consume();  
    return;
  }  
    
}
 private void TipokeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=formRecursos.getTxtTipo().getText().trim();
  if (cadena.length()==30)
  {
    e.consume();  
    return;
  }  
    
}
 
 private void RifkeyPressed(KeyEvent e)
{
   Integer Tecla;
   Integer posiCodigo;
   Recurso rec = new Recurso();
   Tecla=e.getKeyCode();
   if (Tecla==10 && formRecursos.getTxtCodigo().getText().trim().length() > 0)
    {
      posiCodigo=lisRecurso.ExisteUsuario(formRecursos.getTxtCodigo().getText().trim());
      if (posiCodigo>=0)
       {
         rec=lisRecurso.getListaRecurso().get(posiCodigo);
         formRecursos.getTxtTipo().setText(rec.getEstado());
       }  
        
      Enabled(true); 
      formRecursos.getTxtTipo().requestFocusInWindow();
    }  
}
 
    private void Enabled(boolean status)
{
  formRecursos.getTxtCodigo().setEditable(!status);
  formRecursos.getTxtEstado().setEditable(status);
  formRecursos.getTxtTipo().setEditable(status);
  formRecursos.getTxtCantidadExistente().setEditable(status);
  
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
    
     private void Grabar()    
{
   Recurso rec=new Recurso();
   
   if (formRecursos.getTxtCodigo().getText().trim().length()==0)
   {
      Rutinas.Aviso("Código Vacio", "");  
      formRecursos.getTxtCodigo().requestFocusInWindow();
      return;
   }  
   
   if (formRecursos.getTxtTipo().getText().trim().length()==0)
   {
      Rutinas.Aviso("Tipo de Recurso Vacio", "");  
      formRecursos.getTxtTipo().requestFocusInWindow();
      return;
   }  
   if (formRecursos.getTxtEstado().getText().trim().length()==0)
   {
      Rutinas.Aviso("Estado del Recurso Vacio", "");  
      formRecursos.getTxtEstado().requestFocusInWindow();
      return;
   }
   
   rec.Recursos(formRecursos.getTxtCodigo().getText(),
                    formRecursos.getTxtTipo().getText(),
                    formRecursos.getTxtEstado().getText()
                    //formUsuarios.getCmbRol()
                    );
   
   
   lisRecurso.getListaRecurso().add(rec);
   Rutinas.Aviso("Datos Almacenados", "");
   //Limpiar();
   Enabled(false);
}
     
      @Override
    public void actionPerformed(ActionEvent e) 
    {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource().equals(formRecursos.getBtnGuardar())) 
       {
          Grabar(); 
       }  
       
       //----------------------------------
       if (e.getSource().equals(formRecursos.getBtnCancelar())) 
       {
          //Limpiar(); 
       }        
   
     //---------------------------------------  
     if (e.getSource().equals(formRecursos.getBtnSalir())) 
       {
          formRecursos.dispose(); 
       } 
    }

}
