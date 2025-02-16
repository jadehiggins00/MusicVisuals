package example;

import ie.tudublin.*;
import C19365731.GameObject;

import java.util.ArrayList;

import C19365731.*;

public class MyVisual extends Visual {

    WaveForm wf;// referencing the waveform class - wf

    AudioBandsVisual abv;

    EllipseWaveForm ew;
    Flower f;
    Sun sun;
    ShootingStar ss;
    Hoops h;

    ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
    int which = 0;

    public void settings() {

        size(1000, 1000, P3D);
        // Use this to make fullscreen
        // fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        // fullScreen(P3D, SPAN);

    }//end mthod

    public void setup() {
        startMinim();

        // Call loadAudio to load an audio file to process
        loadAudio("violence.mp3");

        // Call this instead to read audio from the microphone
        // startListening();

        // objects
        abv = new AudioBandsVisual(this);
        ew = new EllipseWaveForm(this);
        f = new Flower(this);
        sun = new Sun(this);
        ss = new ShootingStar(this);
        h = new Hoops(this);


    }// end method

    public boolean twocubes = false;

    public void keyPressed()

    {

        keys[keyCode] = true;

        if (keyCode >= '0' && keyCode <= '7') {
            which = keyCode - '0';
        }
        if (key == ' ') {
            if (getAudioPlayer().isPlaying()) {
                getAudioPlayer().pause();
            } else {
                getAudioPlayer().rewind();
                getAudioPlayer().play();
            } // end else

        } // end if

        if (keyCode == UP) {

            twocubes = !twocubes;

        } // end if
    }// end method

    public void draw() {
        background(0);
        try {
            // Call this if you want to use FFT data
            calculateFFT();
        } catch (VisualException e) {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        // calculateFrequencyBands();

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
       

        switch (which) {

            case 0: {
                calculateAverageAmplitude();
                ew.render();

            } // end case 1
                break;

            case 1: {
                calculateAverageAmplitude();
                f.render();

            } // end case 2
                break;

            case 2: {
                calculateAverageAmplitude();

                // calling the spiral
                sun.render();
                sun.update();

            } // end case 2
                break;

            case 3: {
                pushMatrix();
                calculateAverageAmplitude();
                ss.render();
                popMatrix();

            } // end case 3
                break;

            case 4: {

                calculateAverageAmplitude();
                h.render();
                h.update();

            } // end case 3

                break;

            default: {
                System.out.println("\n Error, this is not an option");
            } // end default
        }// end switch

    }// end method



    boolean[] keys = new boolean[1024];

    public boolean checkKey(int k) {
        if (keys.length >= k) {
            return keys[k] || keys[Character.toUpperCase(k)];
        }
        return false;
    }

    public void keyReleased() {
        keys[keyCode] = false;
    }
}
