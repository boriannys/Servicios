/**
 *
 * @author jjvg_
 */
package Modelo;


public class Causa 
{
    
  private int Cacod,Caduracion;
  private  String Cadescrip,CaNombre;

    public void Causa(int Cacod, int Caduracion, String Cadescrip, String CaNombre) 
    {
        this.Cacod = Cacod;
        this.Caduracion = Caduracion;
        this.Cadescrip = Cadescrip;
        this.CaNombre= CaNombre;
    }
//----------------------------------
    public Causa() 
    {
        this.Cacod = 0;
        this.Caduracion= 0;
        this.Cadescrip= "";
        this.CaNombre="";
        
        
    }
//--------------------------
    public String getCaNombre() {
        return CaNombre;
    }

    public void setCaNombre(String CaNombre) {
        this.CaNombre = CaNombre;
    }
//--------------------------------------
    public int getCacod() {
        return Cacod;
    }

    public void setCacod(int Cacod) {
        this.Cacod = Cacod;
    }
//-------------------------------------
    public int getCaduracion() {
        return Caduracion;
    }

    public void setCaduracion(int Caduracion) {
        this.Caduracion = Caduracion;
    }
//--------------------------------------------
    public String getCadescrip() {
        return Cadescrip;
    }

    public void setCadescrip(String Cadescrip) {
        this.Cadescrip = Cadescrip;
    }
  
    
   
    
}
