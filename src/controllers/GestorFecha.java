
package controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GestorFecha {
    
    public Date obtenerFecha(){
        
      Date f = new Date();

        int dia, mes, anio, hora, minutos, segundos;

        dia = f.getDate();
        mes = f.getMonth();
        anio = f.getYear();
        hora = f.getHours();
        minutos = f.getMinutes();
        segundos = f.getSeconds();
        
      
        f.setYear(anio);
        f.setMonth(mes);
        f.setDate(dia);
        f.setHours(hora);
        f.setMinutes(minutos);
        f.setSeconds(segundos);
        
        return f;
    }
    
}