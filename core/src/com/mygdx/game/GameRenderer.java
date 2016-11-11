package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {

	private TiberSeptim tiberSeptim;
	public GameLogicCalculator gameLogicCalculator;



	private Notes notes;
	private Box box;
	
	public GameRenderer(TiberSeptim tiberSeptim,GameLogicCalculator gameLogicCalculator,Notes notes){
		this.tiberSeptim = tiberSeptim;
		this.gameLogicCalculator = gameLogicCalculator;		
		this.notes = notes;
		this.box = new Box(tiberSeptim,gameLogicCalculator);
	}
	
	public void render(float delta){
        SpriteBatch batch = tiberSeptim.batch;
        box.render(delta);
        notes.render(delta);
	}
	

	
}
