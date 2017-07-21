package pack;

import static pack.Calculator.sum;

/**
 * Created by cosminciocan on 19/07/2017.
 */
public class Menu {
	ReadInput readInput = new ReadInput();
	LogicalOperations opr = new LogicalOperations();
	Calculator calc = new Calculator();
	Display dis = new Display();

	public void printOptions() {
		System.out
				.println("###################################### MENU ################################################ \n"
						+ "1. Convert temperature from F to C\n"
						+ "2. Print the greatest number\n"
						+ "3. Given a text input, if it is \'Evozon\', then print \'Learning text comparison\'. If not, print \'Got to try some more\'\n"
						+ "4. Given a number, if it\'+s equal to or higher than 2 and equal to or lower than 8, print the number\n"
						+ "5. Given a text input and a number input, if the text is equal to \'Evozon\' AND the number is equal to or lower\n"
						+ "than 3, print the text and the number. If the text is not \'Evozon\' AND the number is equal to or higher than 4, print\n"
						+ "the number and the text, in this order\n"
						+ "6. Given a number input, if it is higher than 8 OR equal to 6, print \'The amount of snow this winter was(cm):\'\n"
						+ "and the given number. Else print \'The forecast snow is(cm):\'\n"
						+ "7. Given a number input, if the number is greater than 3 but not equal to 4, print \'The number is greater than\n"
						+ "3 and not equal to 4\'. Else if the number is equal to 4 print \'The number is equal to 4\'. Else if the number is lower\n"
						+ "than 3 print \'The number is lower than 3\'\n"
						+ "8. If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed,  otherwise,\n"
						+ "program will show \'Not allowed\'\n"
						+ "9. Write a Java program to determine whether an input number is an even number\n"
						+ "10. Write Java program to allow the user to input his/her age. Then the program will show if the person is\n"
						+ "eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old\n"
						+ "11. Write a Java program that determines a student\'s grade.\n"
						+ "The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade\n"
						+ "12. Write a Java program that allows the user to choose the correct answer of a question\n"
						+ "13. Write a Java program to search for an element of an integer array of 10 elements\n"
						+ "14. Write a Java program by using two for loops to produce the output shown in \'Exercices in Java.txt\'\n"
						+ "15. Write a Java program by using three for loops to print the patter shown in \'Exercices in Java.txt\'\n"
						+ "16. Write a function that takes an input list and an interval n and returns a new list with all the elements of\n"
						+ "17. Write a function that makes the sum of  2 numbers\n"
						+ "18. White a function that makes the substract of 2 numbers\n"
						+ "the original list, in order, except that every nth item has been removed\n\n"
						+ "###################################### END MENU ###########################################");

	}

