package C19365731;

import example.MyVisual;
import processing.core.PApplet;

public class ShootingStar extends GameObject {

    public ShootingStar(MyVisual mv) {
        super(mv, 0, 0, 0);
    }// end constructor

    // creating the ellipse waveform
    public void render() {

        mv.colorMode(PApplet.HSB);

        int numPoints = 3;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints;
      

        mv.pushMatrix();
        if (!mv.twocubes) {

            // -------- FIRST SPIRAL ------
            mv.pushMatrix();
            for (int i = 0; i < 55; i++) {
                float c = PApplet.map(i, 0, 500, 130, 255) % 255.0f;
                mv.strokeWeight(2);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 700 + PApplet.sin(theta) * r;
                y = 100 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                mv.rotate(r);
                mv.rect(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

            // -------- SECOND SPIRAL ------
            mv.pushMatrix();
            for (int i = 0; i < 55; i++) {
                float c = PApplet.map(i, 0, 500, 100, 255) % 255.0f;
                mv.strokeWeight(2);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 700 + PApplet.sin(theta) * r;
                y = 200 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                mv.rotate(r);
                mv.rect(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

            // -------- THIRD SPIRAL ------
            mv.pushMatrix();
            for (int i = 0; i < 55; i++) {
                float c = PApplet.map(i, 0, 500, 200, 255) % 255.0f;
                mv.strokeWeight(2);
                mv.stroke(c, 255, 255, 100);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 700 + PApplet.sin(theta) * r;
                y = 250 - PApplet.cos(theta) * r;
                r += 0.8f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                mv.rotate(r);
                mv.rect(0, 0, x, y);

                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

        } // end if

        // ellipses loop
        else {

            // -------- White Spiral ------
            mv.pushMatrix();
            for (int i = 0; i < 75; i++) {
                mv.strokeWeight(2);
                mv.stroke(255);
                float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
                mv.pushMatrix();
                x = 700 + PApplet.sin(theta) * r;
                y = 400 - PApplet.cos(theta) * r;
                r += 0.5f + mv.getSmoothedAmplitude();

                mv.fill(0);
                mv.translate(mv.height / 2, mv.width / 2);
                mv.rotate(r);
                mv.rect(0, 0, x, y);
                mv.popMatrix();

            } /// end loop
            mv.popMatrix();

        } // end else
        mv.popMatrix();

    }// end render method

}// end class
