package GameEngine;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class MovebleObject extends GameObject {

	MovebleObject(float x, float y, float w, float h) {
		super(x, y, w, h);
	}
	
	public void render()
	{

		glPushMatrix();
		{
			glTranslatef(x, y, 0);
			glColor3f(255, 0, 0);

			glBegin(GL_QUADS);
			{
				glVertex2f(-super.w / 2, 0 - super.h / 2);
				glVertex2f(-super.w / 2, super.h / 2);
				glVertex2f(super.w / 2, super.h / 2);
				glVertex2f(super.w / 2, -super.h / 2);
			}
			glEnd();

		}
		glPopMatrix();
	}
	

}
