package gamelogic.projectiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import gamelogic.GameResources;
import gamelogic.level.Level;

public class IceDaggar extends Projectile{

    private boolean directionLR;
    private boolean directionUD;
    private BufferedImage image;

    public IceDaggar(float x, float y, int width, int height, boolean right, boolean up, Level level) {
        super(x, y, width, height, level);
        directionLR = right;
        directionUD = up;
        image = GameResources.iceDaggar;
    }

    //precondition: tslf is not null
	//postcondition: throws the ice daggars in teh general direction of teh player
    public void update(float tslf){

       if(directionLR)//go right
       {
        position.x+= 1;
       }
       else{
        position.x-=1;
       }
       if(directionUD){
        position.y-=1;
       }
       else{
        position.y+=1;
       }
       hitbox.update();
       
    }
    
    //precondition: g is not null
	//postcondition: draws the ice daggar at its position 
    @Override
    public void draw(Graphics g) {
        g.drawImage(image, (int)position.x, (int)position.y, width, height, null);
        hitbox.draw(g);
        
	}
}
