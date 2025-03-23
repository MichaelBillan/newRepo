import java.util.ArrayList;

/**
 * this class holds shared data used by threads
 * including the array, target number, and result flag 
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	private String winner;
	
	/**
	 * constructor for SharedData
	 * @param array the list of integers
	 * @param b the target number
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
	
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	public String getWinner() {
		return this.winner;
	}


	/**
	 * returns the result array showing the solution
	 * @return boolean array representing the winning positions 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Sets the result array from the winning thread
	 * @param winArray A boolean array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * getter method
	 * @return the defined array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * returns the target number to be matched by the sum
	 * @return the target integer value
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Checks whether a solution has been found
	 * @return true if a solution exists, false otherwise
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * sets the solution flag
	 * @param flag true if a solution has been found, otherwise false
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
