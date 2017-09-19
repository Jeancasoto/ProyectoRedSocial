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
public class HiloMp3 extends Thread{

    MP3 mp3 = new MP3();
    
    
    @Override
    
    
    public void run() {
        mp3.setVisible(true);
        mp3.pack();
        mp3.setLocationRelativeTo(mp3);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        
    }
    
    
    
}
