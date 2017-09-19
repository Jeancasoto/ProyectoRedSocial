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
public class Evento extends Agenda{
    
    String inicio;
    String fin;

    public Evento() {
        super();
    }

    public Evento(String inicio, String fin, String fecha, String titulo, int recordatorio, Object fechahilo) {
        super(fecha, titulo, recordatorio, fechahilo);
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return super.toString()+"Inicio de evento:  " + inicio + ", Fin del evento:  " + fin ;
    }
    
    
    
}
