package baseball.models.computer;

import java.util.List;

public class ComputerModel {

	protected List<Integer> numbers;

	public ComputerModel() {
		numbers = NumberGenerator.generateThreeNumbers();
	}

	public List<Integer> getNumbers() {
		return numbers;
	}
}
