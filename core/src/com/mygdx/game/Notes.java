package com.mygdx.game;

import java.util.ArrayList;

public class Notes {
	public ArrayList<ArrayList<Note>> noteList;
	
	public Notes(){
		
		noteList = new ArrayList<ArrayList<Note>>(4);
	}

	public void add(int dir, int key){
		Note note = new Note(dir, key);
		noteList.get(dir).add(note);
	}
	
	public void update(float delta){
		for(ArrayList<Note> list : noteList){
			if(list.get(0).isDead()){
				list.remove(0);
			}
			
			for(Note note : list){
				note.update(delta);
			}
		
		}
	}
	
	

}
