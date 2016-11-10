package com.mygdx.game;

public class GameConstant {

	public static final int LEFTHAND_DIR_UP = 0;
	public static final int LEFTHAND_DIR_LEFT = 1;
	public static final int LEFTHAND_DIR_DOWN = 2;
	public static final int LEFTHAND_DIR_RIGHT = 3;
	
	public static final int[][] MOVE_DIR = {
			{0, -1},
			{1, 0},
			{0, 1},
			{-1, 0}
	};
	
	public static final int[][] BOX_LOCATION = {
			{400, 350},
			{350, 300},
			{400, 250},
			{450, 300}
	};
}
