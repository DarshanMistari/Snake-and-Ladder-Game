package com.darshan.snakeandladder;

import java.util.Random;

public class SnakeAndLadderGame {
	
	private int playerPosition = 0;
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	private static int WIN_POSITION = 100;
	private static int dieCount = 0;
	
	public void showPosition()
	{
		System.out.println("Player Position :" + playerPosition);
	}
	
	public void playGame()
	{
		Random random = new Random(); 
		
		while(playerPosition < WIN_POSITION)
		{
			int dieNo = random.nextInt(6)+1;
			System.out.println("Die No :" +dieNo);
			
			int position = random.nextInt(3);
			System.out.println("Position :" +position);
			
			System.out.println("-----------------------");
			dieCount +=1 ;
			
			switch(position)
			{
			case NO_PLAY:
				playerPosition = playerPosition;
				break;
				
			case LADDER:
				playerPosition = playerPosition + dieNo;
				break;
				
			case SNAKE:
				playerPosition = playerPosition - dieNo;
				if(playerPosition < 0)
				{
					playerPosition = 0;
				}
				break;	
			}
			if(playerPosition > WIN_POSITION)
			{
				playerPosition = playerPosition - dieNo;
			}
			showPosition();
		}
		System.out.println("Total Die is throw Count :"+dieCount);
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Game Developed by Darshan Mistari");
		
		SnakeAndLadderGame snakeandladdergame = new SnakeAndLadderGame();
		snakeandladdergame.showPosition();
		snakeandladdergame.playGame();		
	}

}