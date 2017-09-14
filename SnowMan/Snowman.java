import GLOOP.*;

public class Snowman {
    private GLKugel body1;
    private GLKugel body2;
    private GLKugel body3;
    private GLKugel button1;
    private GLKugel button2;
    private GLKugel button3;
    private GLKugel eye1;
    private GLKugel eye2;
    private GLKegel nose;
    private GLZylinder hut1;
    private GLZylinder hut2;
    private GLTextur texture;
    private int x,y,z;
    
    public Snowman(){
        body1 = new GLKugel(0,25,0,75,texture);
        body2 = new GLKugel(0,130,0,55,texture);
        body3 = new GLKugel(0,200,0,35,texture);
        button1 = new GLKugel(0,130,55,5);        
        button2 = new GLKugel(0,130,55,5);
        button3 = new GLKugel(0,130,55,5);
        eye1 = new GLKugel(0,200,35,5);
        eye2 = new GLKugel(0,200,35,5);
        nose = new GLKegel(0,200,50,5,30);
        hut1 = new GLZylinder(0,200,30,50,10);
        hut2 = new GLZylinder(0,200,40,30,30);
        texture = new GLTextur("Schnee.jpg");
    }
    
    private void construct(){        
        button1.setzeFarbe(0,0,0);
        button2.setzeFarbe(0,0,0); 
        button2.drehe(25,0,0, 0,130,0);
        button3.setzeFarbe(0,0,0); 
        button3.drehe(-25,0,0, 0,130,0);
        eye1.setzeFarbe(1,0,0); 
        eye1.drehe(-15,0,0, 0,200,0);
        eye1.drehe(0,-15,0, 0,200,0);
        eye2.setzeFarbe(1,0,0); 
        eye2.drehe(-15,0,0, 0,200,0);
        eye2.drehe(0,15,0, 0,200,0);
        nose.drehe(0,180,0);
        nose.setzeFarbe(1,0.5,0);
        hut1.drehe(-110,0,0, 0,200,0);
        hut1.setzeFarbe(0.8,0.2,0);
        hut2.drehe(-110,0,0, 0,200,0);        
        hut2.setzeFarbe(0.8,0.2,0);
    }
    
    public void move(){
        
    }
}
