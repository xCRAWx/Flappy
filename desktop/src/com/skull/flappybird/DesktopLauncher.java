package com.skull.flappybird;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.skull.flappybird.FlappyBird;


public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(FlappyBird.WIDTH, FlappyBird.HEIGHT);
		config.setTitle(FlappyBird.TITLE);

		config.setForegroundFPS(60);
		config.setTitle("FlappyBird");
		new Lwjgl3Application(new FlappyBird(), config);
	}
}
