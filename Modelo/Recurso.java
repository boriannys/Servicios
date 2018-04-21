
package Modelo;

/**
 *
 * @author Boriannys
 */
public class Recurso
{
    private String Codigo;
    private Integer CantidadExistente;
    private String Estado;
    private String Causa;
    private String Tipo;
    
        public void Recursos(String Codigo,
                             String Estado,
                             String Tipo)
    {
        this.Codigo = Codigo;
        this.Estado = Estado;
        this.Tipo = Tipo;
        //this.Anno = Anno;

    }
     //------------------------------- 
    public Recurso()
    {
        this.Codigo = "";
        this.Estado= "";
        this.Tipo= "";
        this.CantidadExistente = 0;
        //this.Anno = 0;
    }
//---------------------------------

    public String getCodigo() 
    {
        return Codigo;
    }
//------------------------------------
    public Integer getCantidadExistente()
    {
        return CantidadExistente;
    }
//---------------------------------------
    public String getEstado() 
    {
        return Estado;
    }
//-----------------------------------------
    public String getCausa() 
    {
        return Causa;
    }
//----------------------------------------
    public String getTipo() 
    {
        return Tipo;
    }
//---------------------------------------

    public void setCodigo(String Codigo)
    {
        this.Codigo = Codigo;
    }
//--------------------------------------------
    public void setCantidadExistente(Integer CantidadExistente)
    {
        this.CantidadExistente = CantidadExistente;
    }
//--------------------------------------
    public void setEstado(String Estado)
    {
        this.Estado = Estado;
    }
//--------------------------------------------
    public void setCausa(String Causa)
    {
        this.Causa = Causa;
    }
//------------------------------------------------
    public void setTipo(String Tipo) 
    {
        this.Tipo = Tipo;
    }
    
}
