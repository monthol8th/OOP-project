package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class GameLogicCalculator {
	
	LeftHandDirection leftHandDirection;
	private Notes notes;
	public NoteGenerator generator;
	RightHandDirection rightHandDirection;

	
	public GameLogicCalculator(Notes notes){
		leftHandDirection = new LeftHandDirection();
		this.notes = notes;
		generator = new NoteGenerator(notes);		
		rightHandDirection = new RightHandDirection(notes, leftHandDirection);
		

	}
	
	public int getLeftKey(){
		return leftHandDirection.getLeftKey();
	}
	public void update(float delta){
		leftHandDirection.update(delta);
		rightHandDirection.update(delta);
		generator.update(delta);
        notes.update(delta);

	}
}
