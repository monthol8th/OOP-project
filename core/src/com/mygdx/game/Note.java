package com.mygdx.game;
import com.badlogic.gdx.graphics.Texture;

public class Note {
	
	public int x,y;
	public int direction;
	public Texture image;
	
	public Note(int direction){
		this.direction = direction;
		this.x = GameConstant.BOX_LOCATION[direction][0]-350 * GameConstant.MOVE_DIR[direction][0];
		this.y = GameConstant.BOX_LOCATION[direction][1]-250 * GameConstant.MOVE_DIR[direction][1];
		this.image = new Texture("img/arrow-"+direction+".png");
	}
	
	public void update(){
		this.x += GameConstant.MOVE_DIR[this.direction][0];
		this.y += GameConstant.MOVE_DIR[this.direction][1];
	}

}
