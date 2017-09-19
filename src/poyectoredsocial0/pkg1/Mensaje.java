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
public class Mensaje implements Serializable{
    String emisor;
    String receptor;
    String texto;
    int estado;

    public Mensaje(String emisor, String receptor, String texto, int estado) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.texto = texto;
        this.estado= estado;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  emisor ;
    }
    
    
    
}