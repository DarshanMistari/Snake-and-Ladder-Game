package com.darshan.snakeandladder;

import java.util.Random;

public class SnakeAndLadderGame {
	
	private int playerPosition = 0;
	
	public void showPosition()
	{
		System.out.println("Player Position :" + playerPosition);
	}
	
	public void playGame()
	{
		Random random = new Random(); 
		
		int dieNo = random.nextInt(6)+1;
		System.out.println("Die No :" +dieNo);
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Game Developed by Darshan Mistari");
		
		SnakeAndLadderGame snakeandladdergame = new SnakeAndLadderGame();
		snakeandladdergame.showPosition();
		snakeandladdergame.playGame();
	}

}