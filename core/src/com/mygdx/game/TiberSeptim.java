package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TiberSeptim extends Game {
    public SpriteBatch batch;
    public boolean escPress;
    public GameScreen gameScreen;
    @Override
    public void create () {
        batch = new SpriteBatch();
        gameScreen = new GameScreen(this);
        setScreen(gameScreen);
        escPress = false;
    }
 
    @Override
    public void render () {
        super.render();
    }
 
    @Override
    public void dispose () {
        batch.dispose();
    }
    
    public void resumeGame(){
    	setScreen(gameScreen);
    	gameScreen.music.play();
    	escPress = true;

    }
    
    public void pauseGame(){
		System.out.println("pause");
    	setScreen(new PauseScreen(this));
    	escPress = true;
    }
}
