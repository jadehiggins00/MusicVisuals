package C19365731;

import example.MyVisual;
import processing.core.PApplet;

public class Sun extends GameObject {


    // constuctor
    public Sun(MyVisual mv) {
        super(mv, 0, 0, 0);

    }// end constructor

    public void render() {

        // creating tree sprirals
        mv.colorMode(PApplet.HSB);

        int numPoints = 3;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints;
        int spiralSize;
        spiralSize = 900;

        mv.pushMatrix();
        float lastX = 80, lastY = 80;
        for (int i = 0; i < spiralSize; i++) {
            float c = PApplet.map(i, 0, 500, 10, 200) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 80 + PApplet.sin(theta) * r;
            y = 80 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);

            mv.translate(mv.height / 2, mv.width / 2);

            mv.rotate(rotation);
            mv.line(lastX, lastY, x, y);
            lastX = x;
            lastY = y;

            mv.popMatrix();

        } /// end loop

        mv.popMatrix();

    }// end method

    public void update() {

        rotation += 0.03f;
    }// end update method
}// end class
