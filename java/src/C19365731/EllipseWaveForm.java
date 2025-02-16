package C19365731;

import example.MyVisual;
import processing.core.*;

public class EllipseWaveForm extends GameObject {

    public EllipseWaveForm(MyVisual mv) {
        // referencing the GamesObject constructor
        super(mv, 0, 0, 0);
    }// end constructor

    public void render() {

        mv.colorMode(PApplet.HSB);

        int numPoints = 3;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints;

        // -------- FIRST LOOP ------
        mv.pushMatrix();

        int currentTime = mv.millis();
        int time1 = 16000;

        if (currentTime >= time1) {

            mv.textSize(16);
            mv.fill(255);
            mv.stroke(255);

            mv.text("Violence ", 30, 50);
            mv.text("\nby Grimes ", 30, 50);

        } // end if

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
            mv.rotate(r);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- SECOND LOOP ------
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

        // -------- THIRD LOOP ------
        mv.pushMatrix();
        for (int i = 0; i < 65; i++) {
            float c = PApplet.map(i, 0, 500, 240, 255) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 460 + PApplet.sin(theta) * r;
            y = 460 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);

            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- FOURTH LOOP ------
        mv.pushMatrix();
        for (int i = 0; i < 55; i++) {
            float c = PApplet.map(i, 0, 500, 0, 255) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 360 + PApplet.sin(theta) * r;
            y = 360 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- SEVENTH LOOP ------
        mv.pushMatrix();
        for (int i = 0; i < 55; i++) {
            float c = PApplet.map(i, 0, 500, 110, 255) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 260 + PApplet.sin(theta) * r;
            y = 260 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

    }// endmethod


}// end class