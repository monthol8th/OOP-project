package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {

	private TiberSeptim tiberSeptim;
	public GameLogicCalculator gameLogicCalculator;


	private Texture[] squareImage;

	
	public GameRenderer(TiberSeptim tiberSeptim,GameLogicCalculator gameLogicCalculator){
		this.tiberSeptim = tiberSeptim;
		this.gameLogicCalculator = gameLogicCalculator;
		
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
