package com.ludumdarejam.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ludumdarejam.game.TestGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Test Game";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new TestGame(), config);
	}
}
