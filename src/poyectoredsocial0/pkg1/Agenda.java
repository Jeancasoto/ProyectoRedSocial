/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyectoredsocial0.pkg1;

import java.io.Serializable;

/**
 *
 * @author jeansoto
 */
public class Agenda implements Serializable{
    
    String fecha;
    String titulo;
    Object fechahilo;
    int recordatorio;
  private static final long SerialVersionUID = 001L;
  
    public Agenda() {
    }

    public Agenda(String fecha, String titulo, int recordatorio, Object fechahilo) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.recordatorio = recordatorio;
        this.fechahilo=fechahilo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(int recordatorio) {
        this.recordatorio = recordatorio;
    }

    public Object getFechahilo() {
        return fechahilo;
    }

    public void setFechahilo(Object fechahilo) {
        this.fechahilo = fechahilo;
    }
    
    

    @Override
    public String toString() {
        return "Fecha:  " + fecha+"\n" + "Titulo:  " + titulo+"\n"+ "Recordatorio:  " + recordatorio +"\n";
    }

   
    
    
    
}
