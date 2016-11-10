package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class GameLogicCalculator {
	
	LeftHandDirection leftHandDirection;
	private Notes notes;


	
	public GameLogicCalculator(Notes notes){
		leftHandDirection = new LeftHandDirection();
		this.notes = notes;
		notes.add(3, 0);

	}
	
	public int getLeftKey(){
		return leftHandDirection.getLeftKey();
	}
	public void update(float delta){
		leftHandDirection.update(delta);		
        notes.update(delta);

	}
}
