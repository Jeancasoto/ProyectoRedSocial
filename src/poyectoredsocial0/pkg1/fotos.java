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
public class fotos implements Serializable {

    Album al = new Album();
    Icon f1;
    Icon f2;
    Icon f3;
    Icon f4;
    Icon f5;
    Icon f6;
    Icon f7;
    Icon f8;
    Icon f9;
    Icon f10;
    String titulo;

    public fotos(Icon f1, Icon f2, Icon f3, Icon f4, Icon f5, Icon f6, Icon f7, Icon f8, Icon f9, Icon f10, String titulo) {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;
        this.f6 = f6;
        this.f7 = f7;
        this.f8 = f8;
        this.f9 = f9;
        this.f10 = f10;
        this.titulo =titulo;
        al.foto_1.setIcon(f1);
        al.foto_2.setIcon(f2);
        al.foto_3.setIcon(f3);
        al.foto_4.setIcon(f4);
        al.foto_5.setIcon(f5);
        al.foto_6.setIcon(f6);
        al.foto_7.setIcon(f7);
        al.foto_8.setIcon(f8);
        al.foto_9.setIcon(f9);
        al.foto_10.setIcon(f10);
        al.lb_titulo_album.setText(titulo);
    }

    public Album getAl() {
        return al;
    }

    public void setAl(Album al) {
        this.al = al;
    }

    public Icon getF1() {
        return f1;
    }

    public void setF1(Icon f1) {
        this.f1 = f1;
    }

    public Icon getF2() {
        return f2;
    }

    public void setF2(Icon f2) {
        this.f2 = f2;
    }

    public Icon getF3() {
        return f3;
    }

    public void setF3(Icon f3) {
        this.f3 = f3;
    }

    public Icon getF4() {
        return f4;
    }

    public void setF4(Icon f4) {
        this.f4 = f4;
    }

    public Icon getF5() {
        return f5;
    }

    public void setF5(Icon f5) {
        this.f5 = f5;
    }

    public Icon getF6() {
        return f6;
    }

    public void setF6(Icon f6) {
        this.f6 = f6;
    }

    public Icon getF7() {
        return f7;
    }

    public void setF7(Icon f7) {
        this.f7 = f7;
    }

    public Icon getF8() {
        return f8;
    }

    public void setF8(Icon f8) {
        this.f8 = f8;
    }

    public Icon getF9() {
        return f9;
    }

    public void setF9(Icon f9) {
        this.f9 = f9;
    }

    public Icon getF10() {
        return f10;
    }

    public void setF10(Icon f10) {
        this.f10 = f10;
    }
    
    

}
