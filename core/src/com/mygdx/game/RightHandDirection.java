package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class RightHandDirection {
	private boolean haveRightHandKeyPressed;
	private int rightKey;
	private LeftHandDirection leftHand;
	
	Notes notes;
	
	public RightHandDirection(Notes notes, LeftHandDirection leftHand){
		haveRightHandKeyPressed = false;
		this.notes = notes;
		this.leftHand = leftHand;
		rightKey = -1;
	}

	
	public void update(float delta){
		if(haveRightHandKeyPressed){
			switch(rightKey){
				case GameConstant.RIGHTHAND_DIR_UP	: haveRightHandKeyPressed = Gdx.input.isKeyPressed(Keys.UP); break;
				case GameConstant.RIGHTHAND_DIR_LEFT	: haveRightHandKeyPressed = Gdx.input.isKeyPressed(Keys.LEFT); break;
				case GameConstant.RIGHTHAND_DIR_DOWN	: haveRightHandKeyPressed = Gdx.input.isKeyPressed(Keys.DOWN); break;
				case GameConstant.RIGHTHAND_DIR_RIGHT: haveRightHandKeyPressed = Gdx.input.isKeyPressed(Keys.RIGHT); break;
			}
			if(!haveRightHandKeyPressed){
				rightKey = -1;
			}
			
		} else {
			if(Gdx.input.isKeyPressed(Keys.UP)){
				rightKey = 0;
			} else if(Gdx.input.isKeyPressed(Keys.LEFT)){
				rightKey = 1;
			} else if(Gdx.input.isKeyPressed(Keys.DOWN)){
				rightKey = 2;
			} else if(Gdx.input.isKeyPressed(Keys.RIGHT)){
				rightKey = 3;
			} 
			if(rightKey != -1 && leftHand.getLeftKey() != -1){
				haveRightHandKeyPressed = true;
				notes.keyPress(leftHand.getLeftKey(), rightKey);
			}

			
		}


	}

}
