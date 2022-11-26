package baseball.views;

import baseball.models.BallCounterModel;
import camp.nextstep.edu.missionutils.Console;

public class Ui {

	public static void printStartMessage() {
		System.out.println("숫자 야구 게임을 시작합니다.");
	}

	public static String requestInput() {
		System.out.print("숫자를 입력해주세요 : ");
		return Console.readLine();
	}

	public static void printResult() {
		ifNothing();
		ifNoBall();
		ifNoStrike();
		ifBallNStrike();
	}

	private static void ifNothing() {
		if (BallCounterModel.getBall() == 0 && BallCounterModel.getStrike() == 0) {
			System.out.println("낫싱");
		}
	}

	private static void ifNoBall() {
		if (BallCounterModel.getBall() == 0 && BallCounterModel.getStrike() != 0) {
			System.out.println(BallCounterModel.getStrike() + "스트라이크");
		}
	}

	private static void ifNoStrike() {
		if (BallCounterModel.getBall() != 0 && BallCounterModel.getStrike() == 0) {
			System.out.println(BallCounterModel.getBall() + "볼");
		}
	}

	private static void ifBallNStrike() {
		if (BallCounterModel.getBall() != 0 && BallCounterModel.getStrike() != 0) {
			System.out.println(BallCounterModel.getBall() + "볼 " + BallCounterModel.getStrike() + "스트라이크");
		}
	}

	public static String requestRetry() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		return Console.readLine();
	}
}
