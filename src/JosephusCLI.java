import java.util.Scanner;

public class JosephusCLI {

	public static void main(String[] args) {

		// initialize scanner
		Scanner input = new Scanner(System.in);
		JosephusCalculations calculations = new JosephusCalculations();

		// prompt user with back story
		System.out.printf(
				"The problem is named after Flavius Josephus, a Jewish historian living in the 1st century. %nAccording to Josephus' account of the siege of Yodfat, he and his 40 "
						+ "soldiers were trapped %nin a cave by Roman soldiers. They chose suicide over capture, and settled on a serial %nmethod of committing suicide by drawing lots."
						+ "In other words they killed every other person. %nJosephus states that by luck or possibly by the hand of God, he remained until the end %nand surrendered to "
						+ "the Romans rather than killing themselves.");

		System.out.printf("%n%nIn order to stay alive you must choose the correct spot to stand in. Good luck!");

		System.out.printf("%n%nHow many soldiers are in your army?");
		boolean isRealNum = false;
		int numOfSoldiers = 0;
		while (!isRealNum) {
			try {
				String isSoldiers = input.nextLine();
				numOfSoldiers = Integer.parseInt(isSoldiers);
				while (!(numOfSoldiers % 1 == 0)) {
					System.out.printf("%nYou can't have a percentage of a soldier. Please insert a whole number: ");
					String isWhole = input.nextLine();
					numOfSoldiers = Integer.parseInt(isWhole);
				}
				isRealNum = true;
				calculations.setArmySize(numOfSoldiers);
			} catch (Exception e) {
				System.out.printf("%nYour input was not a real number or whole number. Please try again: ");
			}
		}
		

		System.out.printf("%nWhere is the starting position? i.e 1.  ");
		boolean isReal = false;
		while (!isReal) {
			try {
				String isStartingPosition = input.nextLine();
				int startingPosition = Integer.parseInt(isStartingPosition);
				while ((startingPosition > numOfSoldiers) || startingPosition == 0) {
					System.out.printf("%nThere aren't that many or few of soldiers. Please select another position: ");
					String isWhole = input.nextLine();
					startingPosition = Integer.parseInt(isWhole);
				}
				isReal = true;
				calculations.setStartPosition(startingPosition);
			} catch (Exception e) {
				System.out.printf("%nYour input was not a number. Please insert a real number: ");
			}
		}

		System.out.printf("%nIn order to stay alive, at what position should you stand? e.g 3. ");
		boolean isPosition = false;
		while (!isPosition) {
			try {
				String position = input.nextLine();
				int isPositionReal = Integer.parseInt(position);
				while (isPositionReal > numOfSoldiers) {
					System.out.printf("%nYour army is not big enough. Please select another position: ");
					String isWhole = input.nextLine();
					isPositionReal = Integer.parseInt(isWhole);
				}
				isPosition = true;
				calculations.setYourPosition(isPositionReal);
			} catch (Exception e) {
				System.out.printf("%nYour selection was not a real position. Please try again: ");
			}
		}

		

		//System.out.println(calculations.getCountToWinner());
		//System.out.println(calculations.getWinningPosition());
		System.out.println(calculations.getAnswer());
	}
	

}
