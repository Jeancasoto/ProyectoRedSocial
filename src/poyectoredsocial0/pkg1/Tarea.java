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
public class Tarea extends Agenda{
    String contenido;
    String notas;
    String hora;
    public Tarea() {
        super();
    }

    
    public Tarea(String contenido, String notas,String hora, String fecha, String titulo, int recordatorio, Object fechahilo) {
        super(fecha, titulo, recordatorio, fechahilo);
        this.contenido = contenido;
        this.notas = notas;
        this.hora=hora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        
        return super.toString() +"Contenido:  " + contenido +"\n"+ "Notas:  " + notas ;
    }

  
}
