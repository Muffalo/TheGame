import org.lwjgl.opengl.Display;

import Database.Database;
import GameEngine.GameObject;
import GameEngine.WorldObject;
import PlatformDependent.Render;




public class Main {
	
	private static WorldObject wo;
	
	public static void main(String[] args) {
		Database.databaseDevelopment();
		

		System.out.print("muffalohej");


		Render.createWindow();
		createWorld();
		gameLoop();
		Render.cleanUp();
		
		System.out.print("hej");
	}


	private static void gameLoop() {
		while (!Display.isCloseRequested()){
			wo.getInput();
			Render.render();
			
		}
	}

	private static void createWorld() {
		wo = new WorldObject();
		wo.addGameObject(new GameObject(100,100,50,50));
		wo.addGameObject(new GameObject(150,100,50,50));
		wo.addGameObject(new GameObject(200,200,100,300));
		System.out.print("hej");
	}

}
