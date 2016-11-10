package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {

	private TiberSeptim tiberSeptim;
	public GameLogicCalculator gameLogicCalculator;


	private Texture[] squareImage;
	private int[][] boxLocation;

	private Note note1,note2;
	
	public GameRenderer(TiberSeptim tiberSeptim,GameLogicCalculator gameLogicCalculator){
		this.tiberSeptim = tiberSeptim;
		this.gameLogicCalculator = gameLogicCalculator;
		
		squareImage = new Texture[2];
		squareImage[0] = new Texture("img/sq-yellow.png");
		squareImage[1] = new Texture("img/sq-blue.png");

		boxLocation = GameConstant.BOX_LOCATION;
		
		note1 = new Note(0,0);
		note2 = new Note(3,0);
	}
	
	public void render(float delta){
        SpriteBatch batch = tiberSeptim.batch;
        batch.begin();
        for(int i=0;i<4;i++)batch.draw(squareImage[i==gameLogicCalculator.getLeftKey()?1:0], boxLocation[i][0], boxLocation[i][1] ,25 ,25);
        note1.update(delta);
        note2.update(delta);
        batch.draw(note1.image,note1.x,note1.y,25,25);
        batch.draw(note2.image,note2.x,note2.y,25,25);

        batch.end();	
	}
	
}
