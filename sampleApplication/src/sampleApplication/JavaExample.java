package sampleApplication;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * JDBC example application class for testing the usual instrumentation aspects
 * 
 * @author Christian Zirkelbach (czi@informatik.uni-kiel.de)
 *
 */
public class JavaExample {

	private static final Logger LOG = Logger.getLogger(JavaExample.class.getName());

	public static void main(String[] args) {
		LOG.info("Hello, I'm a fibunacci calculator!");
		LOG.info("Enter number upto which Fibonacci series to print: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		LOG.info(String.valueOf(fibonacci(number)));
		scanner.close();
	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}