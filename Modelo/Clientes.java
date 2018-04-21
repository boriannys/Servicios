package Modelo;

public class Clientes 
{
  private String rif;
  private String razonSocial;
  private String direccion;
  private String telefono;
  private String correo;

    public Clientes(String rif, 
                    String razonSocial, 
                    String direccion, 
                    String telefono, 
                    String correo) 
    {
        this.rif = rif;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

  
//-----------------------------
    public Clientes() 
    {
        this.rif = "";
        this.razonSocial = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
    }
  
//-----------------------------  
    public String getRif() 
    {
        return rif;
    }
//-----------------------------
    public void setRif(String rif) 
    {
        this.rif = rif;
    }
//-----------------------------
    public String getRazonSocial() 
    {
        return razonSocial;
    }
//-----------------------------
    public void setRazonSocial(String razonSocial) 
    {
        this.razonSocial = razonSocial;
    }
//-----------------------------
    public String getDireccion() 
    {
        return direccion;
    }
//-----------------------------
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
//-----------------------------
    public String getTelefono() 
    {
        return telefono;
    }
//-----------------------------
    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }
//-----------------------------
    public String getCorreo() 
    {
        return correo;
    }
//-----------------------------
    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }
  
  
}
