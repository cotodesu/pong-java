package com.pong.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import static com.badlogic.gdx.Input.Keys.*;

public class MainClass extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Texture fondo ;
	private Texture barra1 ;  // creamos las imagenes en el mundo
	private Texture pelota ;
	private float elapsedTime = 0f; //  f = float
	private float pelotax = 0f ; // velocidad pelota en x

	private int barra1y ;
	private int barra2y ;
	@Override
	public void create () {

		barra1y = 0 ;
		batch = new SpriteBatch();
		barra1 = new Texture(Gdx.files.internal("Barra.PNG"));
		fondo = new Texture(Gdx.files.internal("fondo.JPG"));
		pelota = new Texture(Gdx.files.internal("pelota.PNG"));
		barra1y = 0;
		barra2y = 0 ;
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(fondo, 0, 0, 700, 500);
		batch.draw(barra1, 0, barra1y);
		batch.draw(barra1, 666, barra2y);
		batch.draw(pelota, 400, 250);

		if(Gdx.input.isKeyPressed(DPAD_UP)) {
			if(barra1y < (Gdx.graphics.getHeight() ) - 185) {
				barra1y += 5f;
			}
		}
		if(Gdx.input.isKeyPressed(DPAD_DOWN)) {
			if(barra1y > 0 ) {
				barra1y -= 5f;
			}
		}
		if(Gdx.input.isKeyPressed(I)) {
			if(barra2y < (Gdx.graphics.getHeight() ) - 185 ) {
				barra2y += 5f;
			}
		}
		if(Gdx.input.isKeyPressed(K)) {
			if(barra2y > 0 ) {
				barra2y -= 5f;
			}
		}



		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.begin();
		batch.dispose();
		img.dispose();


		batch.end();
	}
}
