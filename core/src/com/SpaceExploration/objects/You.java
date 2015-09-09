package com.SpaceExploration.objects;

import com.SpaceExploration.Constants.Constants;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class You {
	
	private static Texture img;
	private static Sprite you;
	public You (){
		img = new Texture("ships/hi-tech/Hi-TechFighterEnemy.png");
		you = new Sprite(img);
		you.setOriginCenter();
		you.setPosition(Constants.width/2, Constants.height/2);
	}

	/*//updates everything revolving around the ship
*/	public void update(){
		//********************Turning*********************
		//moing is handled in the object parent class due to the face that when you move, everything moves around you.
		//turning left
		if (Gdx.input.isKeyPressed(Keys.A)){
			you.rotate(1);
		}
		//turning right
		if (Gdx.input.isKeyPressed(Keys.D)){
			you.rotate(-1);
		}
		
	}
	
	//draw image
	public void draw(SpriteBatch batch){
		you.draw(batch);
	}
}
