
package Modelo;

/**
 *
 * @author Conni
 */

//--------DECLARACION DEL VARIABLES---------------------
public class Servicio {
  private String codigo;
  private String nombre;
  private String descripcion;
  
//--------CONSTRUCTOR CON PARAMETROS---------------------
  
   public void Servicio(String codigo, 
                    String nombre, 
                    String descripcion) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
   
     
//-----------CONSTRUCTOR SIN PARAMETROS------------------
    public Servicio() 
    {
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
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
  
    
}
