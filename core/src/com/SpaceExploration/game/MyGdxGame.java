package com.SpaceExploration.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.SpaceExploration.Constants.Constants;
import com.SpaceExploration.Functions.Functions_Runner;
import com.SpaceExploration.objects.You;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Functions_Runner func;
	You you;
	
	
	@Override
	public void create () {
		//define variables
		you = new You();
		func = new Functions_Runner();
		batch = new SpriteBatch();
		
	}

	@Override
	public void render () {
		//************************Update Handling***********************\\
		you.update();
		func.update();
		//***********************sets backround*************************\\
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//draw begin
		batch.begin();
		//***********************draw stuff***************************\\
		you.draw(batch);
		batch.end();
		//draw end
	}

	
}
