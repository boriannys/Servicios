
package Controlador;

/**
 *
 * @author yosbely
 */
import Modelo.Clientes;
import Modelo.Ranking;
import Modelo.Listas;
import Modelo.Rutinas;
import Vista.jfrmConsulRanking;
import Vista.JFrameRanking;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Logger;
import javax.swing.JTable;

public class ControladorRanking implements ActionListener, KeyListener {
    
    private JFrameRanking jfrmRanking;
    private jfrmConsulRanking jfrmConsulRanking;
    private Listas lisRanking;

    public ControladorRanking(Listas listaRanking) {
        lisRanking= listaRanking;
        jfrmRanking= new JFrameRanking();
        jfrmRanking.agregarListener(this);
        jfrmRanking.setVisible(true);
        Enabled(true);
        CargarCodigo();
            
//--------------------------------
        jfrmRanking.getTxtNombreRank().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                NombreRankkeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
             {
               NombreRankkeyPressed(e);  
             }          
            
       }
     );   
//-----------------------------------------
        jfrmRanking.getTxtDescripcionRank().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                DescripcionRankkeyTyped(e);  
              }
                 
            @Override
            public void keyPressed(KeyEvent e) 
             {
               DescripcionRankkeyPressed(e);  
             }  

            
       }
     );    
       
       
    }

   //----------------------------------------- 
   
    //------------------------------------------
    private void NombreRankkeyTyped(KeyEvent e) 
     {
         String cadena;
  
    cadena=jfrmRanking.getTxtNombreRank().getText().trim();
            if (cadena.length()==20)
            {
              e.consume();  
              return;
            }  
     }

    private void NombreRankkeyPressed(KeyEvent e)
    {
    }
    private void DescripcionRankkeyTyped(KeyEvent e) 
    {
         String cadena;
  
    cadena=jfrmRanking.getTxtDescripcionRank().getText().trim();
            if (cadena.length()==30)
            {
              e.consume();  
              return;
            }  
    }

   private void DescripcionRankkeyPressed(KeyEvent e) 
   {
   }
            

    @Override
    public void keyTyped(KeyEvent e) {
         }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    //---------------------------------------
    private void Grabar()    
{
   Ranking ranking=new Ranking();
   
     
   if (jfrmRanking.getTxtNombreRank().getText().trim().length()==0)
   {
      Rutinas.Aviso("Nombre vacío", "");  
      jfrmRanking.getTxtNombreRank().requestFocusInWindow();
      return;
   } 
   
   if (jfrmRanking.getTxtDescripcionRank().getText().trim().length()==0)
   {
      Rutinas.Aviso("Descripción vacía", "");  
      jfrmRanking.getTxtDescripcionRank().requestFocusInWindow();
      return;
   } 
   if(jfrmRanking.getCmbNivel().getSelectedIndex()==0)
   {
       Rutinas.Aviso("Debe seleccionar un nivel de acceso", "");
       jfrmRanking.getCmbNivel().requestFocusInWindow();
       return;
   }
   
   ranking.Ranking(jfrmRanking.getTxtCodigoRank().getText(),
                    jfrmRanking.getTxtNombreRank().getText(),
                    jfrmRanking.getTxtDescripcionRank().getText(),
                    Integer.parseInt(jfrmRanking.getCmbNivel().getSelectedItem().toString()));
   
  Integer posRanking;
  posRanking = lisRanking.ExisteRanking(jfrmRanking.getTxtCodigoRank().getText());
   
  if (posRanking==-1)       
     lisRanking.getListaRanking().add(ranking);
  else
  lisRanking.getListaRanking().set(posRanking,ranking);  
   
  Rutinas.Aviso("Registro Realizado", "");
   Limpiar();
   Enabled(false);
   CargarCodigo();
}
    //----------------------------------------
    public void Buscar(String codigo){
        
   Integer posCod;
   Ranking ranking=new Ranking();
   JTable Tabla = jfrmConsulRanking.getjTableRanking();
   Integer filaSel = (Integer) Tabla.getValueAt(Tabla.getSelectedRow(), 0);

// txt.setText(Integer.toString(id));
   
    posCod=lisRanking.ExisteRanking(Integer.toString(filaSel));
    //if (posCod>=0)
       {
         ranking=lisRanking.getListaRanking().get(posCod);
         jfrmRanking.getTxtCodigoRank().setText(Integer.toString(filaSel));
         jfrmRanking.getTxtNombreRank().setText(ranking.getNombreRank());
         jfrmRanking.getTxtDescripcionRank().setText(ranking.getDescripcionRank());
         jfrmRanking.getCmbNivel().setSelectedItem(ranking.getNivelRank());
        
         Enabled(false);
       }

    }

    //---------------------------------------
   
   
    private void Enabled(boolean status) 
    {
       
     jfrmRanking.getTxtNombreRank().setEditable(status);  
     jfrmRanking.getTxtDescripcionRank().setEditable(status);
     jfrmRanking.getCmbNivel().setEnabled(status);  
       
    }
//-------------------------------
    private void Limpiar()
    {
        CargarCodigo();
        jfrmRanking.getTxtNombreRank().setText("");  
        jfrmRanking.getTxtDescripcionRank().setText("");
        jfrmRanking.getCmbNivel().setSelectedIndex(0);
        jfrmRanking.getTxtNombreRank().requestFocusInWindow();
        
    }
//----------------------------------
    public void CargarCodigo() 
    {
        int codigoR=Rutinas.Generar_Aleatorio(200);
        String codigoText= Integer.toString(codigoR);
        jfrmRanking.getTxtCodigoRank().setText(codigoText);
    }
//-------------------------------
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if (e.getSource().equals(jfrmRanking.getBtnGuardar())) 
       {
          Grabar(); 
       } 
   
       //----------
      if (e.getSource().equals(jfrmRanking.getBtnCancelar())) 
       {
          Limpiar(); 
       } 
     
     //--------  
     if (e.getSource().equals(jfrmRanking.getBtnSalir())) 
       {
          jfrmRanking.dispose(); 
       }  
    }

    
}
    
    

