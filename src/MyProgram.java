
public class MyProgram {
	
	/**
	 * Return the sum of the inputs. 
	 * @param a First number to add
	 * @param b Second number to add
	 * 
	 * @return The sum of a and b.
	 */

    // changed a to int originally String
	public static int sum(int a, int b) {
        return a + b;
    }
	
	/**
	 * Implement multiplication as a series of add operations. 
	 * For example, if 'times' is 3, then the equation
	 * should be: 'input + input + input'. 
	 * @param input Number to be multiplied
	 * @param times Number to be multiplied by
	 * @return The multiplication of input and times.
	 */

    // times variable not called for iteration, looped using input originally
    // int should be initialized at 1 instead of 0
    // for condition should be (i < times) not (i <= times)
    // else if statements added to deal with negative and zero values
	public static int multiplyByAdding(int input, int times) {
		int carry = input;
        if (times == 0) {
            carry = 0;
        } else if (input < 0 && times < 0) {
            input = Math.abs(input);
            times = Math.abs(times);
            carry = input;
            for ( int i = 1; i < times; i++ ) {
                carry += input;
            }
        } else if (times < 0) {
            input = input*-1;
            times = times*-1;
            carry = input;
            for ( int i = 1; i < times; i++ ) {
                carry += input;
            }
        } else {
            for (int i = 1; i < times; i++) {
                carry += input;
            }
        }

		return carry;
	}
	
	/**
	 * Divide a by b. 
	 * 
	 * @param a Number to be divided
	 * @param b Number to be divided by
	 * @return The division of a by b. The result as a decimal.
	 */

    // change to double from int so result is decimal.
	public static double divideBy(double a, double b) {
        return a/b;
	}

	/**
	 * Print the input to the screen a given number of times.
	 *
	 * @param input String message to be printed
	 * @param times Number of times message should be printed
	 */

    // changed while loop to for loop. If while loop is preferred change
    // while condition from ( 0 <= times--) to ( 0 != times--) which
    // resulted in an additional print

    public static void displayInput(String input, int times) {
        for ( int i = 0; i < times; i++ ) {
            System.out.println(input);
        }
    }

	static void main(String[] args) {
		int a = 1;
		int b = 2;

        // Added label print out for results
		System.out.println(a + " + " + b + " = " + sum(a, b));

        // change hard coded values
        int c = 3;
        int d = 4;
		System.out.println("Multiplying " + c + " by " + d + " equals: " + multiplyByAdding(c,d));

        // change hard coded values
        int e = 1;
        int f = 3;
        System.out.println("Dividing " + e + " by " + f + " equals: " + divideBy(e,f));

        System.out.println("Display for loop method");
		displayInput("Hello!", 4);

	}
}
