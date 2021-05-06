package C19365731;

import example.MyVisual;
import processing.core.PApplet;

public class Asteroid extends GameObject {

    public Asteroid(MyVisual mv) {
        super(mv, 0, 0, 0);
        respawn();
    }// end constructor

    void respawn() {
        // Roll a dice
        int dice = (int) mv.random(10);
        switch (dice) {
            case 0: {

                // left
                x = -w;
                y = mv.random(0, mv.height);
                dx = mv.random(1, 10);
                dy = mv.random(-1, 1);
            } // end case 0
            break;
            case 1: {
                // top
                x = mv.random(0, mv.width);
                y = -w;
                dx = mv.random(-1, 1);
                dy = mv.random(1, 10);
            } // end case 1
            break;

            case 2:{
                // right
                x = mv.width + w;
                y = mv.random(0, mv.height);
                dx = mv.random(-1, -10);
                dy = mv.random(-1, 1);
               
            }//end case 2
            break;
            case 3:{
                // bottom
                x = mv.random(0, mv.width);
                y = mv.height + w;
                dx = mv.random(-1, 1);
                dy = mv.random(-1, -10);
            }//end case 3
            break;
            default:{
                System.out.println("error");
            }//end default
        }/// end switch
    }// end method

    public void render() {

        // mv.pushMatrix();
        // mv.translate(x, y);
        // mv.rotate(rotation);
        // mv.stroke(255);
        // mv.noFill();
        // mv.ellipse(x, y, 60, 60);
        // mv.popMatrix();


        mv.colorMode(PApplet.HSB);

        int numPoints = 3;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints;
        int spiralSize;
        spiralSize =280;

        // drawing the branches
    
      // float c = PApplet.map(mv.getSmoothedAmplitude(), 0, 1, 0, 255);
        // mv.strokeWeight(1);
        // mv.stroke(255);
        // mv.line(500,900,500,500 );// right line
       
        // mv.line(480,900,480,450 );
        // mv.line(460,900,460,750 );
        // mv.line(450,900,450,730 );
        // mv.line(435,900,435,400 );
        // mv.line(420,900,420,500 );//left line
        // mv.line(500,500,720,350);
        // mv.line(490,490,710,340);
        // mv.line(490,460,690,320);

        // mv.line(420,500,250,400);
        // mv.line(420,490,250,390);
      

      
     mv.pushMatrix();
        float lastX = 400,lastY = 400;
        for (int i = 0; i < spiralSize; i++) {
            float c = PApplet.map(i, 0, 500, 10, 100) % 255.0f;
            mv.strokeWeight(2);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 400 + PApplet.sin(theta) * r;
            y = 400 - PApplet.cos(theta) * r;
            r += 0.5f + mv.getSmoothedAmplitude();

            mv.fill(0);
            
            //mv.rotate(r);
            //mv.ellipse(0,0, x, y);
           mv.translate(lastX, lastY);
           mv.rotate(rotation);
            mv.line(lastX, lastY, x, y);
            lastX = x;
            lastY = y;

            mv.popMatrix();

        } /// end loop

        mv.popMatrix();
    }// end render method

    public void update() {
        x += dx;
        y += dy;
        rotation += 0.01f;

        if (x < -w) {
            respawn();
        }
        if (x > mv.width + w) {
            respawn();
        }

        if (y < -w) {
            respawn();
        }
        if (y > mv.height + w) {
            respawn();
        }

    }// end update method

  

}// end class
