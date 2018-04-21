/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Orlando Cuervo
 */
public class Obra 
{
  private String nombre;
  private String descripcion;
  private String rifCliente;
 // private Integer codigo;

    public void Obra(String rifCliente, String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rifCliente = rifCliente;
    }

    


  
    
  
    //-----------------------------
    public Obra() 
    {
        this.nombre = "";
        this.descripcion = "";
       // this.codigo = 0;
        this.rifCliente="";
    }
    //-----------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getRifCliente() {
        return rifCliente;
    }

    public void setRifCliente(String rifCliente) {
        this.rifCliente = rifCliente;
    }

  /*  public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }*/

   
    
    
}
