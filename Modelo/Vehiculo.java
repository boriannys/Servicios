
package Modelo;

/**
 *
 * @author Boriannys
 */
public class Vehiculo
{
    private String Placa;
    private String Modelo;
    private Integer Capacidad;
    private Integer Anno;

    public void Vehiculos(String Placa,
                         String Modelo,Integer Capacidad,Integer Anno
                         )
    {
        this.Placa = Placa;
        this.Modelo = Modelo;
        this.Capacidad = Capacidad;
        this.Anno = Anno;

    }
     //------------------------------- 
    public Vehiculo()
    {
        this.Placa = "";
        this.Modelo = "";
        this.Capacidad = 0;
        this.Anno = 0;
    }
//---------------------------------

    public String getPlaca()
    {
        return Placa;
    }
//--------------------------------- 
    public String getModelo() 
    {
        return Modelo;
    }
//---------------------------------
    public Integer getCapacidad()
    {
        return Capacidad;
    }
//---------------------------------
    public Integer getAnno()
    {
        return Anno;
    }
//-----------------------------------------    

    public void setPlaca(String Placa)
    {
        this.Placa = Placa;
    }
//--------------------------------------------
    public void setModelo(String Modelo) 
    {
        this.Modelo = Modelo;
    }
//---------------------------------------------
    public void setCapacidad(Integer Capacidad) 
    {
        this.Capacidad = Capacidad;
    }
//------------------------------------------------
    public void setAnno(Integer Anno) 
    {
        this.Anno = Anno;
    }
//-------------------------------------------------  
    
}
