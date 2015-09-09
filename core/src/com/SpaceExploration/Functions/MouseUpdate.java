package com.SpaceExploration.Functions;

import com.SpaceExploration.Constants.Constants;
import com.badlogic.gdx.Gdx;

public class MouseUpdate {
	
	//sets mouse position in the constants
	public void setMousePos(){
		//mouse position uploaded to constants
		Constants.MouseX = (Gdx.input.getX());
		
		//mouse y is here
		Constants.MouseY = (Gdx.input.getY());
	}
}
