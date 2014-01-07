package GameEngine;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Physics {
	
	public static boolean isColiding(PlayerObject playerObject,
			ArrayList<GameObject> comperatorObjects) {
		
		
		
		Rectangle rt1 = new Rectangle((int)playerObject.x - ((int)playerObject.w/2), (int)playerObject.y  - ((int)playerObject.h/2), (int)playerObject.w, (int)playerObject.h);
		
		for( GameObject go : comperatorObjects)
		{
			Rectangle rt2 = new Rectangle((int)go.x - ((int)go.w/2), (int)go.y  - ((int)go.h/2), (int)go.w, (int)go.h);
			if(playerObject != go  && rt1.intersects(rt2))
			{
				return true;
			}
		}
		

		return false;
	}



	

}
