package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PauseScreen extends ScreenAdapter {
	TiberSeptim tiberSeptim;
	BitmapFont font;
	public PauseScreen(TiberSeptim tiberSeptim){
		this.tiberSeptim = tiberSeptim;
		font = new BitmapFont();
		
	}

	
	public void render(float delta){
		resumeCheck();
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        SpriteBatch batch = tiberSeptim.batch;

        batch.begin();
        font.setColor(Color.RED);
        font.draw(batch, "PAUSE", 400, 300);
        batch.end();
	}
	
	public void resumeCheck(){
		if(Gdx.input.isKeyPressed(Keys.ESCAPE)&&!tiberSeptim.escPress){
			tiberSeptim.resumeGame();
		} else if(tiberSeptim.escPress&&!Gdx.input.isKeyPressed(Keys.ESCAPE))
			tiberSeptim.escPress = false;		
	}
}
