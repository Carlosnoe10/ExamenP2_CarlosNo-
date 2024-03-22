/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlp2_carlosnoé;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author cd507
 */
public class MusicPlayer extends Thread implements Serializable{

    private File filePath;
    private Player player;
    private boolean paused = false;
    private boolean playing = false;

    public MusicPlayer(File filePath) {
        this.filePath = filePath;
    }

    public File getFilePath() {
        return filePath;
    }

    public void setFilePath(File filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            playing = true;
            player.play();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {

            }
        } catch (FileNotFoundException | JavaLayerException ex) {
            ex.printStackTrace();
        }
    }

    public void stopPlaying() {
        if (player != null) {
            playing = false;
            player.close();
        }
    }

    public void pause() {
        if (playing) {
            paused = true;
            player.close();
        }
    }

    public void resumePlaying() {
        if (paused) {
            paused = false;
            start();
        }
    }

    public boolean isPlaying() {
        return playing;
    }

    public boolean isPaused() {
        return paused;
    }
}
