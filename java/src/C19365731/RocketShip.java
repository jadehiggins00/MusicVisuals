package C19365731;
import example.MyVisual;
import processing.core.PApplet;

public class RocketShip extends GameObject {



    //constructor
    public RocketShip(MyVisual mv,float x, float y) {
        
        super(mv, x, y, 0);
        
    }//end constructor

    public void render(){

        mv.pushMatrix();
        mv.translate(x, y);
        mv.rotate(rotation);
        mv.rectMode(PApplet.CENTER);
        mv.rect(0,0,50,50);
        mv.popMatrix();

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
