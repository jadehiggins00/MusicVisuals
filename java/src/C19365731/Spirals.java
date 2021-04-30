package C19365731;
import example.MyVisual;
import processing.core.*;


public class Spirals  {


    MyVisual mv;
    float x;
    // MyVisual mv;
     int i;
    
     float average = 0;
     float sum = 0;

   
     //float[] lerpedBuffer;
     
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

        int numPoints = 3;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints; 
          

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
                  mv.translate(mv.height/2, mv.width/2 );
                  //mv.rotate(r);
                  mv.ellipse(0, 0, x, y);

                  mv.popMatrix();


              } /// end loop
              mv.popMatrix();

                 // -------- FOURTH LOOP ------
            mv.pushMatrix();
            for (int i = 0; i < 45; i++) {
                float c = PApplet.map(i, 0, 500, 199, 225) % 255.0f;
                mv.strokeWeight(2);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 470 + PApplet.sin(theta) * r;
                y = 800 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
               // rotate(r);
                mv.ellipse(0, 0, x, y);

                mv.popMatrix();
              

            } /// end loop
            mv.popMatrix();

            // -------- FIFTH LOOP ------
            mv.pushMatrix();
            for (int i = 0; i < 65; i++) {
                float c = PApplet.map(i, 0, 500, 240, 255) % 255.0f;
                mv.strokeWeight(2);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 460 + sin(theta) * r;
                y = 460 - cos(theta) * r;
                r += 0.8f + lerpedAverage;

                fill(0);
                translate(height / 2, width / 2);
           
                ellipse(0, 0, x, y);

                popMatrix();
                lastX = x;
                lastY = y;

            } /// end loop
            popMatrix();

            // -------- SIXTH LOOP ------
            pushMatrix();
            for (int i = 0; i < 55; i++) {
                float c = map(i, 0, 500, 0, 255) % 255.0f;
                strokeWeight(2);
                stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + lerpedAverage * 5);
                pushMatrix();
                x = 360 + sin(theta) * r;
                y = 360 - cos(theta) * r;
                r += 0.8f + lerpedAverage;

                fill(0);
                translate(height / 2, width / 2);
                ellipse(0, 0, x, y);

                popMatrix();
                lastX = x;
                lastY = y;

            } /// end loop
            popMatrix();

            // -------- SEVENTH LOOP ------
            pushMatrix();
            for (int i = 0; i < 55; i++) {
                float c = map(i, 0, 500, 110, 255) % 255.0f;
                strokeWeight(2);
                stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + lerpedAverage * 5);
                pushMatrix();
                x = 260 + sin(theta) * r;
                y = 260 - cos(theta) * r;
                r += 0.8f + lerpedAverage;

                fill(0);
                translate(height / 2, width / 2);
                ellipse(0, 0, x, y);

                popMatrix();
                lastX = x;
                lastY = y;

            } /// end loop
            popMatrix();
     

    }//endmethod


}//end class