package com.mygdx.game;

import java.util.Random;

public class NoteRandomGenerator {
	Notes notes;
	int dir;
	float time;
	int count;
	
	Random rand;
	public NoteRandomGenerator(Notes notes){
		this.notes = notes;
		time = 0;
		dir = 0;
		count = 0;
		rand = new Random();
	}
	
	public void update(float delta){
		time += delta;
		//System.out.println(time);
		if(count > 1){
			dir = rand.nextInt(4);
			count = 0;
		}
		if(time*2 > GameConstant.len){
			time = 0;
			count++;
			notes.add(dir, rand.nextInt(4));
		}
	}

}
