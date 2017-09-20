/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyectoredsocial0.pkg1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jeansoto
 */
public class HiloNotificacion extends Thread{

    Object year;
    Object month;
    Object day;
    Object hour;
    Object minutes;

    public HiloNotificacion(String fecha) {
     
     Object[] token  = fecha.split("/"); 
     year = token[0];
     month = token[1];
     day = token[2];
     hour = token[3];
     minutes = token[4];
     
    }

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }

    public Object getMonth() {
        return month;
    }

    public void setMonth(Object month) {
        this.month = month;
    }

    public Object getDay() {
        return day;
    }

    public void setDay(Object day) {
        this.day = day;
    }

    public Object getHour() {
        return hour;
    }

    public void setHour(Object hour) {
        this.hour = hour;
    }

    public Object getMinutes() {
        return minutes;
    }

    public void setMinutes(Object minutes) {
        this.minutes = minutes;
    }

    @Override
    public void run() {
        Principal p = null ;
       while (true){
//            Date fecha;
//                fecha = new Date();
//                
//               DateFormat f = new SimpleDateFormat("M/dd/yy");
//                 
//                   Object[] tokens  = f.format(fecha).split("/");
//                  Object mes=(tokens[0]);
//                   Object dia=(tokens[1]);
//                    Object anio=("20"+tokens[2]);
//                    Object hora = new Date().getHours();
//                    Object minutos = new Date().getMinutes();
                    
                    if (new Date().getYear()==117) {
                        System.out.println("1");
                        if (new Date().getMonth()==Integer.parseInt((String)month)) {
                            System.out.println("2");
                            if (new Date().getDate()==Integer.parseInt((String)day)) {
                                System.out.println("3");
                                 if (new Date().getHours()==Integer.parseInt((String)hour)) {
                                     System.out.println("4");
                                     if (new Date().getMinutes()==Integer.parseInt((String)minutes)) {
                                         System.out.println("Deberia");
                                         JOptionPane.showMessageDialog(p.js, "Recordatorio de agenda!");
                                         break;
                                     }
                                }
                            }
                        }
           }
//           if (anio.equals(year)) {
//               System.out.println(year);
//               if (mes.equals(month)) {
//                   System.out.println(month);
//                   if (day.equals(dia)) {
//                       System.out.println(day);
//                       if (hora.equals(hour)) {
//                           System.out.println(hour);
//                           if (minutos.equals(minutes)) {
//                               System.out.println(minutes);
//                                JOptionPane.showMessageDialog(p.label_u, "EVENTO!!!!!!!!");
//                                System.out.println("debia servir");
//                           }
//                       }
//                   }
//               }
//           }
           try {
               Thread.sleep(500);
           } catch (Exception e) {
           }
       }
        
    }


}
