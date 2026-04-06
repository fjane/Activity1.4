
public class MyProgram {
	
	/**
	 * Return the sum of the inputs. 
	 * @param a First number to add
	 * @param b Second number to add
	 * 
	 * @return
	 */

    // changed a to int
	public static int sum(int a, int b) {
        return a + b;
    }
	
	/**
	 * Implement multiplication as a series of add operations. 
	 * For example, if 'times' is 3, then the equation
	 * should be: 'input + input + input'. 
	 * @param input
	 * @param times
	 * @return
	 */
	public static int multiplyByAdding(int input, int times) {
		int carry = input;
		for ( int i = 0; i <= input; i++ ) {
			carry += input;
		}
		return carry;
	}
	
	/**
	 * Divide a by b. 
	 * 
	 * @param a
	 * @param b
	 * @return The result as a decimal. 
	 */
	public static double divideBy(int a, int b) {
		return a/b;
	}
	/**
	 * Print a the input to the screen a given number of times. 
	 * 
	 * @param input
	 * @param times
	 */
	public static void displayInput(String input, int times) {
		while( 0 <= times--) {
			System.out.println(input);
		}
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println(sum(a, b));

		System.out.println("Multiplying 3 by 4 is: " + multiplyByAdding(3, 4));
		
		displayInput("Hello!", 4);
		
		System.out.println("The answer should be 0.33333...: " + divideBy(1, 3));
	}
}
