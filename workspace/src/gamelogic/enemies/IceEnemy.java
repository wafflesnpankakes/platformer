package gamelogic.enemies;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import gameengine.PhysicsObject;
import gameengine.hitbox.RectHitbox;
import gamelogic.GameResources;
import gamelogic.level.Level;
import gamelogic.projectiles.IceDaggar;

public class IceEnemy extends PhysicsObject{

    private BufferedImage image;
	private boolean throwIce = false;
    private long timer;

    public IceEnemy(float x, float y, Level level) {
		super(x, y,(int)(level.getLevelData().getTileSize()*1.5), (int)(level.getLevelData().getTileSize()*1.5), level);
		this.hitbox = new RectHitbox(this, 10, 10, width - 10, height - 10);
		this.image = GameResources.iceEnemy;
        timer = 0;
	}
	
	//precondition: none
	//postcondition: makes the instance varible, trhowIce, true. Makes the ice enemy thrwo ice daggars
	public void throwIce(){
		throwIce = true;

	}

	//precondition: none
	//postcondition: makes the instance variable, throwIce, false. makes the ice enemy stop throwing ice daggars
	public void noThrow(){
		throwIce = false;
	}

	//precondition: tflf is not null
	//postcondition: throws an ice daggar every 5 seconds. 
	@Override
	public void update(float tslf) {
		if(throwIce){
			
			if(timer ==0){
				timer=System.currentTimeMillis();
			}

			else if(System.currentTimeMillis() - timer >5000){
				IceDaggar temp = new IceDaggar(position.x, position.y, 40, 40, level.getPlayer().getX()>position.x, level.getPlayer().getX()>position.y, level);
				timer = System.currentTimeMillis();
				level.iceDaggarsList.add(temp);
			}
		}
        
	}
	
	//precondition: g is not null
	//postcondition: draws the ice enemy at its position 
	@Override
    public void draw(Graphics g) {
		g.drawImage(image, (int)position.x, (int)position.y, width, height, null);
		hitbox.draw(g);
	}

}
