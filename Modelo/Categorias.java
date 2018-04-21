package Modelo;

public class Categorias 
{
  private String codCategoria;
  private String nombre;

    public void Categorias(String codCategoria, String nombre) {
        this.codCategoria = codCategoria;
        this.nombre = nombre;
    }

//-------------------------
    public Categorias() 
    {
        this.codCategoria = "";
        this.nombre = "";
    }
    
//--------------------------    
  
    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
  
}
