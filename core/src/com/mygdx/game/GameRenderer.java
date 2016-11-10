package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {

	private TiberSeptim tiberSeptim;
	public GameLogicCalculator gameLogicCalculator;


	private Texture[] squareImage;
	private int[][] boxLocation;

	
	public GameRenderer(TiberSeptim tiberSeptim,GameLogicCalculator gameLogicCalculator){
		this.tiberSeptim = tiberSeptim;
		this.gameLogicCalculator = gameLogicCalculator;
		
		squareImage = new Texture[2];
		squareImage[0] = new Texture("img/sq-yellow.png");
		squareImage[1] = new Texture("img/sq-blue.png");

		boxLocation = new int[][]{
			{400,400},
			{300,300},
			{400,200},
			{500,300}
		};
		
	}
	
	public void render(float delta){
        SpriteBatch batch = tiberSeptim.batch;
        batch.begin();
        for(int i=0;i<4;i++)batch.draw(squareImage[0], boxLocation[i][0],boxLocation[i][1] ,25 ,25);
        batch.end();	
	}
	
}
