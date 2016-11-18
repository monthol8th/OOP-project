package com.mygdx.game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NoteGenerator {

	public float time;
	Notes notes;
	public boolean finish;
	
	public ArrayList<PreNote> noteList;
	
	public class PreNote{
		public Note note;
		public float time;
		public PreNote(float time,Note note){
			this.note = note;
			this.time = time;
		}
	}
	
	public NoteGenerator(Notes notes){
		this.time = 0;
		this.notes = notes;
		noteList = new ArrayList<PreNote>();
		
		finish = false;
		try{
	            String thisLine=null;
	            BufferedReader br = new BufferedReader(new FileReader("./input.txt"));
	            while ((thisLine = br.readLine()) != null) {
	            	System.out.println(thisLine);
	                String[] val=thisLine.split(" ");
	                noteList.add(new PreNote(Integer.parseInt(val[0])/100.0f,new Note(Integer.parseInt(val[1]),Integer.parseInt(val[2]))));
	            }
	            br.close();
	            finish = true;
	        }
	        catch(IOException e)
	        {
	            return ;
	        }
	}
	public void update(float delta){
		//GameConstant.timeNow += delta;
		//System.out.println(time);
		if(!noteList.isEmpty()){
			if(GameConstant.timeNow>=noteList.get(0).time){
				notes.add(noteList.get(0).note);
				noteList.remove(0);
			}
		}
	}
}
