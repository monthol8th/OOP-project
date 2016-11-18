package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {

	private TiberSeptim tiberSeptim;
	public GameLogicCalculator gameLogicCalculator;



	private Notes notes;
	private Box box;
	private Score score;
	
	public GameRenderer(TiberSeptim tiberSeptim,GameLogicCalculator gameLogicCalculator,Notes notes,Score score){
		this.tiberSeptim = tiberSeptim;
		this.gameLogicCalculator = gameLogicCalculator;		
		this.notes = notes;
		this.box = new Box(tiberSeptim,gameLogicCalculator);
		this.score = score;
	}
	
	public void render(float delta){
        SpriteBatch batch = tiberSeptim.batch;
        score.render(delta);
        box.render(delta);
        notes.render(delta);
	}
	

	
}
