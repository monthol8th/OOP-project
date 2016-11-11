package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class LeftHandDirection {
				
		public boolean[] isLeftHandKeyPressed;
		private boolean haveLeftHandKeyPressed;
		private int leftKey;
		
		public LeftHandDirection(){
			isLeftHandKeyPressed = new boolean[4];
			haveLeftHandKeyPressed = false;
			leftKey = 0;
		}
	
		
		public void update(float delta){
			if(haveLeftHandKeyPressed){
				switch(leftKey){
					case GameConstant.LEFTHAND_DIR_UP	: haveLeftHandKeyPressed = Gdx.input.isKeyPressed(Keys.W); break;
					case GameConstant.LEFTHAND_DIR_LEFT	: haveLeftHandKeyPressed = Gdx.input.isKeyPressed(Keys.A); break;
					case GameConstant.LEFTHAND_DIR_DOWN	: haveLeftHandKeyPressed = Gdx.input.isKeyPressed(Keys.S); break;
					case GameConstant.LEFTHAND_DIR_RIGHT: haveLeftHandKeyPressed = Gdx.input.isKeyPressed(Keys.D); break;
				}
				
			} else {
				isLeftHandKeyPressed[0] = Gdx.input.isKeyPressed(Keys.W);
				isLeftHandKeyPressed[1] = Gdx.input.isKeyPressed(Keys.A);
				isLeftHandKeyPressed[2] = Gdx.input.isKeyPressed(Keys.S);
				isLeftHandKeyPressed[3] = Gdx.input.isKeyPressed(Keys.D);
			
				for(int i=0;i<4 & !haveLeftHandKeyPressed;i++){
					haveLeftHandKeyPressed = isLeftHandKeyPressed[i];
					if(haveLeftHandKeyPressed)
						leftKey = i; 
				}				
			}
		}
	

	public int getLeftKey() {
		return haveLeftHandKeyPressed? leftKey : -1 ;
	}

}
