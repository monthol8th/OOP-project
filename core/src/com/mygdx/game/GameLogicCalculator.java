package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class GameLogicCalculator {
	
	LeftHandDirection leftHandDirection;
	

	
	public GameLogicCalculator(){
		leftHandDirection = new LeftHandDirection();

	}
	
	public int getLeftKey(){
		return leftHandDirection.getLeftKey();
	}
	public void update(float delta){
		leftHandDirection.update(delta);		
	}
}
