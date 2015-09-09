package com.SpaceExploration.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.SpaceExploration.Constants.Constants;
import com.SpaceExploration.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Constants.width;
		config.height = Constants.height;
		config.fullscreen = false;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
