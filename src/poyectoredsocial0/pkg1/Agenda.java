/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyectoredsocial0.pkg1;

/**
 *
 * @author jeansoto
 */
public class Agenda {
    
    String fecha;
    String titulo;
    int recordatorio;

    public Agenda() {
    }

    public Agenda(String fecha, String titulo, int recordatorio) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.recordatorio = recordatorio;
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

    @Override
    public String toString() {
        return "Fecha:  " + fecha+"\n" + "Titulo:  " + titulo+"\n"+ "Recordatorio:  " + recordatorio +"\n";
    }

   
    
    
    
}
