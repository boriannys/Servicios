
package Modelo;

/**
 *
 * @author Ikemi
 */

//--------DECLARACION DEL VARIABLES---------------------
public class TipoRecursoServicio {
    
  private String codigo;
  private String cantidadsugerida;
  
//--------CONSTRUCTOR CON PARAMETROS---------------------
  
   public void TipoRecursoServicio(String codigo, 
                    String cantidadsugerida) 
    {
        this.codigo = codigo;
        this.cantidadsugerida = cantidadsugerida;
    }
   
     
//-----------CONSTRUCTOR SIN PARAMETROS------------------
    public TipoRecursoServicio() 
    {
        this.codigo = "";
        this.cantidadsugerida = "";
    }
//-----------METODOS SET------------------

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCantidadsugerida(String cantidadsugerida) {
        this.cantidadsugerida = cantidadsugerida;
    }

    
    
    
//-----------METODOS GET------------------

    public String getCodigo() {
        return codigo;
    }

    public String getCantidadsugerida() {
        return cantidadsugerida;
    }

    
}
