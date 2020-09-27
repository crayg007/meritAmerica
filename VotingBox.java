import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {

		move();

		while (frontIsClear()) {

			if (noBeepersPresent()) {

				turnLeft();
				move();
				while (beepersPresent()) {
					pickBeeper();
				}
				turnAround();
				move();
				move();
				while (beepersPresent()) {
					pickBeeper();
				}
				turnAround();
				move();
				turnRight();

			}
			if (beepersPresent())
				;
			{
				move();
				if (frontIsClear()) {
					move();
				}
			}
		}
	}
}
