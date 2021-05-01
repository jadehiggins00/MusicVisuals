package C19365731;

import example.MyVisual;
import processing.core.PApplet;

public class TreeSpirals extends GameObject{
    

    //referencing MyVisual Class
  
    //constuctor
    public TreeSpirals(MyVisual mv){
        super(mv, 0, 0, 0);
      
    }//end constructor


    public void render(){

        //creating tree sprirals
        mv.colorMode(PApplet.HSB);

        int numPoints = 3;
        float r = 1f;
        float thetaInc = PApplet.TWO_PI / (float) numPoints;
        int spiralSize;
        spiralSize =220;

        // drawing the branches
    
        //float c = PApplet.map(mv.getSmoothedAmplitude(), 0, 1, 0, 255);
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
      

      
     
        float lastX = 250,lastY = 280;
        for (int i = 0; i < spiralSize; i++) {
            float c = PApplet.map(i, 0, 500, 0, 255) % 255.0f;
            mv.strokeWeight(1);
            mv.stroke(c, 255, 255, 100);
            float theta = i * (thetaInc + mv.getSmoothedAmplitude() * 5);
            mv.pushMatrix();
            x = 240 + PApplet.sin(theta) * r;
            y = 260 - PApplet.cos(theta) * r;
            r += 0.8f + mv.getSmoothedAmplitude();

            mv.fill(0);
            
            //mv.rotate(r);
            //mv.ellipse(0,0, x, y);
         
            mv.line(lastX, lastY, x, y);
            lastX = x;
            lastY = y;

            mv.popMatrix();

        } /// end loop


      

    }//end method


    public void update(){
        dx = PApplet.sin(rotation);
        dy =  - PApplet.cos(rotation);
        
        if (mv.checkKey(PApplet.UP))
        {
            x += dx * speed;
            y += dy * speed;
        }
        if (mv.checkKey(PApplet.DOWN))
        {
            x -= dx * speed;
            y -= dy * speed;
        }
        if (mv.checkKey(PApplet.LEFT))
        {
            rotation -= 0.1f;
        }
        if (mv.checkKey(PApplet.RIGHT))
        {
            rotation += 0.1f;
        }  

    }//end update method
}//end class
