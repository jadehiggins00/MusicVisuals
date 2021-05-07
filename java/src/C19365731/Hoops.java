package C19365731;

import example.MyVisual;
import processing.core.PApplet;

public class Hoops extends GameObject {

    public Hoops(MyVisual mv) {
        super(mv, 0, 0, 0);
    }// end constructor

    public void render() {

        mv.colorMode(PApplet.HSB);

        int numPoints = 3;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints;
      

            // -------- FIRST HOOP ------
            mv.pushMatrix();
            for (int i = 0; i < 45; i++) {
                float c = PApplet.map(i, 0, 500, 160, 255) % 255.0f;
                mv.strokeWeight(1);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 260 + PApplet.sin(theta) * r;
                y = 260 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                // mv.rotate(rotation);
                mv.ellipse(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

     

            // -------- FIRST HOOP ------
            mv.pushMatrix();
            for (int i = 0; i < 45; i++) {
                float c = PApplet.map(i, 0, 500, 110, 255) % 255.0f;
                mv.strokeWeight(1);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 260 + PApplet.sin(theta) * r;
                y = 260 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                // mv.rotate(rotation);
                mv.ellipse(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

            // -------- Second HOOP ------
            mv.pushMatrix();
            for (int i = 0; i < 45; i++) {
                float c = PApplet.map(i, 0, 500, 10, 255) % 255.0f;
                mv.strokeWeight(2);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 800 + PApplet.sin(theta) * r;
                y = 400 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                mv.rotate(-rotation);
                mv.ellipse(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

            // -------- third HOOP ------
            mv.pushMatrix();
            for (int i = 0; i < 45; i++) {
                float c = PApplet.map(i, 0, 500, 30, 255) % 255.0f;
                mv.strokeWeight(2);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 560 + PApplet.sin(theta) * r;
                y = 360 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                mv.rotate(rotation);
                mv.ellipse(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

            // -------- FOURTH HOOP ------
            mv.pushMatrix();
            for (int i = 0; i < 45; i++) {
                float c = PApplet.map(i, 0, 500, 250, 255) % 255.0f;
                mv.strokeWeight(2);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 840 + PApplet.sin(theta) * r;
                y = 500 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                mv.rotate(rotation + 2.5f);
                mv.ellipse(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

    
    }// end method

    public void update() {

        rotation += 0.01f;
        mv.colorMode(PApplet.HSB);

        int numPoints = 3;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints;
        int currentTime = PApplet.second();
        if (currentTime == 4000) {

            // -------- FIRST HOOP ------
            mv.pushMatrix();
            for (int i = 0; i < 45; i++) {
                float c = PApplet.map(i, 0, 500, 160, 255) % 255.0f;
                mv.strokeWeight(1);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 260 + PApplet.sin(theta) * r;
                y = 260 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                // mv.rotate(rotation);
                mv.ellipse(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

        } // end if

    }// end method

}// end class
