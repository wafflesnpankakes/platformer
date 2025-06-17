package gamelogic.projectiles;

import gameengine.PhysicsObject;
import gamelogic.level.Level;

public class Projectile extends PhysicsObject{
    public Projectile(float x, float y, int width, int height, Level level) {
        super(x, y, width, height, level);
    }

    //precondition: tslf is not null
    //postcondition: checks collisions with the player
    @Override
	public void update(float tslf) {

		super.update(tslf);
    }
}
