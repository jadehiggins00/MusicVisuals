package example;

import ie.tudublin.*;
import C19365731.GameObject;

import java.util.ArrayList;

import C19365731.*;

public class MyVisual extends Visual {


    WaveForm wf;// referencing the waveform class - wf

    AudioBandsVisual abv;


    Spirals s;
    Flower f;
    TreeSpirals ts;
    RocketShip rs;
    ShootingStar e;

    ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
    int which = 0;

    public void settings() {

        size(1000, 1000, P3D);
        // Use this to make fullscreen
        // fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        // fullScreen(P3D, SPAN);
    }

    public void setup() {
        startMinim();

        // Call loadAudio to load an audio file to process
        loadAudio("violence.mp3");

        // Call this instead to read audio from the microphone
        // startListening();

        rs = new RocketShip(this, height / 2, width / 2);

        // gameObjects.add(rs);
        // gameObjects.add(new Flower(this));
        // gameObjects.add(new Spirals(this));
        // gameObjects.add(new TreeSpirals(this));

       wf = new WaveForm(this);


        abv = new AudioBandsVisual(this);
        s = new Spirals(this);
        f = new Flower(this);
        ts = new TreeSpirals(this);
        e = new ShootingStar(this);
    }

    public  boolean twocubes=false;
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
            
            //gettwoCubes = !twoCubes;
            twocubes = !twocubes;

            // e.getTwoCubes() = !e.getTwoCubes();
           
         
        }
    }

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
        // wf.render();
        // abv.render();

        switch (which) {

            case 0: {
                calculateAverageAmplitude();
                s.render();

            } // end case 1
            break;

            case 1: {
                calculateAverageAmplitude();
                f.render();

            } // end case 2
            break;

            case 2: {
                calculateAverageAmplitude();
                // rs.render();
                 ts.render();
                // // rs.update();

                // gameObjects.add(rs);
                // gameObjects.add(ts);

                // // going backwards -> iterate
                // for (int i = gameObjects.size() - 1; i >= 0; i--) {
                //     GameObject b = gameObjects.get(i);
                //     b.update();
                //     b.render();
                // } // end for

            } // end case 2
            break;
           
            case 3: {
                pushMatrix();
                calculateAverageAmplitude();
                e.render();
                popMatrix();

            } // end case 3


            break;

            default: {
                System.out.println("\n Error, this is not an option");
            } // end default
        }// end switch


       

    }//end method

    public void checkCollisions() {
        // checking collisions between the spiral and the rocketship
        if (dist(rs.getX(), rs.getY(), ts.getX(), ts.getY()) < ts.getHalfWidth() + rs.getHalfWidth()) {
            System.out.println("HIT");
        } // end if
    }

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
