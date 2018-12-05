
package clases;

import java.util.Date;


/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
    public class TicketDTO {
    
       private int nroTicket;
       private int NroLegajoempleado;
       private Date fechaapertura;
       private String estadoactual;
       private Date horaapertura;
       private String clasificacionactual;
       private String operador;
       private Date fechaultimocambioestado;
       private String grupoactual;

    public TicketDTO(){  
    }
     
    public int getNroTicket() {
        return nroTicket;
    }

    public void setNroTicket(int nroTicket) {
        this.nroTicket = nroTicket;
    }

    public int getNroLegajoempleado() {
        return NroLegajoempleado;
    }

    public void setNroLegajoempleado(int NroLegajoempleado) {
        this.NroLegajoempleado = NroLegajoempleado;
    }

    public Date getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(Date fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public String getEstadoactual() {
        return estadoactual;
    }

    public void setEstadoactual(String estadoactual) {
        this.estadoactual = estadoactual;
    }

    public Date getHoraapertura() {
        return horaapertura;
    }

    public void setHoraapertura(Date horaapertura) {
        this.horaapertura = horaapertura;
    }

    public String getClasificacionactual() {
        return clasificacionactual;
    }

    public void setClasificacionactual(String clasificacionactual) {
        this.clasificacionactual = clasificacionactual;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Date getFechaultimocambioestado() {
        return fechaultimocambioestado;
    }

    public void setFechaultimocambioestado(Date fechaultimocambioestado) {
        this.fechaultimocambioestado = fechaultimocambioestado;
    }

    public String getGrupoactual() {
        return grupoactual;
    }

    public void setGrupoactual(String grupoactual) {
        this.grupoactual = grupoactual;
    }

}
