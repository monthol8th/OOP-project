package com.mygdx.game;
import com.badlogic.gdx.graphics.Texture;

public class Note {
	
	public int x,y;
	public int direction;
	public int key;
	public Texture image;

	public boolean dead;
	
	public Note(int direction,int key){
		this.direction = direction;
		this.key=key;
		this.x = GameConstant.BOX_LOCATION[direction][0]-350 * GameConstant.MOVE_DIR[direction][0];
		this.y = GameConstant.BOX_LOCATION[direction][1]-250 * GameConstant.MOVE_DIR[direction][1];
		this.image = new Texture("img/arrow-"+key+".png");
		this.dead = false;
	}
	
	public void update(float delta){
		this.x += (int)Math.round(GameConstant.MOVE_DIR[this.direction][0]*delta*350/GameConstant.time);
		this.y += (int)Math.round(GameConstant.MOVE_DIR[this.direction][1]*delta*250/GameConstant.time);
		if(!dead)dead = Math.abs(this.x - 400) < 20 && Math.abs(this.y - 300) < 20;
	}
	
	public boolean isDead(){
		//System.out.println(this.x);
		return dead;
	}

}
