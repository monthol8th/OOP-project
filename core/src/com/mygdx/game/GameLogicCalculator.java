package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class GameLogicCalculator {
	
	public boolean[] isLeftHandKeyPressed;
	
	public GameLogicCalculator(){
		isLeftHandKeyPressed = new boolean[4];
	}
	
	public void update(float delta){
		isLeftHandKeyPressed[0]=Gdx.input.isKeyPressed(Keys.UP);
		isLeftHandKeyPressed[1]=Gdx.input.isKeyPressed(Keys.LEFT);
		isLeftHandKeyPressed[2]=Gdx.input.isKeyPressed(Keys.DOWN);
		isLeftHandKeyPressed[3]=Gdx.input.isKeyPressed(Keys.RIGHT);

	}
}
