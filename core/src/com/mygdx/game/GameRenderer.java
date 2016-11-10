package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {

	private TiberSeptim tiberSeptim;

	private Texture[] squareImage;

	
	public GameRenderer(TiberSeptim tiberSeptim){
		this.tiberSeptim = tiberSeptim;
		squareImage = new Texture[2];
		squareImage[0] = new Texture("img/sq-yellow.png");
		squareImage[1] = new Texture("img/sq-blue.png");

		
	}
	
	public void render(float delta){
        SpriteBatch batch = tiberSeptim.batch;
        batch.begin();
        batch.draw(squareImage[0], 100, 50 ,25 ,25);
        batch.end();	
	}
	
}
