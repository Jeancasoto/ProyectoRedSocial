/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyectoredsocial0.pkg1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author jeansoto
 */
public class Usuario implements Serializable{

    private String nombre;
    private String nickname;
    private String nacionalidad;
    private Date fecha;
    private String password;
    private Icon fotografia;
    private String cod;
    ArrayList solicitudes = new ArrayList();
    ArrayList amigos= new ArrayList();
   ArrayList <Agenda> agenda = new ArrayList();
    ArrayList <Mensaje> mensajesR = new ArrayList();
    ArrayList <Post> publitexto= new ArrayList();
    ArrayList <Post> publiimagen= new ArrayList();
    ArrayList <Post> publivideo= new ArrayList();
    
    private static final long SerialVersionUID = 001L;

//    public Persona(String nombre, String nickname, String nacionalidad, Date fecha, String password,Icon fotografia) {
//        this.nombre = nombre;
//        this.nickname = nickname;
//        this.nacionalidad = nacionalidad;
//        this.fecha = fecha;
//        this.password = password;
//        this.fotografia = fotografia;
//       
//    }

    public Usuario(String nombre, String nickname, String nacionalidad, Date fecha, String password, String cod) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
        this.password = password;
        this.cod=cod;
        
    }
       public Usuario(String nombre, String nickname, String nacionalidad, Date fecha, String password, ArrayList solicitudes, String cod) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
        this.password = password;
        this.solicitudes= solicitudes;
        this.cod=cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Icon getFotografia() {
        return fotografia;
    }

    public void setFotografia(Icon fotografia) {
        this.fotografia = fotografia;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public ArrayList getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }


    public ArrayList<Mensaje> getMensajesR() {
        return mensajesR;
    }

    public void setMensajesR(ArrayList<Mensaje> mensajesR) {
        this.mensajesR = mensajesR;
    }

    public ArrayList<Agenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Agenda> agenda) {
        this.agenda = agenda;
    }

    public ArrayList<Post> getPublitexto() {
        return publitexto;
    }

    public void setPublitexto(ArrayList<Post> publitexto) {
        this.publitexto = publitexto;
    }

    public ArrayList<Post> getPubliimagen() {
        return publiimagen;
    }

    public void setPubliimagen(ArrayList<Post> publiimagen) {
        this.publiimagen = publiimagen;
    }

    public ArrayList<Post> getPublivideo() {
        return publivideo;
    }

    public void setPublivideo(ArrayList<Post> publivideo) {
        this.publivideo = publivideo;
    }
    
    

}
