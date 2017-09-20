/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyectoredsocial0.pkg1;
import java.io.Serializable;
import javax.swing.Icon;

/**
 *
 * @author jeansoto
 */
public class Post implements Serializable{
    
    paneles k = new paneles();
 Usuario u;
Icon imagen;
Icon video;
String texto;

private static final long SerialVersionUID = 001L;

    public Post() {
    }



    public Post(Icon imagen, Icon video, String texto) {
        this.imagen = imagen;
        this.video = video;
        this.texto = texto;
     paneles.ta_estado.setText(texto);
      paneles.lb_imagen.setIcon(imagen);
      paneles.lb_video.setIcon(video);
    }
 

 
    public paneles getK() {
        return k;
    }

    public void setK(paneles k) {
        this.k = k;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public Icon getVideo() {
        return video;
    }

    public void setVideo(Icon video) {
        this.video = video;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
    
}
