package Modelo;

import Modelo.Causa;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import javax.swing.*;

import java.util.GregorianCalendar;

/* @author jjvg_*/
public class OrdenServicio {

   // GregorianCalendar calendar = new GregorianCalendar();
    private Date OSFechaInicial, OSFechaFinal;
    private String OSLugar, OSClienteRif, OSEstado;
    private int OSObraCod, OSSerCod;
//  private Recurso ArrRecurso[];
    private Causa OSCausa;

    public OrdenServicio(Date OSFechaInicial, Date OSFechaFinal, String OSLugar, String OSClienteRif, String OSEstado, int OSObraCod, int OSSerCod) {
        this.OSFechaInicial = OSFechaInicial;
        this.OSFechaFinal = OSFechaFinal;
        this.OSLugar = OSLugar;
        this.OSClienteRif = OSClienteRif;
        this.OSEstado = OSEstado;
        this.OSObraCod = OSObraCod;
        this.OSSerCod = OSSerCod;
    }

    public OrdenServicio() 
    {
        this.OSLugar = "";
        this.OSClienteRif = "";
        this.OSEstado = "";
        this.OSObraCod = 0;
    }
    

    /**
     * @return the OSFechaInicial
     */
    public Date getOSFechaInicial() {
        return OSFechaInicial;
    }

    /**
     * @param OSFechaInicial the OSFechaInicial to set
     */
    public void setOSFechaInicial(Date OSFechaInicial) {
        this.OSFechaInicial = OSFechaInicial;
    }

    /**
     * @return the OSFechaFinal
     */
    public Date getOSFechaFinal() {
        return OSFechaFinal;
    }

    /**
     * @param OSFechaFinal the OSFechaFinal to set
     */
    public void setOSFechaFinal(Date OSFechaFinal) {
        this.OSFechaFinal = OSFechaFinal;
    }

    /**
     * @return the OSLugar
     */
    public String getOSLugar() {
        return OSLugar;
    }

    /**
     * @param OSLugar the OSLugar to set
     */
    public void setOSLugar(String OSLugar) {
        this.OSLugar = OSLugar;
    }

    /**
     * @return the OSClienteRif
     */
    public String getOSClienteRif() {
        return OSClienteRif;
    }

    /**
     * @param OSClienteRif the OSClienteRif to set
     */
    public void setOSClienteRif(String OSClienteRif) {
        this.OSClienteRif = OSClienteRif;
    }

    /**
     * @return the OSEstado
     */
    public String getOSEstado() {
        return OSEstado;
    }

    /**
     * @param OSEstado the OSEstado to set
     */
    public void setOSEstado(String OSEstado) {
        this.OSEstado = OSEstado;
    }

    /**
     * @return the OSObraCod
     */
    public int getOSObraCod() {
        return OSObraCod;
    }

    /**
     * @param OSObraCod the OSObraCod to set
     */
    public void setOSObraCod(int OSObraCod) {
        this.OSObraCod = OSObraCod;
    }

    /**
     * @return the OSSerCod
     */
    public int getOSSerCod() {
        return OSSerCod;
    }

    /**
     * @param OSSerCod the OSSerCod to set
     */
    public void setOSSerCod(int OSSerCod) {
        this.OSSerCod = OSSerCod;
    }

    /**
     * @return the OSCausa
     */
    public Causa getOSCausa() {
        return OSCausa;
    }

    /**
     * @param OSCausa the OSCausa to set
     */
    public void setOSCausa(Causa OSCausa) {
        this.OSCausa = OSCausa;
    }
    
    public void ProcesarOrden(Causa causarechazo,String Estado)
    {
        if(Estado=="Rechazar")
        {
            setOSCausa(causarechazo);
            setOSEstado("Rechazada");
        }
        else
        {
            if(Estado=="Aprobar")
            {
               setOSEstado("Rechazada");
            }
        }
    }
    public void ProcesarRecursoOrden()
    {
        
    }
}
