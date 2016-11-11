package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Notes {
	public ArrayList<ArrayList<Note>> noteList;
	
	TiberSeptim tiberSeptim;
	
	public Notes(TiberSeptim tiberSeptim){
		
		this.tiberSeptim = tiberSeptim;
		noteList = new ArrayList<ArrayList<Note>>();
		
		for(int i=0;i<4;i++)noteList.add(new ArrayList<Note>());
	}

	public void add(int dir, int key){
		Note note = new Note(dir, key);
		noteList.get(dir).add(note);
	}
	
	public void update(float delta){
		for(ArrayList<Note> list : noteList){
		//	System.out.print(list.size()+" ");
			if(list.size()>0){
				
				for(Note note : list){
					note.update(delta);
				}
				
				if(list.get(0).isDead())list.remove(0);

			}
		//	System.out.println(" ");
		}
	}
	
	public void keyPress(int leftKey,int rightKey){
		//System.out.print(noteList.get(leftKey).size()>0);
		if(noteList.get(leftKey).size()>0){
			if(noteList.get(leftKey).get(0).key == rightKey){
				noteList.get(leftKey).remove(0);
			}
		}
		
	}
	
	public void render(float delta){
        SpriteBatch batch = tiberSeptim.batch;
        batch.begin();
		for(ArrayList<Note> list : noteList){	
			for(Note note : list){
				batch.draw(note.image ,note.x, note.y , GameConstant.noteSize, GameConstant.noteSize);
			}
		}
		
		batch.end();
		
	}
	
	

}
