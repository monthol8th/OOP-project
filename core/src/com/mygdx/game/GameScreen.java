package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private TiberSeptim tiberSeptim;
	private Texture squareImage;
	
	public GameScreen(TiberSeptim tiberSeptim) {
		this.tiberSeptim = tiberSeptim;
		squareImage = new Texture("img/sq-blue.png");

	}

	public void render(float delta){
        SpriteBatch batch = tiberSeptim.batch;
        batch.begin();
        batch.draw(squareImage, 100, 50 ,25 ,25);
        batch.end();	
	}
}
