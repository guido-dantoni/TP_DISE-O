
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
                    
                    IntervencionDTO intervencionDto = new IntervencionDTO();
                    
                    intervencionDto.setIdIntervencion(l.get(i).getIdIntervencion());
                    intervencionDto.setNroTicket(l.get(i).getTicket().getNroTicket());
                    intervencionDto.setLegajoEmpleado(l.get(i).getTicket().getEmpleado().getLegajoEmpleado());
                    intervencionDto.setClasificacionActualTicket(l.get(i).getTicket().getClasificacion().getNombreclasificacion());
                    intervencionDto.setEstadoActualTicket(l.get(i).getTicket().getEstadoactual());
                    intervencionDto.setFechaApertura(l.get(i).getTicket().getFecahapertura());
                    intervencionDto.setGrupoResoulucion(l.get(i).getGruporesolucion().getNombregrupo());
                    intervencionDto.setEstadoIntervencion(l.get(i).getEstadoactual());
                    
                    //casteo el historialintervencion de la intervencion.get(i) a Arraylist
                     List<Historialintervencion> hi = new ArrayList<>(l.get(i).getHistorialintervencions());
                      
                     //obtengo la primer fechaInicio porque es la mas chica --> es la fecha de apertura
                    intervencionDto.setFechaAsiganacionIntervencion(hi.get(0).getFechainicio());
                   //obtengo la observacion del ultimo elemento del historilIntervencion de la intervencion.get(i)
                   //ya que es la ultima observacion cargada
                    intervencionDto.setObservacionIntervencion(hi.get(hi.size()-1).getObservaciones());
                    
                    intervencionesFiltradas.add(intervencionDto);
                }
                
                return intervencionesFiltradas;    
    }

    public Intervencion obtenerIntervencion(int idInt) {
            IntervencionDao i = new IntervencionDao();
            return i.getIntervencion(idInt);
            
    }
    

    public void registrarNuevoEstado(Intervencion i, String nuevoEstadoIntervencion, String nuevaClasificacion, String motivo, String nuevaObservacion) {
    
        GestorSesion gestorSesion = new GestorSesion();
        Usuario u = new Usuario();
        GestorFecha gestorF = new GestorFecha();
        Date fechaActual = gestorF.obtenerFecha();
                
        u = gestorSesion.getUsuarioLogueado();
        
        IntervencionDao intervencionDao = new IntervencionDao();
         //recupero el ultimo historial y lo actualizo     
        Historialintervencion historialIntervencion = new Historialintervencion();
        historialIntervencion =  intervencionDao.getHistorial(i);
        
        historialIntervencion.setFechafin(fechaActual);
        historialIntervencion.setHorafin(fechaActual);
        
        intervencionDao.updateHistorialIntervencion(historialIntervencion);
        
        //creo historial nuevo y lo guardo
        Historialintervencion hi = new Historialintervencion();
        hi.setHorainicio(fechaActual);
        hi.setUsuario(u);
        hi.setFechainicio(fechaActual);
        hi.setEstado(nuevoEstadoIntervencion);
        hi.setObservaciones(nuevaObservacion);
        hi.setIntervencion(i); 
        if(nuevoEstadoIntervencion.equals("CERRADA")){ // si el nuevo estado es cerrado seteo fecha y hora fin
            
            hi.setFechafin(fechaActual);
            hi.setHorafin(fechaActual);
        }
                      
        HashSet<Historialintervencion> hashHistorialIntervenciones = new HashSet<>();
        hashHistorialIntervenciones.add(hi);
                
        i.setHistorialintervencions(hashHistorialIntervenciones);
        
        i.setEstadoactual(nuevoEstadoIntervencion);
        
        intervencionDao.updateIntervecnion(i);
        intervencionDao.insertHistorialIntervencion(hi);
        
        if(!nuevoEstadoIntervencion.equals("TRABAJANDO")){
            GestorTicket gestorTicket = new GestorTicket();
            gestorTicket.actualizarEstadoTicket(i, nuevoEstadoIntervencion, nuevaClasificacion, motivo);
        }
    }

    public Boolean existenIntervenciones(Ticket ticket) {
        
        Boolean tiene=false;
        IntervencionDao intervencionDao = new IntervencionDao();
        List<Intervencion> intervenciones = new ArrayList<>();
        intervenciones = intervencionDao.getIntervenciones(ticket);
        

        if(intervenciones.size() > 0){
            tiene=true;
        }
        return tiene;
    }

  
}
