package classLab1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello User, enter a number less than 10 and greater than zero and press enter: ");
		int number1 = sc.nextInt();
		if(number1 > 10 || number1 < 0) {
			System.out.println("Enter a number less than 10 and greater than 0");
		}
		System.out.println("Please enter second number");
		int number2 = sc.nextInt();
		System.out.println("Please enter a sentence");
		String str = sc.next();
		
		System.out.println("You entered" + number1 + "and" + number2 + "Your sentenece:" + str);
		System.out.println("Lets do some arithmetic with your numbers");
		int  result = number1 + number2;
		int result2 = number1 - number2;
		int result3 = number1 * number2;
		int result4 = number2 / number1;
		int result5 = number2 % number1;
		System.out.println("Here are the result we got");
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	
		System.out.println("Now we will manipulate your sentence");
		char str1 = str.charAt(0);
		System.out.println("Index 5 displayed this character:" + str1);
		System.out.println("The length of your sentence: " + str.length());
		System.out.println("This is your sentence without any spaces" + str.trim());
		System.out.println("This is your sentence in all CAPS:" + str.toUpperCase());
		System.out.println("This is your sentence in all lowercase: " + str.toLowerCase());
		
		sc.close();
	
		
		
	}

}
