package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Score {
	public int score;
	public int color[][]={
			{120,120,255},
			{60,255,60},
			{255,255,30},
			{255,0,0}
	};
	public int colorNow;
    public SpriteBatch batch;
	BitmapFont font;

	
	public Score(TiberSeptim tiberSeptim){
		this.batch = tiberSeptim.batch;
		this.score=0;
		this.colorNow=5;
		font = new BitmapFont();
	}
	public void addScore(Note note){
		int score=100-Math.abs(GameConstant.BOX_LOCATION[note.direction][0]-note.x)-Math.abs(GameConstant.BOX_LOCATION[note.direction][1]-note.y);
		score/=20;
		switch(score){
			case 5:
			case 4: 
					this.score+=100; 
					colorNow=0;
					break;
			case 3:
			case 2: this.score+=60;
					colorNow=1;
					break;
			case 1:
			case 0:
					this.score+=15;
					colorNow=2;
					break;
			default:
					colorNow=3;
		}
		changeColor();
	}
	public void changeColor(){
		for(int i=0;i<3;i++)
			GameConstant.color[i]=this.color[colorNow][i];
	}
	
	public void render(float delta){
		for(int i=0;i<3;i++)
			GameConstant.color[i]+=GameConstant.color[i]<255?3:0;
			
		Gdx.gl.glClearColor(GameConstant.color[0]/255.0f, GameConstant.color[1]/255.0f, GameConstant.color[2]/255.0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
        batch.begin();
        font.setColor(Color.RED);
        font.draw(batch, "Score:", 750, 550);
        font.draw(batch, score+"" , 750, 525);
        batch.end();
	}
	
	
}
