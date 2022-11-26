package baseball.models.user;

import java.util.List;

public class UserModel {

	protected List<Integer> numbers;

	public UserModel(String input) {
		numbers = Validator.validateNumbers(input);
	}

	public List<Integer> getNumbers() {
		return numbers;
	}
}
