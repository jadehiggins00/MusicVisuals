package C19365731;
import example.MyVisual;
import processing.core.PApplet;

public class RocketShip extends GameObject {

    int asteroid =10;


    //constructor
    public RocketShip(MyVisual mv) {
        
        super(mv, 0, 0, 0);
        
    }//end constructor

    public void render(){

        mv.pushMatrix();
        mv.translate(mv.height / 2, mv.width / 2);
      
        mv.stroke(255);
        mv.rotate(rotation);
       // mv.rectMode(PApplet.CENTER)
       mv.shapeMode(PApplet.CENTER);
        mv.triangle(30, 75, 58, 20, 86, 75);
        lastX = x;
        lastY = y;
        mv.popMatrix();

    }//end method


    public void update(){
        dx = PApplet.sin(rotation);
        dy =  - PApplet.cos(rotation);
        rotation += 0.03f;
        // if (mv.checkKey(PApplet.UP))
        // {
        //     x += dx * speed;
        //     y += dy * speed;
        // }
        // if (mv.checkKey(PApplet.DOWN))
        // {
        //     x -= dx * speed;
        //     y -= dy * speed;
        // }
        // if (mv.checkKey(PApplet.LEFT))
        // {
        //     rotation -= 0.1f;
        // }
        // if (mv.checkKey(PApplet.RIGHT))
        // {
        //     rotation += 0.1f;
        // }  

    }//end update method
    


    
}//end class
