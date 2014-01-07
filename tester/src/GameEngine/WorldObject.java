package GameEngine;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import Database.Database;

public class WorldObject {

	
	
	static ArrayList<GameObject> go = new ArrayList<>();
	private PlayerObject myPlayer;
	
	public WorldObject()
	{
		myPlayer = new PlayerObject(50, 50, 10 ,10);
		go.add(myPlayer);
		
	}
	
	
	public GameObject getGameObjectById(int id){

		for(GameObject tgo : go)
		{
			if(tgo.getId() == id)
			{
				return tgo;
			}
		}
		return null;
	}
	
	
	public boolean addGameObject(GameObject go){

		
		this.go.add(go);
		return true;
	}

	public void removeGameobject(GameObject go){
		this.go.remove(go);
	}

	public void getInput() {
		
		
		
		if(Keyboard.isKeyDown(Keyboard.KEY_DOWN))
		{
			myPlayer.move(0, -1, go);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_UP))
		{
			myPlayer.move(0,1, go);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT))
		{
			myPlayer.move(1,0, go);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_LEFT))
		{
			myPlayer.move(-1,0, go);
		}
	}


	public static void render() {
		// loopa genom samtliga gameobjects och rendera dem
		
		for(GameObject tgo : go)
		{
			tgo.render();
		}
	}
	

}
