
package Controlador;
/* @author jjvg_*/

import Vista.JFrmOrdenServicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorOrdenes 
{
     private JFrmOrdenServicio jfrmorden;

    public ControladorOrdenes()
    {
        jfrmorden = new JFrmOrdenServicio();
        //jfrmorden.agregarListener(this);
        jfrmorden.setVisible(true);
        
    }
    // @Override
    public void actionPerformed(ActionEvent OS) 
    {
        if(OS.getSource().equals(jfrmorden.getBtnSalirOrden()))
       {
             jfrmorden.dispose();
       }  
       
    }
}
