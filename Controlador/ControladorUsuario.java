/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

//import Modelo.Listas;
import Modelo.Listas;
import Modelo.Rutinas;
import Modelo.Usuario;
import Vista.jfrmUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Boriannys
 */
public class ControladorUsuario implements ActionListener,KeyListener
{
    private jfrmUsuario formUsuarios;  
    private Listas lisSer;
   public ControladorUsuario(Listas lisServicios) 
    {
       lisSer=lisServicios;
       formUsuarios = new jfrmUsuario();
       formUsuarios.agregarListener(this);
       formUsuarios.setVisible(true);
       Enabled(false);
       //CargarComboRoles();
      
       //Programacion de los KeyListener

       formUsuarios.getTxtRif().addKeyListener(new KeyAdapter()
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
      //--------------------------------
       formUsuarios.getTxtContrasena().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ContrasenakeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
               {
               }   

        
       }
     );        
       
       //-------------------------------
    }
    
   
   //-------------------------------------
   
   private void RifkeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=formUsuarios.getTxtRif().getText().trim();
  if (cadena.length()==12)
  {
    e.consume();  
    return;
  }  
}        
//--------------------------
private void ContrasenakeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=formUsuarios.getTxtContrasena().getText().trim();
  if (cadena.length()==30)
  {
    e.consume();  
    return;
  }  
    
}
//----------------------------------------
//--------------------------
private void RifkeyPressed(KeyEvent e)
{
   Integer Tecla;
   Integer posiRif;
   Usuario usu = new Usuario();
   Tecla=e.getKeyCode();
   if (Tecla==10 && formUsuarios.getTxtRif().getText().trim().length() > 0)
    {
      posiRif=lisSer.ExisteUsuario(formUsuarios.getTxtRif().getText().trim());
      if (posiRif>=0)
       {
         usu=lisSer.getListaUsuarios().get(posiRif);
         formUsuarios.getTxtContrasena().setText(usu.getContrasena());
       }  
        
      Enabled(true); 
      formUsuarios.getTxtContrasena().requestFocusInWindow();
    }  
}
//---------------------------------------
  //---------------------------------------
   private void Enabled(boolean status)
{
  formUsuarios.getTxtRif().setEditable(!status);
  formUsuarios.getTxtContrasena().setEditable(status);  
  
}
  //------------------------------------
   /*   private void CargarComboRoles()
{
  formUsuarios.getCmbRol().addItem("Seleccione");  
    
  Rol roles=new Rol();  
  for (int i=0;i<lisSer.getListaRoles().size();i++)  
  {
    roles=lisSer.getListaRoles().get(i);    
    jfrmRol.getCmbRol().addItem(roles.getCodRol()+"-"+roles.getNombre());    
  }  
  
} */ 
  
   
 //-----------------------------------------   
    private void Limpiar()    
{
    formUsuarios.getTxtContrasena().setText("");
    formUsuarios.getTxtRif().setText("");
 
} 
//--------------------------------------------
   

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
   Usuario usuario=new Usuario();
   
   if (formUsuarios.getTxtRif().getText().trim().length()==0)
   {
      Rutinas.Aviso("Cedula Vacio", "");  
      formUsuarios.getTxtRif().requestFocusInWindow();
      return;
   }  
   
   if (formUsuarios.getTxtContrasena().getText().trim().length()==0)
   {
      Rutinas.Aviso("Contraseña Vacia", "");  
      formUsuarios.getTxtContrasena().requestFocusInWindow();
      return;
   }  
   
   usuario.Usuarios(formUsuarios.getTxtRif().getText(),
                    formUsuarios.getTxtContrasena().getText()
                    //formUsuarios.getCmbRol()
                    );
   
   
   lisSer.getListaUsuarios().add(usuario);
   Rutinas.Aviso("Datos Almacenados", "");
   Limpiar();
   Enabled(false);
}  
    
     @Override
    public void actionPerformed(ActionEvent e)
    {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource().equals(formUsuarios.getBtnGuardar())) 
       {
          Grabar(); 
       }  
       
       //----------
       if (e.getSource().equals(formUsuarios.getBtnCancelar())) 
       {
          Limpiar(); 
       }        
       // -----
     //if (e.getSource().equals(formUsuarios.getBtnEliminar())) 
       //{
         //new ControladorConsulClientes(lisSer);  
       //}  
     //--------  
     if (e.getSource().equals(formUsuarios.getBtnSalir())) 
       {
          formUsuarios.dispose(); 
       }  
    }
    
}
