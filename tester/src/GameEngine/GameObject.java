package GameEngine;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class GameObject {
	
	protected float x;
	protected float y;
	protected float w;
	protected float h;
	
	int id;
	boolean idFlag = false;
	Shape myShape;
	
	public GameObject(float x,float y,float w, float h)
	{
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
	}
	
	public boolean setId(int currentObjectId) {
		
		if (!idFlag){
			id=currentObjectId;
			idFlag=true;
			return true;
		}
		return false;
	}

	public int getId() {
		return id;
	}
	
	
	
	public void render() {

		glPushMatrix();
		{
			glTranslatef(x, y, 0);
			glColor3f(0, 255, 0);

			glBegin(GL_QUADS);
			{
				glVertex2f(-w / 2, 0 - h / 2);
				glVertex2f(-w / 2, h / 2);
				glVertex2f(w / 2, h / 2);
				glVertex2f(w / 2, -h / 2);
			}
			glEnd();

		}
		glPopMatrix();

	}


	
}
