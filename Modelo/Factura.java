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
public class Factura 
{

 private String numeroFactura, rifCliente;
    private Double subtotal,  total, iva;

    public Factura(String numeroFactura,String rifCliente, Double subtotal, Double total, Double iva) {
        this.numeroFactura = numeroFactura;
        this.rifCliente= rifCliente;
        this.subtotal = subtotal;
        this.total = total;
        this.iva = iva;
    }

     public Factura()
    {
        this.numeroFactura="";
        this.rifCliente="";
        this.subtotal=0.00;
        this.total=0.00;
        this.iva=0.00;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getRifCliente() {
        return rifCliente;
    }

    public void setRifCliente(String rifCliente) {
        this.rifCliente = rifCliente;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }
     
     
     
}
