/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class IntervencionDTO {
    
    private int nroTicket;
    private int legajoEmpleado;
    private String clasificacionActualTicket;
    private String estadoActualTicket;
    private Date fechaApertura;
    private String estadoIntervencion;
    private Date fechaAsiganacionIntervencion;
    private String grupoResoulucion;
    private String observacionIntervencion;
    
    
    public IntervencionDTO(){
    }
    
    
    
    public int getNroTicket() {
        return nroTicket;
    }

    public void setNroTicket(int nroTicket) {
        this.nroTicket = nroTicket;
    }

    public int getLegajoEmpleado() {
        return legajoEmpleado;
    }

    public void setLegajoEmpleado(int legajoEmpleado) {
        this.legajoEmpleado = legajoEmpleado;
    }

    public String getClasificacionActualTicket() {
        return clasificacionActualTicket;
    }

    public void setClasificacionActualTicket(String clasificacionActualTicket) {
        this.clasificacionActualTicket = clasificacionActualTicket;
    }

    public String getEstadoActualTicket() {
        return estadoActualTicket;
    }

    public void setEstadoActualTicket(String estadoActualTicket) {
        this.estadoActualTicket = estadoActualTicket;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getEstadoIntervencion() {
        return estadoIntervencion;
    }

    public void setEstadoIntervencion(String estadoIntervencion) {
        this.estadoIntervencion = estadoIntervencion;
    }

    public Date getFechaAsiganacionIntervencion() {
        return fechaAsiganacionIntervencion;
    }

    public void setFechaAsiganacionIntervencion(Date fechaAsiganacionIntervencion) {
        this.fechaAsiganacionIntervencion = fechaAsiganacionIntervencion;
    }

    public String getGrupoResoulucion() {
        return grupoResoulucion;
    }

    public void setGrupoResoulucion(String grupoResoulucion) {
        this.grupoResoulucion = grupoResoulucion;
    }

    public String getObservacionIntervencion() {
        return observacionIntervencion;
    }

    public void setObservacionIntervencion(String observacionIntervencion) {
        this.observacionIntervencion = observacionIntervencion;
    }
    
}
