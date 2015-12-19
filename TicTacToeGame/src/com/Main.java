package com;

import java.util.Scanner;

public class Main {
	
	public static boolean pTurn = true;
	public static boolean pWon = false;
	public static boolean p2Won = false;
	public static boolean playing = true;
	public static boolean playAgain = false;
	
	public static TicTacToeBoard board = new TicTacToeBoard();
	
	public static void main(String[] args)
	{
		if(board.isVisible() == false)
		{
			board.setVisible(true);
		}
	}
	
	public static void checkWin()
	{
		//1 4 7
		if(board.button1.getText().equals("X"))
		{
			if(board.button4.getText().equals("X"))
			{
				if(board.button7.getText().equals("X"))
				{
					pWon = true;
					p2Won = false;
					System.out.println("Player1 Won");
				}
			}	
		}
		// 1 5 9
		if(board.button1.getText().equals("X"))
		{
			if(board.button5.getText().equals("X"))
			{
				if(board.button9.getText().equals("X"))
				{
					pWon = true;
					p2Won = false;
					System.out.println("Player1 Won");
				}
			}	
		}
		
		//1 2 3
		if(board.button1.getText().equals("X"))
		{
			if(board.button2.getText().equals("X"))
			{
				if(board.button3.getText().equals("X"))
				{
					pWon = true;
					p2Won = false;
					System.out.println("Player1 Won");
				}
			}	
		}
		// 3 5 7
		if(board.button3.getText().equals("X"))
		{
			if(board.button5.getText().equals("X"))
			{
				if(board.button7.getText().equals("X"))
				{
					pWon = true;
					p2Won = false;
					System.out.println("Player1 Won");
				}
			}	
		}
		//3 6 9
		if(board.button3.getText().equals("X"))
		{
			if(board.button6.getText().equals("X"))
			{
				if(board.button9.getText().equals("X"))
				{
					pWon = true;
					p2Won = false;
					System.out.println("Player1 Won");
				}
			}	
		}
		//7 8 9
		if(board.button7.getText().equals("X"))
		{
			if(board.button8.getText().equals("X"))
			{
				if(board.button9.getText().equals("X"))
				{
					pWon = true;
					p2Won = false;
					System.out.println("Player1 Won");
				}
			}	
		}
		//4 5 6
		if(board.button4.getText().equals("X"))
		{
			if(board.button5.getText().equals("X"))
			{
				if(board.button6.getText().equals("X"))
				{
					pWon = true;
					p2Won = false;
					System.out.println("Player1 Won");
				}
			}	
		}
		//2 5 8
		if(board.button2.getText().equals("X"))
		{
			if(board.button5.getText().equals("X"))
			{
				if(board.button8.getText().equals("X"))
				{
					pWon = true;
					p2Won = false;
					System.out.println("Player1 Won");
				}
			}	
		}
		
		//for "O"
		//1 4 7
		if(board.button1.getText().equals("O"))
		{
			if(board.button4.getText().equals("O"))
			{
				if(board.button7.getText().equals("O"))
				{
					pWon = false;
					p2Won = true;
					System.out.println("Player2 Won");
				}
			}	
		}
		// 1 5 9
		if(board.button1.getText().equals("O"))
		{
			if(board.button5.getText().equals("O"))
			{
				if(board.button9.getText().equals("O"))
				{
					pWon = false;
					p2Won = true;
					System.out.println("Player2 Won");
				}
			}	
		}
		//1 2 3
		if(board.button1.getText().equals("O"))
		{
			if(board.button2.getText().equals("O"))
			{
				if(board.button3.getText().equals("O"))
				{
					pWon = false;
					p2Won = true;
					System.out.println("Player2 Won");
				}
			}	
		}
		// 3 5 7
		if(board.button3.getText().equals("O"))
		{
			if(board.button5.getText().equals("O"))
			{
				if(board.button7.getText().equals("O"))
				{
					pWon = false;
					p2Won = true;
					System.out.println("Player2 Won");
				}
			}	
		}
		//3 6 9
		if(board.button3.getText().equals("O"))
		{
			if(board.button6.getText().equals("O"))
			{
				if(board.button9.getText().equals("O"))
				{
					pWon = false;
					p2Won = true;
					System.out.println("Player2 Won");
				}
			}	
		}
		//7 8 9
		if(board.button7.getText().equals("O"))
		{
			if(board.button8.getText().equals("O"))
			{
				if(board.button9.getText().equals("O"))
				{
					pWon = false;
					p2Won = true;
					System.out.println("Player2 Won");
				}
			}	
		}
		//4 5 6
		if(board.button4.getText().equals("O"))
		{
			if(board.button5.getText().equals("O"))
			{
				if(board.button6.getText().equals("O"))
				{
					pWon = false;
					p2Won = true;
					System.out.println("Player2 Won");
				}
			}	
		}
		//2 5 8
		if(board.button2.getText().equals("O"))
		{
			if(board.button5.getText().equals("O"))
			{
				if(board.button8.getText().equals("O"))
				{
					pWon = false;
					p2Won = true;
					System.out.println("Player2 Won");
				}
			}	
		}
		
		if(pWon == true || p2Won == true)
		{
			System.out.println("Do you want to play again: True or False");
			Scanner sc = new Scanner(System.in);
			playAgain = sc.nextBoolean();
			
			if(playAgain == true)
			{
				board.setVisible(false);
				board.button1.setText("");
				board.button2.setText("");
				board.button3.setText("");
				board.button4.setText("");
				board.button5.setText("");
				board.button6.setText("");
				board.button7.setText("");
				board.button8.setText("");
				board.button9.setText("");
				
				pTurn = true;
				pWon = false;
				p2Won = false;
				board.setVisible(true);
			}	
			else
			{
				board.setVisible(false);
				System.out.println("Thank you");
			}
			sc.close();
		}
	}

}
