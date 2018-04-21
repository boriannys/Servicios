
package Modelo;

/**
 *
 * @author Conni
 */

//--------DECLARACION DEL VARIABLES---------------------

public class TipoRecurso 
{
  private String codigo;
  private String nombre;
  private String descripcion;
  private String tasa;
  
//--------CONSTRUCTOR CON PARAMETROS---------------------

    public void TipoRecurso(String codigo,
                       String nombre, 
                       String descripcion, 
                       String tasa) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tasa = tasa;
    }
  
   
     
//-----------CONSTRUCTOR SIN PARAMETROS------------------
    public TipoRecurso() 
    {
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.tasa = "";
    }
//-----------METODOS SET------------------

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTasa(String tasa) {
        this.tasa = tasa;
    }
    
    
    
//-----------METODOS GET------------------

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTasa() {
        return tasa;
    }

    
    
    
}
