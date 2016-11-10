package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;


public class GameScreen extends ScreenAdapter {
	private TiberSeptim tiberSeptim;
	
	private GameRenderer gameRenderer;
	public GameLogicCalculator gameLogicCalculator;
	
	public Notes notes;

	
	public GameScreen(TiberSeptim tiberSeptim) {
		this.tiberSeptim = tiberSeptim;
		notes = new Notes(tiberSeptim);
		gameLogicCalculator = new GameLogicCalculator(notes);
		gameRenderer = new GameRenderer(tiberSeptim,gameLogicCalculator,notes);

	}

	public void render(float delta){
		gameLogicCalculator.update(delta);
		
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        gameRenderer.render(delta);
	}
}
