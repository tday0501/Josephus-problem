
public class JosephusCalculations {
	
	//data members
	private int armySize;
	private int startPosition;
	private int yourPosition;
	private int counter;
	private int winningPosition;
	
	//getters and setters
	public void setArmySize(int size) {
		this.armySize = size;
	}
	
	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}
	
	public void setYourPosition(int yourPosition) {
		this.yourPosition = yourPosition;
	}
	
	public void setCounter() {
		int raised = (int)(Math.log(armySize)/Math.log(2));
		int variableL = (int)(armySize - Math.pow(2, raised));
		counter = variableL *2;
	}
	
	public void setWinningPosition () {
		if((startPosition + counter) > armySize) {
			int newCounter = Math.abs(startPosition - armySize); 
			winningPosition = (int)counter - newCounter;
		} else {
			winningPosition = (int) (startPosition + counter);
		}
	}
	
	//method
	public String getAnswer() {
		setCounter();
		setWinningPosition();
		if(winningPosition != yourPosition) {
			return ("Sorry, you died. In order to have survived you should have stood at postion: " + winningPosition);
		} else {
			return ("You survived... but now you're a prisoner!");
		}
	}
	
	
	
}
