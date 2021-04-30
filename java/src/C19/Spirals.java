package C19365731;

import example.MyVisual;
import processing.core.*;


public class Spirals  {
    

    MyVisual mv;
    float x;
    // MyVisual mv;
     int i;
     float r = 1f;
     float average = 0;
     float sum = 0;
   
     int numPoints = 3;
     //float[] lerpedBuffer;
     float thetaInc = PApplet.TWO_PI / (float) numPoints;
     float y = 200;
     float lerpedY = y;
  
     float dx, dy;
     float w = 50;
     float rotation = 0;
     int which = 0;


     

    public  Spirals(MyVisual mv){
        this.mv = mv;
      
        //ab = ap.mix;
    }

  
    public void render(){
        

        mv.colorMode(PApplet.HSB);
 

              // -------- THIRD LOOP ------
              mv.pushMatrix();
              for (int i = 0; i < 75; i++) {
                  float c = PApplet.map(i, 0, 500, 130, 210) % 255.0f;
                  mv.strokeWeight(1);
                  mv.stroke(c, 255, 255, 100);
                  float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                  mv.pushMatrix();
                  x = 700 + PApplet.sin(theta) * r;
                  y = 420 - PApplet.cos(theta) * r;
                  r += 0.8f + mv.getSmoothedAmplitude();
  
              
                  mv.fill(0);
                  mv.translate(mv.height / 2, mv.width / 2);
                  //mv.rotate(r);
                  mv.ellipse(0, 0, x, y);
  
                  mv.popMatrix();
              
  
              } /// end loop
              mv.popMatrix();
      
    }//endmethod


}//end class
