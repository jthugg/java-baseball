package baseball.models.user;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Validator extends UserModel {

	public Validator(String input) {
		super(input);
	}

	public static List<Integer> validateNumbers(String input) {
		isThreeNumerics(input);
		return makeNumbers(splitInput(input));
	}

	public static void isThreeNumerics(String input) {
		if (!Pattern.matches("^[1-9]{3}$", input)) {
			throw new IllegalArgumentException("[ERROR] 숫자 3자리만 입력 가능합니다.");
		}
	}

	public static List<Integer> makeNumbers(String[] splitInput) {
		List<Integer> numbers = new ArrayList<>();
		for (int index = 0; index < 3; index++) {
			int number = Integer.parseInt(splitInput[index]);
			isDuplicated(numbers, number);
			numbers.add(number);
		}
		return numbers;
	}

	public static String[] splitInput(String input) {
		return input.split("");
	}

	public static void isDuplicated(List<Integer> numbers, int number) {
		if (numbers.contains(number)) {
			throw new IllegalArgumentException("[ERROR] 중복된 숫자는 입력할 수 없습니다.");
		}
	}
}
