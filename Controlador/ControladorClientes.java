package Controlador;

import Modelo.Clientes;
import Modelo.Listas;
import Modelo.Rutinas;
import Vista.jfrmClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorClientes implements ActionListener,KeyListener
{
   private jfrmClientes formClientes;  
   public Listas lisSer;
   ControladorClientes()
   {
       
   }
   
    public ControladorClientes(Listas lisServicios) 
    {
       lisSer=lisServicios;
       formClientes = new jfrmClientes();
       formClientes.agregarListener(this);
       formClientes.setVisible(true);
       formClientes.getBtnReestablecerCliente().setVisible(false);
       Enabled(false);
       
      
       //Programacion de los KeyListener
       formClientes.getjTextFieldRif().addKeyListener(new KeyAdapter()
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
       formClientes.getjTextFieldRazonSocial().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                RazonSocialkeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
               {
               }   
       }
     );        
       
       //-------------------------------
    }

  
//---------------------------
private void RifkeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=formClientes.getjTextFieldRif().getText().trim();
  if (cadena.length()==12)
  {
    e.consume();  
    return;
  }  
}        
//--------------------------
private void RazonSocialkeyTyped(KeyEvent e)
{
  String cadena;
  
  cadena=formClientes.getjTextFieldRazonSocial().getText().trim();
  if (cadena.length()==30)
  {
    e.consume();  
    return;
  }  
    
}        
//--------------------------
private void RifkeyPressed(KeyEvent e)
{
   Integer Tecla,Opcion;
   Integer posiRif;
   Clientes cli=new Clientes();
   Tecla=e.getKeyCode();
   if (Tecla==10 && formClientes.getjTextFieldRif().getText().trim().length() > 0)
    {
      posiRif=lisSer.ExisteCliente(formClientes.getjTextFieldRif().getText().trim());
      if (posiRif>=0)
       {
         cli=lisSer.getListaClientes().get(posiRif);
         formClientes.getjTextFieldRazonSocial().setText(cli.getRazonSocial());
         formClientes.getjTextFieldDireccion().setText(cli.getDireccion());
         formClientes.getjTextFieldCorreo().setText(cli.getCorreo());
         formClientes.getjTextFieldTelefono().setText(cli.getTelefono());
         
               //   case 1:lisSer.getListaClientes().remove(posiRif); 
       }
      Enabled(true); 
      formClientes.getjTextFieldRazonSocial().requestFocusInWindow();
    }  
}        
//--------------------------
public void Enabled(boolean status)
{
  formClientes.getjTextFieldRif().setEditable(!status);
  formClientes.getjTextFieldRazonSocial().setEditable(status);  
  formClientes.getjTextFieldDireccion().setEditable(status);  
  formClientes.getjTextFieldTelefono().setEditable(status);
  formClientes.getjTextFieldCorreo().setEditable(status);  
}        
//--------------------------
private void Limpiar()    
{
  formClientes.getjTextFieldRif().setText("");  
  formClientes.getjTextFieldRazonSocial().setText("");  
  formClientes.getjTextFieldDireccion().setText("");  
  formClientes.getjTextFieldTelefono().setText("");
  formClientes.getjTextFieldCorreo().setText("");
  formClientes.getjTextFieldRif().requestFocusInWindow();
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
    //-----------------------
    public void Reestablecer()
    {
         Clientes cli=new Clientes();
         Integer posiRif;
         String rif;
         rif=formClientes.getjTextFieldRif().getText();
         posiRif=lisSer.ExisteCliente(rif);
       
      if (posiRif>=0)
       {
         cli=lisSer.getListaClientes().get(posiRif);
         formClientes.getjTextFieldRif().setText(rif);
         formClientes.getjTextFieldRazonSocial().setText(cli.getRazonSocial());
         formClientes.getjTextFieldDireccion().setText(cli.getDireccion());
         formClientes.getjTextFieldCorreo().setText(cli.getCorreo());
         formClientes.getjTextFieldTelefono().setText(cli.getTelefono());
         formClientes.setVisible(true);
         Enabled(true);
       
       }
    }
//-------------------------
 public void Grabar()    
{
    
   Clientes cliente=new Clientes(formClientes.getjTextFieldRif().getText(),
                    formClientes.getjTextFieldRazonSocial().getText(),
                    formClientes.getjTextFieldDireccion().getText(), 
                    formClientes.getjTextFieldTelefono().getText(), 
                    formClientes.getjTextFieldCorreo().getText());
   
   if (formClientes.getjTextFieldRif().getText().trim().length()==0)
   {
      Rutinas.Aviso("Rif Vacio", "");  
      formClientes.getjTextFieldRif().requestFocusInWindow();
      return;
   }  
   
   if (formClientes.getjTextFieldRazonSocial().getText().trim().length()==0)
   {
      Rutinas.Aviso("Razon Social Vacia", "");  
      formClientes.getjTextFieldRazonSocial().requestFocusInWindow();
      return;
   }  
 
   Integer posiCliente;
   String nom;
   nom=formClientes.getjTextFieldRif().getText();
   posiCliente = lisSer.ExisteCliente(nom);
   
   if (posiCliente>=0)       
    lisSer.getListaClientes().set(posiCliente, cliente);
   else
    lisSer.getListaClientes().add(cliente);
   Rutinas.Aviso("Grabacion Realizada", "");
   formClientes.dispose();
   new ControladorConsulClientes(lisSer); 
}  
 //------------ Eliminar-----------------
 public void Eliminar(String rif, Listas lis)
 {
     
     lisSer=lis;
     Clientes cli=new Clientes();
     Integer posiRif;
     posiRif=lisSer.ExisteCliente(rif);
     cli=lisSer.getListaClientes().get(posiRif);
     lisSer.getListaClientes().remove(cli);
     
     
 }
 //----------- Buscar--------------------
 public void BuscarCliente(String rif,Listas lisServicios)
 {
     lisSer=lisServicios;
        formClientes = new jfrmClientes();
        formClientes.agregarListener(this);
        formClientes.getjButtonCancelar().setVisible(false);
        Integer posiRif;
        Clientes cli=new Clientes();
      
         posiRif=lisSer.ExisteCliente(rif);
       
      if (posiRif>=0)
       {
         cli=lisSer.getListaClientes().get(posiRif);
         formClientes.getjTextFieldRif().setText(rif);
         formClientes.getjTextFieldRazonSocial().setText(cli.getRazonSocial());
         formClientes.getjTextFieldDireccion().setText(cli.getDireccion());
         formClientes.getjTextFieldCorreo().setText(cli.getCorreo());
         formClientes.getjTextFieldTelefono().setText(cli.getTelefono());
         formClientes.setVisible(true);
         Enabled(true);
       
       }
 }
//--------------------------    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(formClientes.getjButtonGrabar())) 
       {
          Grabar(); 
       }  
       
       //----------
       if (e.getSource().equals(formClientes.getjButtonCancelar())) 
       {
          Limpiar(); 
       }        
       // -----
     if (e.getSource().equals(formClientes.getBtnReestablecerCliente())) 
       {
         Reestablecer();  
       }  
     //--------  
     if (e.getSource().equals(formClientes.getjButtonSalir())) 
       {
          formClientes.dispose(); 
       }  
       
    }

   

}
