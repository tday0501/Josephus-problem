import java.util.Scanner;

public class JosehpusCLI {

	public static void main(String[] args) {

		// initialize scanner
		Scanner input = new Scanner(System.in);

		// prompt user with back story
		System.out.printf(
				"The problem is named after Flavius Josephus, a Jewish historian living in the 1st century. %nAccording to Josephus' account of the siege of Yodfat, he and his 40 "
						+ "soldiers were trapped %nin a cave by Roman soldiers. They chose suicide over capture, and settled on a serial %nmethod of committing suicide by drawing lots. Josephus states"
						+ " that by luck or possibly by %nthe hand of God, he and another man remained until the end and surrendered to the Romans %nrather than killing themselves.");

		System.out.printf("%n%nIn order to stay alive you must choose the correct spot to stand in. Good luck!");

		System.out.printf("%n%nHow many soldiers are in your army?");
		boolean isRealNum = false;
		double numOfSoldiers = 0;
		while (!isRealNum) {
			try {
				String isSoldiers = input.nextLine();
				numOfSoldiers = Double.parseDouble(isSoldiers);
				while (!(numOfSoldiers % 1 == 0)) {
					System.out.printf("%nYou can't have a percentage of a soldier. Please insert a whole number: ");
					String isWhole = input.nextLine();
					numOfSoldiers = Double.parseDouble(isWhole);
				}
				isRealNum = true;
			} catch (Exception e) {
				System.out.printf("%nYour input was not a number. Please insert a real number: ");
			}
		}

		System.out.printf("%nWhat is the serial order? e.g Kill every other.");
		boolean isReal = false;
		while (!isReal) {
			try {
				String isSerial = input.nextLine();
				double serialOrder = Double.parseDouble(isSerial);
				while (!(serialOrder % 1 == 0)) {
					System.out.printf("%nYou can't count every nth soldier. Please insert a whole number: ");
					String isWhole = input.nextLine();
					serialOrder = Double.parseDouble(isWhole);
				}
				isReal = true;
			} catch (Exception e) {
				System.out.printf("%nYour input was not a number. Please insert a real number: ");
			}
		}

		System.out.printf("%nIn order to stay alive, at what position should you stand? e.g 3. ");
		boolean isPosition = false;
		while (!isPosition) {
			try {
				String position = input.nextLine();
				double isPositionReal = Double.parseDouble(position);
				while (isPositionReal > numOfSoldiers) {
					System.out.printf("%nYour army is not big enough. Please select another position: ");
					String isWhole = input.nextLine();
					isPositionReal = Double.parseDouble(isWhole);
				}
				isPosition = true;
			} catch (Exception e) {
				System.out.printf("%nYour selection was not a real position. Please try again: ");
			}
		}

	}

}
