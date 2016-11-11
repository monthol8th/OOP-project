package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {

	private TiberSeptim tiberSeptim;
	public GameLogicCalculator gameLogicCalculator;


	private Texture[] squareImage;
	private int[][] boxLocation;

	private Notes notes;
	
	public GameRenderer(TiberSeptim tiberSeptim,GameLogicCalculator gameLogicCalculator,Notes notes){
		this.tiberSeptim = tiberSeptim;
		this.gameLogicCalculator = gameLogicCalculator;
		
		squareImage = new Texture[2];
		squareImage[0] = new Texture("img/sq-yellow.png");
		squareImage[1] = new Texture("img/sq-blue.png");

		boxLocation = GameConstant.BOX_LOCATION;
		
		this.notes = notes;
	}
	
	public void render(float delta){
        SpriteBatch batch = tiberSeptim.batch;
        batch.begin();
        for(int i=0;i<4;i++)
        	batch.draw(squareImage[i==gameLogicCalculator.getLeftKey()?1:0], boxLocation[i][0], boxLocation[i][1] ,GameConstant.noteSize ,GameConstant.noteSize);
        batch.end();	
        notes.render(delta);
	}
	
}
