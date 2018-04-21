/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Listas;
import Vista.JFrmConsulCausaRecurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author yosbely
 */
public class ControladorConsulCausaRecurso implements ActionListener{
    private JFrmConsulCausaRecurso jfrmConsulCausaRecurso;
    private Listas lisConsulCausaRecurso;

    public ControladorConsulCausaRecurso(Listas listaConsulCausaRecurso) {
        listaConsulCausaRecurso=lisConsulCausaRecurso;
        jfrmConsulCausaRecurso= new JFrmConsulCausaRecurso();
        jfrmConsulCausaRecurso.agregarListener(this);
        jfrmConsulCausaRecurso.setVisible(true);
    }



public void actionPerformed(ActionEvent e) 
    {
       
     if (e.getSource().equals(jfrmConsulCausaRecurso.getBtnSalir())) 
       {
         jfrmConsulCausaRecurso.dispose();
       }  
     //--------  
     /*if (e.getSource().equals(formClientes.getjButtonSalir())) 
       {
          formClientes.dispose(); 
       }  
       */
    }    
}
