package PlatformDependent;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import GameEngine.WorldObject;

import static org.lwjgl.opengl.GL11.*;


public class Render {

	static public boolean windowIsOpen(){
		if(Display.isCloseRequested())
		{
			System.out.println("stänh");
		}
		
		return !Display.isCloseRequested();
	}
	
	static public void createWindow(){
		
		// disp
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.create();
			
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		
		// gl
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0,Display.getWidth(), 0, Display.getHeight(), -1,1);
		
		
		glMatrixMode(GL_MODELVIEW);
		glClearColor(0,0, 0, 1);
		
		//ingen 3d
		glDisable(GL_DEPTH_TEST);
		
	}

	//denna funktion ska lägga till en 'bild' för rendering.
	public static void addToQueue() {// förmodligen ska en bild skickas istället för en shape--- 
		
		
	}

	public static void cleanUp() {
		Display.destroy();
		
	}
	

	public static void render() {
		glClear(GL_COLOR_BUFFER_BIT);
		glLoadIdentity();
		
		WorldObject.render();

		Display.update();
		Display.sync(60);
		
	}
	
	
	
}
