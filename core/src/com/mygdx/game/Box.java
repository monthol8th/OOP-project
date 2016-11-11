package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

class Box{
	SpriteBatch batch;
	GameLogicCalculator gameLogicCalculator;
	private Texture[] squareImage;
	private int[][] boxLocation;


	public Box(TiberSeptim tiberSeptim, GameLogicCalculator gameLogicCalculator){
		this.batch = tiberSeptim.batch;
		this.gameLogicCalculator = gameLogicCalculator;
		
		squareImage = new Texture[2];
		squareImage[0] = new Texture("img/sq-yellow.png");
		squareImage[1] = new Texture("img/sq-blue.png");
		
		boxLocation = GameConstant.BOX_LOCATION;
	}
	 
	public void render(float delta){
        batch.begin();
        for(int i=0;i<4;i++)
        	batch.draw(squareImage[i==gameLogicCalculator.getLeftKey()?1:0], boxLocation[i][0], boxLocation[i][1] ,GameConstant.noteSize ,GameConstant.noteSize);
        batch.end();				
	}
}
