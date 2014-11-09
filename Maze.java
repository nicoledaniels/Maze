import java.util.Random;
// No other import statement is allowed

public class Maze
{
	// TO DO: Instance Variable
	int width;
	int height;
	int[][][]board;
	
	/**
	 * Constructor
	 * @param aWidth the number of chambers in each row
	 * @param aHeight the number of chamber in each column
	 */
	public Maze(int aWidth, int aHeight)
	{
		width = aWidth;
		height = aHeight;
		board = new int[height][width][4];
		if (getWidth()==1 || getHeight()==1){
			return;
		}
		Random rand = new Random();
		int randomX = rand.nextInt((getWidth()-1 - 0) + 1) + 0;
		int randomY = rand.nextInt((getHeight()-1 -0) + 1) + 0;
		
		for (int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				/*if (j == randomX){
					board[i][j][1]=1;
				}
				if (i == randomY){
					board[i][j][2]=1;
				}
				if (j == randomX + 1){
					board[i][j][0]=1;
				}
				if (i == randomY+1){
					board[i][j][3]=1;
				}
				*/
				//set outside walls
				//x= i, y = j
				if (j == 0)board[i][j][3]=1;
				if (i == 0)board[i][j][0]=1;
				if(i == getHeight()-1)board[i][j][1]=1;
				if(j == getWidth()-1)board[i][j][2]=1;
				
			}
		}
		// TO DO: Constructor
	}

	/**
	 * getWidth
	 * @return the width of this maze
	 */
	public int getWidth()
	{
		// TO DO
		return width;
	}
	
	/**
	 * getHeight
	 * @return the height of this maze
	 */
	public int getHeight()
	{
		// TO DO
		return height;
	}
	
	/**
	 * isNorthWall
	 * @param row the row identifier of a chamber
	 * @param column the column identifier of a chamber
	 * @return true if the chamber at row row and column column
	 * contain a north wall. Otherwise, return false
	 */
	public boolean isNorthWall(int row, int column)
	{
		// TO DO
		boolean isNorthWall = false;
		if(board[row][column][0]==1){
			isNorthWall=true;
		}
		return isNorthWall;
	}
	
	/**
	 * isEastWall
	 * @param row the row identifier of a chamber
	 * @param column the column identifier of a chamber
	 * @return true if the chamber at row row and column column
	 * contain an east wall. Otherwise, return false
	 */
	public boolean isEastWall(int row, int column)
	{
		boolean isEastWall = false;
		if(board[row][column][2]==1){
			isEastWall = true;
		}
		return isEastWall;
	}
	
	/**
	 * isSouthWall
	 * @param row the row identifier of a chamber
	 * @param column the column identifier of a chamber
	 * @return true if the chamber at row row and column column
	 * contain a south wall. Otherwise, return false
	 */
	public boolean isSouthWall(int row, int column)
	{
		// TO DO
		boolean isSouthWall = false;
		if(board[row][column][1]==1){
			isSouthWall = true;
		}
		return isSouthWall;
	}
	
	/**
	 * isWestWall
	 * @param row the row identifier of a chamber
	 * @param column the column identifier of a chamber
	 * @return true if the chamber at row row and column column
	 * contain a west wall. Otherwise, return false
	 */
	public boolean isWestWall(int row, int column)
	{
		boolean isWestWall = false;
		if(board[row][column][3]==1){
			isWestWall = true;
		}
		return isWestWall;
		// TO DO
	}
}