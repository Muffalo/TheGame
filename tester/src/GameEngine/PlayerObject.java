package GameEngine;

import static org.lwjgl.opengl.GL11.*;

import java.util.ArrayList;

public class PlayerObject extends MovebleObject {

	PlayerObject(float x, float y, float w, float h) {
		super(x, y, w, h);
	}

	public void move(float x, float y, ArrayList<GameObject> ComperatorObjects) {
		

		super.x += x;
		super.y += y;
		
		if(Physics.isColiding(this, ComperatorObjects))
		{
			super.x -= x;
			super.y -= y;
		}
	

	}

	public void render()
	{
		glPushMatrix();
		{
			glTranslatef(x, y, 0);
			glColor3f(0, 0, 255);

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
