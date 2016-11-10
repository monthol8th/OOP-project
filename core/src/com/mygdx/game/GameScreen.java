package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;


public class GameScreen extends ScreenAdapter {
	private TiberSeptim tiberSeptim;
	
	private GameRenderer gameRenderer;
	public GameLogicCalculator gameLogicCalculator;
	
	public GameScreen(TiberSeptim tiberSeptim) {
		this.tiberSeptim = tiberSeptim;
		gameLogicCalculator = new GameLogicCalculator();
		gameRenderer = new GameRenderer(tiberSeptim,gameLogicCalculator);

	}

	public void render(float delta){
		gameLogicCalculator.update(delta);
        
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        gameRenderer.render(delta);
	}
}
