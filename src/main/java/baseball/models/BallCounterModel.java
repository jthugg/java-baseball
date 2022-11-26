package baseball.models;

public class BallCounterModel {

	private static int ball = 0;
	private static int strike = 0;

	public static void initBallCounts() {
		ball = 0;
		strike = 0;
	}

	public static void ballUp(boolean contains) {
		if (contains) {
			ball++;
		}
	}

	public static void ballDown(boolean matches) {
		if (matches) {
			ball--;
		}
	}

	public static void strikeUp(boolean matches) {
		if (matches) {
			strike++;
		}
	}

	public static int getBall() {
		return ball;
	}

	public static int getStrike() {
		return strike;
	}
}
