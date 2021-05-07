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

        // --- Green inner circle -----
        // mv.pushMatrix();
        // for (int i = 0; i < 45; i++) {
        //     float c = PApplet.map(i, 0, 500, 90, 255) % 255.0f;
        //     mv.strokeWeight(1);
        //     mv.stroke(c, 255, 255, 100);
        //     float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
        //     mv.pushMatrix();
        //     x = mv.mouseX + PApplet.sin(theta) * r; //40
        //     y = mv.mouseY - PApplet.cos(theta) * r;
        //     r += 0.8f + mv.getSmoothedAmplitude();

        //     mv.fill(0);
        //     mv.translate(mv.height / 2, mv.width / 2);
        //     // mv.rotate(rotation);
        //     mv.ellipse(0, 0, x, y);

        //     mv.popMatrix();

        // } /// end loop
        // mv.popMatrix();

        // --- LIGHT BLUE PART-----
        mv.pushMatrix();
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 115, 255) % 255.0f;
            mv.strokeWeight(1);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = mv.mouseX + PApplet.sin(theta) * r; //90
            y = 90 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // mv.rotate(rotation);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // --- PURPLE PART-----
        mv.pushMatrix();
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 190, 255) % 255.0f;
            mv.strokeWeight(1);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 130 + PApplet.sin(theta) * r; //130
            y = 130 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // mv.rotate(rotation);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- DARK BLUE inner HOOP ------
        mv.pushMatrix();
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 140, 255) % 255.0f;
            mv.strokeWeight(1);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 200 + PApplet.sin(theta) * r; //200
            y = 200 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // mv.rotate(rotation);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- LIGHT BLUE HOOP ------
        mv.pushMatrix();
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 110, 255) % 255.0f;
            mv.strokeWeight(1);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 260 + PApplet.sin(theta) * r; // 260
            y = 260 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // mv.rotate(rotation);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();
        // int currentTime = PApplet.second();
        // int time1 = 5000;
        // if (currentTime == time1) {

        // mv.textSize(32);
        // mv.fill(255);
        // mv.text("Violence", 100, 70);

        // } // end if

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

        // -------- RED HOOP ------
        mv.pushMatrix();
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 250, 255) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 820 + PApplet.sin(theta) * r;
            y = 520 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            mv.rotate(rotation + 2.5f);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- A difference shade of red under the hoop ------
        mv.pushMatrix();
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 254, 255) % 255.0f;
            mv.strokeWeight(1);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 820 + PApplet.sin(theta) * r;
            y = 520 - PApplet.cos(theta) * r;
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

        int currentTime = PApplet.second();
        int time1 = 52000;
        if (currentTime == time1) {

            mv.textSize(32);
            mv.fill(255);
            mv.text("Violence", 100, 70);

        } // end if

    }// end method

}// end class
