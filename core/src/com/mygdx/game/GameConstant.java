package com.mygdx.game;

public class GameConstant {
	public static float time = 4.0f;
	public static float timeNow = -1.0f;
	public static int len = 1;
	public static int noteSize = 30;
	public static int color[]={255,255,255};

	
	public static final int LEFTHAND_DIR_UP = 0;
	public static final int LEFTHAND_DIR_LEFT = 1;
	public static final int LEFTHAND_DIR_DOWN = 2;
	public static final int LEFTHAND_DIR_RIGHT = 3;
	
	public static final int RIGHTHAND_DIR_UP = 0;
	public static final int RIGHTHAND_DIR_LEFT = 1;
	public static final int RIGHTHAND_DIR_DOWN = 2;
	public static final int RIGHTHAND_DIR_RIGHT = 3;
	
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
