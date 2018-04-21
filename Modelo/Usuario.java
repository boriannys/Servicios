
package Modelo;

import javax.swing.JComboBox;

/**
 *
 * @author Boriannys
 */
public class Usuario 
{
    private String Rif;
    private String Contrasena;
    private String Rol;

    public void Usuarios(String Rif,
                    String Contrasena)
    {
        this.Rif = Rif;
        this.Contrasena = Contrasena;
        //this.Rol = Rol;
    }
   //------------------------------- 
    public Usuario()
    {
        this.Rif = "";
        this.Contrasena = "";
    }
    //------------------------------

    public void setRif(String Rif)
    {
        this.Rif = Rif;
    }
    //------------------------------
    public void setContrasena(String Contrasena)
    {
        this.Contrasena = Contrasena;
    }
    //-----------------------------
    public void setRol(String Rol)
    {
        this.Rol = Rol;
    }
    //------------------------------
    public String getRif() 
    {
        return Rif;
    }
    //-----------------------------
    public String getContrasena() 
    {
        return Contrasena;
    }
    //-----------------------------
    public String getRol() 
    {
        return Rol;
    }

    public Usuario(String text, String text0, JComboBox cmbRol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
