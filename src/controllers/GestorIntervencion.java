
package controllers;

import Dao.IntervencionDao;
import clases.Gruporesolucion;
import clases.Historialintervencion;
import clases.Intervencion;
import clases.IntervencionDTO;
import clases.Ticket;
import clases.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

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

    public List<IntervencionDTO> buscarIntervencionesCriterios(Integer nroTicket, Integer nroLegajoEmpleado, String estadoIntervencion, Date fechaDesde, Date fechaHasta) {
                    
                List<IntervencionDTO> intervencionesFiltradas = new ArrayList<>();
                IntervencionDao intervencionDao = new IntervencionDao();
               
                List<Intervencion> l = intervencionDao.getIntervencionesFiltradas(nroTicket,nroLegajoEmpleado,estadoIntervencion,fechaDesde,fechaHasta);
                
                for(int i=0; i<l.size(); i++){
                    
                    intervencionesFiltradas.get(i).setNroTicket(l.get(i).getTicket().getNroTicket());
                    intervencionesFiltradas.get(i).setLegajoEmpleado(l.get(i).getTicket().getEmpleado().getLegajoEmpleado());
                    intervencionesFiltradas.get(i).setClasificacionActualTicket(l.get(i).getTicket().getClasificacion().getNombreclasificacion());
                    intervencionesFiltradas.get(i).setEstadoActualTicket(l.get(i).getTicket().getEstadoactual());
                    intervencionesFiltradas.get(i).setFechaApertura(l.get(i).getTicket().getFecahapertura());
                    intervencionesFiltradas.get(i).setGrupoResoulucion(l.get(i).getGruporesolucion().getNombregrupo());
                    
                    //casteo el historialintervencion de la intervencion.get(i) a Arraylist
                     List<Historialintervencion> hi = new ArrayList<>(l.get(i).getHistorialintervencions());
                      
                     //obtengo la primer fechaInicio porque es la mas chica --> es la fecha de apertura
                    intervencionesFiltradas.get(i).setFechaAsiganacionIntervencion(hi.get(0).getFechainicio());
                   //obtengo la observacion del ultimo elemento del historilIntervencion de la intervencion.get(i)
                   //ya que es la ultima observacion cargada
                    intervencionesFiltradas.get(i).setObservacionIntervencion(hi.get(hi.size()-1).getObservaciones());
                }
                
                return intervencionesFiltradas;    
    }

    
}
