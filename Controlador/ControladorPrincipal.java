package Controlador;

import Modelo.Listas;
import Vista.JFramePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener
{
    private JFramePrincipal formPrincipal;     
    private Listas lisServicios;
    
    public ControladorPrincipal() 
    {
        
      lisServicios=new Listas();  
      lisServicios.CargarClientes();
      lisServicios.CargarCategorias();
      lisServicios.CargarCausas();
      lisServicios.CargarRanking();
      lisServicios.CargarObras();
      
      formPrincipal=new JFramePrincipal();
      formPrincipal.agregarListener(this);
      formPrincipal.setVisible(true);
    }

    //----------------------------------
    @Override
    public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(formPrincipal.getjMenuItemClientes()))  
      {
        new ControladorConsulClientes(lisServicios); 
      }  
      //---
      if (e.getSource().equals(formPrincipal.getjMenuItemObras()))  
      {
         new ControladorConsultaObra(lisServicios);  
      }  
      //----------
      if (e.getSource().equals(formPrincipal.getjMenuItemTipoRecursos()))  
      {
        new ControladorTipoRecurso(lisServicios);  
      }  
       //---
      if(e.getSource().equals(formPrincipal.getJMenCausas()))
      {
          new ControladorConsulCausas(lisServicios);
      }
        if(e.getSource().equals(formPrincipal.getJMenOrden()))
      {
          new ControladorOrdenes();
          
      }
          if (e.getSource().equals(formPrincipal.getjMenuIRanking()))
      {
        new ControladorConsulRanking(lisServicios); 
      } 
           if (e.getSource().equals(formPrincipal.getjMenuCausaRecursos()))
     {
          new ControladorConsulCausaRecurso(lisServicios);
      }
      if (e.getSource().equals(formPrincipal.getjMenuFactura()))  
      {
      new ControladorFactura(lisServicios);   
      } 
       if (e.getSource().equals(formPrincipal.getjMenuItemUsuarios()))
      {
          new ControladorConsulUsuarios(lisServicios);
      }
       if (e.getSource().equals(formPrincipal.getjMenuItemRecursos()))
      {
          new ControladorConsulRecursos(lisServicios);
      }
    }
    
    
   
   
}
