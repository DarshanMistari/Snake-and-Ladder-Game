package com.darshan.snakeandladder;

public class SnakeAndLadderGame {
	
	private int playerPosition = 0;
	
	public void showPosition()
	{
		System.out.println("Player Position :" + playerPosition);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Game Developed by Darshan Mistari");
		
		SnakeAndLadderGame snakeandladdergame = new SnakeAndLadderGame();
		snakeandladdergame.showPosition();
	}

}