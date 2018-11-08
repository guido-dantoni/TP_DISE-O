
package controllers;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GestorFecha {
    
    public Date obtenerFecha(){
        
        Date f = new Date();
        Calendar c = new GregorianCalendar(); 
        //c.setTime(fechaApertura);

        int dia, mes, anio;

        dia = c.get(Calendar.DATE);
        mes = c.get((Calendar.MONTH)+1);
        anio = c.get(Calendar.YEAR);
        
                
        f.setYear(anio);
        f.setMonth(mes);
        f.setDate(dia);

        
        return f;
    }
    
    public Date obtenerHora(){
        
        Date h = new Date();
        Calendar c = new GregorianCalendar();
        int hora, minutos, segundos;
        
        hora = c.get(Calendar.HOUR_OF_DAY);
        minutos = c.get(Calendar.MINUTE);
        segundos = c.get(Calendar.SECOND);
        
        h.setHours(hora);
        h.setMinutes(minutos);
        h.setSeconds(segundos);
        return h;
    }
    
}
