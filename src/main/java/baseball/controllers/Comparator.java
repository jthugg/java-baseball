package baseball.controllers;

import baseball.models.BallCounterModel;
import java.util.List;

public class Comparator {

	public static void compare(List<Integer> computersNumbers, List<Integer> usersNumbers) {
		for (int index = 0; index < 3; index++) {
			BallCounterModel.ballUp(computersNumbers.contains(usersNumbers.get(index)));
			BallCounterModel.ballDown(computersNumbers.get(index) == usersNumbers.get(index));
			BallCounterModel.strikeUp(computersNumbers.get(index) == usersNumbers.get(index));
		}
	}
}
