package pk.ciit.sc.final1.calculator;

/**
 * @author mnh
 *
 */
public class Calculator {
	/**
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return maximum
	 */
	
	
	
	
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	/**
	 * @param num
	 * @return square of the number
	 * @throws IllegalArgumentException
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else
			throw new IllegalArgumentException();
		return result;
	}
	
	/**
	 * @param num
	 * @return cube of the number
	 */
	public int cube(int num) 
	{
		return num*num*num;
	}
}
