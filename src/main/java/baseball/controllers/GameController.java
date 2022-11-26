package baseball.controllers;

import baseball.models.BallCounterModel;
import baseball.models.computer.ComputerModel;
import baseball.models.user.UserModel;
import baseball.views.Ui;
import java.util.regex.Pattern;

public class GameController {

	public static void gameSequence() {
		Ui.printStartMessage();
		String retry = "1";
		gameLoop(retry);
	}

	private static void gameLoop(String retry) {
		while (retry.equals("1")) {
			ComputerModel computerModel = new ComputerModel();
			compareLoop(computerModel);
			retry = validateRetryAnswer(Ui.requestRetry());
			BallCounterModel.initBallCounts();
		}
	}

	private static String validateRetryAnswer(String answer) {
		if (!Pattern.matches("^1|2$", answer)) {
			throw new IllegalArgumentException("[ERROR] 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		}
		return answer;
	}

	private static void compareLoop(ComputerModel computerModel) {
		while (BallCounterModel.getStrike() < 3) {
			UserModel userModel = new UserModel(Ui.requestInput());
			BallCounterModel.initBallCounts();
			Comparator.compare(computerModel.getNumbers(), userModel.getNumbers());
			Ui.printResult();
		}
	}
}
