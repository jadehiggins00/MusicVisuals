package C19365731;

import example.MyVisual;
import processing.core.*;

public class Flower extends GameObject {

 

    // constructor
    public Flower(MyVisual mv) {
        super(mv,0,0,0);
    }// end constructor

    public void render() {
        mv.colorMode(PApplet.HSB);

        int numPoints = 3;
        float angle = 0.0f;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints;

        // // ------- Center of Flower --------
        mv.pushMatrix();

        for (int i = 0; i < 55; i++) {
            float c = PApplet.map(i, 0, 500, 0, 0) % 255.0f;
            mv.strokeWeight(1);
            mv.stroke(255);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            float diagonal = PApplet.PI / (float) angle;
            mv.pushMatrix();
            x = 200 + PApplet.sin(theta) * r;
            y = 200 - PApplet.cos(theta) * r;
            r += 0.5f + mv.getSmoothedAmplitude();

            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // mv.rotate(diagonal);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // ********************** PINK PETALS ************************

        // -------- First PINK Petal ------
        mv.pushMatrix();
        // angle = 3.0f;
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 230, 225) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            float diagonal = PApplet.PI / (float) angle;
            mv.pushMatrix();
            x = 110 + PApplet.sin(theta) * r;
            y = 800 - PApplet.cos(theta) * r;
            r += 0.5f + mv.getSmoothedAmplitude();
            angle = 2.5f;
            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // mv.rotate(r);
            mv.rotate(diagonal);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- First PURPLE Petal ------
        mv.pushMatrix();
        // angle = 3.0f;
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 200, 225) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            float diagonal = PApplet.PI /  (float)angle;
            mv.pushMatrix();
            x = 110 + PApplet.sin(theta) * r;
            y = 800 - PApplet.cos(theta) * r;
            r += 0.5f + mv.getSmoothedAmplitude();
            angle = 3.5f;
            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // rotate(r);
            mv.rotate(diagonal);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- Second Purple Petal ------
        mv.pushMatrix();
        // angle = 3.0f;
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 200, 225) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            float diagonal = PApplet.PI / (float) angle;
            mv.pushMatrix();
            x = 110 + PApplet.sin(theta) * r;
            y = 800 - PApplet.cos(theta) * r;
            r += 0.5f + mv.getSmoothedAmplitude();
            angle = -2.5f;
            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // rotate(r);
            mv.rotate(diagonal);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- Second PINK Petal ------
        mv.pushMatrix();
        // angle = 3.0f;
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 230, 225) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            float diagonal = PApplet.PI / (float) angle;
            mv.pushMatrix();
            x = 110 + PApplet.sin(theta) * r;
            y = 800 - PApplet.cos(theta) * r;
            r += 0.5f + mv.getSmoothedAmplitude();
            angle = -3.5f;
            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // rotate(r);
            mv.rotate(diagonal);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- Third PURPLE Petal ------
        mv.pushMatrix();
        // angle = 3.0f;
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 200, 225) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            float diagonal = PApplet.PI / (float) angle;
            mv.pushMatrix();
            x = 110 + PApplet.sin(theta) * r;
            y = 800 - PApplet.cos(theta) * r;
            r += 0.5f + mv.getSmoothedAmplitude();
            angle = -8.0f;
            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // rotate(r);
             mv.rotate(diagonal);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // -------- Third PINK Petal ------
        mv.pushMatrix();
        // angle = 3.0f;
        for (int i = 0; i < 45; i++) {
            float c = PApplet.map(i, 0, 500, 230, 225) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            float diagonal = PApplet.PI / (float) angle;
            mv.pushMatrix();
            x = 100 + PApplet.sin(theta) * r;
            y = 790 - PApplet.cos(theta) * r;
            r += 0.5f + mv.getSmoothedAmplitude();
            angle = 8.0f;
            mv.fill(0);
            mv.translate(mv.height / 2, mv.width / 2);
            // rotate(r);
             mv.rotate(diagonal);
            mv.ellipse(0, 0, x, y);

            mv.popMatrix();

        } /// end loop
        mv.popMatrix();


        // CENTRE OF FLOWER BLUE PART
        mv.pushMatrix();

        for (int i = 0; i < 75; i++) {
        float c = PApplet.map(i, 0, 500, 140, 255) % 255.0f;
        mv.strokeWeight(3);
        mv.stroke(c, 255, 255, 100);
        float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
        float diagonal = PApplet.PI / (float) angle;
        mv.pushMatrix();
        x = 30 + PApplet.sin(theta) * r;
        y = 30 - PApplet.cos(theta) * r;
        r += 0.5f + mv.getSmoothedAmplitude();

        mv.fill(0);
        mv.translate(mv.height / 2, mv.width / 2);
        // mv.rotate(diagonal);
        mv.rotate(r);
        mv.ellipse(0, 0, x, y);

        mv.popMatrix();

        } /// end loop
        mv.popMatrix();

        // ----- light blue inner circle --------
        mv.pushMatrix();

        for (int i = 0; i < 75; i++) {
        float c = PApplet.map(i, 0, 500, 100, 255) % 255.0f;
        mv.strokeWeight(2);
        mv.stroke(c, 255, 255, 100);
        float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
        float diagonal = PApplet.PI / (float) angle;
        mv.pushMatrix();
        x = 50 + PApplet.sin(theta) * r;
        y = 50 - PApplet.cos(theta) * r;
        r += 0.5f + mv.getSmoothedAmplitude();

        mv.fill(0);
        mv.translate(mv.height / 2, mv.width / 2);
        // mv.rotate(diagonal);
        //    mv.rotate(r);
        mv.ellipse(0, 0, x, y);

        mv.popMatrix();

        } /// end loop
        mv.popMatrix();

    }// end render method

    public void update(){

    }//end method

}// end class
