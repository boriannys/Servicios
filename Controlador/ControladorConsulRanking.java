/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Listas;
import Modelo.Ranking;
import Modelo.Rutinas;
import Vista.jfrmConsulRanking;
import Vista.JFrameRanking;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class ControladorConsulRanking implements ActionListener{
    private jfrmConsulRanking jfrmConsulRanking;
    private Listas lisRanking;
    private JFrameRanking jfrmRanking;
    private ControladorRanking controlRanking;
    public String codigoEnviar;
    
            
    public ControladorConsulRanking(Listas listaRanking) 
    {
        lisRanking =listaRanking;
        jfrmConsulRanking = new jfrmConsulRanking();
        jfrmConsulRanking.agregarListener(this);
        jfrmConsulRanking.setVisible(true);
        CargarGrid();
       
   
  //------------------------------------
  

 jfrmConsulRanking.getjTableRanking().addMouseListener(new MouseAdapter()
        {       
          
            @Override
            public void  mouseClicked(MouseEvent e) 
             {
               MousClicked(e);  
             }
            }
          );

         
}
  //------------------------------------
    
private void CargarGrid()    
{
    Integer Fila;
    Ranking ranking=new Ranking();
    
    for (Fila=0;Fila<lisRanking.getListaRanking().size();Fila++)
     {
       ranking=lisRanking.getListaRanking().get(Fila);
       jfrmConsulRanking.getjTableRanking().setValueAt(ranking.getCodigoRank(), Fila, 0);
       jfrmConsulRanking.getjTableRanking().setValueAt(ranking.getNombreRank(), Fila, 1); 
       jfrmConsulRanking.getjTableRanking().setValueAt(ranking.getDescripcionRank(),Fila, 2);
       jfrmConsulRanking.getjTableRanking().setValueAt(ranking.getNivelRank(),Fila, 3);
     }   
}    

  
// Metodo que obtiene el valor que esta contenido en una celda indicada en particular
private String RankingSeleccionado(int fila,int columna)
{
  String codSel;
  codSel = (String)jfrmConsulRanking.getjTableRanking().getValueAt(fila, columna);
  return codSel;
}
//----------------------------------------------------------------------------------

//-- Metodo que raliza la accion del evento del boton enter sobre una celda de la tabla
//-- Le faltan validaciones y el llamado de el formulario
//-- Falta insertar valor obtenido en el formulario;


private void MousClicked(final MouseEvent e)
{
    Integer Opcion; 
    JTable Tabla = jfrmConsulRanking.getjTableRanking();
    if(e.getClickCount()==2)
    {
        int fila =Tabla.rowAtPoint(e.getPoint());// Determina la fila en donde se realizo la accion
        int columna = Tabla.columnAtPoint(e.getPoint());
        if ((fila > -1) && (columna > -1))
        System.out.println(Tabla.getColumnName(columna));
        
        if(Tabla.getColumnName(columna)=="Código")// Valida la columna sobre la cual se hace la accion
        {
            codigoEnviar=RankingSeleccionado(fila,columna);//Llama al metodo y se resta uno a la fila porque es un vector
            System.out.println(codigoEnviar);
            Opcion=Rutinas.Opciones("Modificar", "Eliminar", "Salir");//Llama a las opciones del sistema    
                switch (Opcion)
                    {
                        case 0:
                        {
                          new ControladorRanking(lisRanking);
                          
                          controlRanking.Buscar(codigoEnviar);
                          //e.consume();
                        }
                             break;
                        case 1:
      
                            break;
                        case 2: 
                         e.consume();
                            break;
                    }
        }
        else
        {
            e.consume();
            return;
        }
    }
}
  
    public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(jfrmConsulRanking.getBtnNuevo()))  
      {
          
         new ControladorRanking(lisRanking);
         controlRanking.CargarCodigo();
          
      }
      if (e.getSource().equals(jfrmConsulRanking.getBtnSalir()))  
      {
       jfrmConsulRanking.dispose(); 
      }
    }

    

   

    
} 

