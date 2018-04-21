
package Modelo;

/**
 *
 * @author yosbely
 */
public class Ranking {
    private String codigoRank;
    private String nombreRank;
    private String descripcionRank;
    private int nivelRank;

    public void Ranking(
                        String codigoRank,
                        String nombreRank, 
                        String descripcionRank, 
                        int nivelRank) 
    {
        this.codigoRank = codigoRank;
        this.nombreRank = nombreRank;
        this.descripcionRank = descripcionRank;
        this.nivelRank = nivelRank;
    }

    public Ranking() 
    {
        this.codigoRank = "";
        this.nombreRank = "";
        this.descripcionRank = "";
        this.nivelRank =0;
    }

    public String getCodigoRank() {
        return codigoRank;
    }

    public void setCodigoRank(String codigoRank) {
        this.codigoRank = codigoRank;
    }

    public String getNombreRank() 
    {
        return nombreRank;
    }

    public void setNombreRank(String nombreRank) 
    {
        this.nombreRank = nombreRank;
    }

    public String getDescripcionRank() 
    {
        return descripcionRank;
    }

    public void setDescripcionRank(String descripcionRank) 
    {
        this.descripcionRank = descripcionRank;
    }

    public int getNivelRank() 
    {
        return nivelRank;
    }

    public void setNivelRank(int nivelRank) 
    {
        this.nivelRank = nivelRank;
    }
   
}
