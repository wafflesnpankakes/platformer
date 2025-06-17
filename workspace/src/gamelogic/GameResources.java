package gamelogic;

import java.awt.image.BufferedImage;

import gameengine.loaders.ImageLoader;
import gameengine.loaders.Tileset;
import gameengine.loaders.TilesetLoader;
import gamelogic.projectiles.IceDaggar;

public final class GameResources {

	public static Tileset tileset;
	
	public static BufferedImage enemy;

	public static BufferedImage iceEnemy;

	public static BufferedImage iceDaggar;



	
	public static void load() {
		try {
			tileset = TilesetLoader.loadTileset("/workspaces/platformer/workspace/gfx/tileset.txt", ImageLoader.loadImage("/workspaces/platformer/workspace/gfx/tileset.png"));
			
			enemy = ImageLoader.loadImage("/workspaces/platformer/workspace/gfx/Enemy.png");
			iceEnemy = ImageLoader.loadImage("/workspaces/platformer/workspace/gfx/IceEnemy.png");
			iceDaggar = ImageLoader.loadImage("/workspaces/platformer/workspace/gfx/IceDaggar.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
