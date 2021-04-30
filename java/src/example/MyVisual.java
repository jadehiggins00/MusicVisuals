package C19365731;

import ie.tudublin.*;
import ddf.minim.AudioBuffer;
import example.AudioBandsVisual;
import example.CubeVisual1;
import example.WaveForm;

public class MyVisual extends Visual
{    
    WaveForm wf;
    AudioBandsVisual abv;
    Spirals s;
    CubeVisual1 cv1;

    
    public void settings()
    {
        size(1000, 1000,P3D);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("violence.mp3");   

        
        // Call this instead to read audio from the microphone
        //startListening(); 
        
        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
        s = new Spirals(this);
    
      
    
       
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
           // getAudioPlayer().cue(0);
           if(getAudioPlayer().isPlaying()){
               getAudioPlayer().pause();
           }//endn if

           else{
               getAudioPlayer().rewind();
               getAudioPlayer().play();
           }
            
        }
    }

    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        // calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();    
       // wf.render();
      //  abv.render();
        s.render();
        
    }
}
