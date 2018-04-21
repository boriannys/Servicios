package Controlador;
/*@author jjvg_*/
import Vista.JFrmCausa;
import Modelo.Listas;
import Modelo.Rutinas;
import Modelo.Causa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//-----------------------
public class ControladorCausas implements ActionListener
{

    private JFrmCausa jfrmcausa;
    private Listas listCausa;

    public ControladorCausas(Listas listaCausa)
    { 
        listCausa=listaCausa;
        jfrmcausa = new JFrmCausa();
        jfrmcausa.agregarListener(this);
        jfrmcausa.setVisible(true);
        GenerarCodigo();
        Enabled(true);
        jfrmcausa.getTxtCaNombre().requestFocusInWindow();
        
    }

    public ControladorCausas()
    {
        CargarCausa();
    }
    
    private void LimpiarCa()
    {
        jfrmcausa.getTxtCaNombre().setText("");
        jfrmcausa.getTxtCaCodigo1().setText("");
        jfrmcausa.getTxtCaDescrip().setText("");
        jfrmcausa.getTxtCaDuracion().setText("");
        
    }
    @Override
    public void actionPerformed(ActionEvent ca) 
    {
        if(ca.getSource().equals(jfrmcausa.getCancelar()))
       {
           CargarCausa();
       }  
        if(ca.getSource().equals(jfrmcausa.getBtnCaSalir()))
        {
            jfrmcausa.dispose();
        }
        if(ca.getSource().equals(jfrmcausa.getBtnCaGuardar()))
        {
            GuardarCausa();
        }
    }

    public void GuardarCausa()
    {
         Causa causas=new Causa();
   
   if (jfrmcausa.getTxtCaDescrip().getText().trim().length()==0)
   {
      Rutinas.Aviso("Descripcion Vacia", "");  
      jfrmcausa.getTxtCaDescrip().requestFocusInWindow();
      return;
   }  
   
    if (jfrmcausa.getTxtCaNombre().getText().trim().length()==0)
   {
      Rutinas.Aviso("Nombre Vacio", "");  
      jfrmcausa.getTxtCaNombre().requestFocusInWindow();
      return;
   }  
     if (jfrmcausa.getTxtCaDuracion().getText().trim().length()==0)
   {
      Rutinas.Aviso("Duracion vacia", "");  
      jfrmcausa.getTxtCaDuracion().requestFocusInWindow();
      return;
   }  
     causas.Causa(
     Integer.parseInt(jfrmcausa.getTxtCaCodigo1().getText()),
     Integer.parseInt(jfrmcausa.getTxtCaDuracion().getText()),
     jfrmcausa.getTxtCaDescrip().getText(),
     jfrmcausa.getTxtCaNombre().getText());
     Integer posiCausa;
   posiCausa = listCausa.ExisteCausa(Integer.parseInt(jfrmcausa.getTxtCaCodigo1().getText()));
   
   if (posiCausa==-1)       
     listCausa.getListaCausas().add(causas);
   else
     listCausa.getListaCausas().set(posiCausa, causas);  
    }
    public void GenerarCodigo()
    {
        int codigoCa=Rutinas.Generar_Aleatorio(300);
        String codigo=Integer.toString(codigoCa);
        jfrmcausa.getTxtCaCodigo1().setText(codigo);
    }
    public void CargarCausa()
    {
        Integer posCausa;
        Causa causas=new Causa();
        Enabled(true);
        posCausa=listCausa.ExisteCausa(Integer.parseInt(jfrmcausa.getTxtCaCodigo1().getText()));
      if (posCausa>=0)
      {
          causas=listCausa.getListaCausas().get(posCausa);
         jfrmcausa.getTxtCaDescrip().setText(causas.getCadescrip());
         jfrmcausa.getTxtCaDuracion().setText(Integer.toString(causas.getCaduracion()));
         jfrmcausa.getTxtCaNombre().setText(causas.getCaNombre());
         
      }
    }
    public void Enabled(boolean status)
    {
        jfrmcausa.getTxtCaCodigo1().setEditable(!status);
        jfrmcausa.getTxtCaNombre().setEditable(status);
        jfrmcausa.getTxtCaDescrip().setEditable(status);
        jfrmcausa.getTxtCaDuracion().setEditable(status);
    }
}
