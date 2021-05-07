package C19365731;

import example.MyVisual;

public abstract class GameObject {

    MyVisual mv;
    float x;
    float y;
    float speed = 5;
    float rotation = 0;
    float w =50;
    float halfWidth = w/2;
    float dx, dy;
    int which =0;
    float lastX, lastY;
  
    
    //master constructor
    public GameObject(MyVisual mv, float x, float y, float rotation){
        this.mv = mv;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
       
    }//end constructor

 

    //GETTERS AND SETTERS
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getHalfWidth() {
        return halfWidth;
    }

    public void setHalfWidth(float halfWidth) {
        this.halfWidth = halfWidth;
    }
  
    
    /* 
    subclasses must implement these abstract methods, otherwise  they will be abstract
    */
    //abstract methods
    // this means any class that extends game object must include these methods
    public abstract void render();
   
    
    
}//enc class
