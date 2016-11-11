package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;


public class GameScreen extends ScreenAdapter {
	private TiberSeptim tiberSeptim;
	
	private GameRenderer gameRenderer;
	public GameLogicCalculator gameLogicCalculator;
	public Music music;
	public Notes notes;

	
	public GameScreen(TiberSeptim tiberSeptim) {
		this.tiberSeptim = tiberSeptim;
		notes = new Notes(tiberSeptim);
		gameLogicCalculator = new GameLogicCalculator(notes);
		gameRenderer = new GameRenderer(tiberSeptim,gameLogicCalculator,notes);

		music = Gdx.audio.newMusic(Gdx.files.internal("MoonlightSonata.mp3"));
		music.play();
	}

	public void render(float delta){
		if(Gdx.input.isKeyPressed(Keys.ESCAPE)&&!tiberSeptim.escPress){
			music.pause();
			tiberSeptim.pauseGame();
		} else if (tiberSeptim.escPress&&!Gdx.input.isKeyPressed(Keys.ESCAPE))
			tiberSeptim.escPress = false;
		
		
		gameLogicCalculator.update(delta);
		
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        gameRenderer.render(delta);
	}
}
