package poyectoredsocial0.pkg1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MainClass {

    FileInputStream FIS;
    BufferedInputStream BIS;

    public Player player;

    public long pauseLocation;
    public long songtotalLength;
    public String fileLocation;

    public void Stop() {
        if (player != null) {
            player.close();

            pauseLocation = 0;
            songtotalLength = 0;

            MP3.Display.setText("");
        }//fin if

    }

    public void Pause() {
        if (player != null) {
            try {
                pauseLocation = FIS.available();
                player.close();

            } //fin if
            catch (IOException ex) {

            }
        }

    }

    public void Resume() {
        try {
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);

            player = new Player(BIS);

            FIS.skip(songtotalLength - pauseLocation);
        } catch (FileNotFoundException | JavaLayerException ex) {

        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread() {

            @Override
            public void run() {

                try {
                    player.play();
                } catch (JavaLayerException ex) {

                }
            }
        }.start();
    }

    public void Play(String path) {
        try {

            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);

            player = new Player(BIS);

            songtotalLength = FIS.available();

            fileLocation = path + "";
        } catch (FileNotFoundException | JavaLayerException ex) {

        } catch (IOException ex) {

            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread() {

            @Override
            public void run() {

                try {
                    player.play();
                    if (player.isComplete() && MP3.count == 1) {
                        Play(fileLocation);

                    }
                    if (player.isComplete()) {
                        MP3.Display.setText("");

                    }
                } catch (JavaLayerException ex) {

                }
            }
        }.start();
    }

}
