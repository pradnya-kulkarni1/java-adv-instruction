import utility.Console;

public class TicTacToeApp {
	
	public static String[][] board= {{" "," "," "},
							  {" "," "," "},
							  {" "," "," "}};
	public static boolean won = false;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");
		printBoard();
		
		
		int xoro = 2;
		
		while(!won) 
		{	
			
			if ((xoro % 2) == 0) 
			{
				System.out.println("X's turn");
				int xrow = Console.getInt("Pick a row 1, 2, 3 : ");
				int xcolumn = Console.getInt("Pick a column 1, 2, 3 : ");
				if (board[xrow-1][xcolumn-1].equals(" "))
				{
					board[xrow-1][xcolumn-1]= "X";
					xoro +=1;
					printBoard();
					checkboard();
				}
				else 
				{ System.out.println("That cell is occupied, please enter another values");  
				won = false; 
				}

					
			}
			else
			{	
				System.out.println("O's turn");
				int orow = Console.getInt("Pick a row 1, 2, 3 : ");
				int ocolumn = Console.getInt("Pick a column 1, 2, 3 : ");
				if (board[orow-1][ocolumn-1].equals(" "))
				{
					board[orow-1][ocolumn-1]= "O";
					xoro+=1;
					printBoard();
					checkboard();
				}
				
			else 
				{ 
				System.out.println("That cell is occupied, please enter another values"); 
				won = false; 
				}
				
				
			}
			
		}
		
		
		
		
		
		
		System.out.println("Bye!!");

	}
	
	public static void printBoard()
	{
		
		
		for (int i = 0; i< 3; i++)
		{			
			System.out.println("+---+---+---+");
			for(int j=0; j<3; j++)
			{
				System.out.print("|"+" "+board[i][j]+" ");
			}
		System.out.println("|");
		}
		System.out.println("+---+---+---+");
	}
	
	public static void checkboard()
	{
		
		int xRowDone = 0;
		int xColumnDone = 0;
		int xDiagonalDone = 0;

		int oRowDone = 0;
		int oColumnDone = 0;
		int oDiagonalDone = 0;

		// loop to check row of the board
		for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++ )
				{
					if (board[i][j] == " ") 
					{
						won = false;
					}
					else 
						if (board[i][j] == "X") 
							{
							xRowDone +=1;
							
							}	
						else if(board[i][j]=="O")
						{
						oRowDone +=1;
						}					
				}
				if (xRowDone == 3)
				{
					System.out.println("X Wins!");
					won = true;
					break;
				}
				
				else if (oRowDone == 3)
				{
					System.out.println("O Wins!");
					won = true;
					break;
				}
				xRowDone =0;
				oRowDone = 0;
			}
		
	
	// to check columns
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++ )
		{
			if (board[j][i] == " ") 
			{
				won = false;
			}
			else 
				if (board[j][i] == "X") 
					{
					xColumnDone +=1;
					
					}	
				else if(board[j][i]=="O")
				{
				oColumnDone +=1;
				}					
		}
		if (xColumnDone == 3)
		{
			System.out.println("X Wins!");
			won = true;
			break;
		}
		
		else if (oColumnDone == 3)
		{
			System.out.println("O Wins!");
			won = true;
			break;
		}
		xColumnDone =0;
		oColumnDone = 0;
	}
	
	
// to check diagonally
	String temp = " ";
	boolean isSameLeft = true;
	boolean isSameRight = true;
	String leftUpper1 = board[0][0];
	String rightUpper1 = board[0][2];
	for(int i=1; i<board.length; i++)
	{
		if (!board[i][i].equals(leftUpper1)|| leftUpper1.equals(" ")) isSameLeft = false;
		if(!board[i][board.length-1-i].equals(rightUpper1)|| rightUpper1.equals(" ")) isSameRight = false;
	}
	if (isSameLeft|| isSameRight) {
					if ((leftUpper1.equals("X")&& !isSameRight) || (rightUpper1.equals("X")&& !isSameLeft)) { temp = "X";}
					if ((leftUpper1.equals("O")&& !isSameRight)|| (rightUpper1.equals("O") && !isSameLeft)) { temp = "O";}
					System.out.println(temp + " Wins !");
					won = true;
						}
		
	}
			
			
}