	public boolean chooseOption(int option) {

		switch (option) {

		case 1:
			System.out.println("Introduce a temperature in F: ");
			float temper = readInput.readFloat();
			System.out.println("Temperature in C: " + calc.convertFtoC(temper));
			break;

		case 2:
			System.out.println("Introduce 2 numbers: ");
			System.out.println("Introduce first number: ");
			int x = readInput.readInt();
			System.out.println("Introduce second number: ");
			int y = readInput.readInt();
			int greatestNumber = opr.compareNumbers(x, y);
			System.out.println("The greatest number is: " + greatestNumber);
			break;

		case 3:
			System.out.println("Introduce text: ");
			String text = readInput.readString();
			if (text.equals("Evozon") == true)
				System.out.println("Learning text comparison");
			else
				System.out.println("Got to try some more");
			break;

		case 4:
			System.out.println("Give the initial number: ");
			int a = readInput.readInt();
			System.out.println("Introduce first number: ");
			int b = readInput.readInt();
			System.out.println("Introduce second number: ");
			int c = readInput.readInt();
			if (opr.compareBetweenValues(a, b, c) != (b - 1))
				System.out.println("The number is: " + a);
			else
				System.out.println("The number is not in the interval");
			break;

		case 5:
			System.out.println("Intoduce text: ");
			String text1 = readInput.readString();
			System.out.println("Introduce number: ");
			int m = readInput.readInt();
			System.out.println("Compare number: ");
			int n = readInput.readInt();
			if (text1.equals("Evozon") && m <= n)
				System.out.println(text1 + " " + m);
			else
				System.out.println(m + " " + text1);
			break;

		case 6:
			System.out.println("Give the initial number: ");
			int firstNumber = readInput.readInt();
			System.out.println("First number: ");
			int secondNumber = readInput.readInt();
			System.out.println("Second number: ");
			int thirdNumber = readInput.readInt();
			opr.comparison(firstNumber, secondNumber, thirdNumber);
			break;

		case 7:
			System.out.println("Give the initial number: ");
			int x1 = readInput.readInt();
			System.out.println("First number: ");
			int y1 = readInput.readInt(); //4
			System.out.println("Second number: ");
			int z1 = readInput.readInt(); //3
			opr.numberCompare(x1, y1, z1);
			break;
			
		case 8:
			System.out.println("Give an input: ");
			String key = readInput.readString();
			NumberKeys number = new NumberKeys();
			number.keys(key);
			break;
		
		case 9:
			System.out.println("Enter an integer to check if it is odd or even");
			int num = readInput.readInt();
			opr.odderOrEvven(num);
			break;
			
		case 10:
			System.out.println("Enter the age: ");
			int age = readInput.readInt();
			opr.checkAge(age);
			break;
			
		case 11:
			 System.out.println("Quiz score:");
			 int quizScore = readInput.readNumber();
			 System.out.println("Mid-term score:");
			 int midTermScore = readInput.readNumber();
			 System.out.println("Final score: ");
			 int finalScore = readInput.readNumber();
			 System.out.println(" Your grade is : " + calc.calculateGrade(quizScore, midTermScore, finalScore));
			 break;
			 
		case 12:
			System.out.println(" What is the correct way to declare a variable to store an integer value in Java?");
			System.out.println("a. int 1x=10;");
			System.out.println("b. int x=10;");
			System.out.println("c. float x=10.0f;");
			System.out.println("d. string x=\"10\";");
			System.out.println("Enter your choice: ");
			String answer = readInput.readString();
			Quiz quiz = new Quiz();
			quiz.question(answer);
			break;
			
		case 13:
			System.out.println("Enter the element that you want to search: ");
			int element = readInput.readNumber();
			System.out.println(opr.searchElementInArray(element));
			break;
			
		case 14:
			 ReadInput number3 = new ReadInput();
			 System.out.print("Enter a number: ");
		     dis.displayStar(number3.readNumber());
		     break;
		     
		case 15:
			ReadInput number4 = new ReadInput();
			System.out.print("Enter a number: ");
			dis.displayVal(number4.readNumber());
			break;
			
		case 16:
			System.out.print("Introduceti numarul de elemente: ");
            int rez = readInput.readNumber();
            Lista list = new Lista();
            list.returnList(rez);
            break;
			
			
		case 17:
			System.out.println("Introduce the first number: ");
			int number1 = readInput.readNumber();
			System.out.println("Introduce second number: ");
			int number2 = readInput.readNumber();
			System.out.println("Sum is: " + calc.sum(number1, number2));
			break;
			
		case 18:
			System.out.println("Introduce the first number: ");
			int n1 = readInput.readNumber();
			System.out.println("Introduce second number: ");
			int n2 = readInput.readNumber();
			System.out.println("Substract is: " +calc.substract(n1, n2));
			break;
			
		
			
				
			

		case 0:
			System.out.println("Exit");
			 int nr3=readInput.readNumber();
			return false;
		default:
			System.out.println("");

		}
		return true;
	}

	public void runProgram() {
		int option;
		do {
			printOptions();
			System.out.println("Alege optiunea: ");

			option = readInput.readNumber();

		} while (chooseOption(option));

	}
}
