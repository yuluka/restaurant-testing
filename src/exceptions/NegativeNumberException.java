package exceptions;

public class NegativeNumberException extends RuntimeException{

	public NegativeNumberException(double weight) {
		super("The weight you are trying to add is negative. You tried to add "
				+ weight + ".");
	}
}
