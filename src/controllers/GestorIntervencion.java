
package controllers;

import Dao.IntervencionDao;
import clases.Gruporesolucion;
import clases.Historialintervencion;
import clases.Intervencion;
import clases.Ticket;
import clases.Usuario;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GestorIntervencion {

    public void tieneIntervencion(Ticket ticket, Gruporesolucion grupoResolucion, Usuario usuario, String observacion) {
        
            Intervencion intervencion = new Intervencion();
            IntervencionDao intervencionDao = new IntervencionDao();
            
             intervencion = intervencionDao.getIntervencion(ticket, grupoResolucion);
             GestorFecha gestorF = new GestorFecha();
             Date fechaActual = new Date();
             fechaActual = gestorF.obtenerFecha();
             Boolean resultado = verificarEstadoIntervencion(intervencion);  
            
            if(resultado){
                
                intervencion.setEstadoactual(Enum_EstadoIntervencion.ASIGNADA.toString());
                Historialintervencion historialIntervencion = new Historialintervencion();
                
                historialIntervencion.setIntervencion(intervencion);
                historialIntervencion.setEstado(Enum_EstadoIntervencion.ASIGNADA.toString());
                historialIntervencion.setUsuario(usuario);
                historialIntervencion.setFechainicio(fechaActual);
                historialIntervencion.setHorafin(fechaActual);
                historialIntervencion.setObservaciones(observacion);
              
                intervencion.getHistorialintervencions().add(historialIntervencion);
               
                intervencionDao.updateIntervecnion(intervencion);
            }else{
               
                Intervencion nuevaIntervencion = new Intervencion();
                
                nuevaIntervencion.setTicket(ticket);
                
                
                nuevaIntervencion.setGruporesolucion(grupoResolucion);
                nuevaIntervencion.setEstadoactual(Enum_EstadoIntervencion.ASIGNADA.toString());
              
                Historialintervencion historialIntervencion = new Historialintervencion();
                
                historialIntervencion.setIntervencion(nuevaIntervencion);
                historialIntervencion.setEstado(Enum_EstadoIntervencion.ASIGNADA.toString());
                historialIntervencion.setUsuario(usuario);
                historialIntervencion.setFechainicio(fechaActual);
                historialIntervencion.setHorainicio(fechaActual);
                historialIntervencion.setObservaciones(observacion);
                
                HashSet<Historialintervencion> hashHistorialIntervenciones = new HashSet<>();
                hashHistorialIntervenciones.add(historialIntervencion);
                
                nuevaIntervencion.setHistorialintervencions(hashHistorialIntervenciones);
                
                intervencionDao.insertIntervencion(nuevaIntervencion, historialIntervencion);
                
            }
        }
    
    private Boolean verificarEstadoIntervencion(Intervencion i){
        
        Boolean b=false;
        if(i != null && i.getEstadoactual().equals(Enum_EstadoIntervencion.EN_ESPERA.toString()) ){
            b=true;
        }
        return b;
    }
    
}
