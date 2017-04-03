package com.hellstudios.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TicTacToe extends ApplicationAdapter {

	SpriteBatch batch;
	TexturesHandler spritesHandler;

	Field field;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		spritesHandler = TexturesHandler.getInstance();

		field = new Field();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		field.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		spritesHandler.dispose();
	}
}
