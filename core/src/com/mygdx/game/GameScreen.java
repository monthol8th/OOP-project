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
	public Score score;
	public boolean start;
	
	public GameScreen(TiberSeptim tiberSeptim) {
		this.tiberSeptim = tiberSeptim;
		score = new Score(tiberSeptim);
		notes = new Notes(tiberSeptim,score);
		gameLogicCalculator = new GameLogicCalculator(notes);
		gameRenderer = new GameRenderer(tiberSeptim,gameLogicCalculator,notes,score);
		
		start = false;
		music = Gdx.audio.newMusic(Gdx.files.internal("music/Force.mp3"));
	}

	public void render(float delta){
		pauseCheck();
		
		GameConstant.timeNow+=delta;
		if(!start && GameConstant.timeNow >= GameConstant.time){
			music.play();
			start = true;
		}
		gameLogicCalculator.update(delta);
		
        //Gdx.gl.glClearColor(GameConstant.color[0]/255.0f, GameConstant.color[1]/255.0f, GameConstant.color[1]/255.0f, 1);
      //  Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
        gameRenderer.render(delta);
	}
	
	public void pauseCheck(){
		if(Gdx.input.isKeyPressed(Keys.ESCAPE)&&!tiberSeptim.escPress){
			music.pause();
			tiberSeptim.pauseGame();
		} else if (tiberSeptim.escPress&&!Gdx.input.isKeyPressed(Keys.ESCAPE))
			tiberSeptim.escPress = false;
		
	}
}
