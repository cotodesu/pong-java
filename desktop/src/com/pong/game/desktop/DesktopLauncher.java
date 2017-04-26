package com.pong.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pong.game.MainClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Pong" ;
		config.width = 700 ; // ancho de pa la pantalla
		config.height = 500 ; // largo de la pantalla

		new LwjglApplication(new MainClass(), config);
	}
}
