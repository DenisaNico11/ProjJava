package pack;
import java.util.HashMap;
import java.util.TreeMap;

public class MainD {

    public static void main(String [] args){
        Calculator calc = new Calculator();
        LogicalOperations logicalOp = new LogicalOperations();
        ReadInput read = new ReadInput();
       // Quiz calculateGrade = new Quiz();
        //Quiz quiz = new Quiz();


        //Exercise 1. Convert a given F temperature in C temperature (C=5.0/9*(F-32)

       //System.out.println("Introduce a temperature in F: ");
        //float F = read.readFloat();
        //double C = calc.convertFtoC(F);
        //System.out.println("Temperature in C: " + C );

        //Exercise 2.Given two numbers, see which one is the greatest and print it
        //System.out.println("Introduce 2 numbers: ");
        //System.out.println("Introduce first number: ");
        //int x = read.readInt();
        //System.out.println("Introduce second number: ");
        //int y = read.readInt();
        //int greatestNumber = logicalOp.compareNumbers(x, y);
        //System.out.println("The greatest number is: " +greatestNumber);


        //Exercise 3.Given a text input, if it is â€œEvozonâ€�, then print â€œLearning text comparisonâ€�. If not, print â€œGot to try some moreâ€�

        //System.out.println("Introduce text: ");
        //String text = read.readString();
        //if (text.equals("Evozon") == true )
        //System.out.println("Learning text comparison");
        //else
        //System.out.println("Got to try some more");

        //Exercise 4.Given a number, if itâ€™s equal to or higher than 2 and equal to or lower than 8, print the number

//	System.out.println("Give the initial number: ");
//	int x = read.readInt();
//	System.out.println("Introduce first number: ");
//	int y = read.readInt();
//	System.out.println("Introduce second number: ");
//	int z = read.readInt(); 
//	if (logicalOp.compareBetweenTwoNr(x, y, z)  != (y-1))
//		System.out.println("The number is: " + x);
//	else 
//		System.out.println("The number is not in the interval");
	
/*Exercise 5.Given a text input and a number input, if the text is 
 * equal to "Evozonâ€� AND the number is equal to or lower
 *  than 3, print the text and the number. If the text is
 *   not â€œEvozonâ€� AND the number is equal to or higher 
 *   than 4, print the number and the text, in this order.*/
	
	/*System.out.println("Intoduce text: ");
	String text = read.readString();
	System.out.println("Introduce number: ");
	int x = read.readInt();
	System.out.println("Compare number: ");
	int y = read.readInt();
	if(text.equals("Evozon")&& x <= y)
		System.out.println(text + " " + x );
	else 
		System.out.println(x + " " + text);*/
	
	
	/*Exercise 6.Given a number input, if it is higher than 8 OR equal 
	 * to 6, print â€œThe amount of snow this winter was(cm):â€�
	 *  and the given number. Else print â€œThe forecast snow
	 *   is(cm):â€�  */
	
	/*System.out.println("Give the initial number: ");
	int x = read.readInt();
	System.out.println("First number: ");
	int y = read.readInt();
	System.out.println("Second number: ");
	int z = read.readInt();
	if(x >= y || x == z)
		System.out.println("The amount of snow this winter was(cm):" +x);
	else
		System.out.println("The forecast snow is(cm):" + z);   */
	
	/*Exercise 7.Given a number input, if the number is greater than 3 but 
	 * not equal to 4, print â€œThe number is greater than 3 and
	 * not equal to 4â€�. Else if the number is equal to 4 print
	 * â€�The number is equal to 4â€�. Else if the number is lower 
	 *  than 3 print â€œThe number is lower than 3â€�  */
	
	/*System.out.println("Give the initial number: ");
	int x = read.readInt();
	System.out.println("First number: ");
	int y = read.readInt(); //4
	System.out.println("Second number: ");
	int z = read.readInt(); //3
	if(x > z && x != y )
		System.out.println("The number is greater than " + z + " and not equal to " + y);
	else 
		if (x == y)
			System.out.println("The number is equal to " +y);
		else
			if (x < z)
				System.out.println("The number is lower than " +z); */
	
	/*Exercise 8: If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, 
	otherwise, program will show "Not allowedÂ�. (use a switch case for this)*/
	
	/*System.out.println("Give an input: ");
	String x = read.readString();
	switch (x) {
		case "0" : System.out.println("The number is: 0");
			break;
		case "1" : System.out.println("The number is: 1");
			break;
		case "2" : System.out.println("The number is: 2");
			break;
		case "3" : System.out.println("The number is: 3");
			break;
		case "4" : System.out.println("The number is: 4");
			break;
		case "5" : System.out.println("The number is: 5");
			break;
		case "6" : System.out.println("The number is: 6");
			break;
		case "7" : System.out.println("The number is: 7");
			break;
		case "8" : System.out.println("The number is: 8");
			break;
		case "9" : System.out.println("The number is: 9");
			break;
		default :
            System.out.println("Invalid input !");
            break; 
	} */
	
	
	
	
	

	
	
	/*Exercise 9: Write a Java program to determine whether an input number is an even number.*/
	
	/*System.out.println("Enter an integer to check if it is odd or even");
	int x = read.readInt();
	if(x % 2 == 0)
		System.out.println("You enter an even number");
	else
		System.out.println("You enter an odder number"); */
	

	/*Exercise 11: Write Java program to allow the user to input his/her age. Then the program 
	will show if the person is eligible to vote. A person who is eligible to vote must be older 
	than or equal to 18 years old.
	Enter your age: 18
	You are eligible to vote. */
	
	/*System.out.println("Enter the age: ");
	int age = read.readInt();
	if(age >= 18)
		System.out.println("The person is eligible to vote !");
	else 
		System.out.println("The person is not eligible to vote !"); */
	
	

	
	
	/*Exercise 12: Write a Java program that determines a students grade.
	The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
	-if the average score >=90% =>grade=A
	-if the average score >= 70% and <90% => grade=B
	-if the average score>=50% and <70% =>grade=C
	-if the average score<50% =>grade=F
	See the example output below:

	Quiz score: 80

	Mid-term score: 68

	Final score: 90

	Your grade is B.*/

	/* System.out.println("Quiz score:");
	 int quizScore = read.readNumber();
	 System.out.println("Mid-term score:");
	 int midTermScore = read.readNumber();
	 System.out.println("Final score: ");
	 int finalScore = read.readNumber();
	 System.out.println(" Your grade is : " + calc.calculateGrade(quizScore, midTermScore, finalScore)); */
	 
	/*Exercise 13: Write a Java program that allows the user to choose the correct answer of a question.
	See the example below:
	What is the correct way to declare a variable to store an integer value in Java?
	a. int 1x=10;
	b. int x=10;
	c. float x=10.0f;
	d. string x="10";
	Enter your choice: c */
	
	/*System.out.println(" What is the correct way to declare a variable to store an integer value in Java?");
	System.out.println("a. int 1x=10;");
	System.out.println("b. int x=10;");
	System.out.println("c. float x=10.0f;");
	System.out.println("d. string x=\"10\";");
	System.out.println("Enter your choice: ");
	String answer = read.readString();
	quiz.question(answer); */
	
	
	/*Exercise 15: Write a Java program to search for an element of an integer array of 10 elements.*/
	/*System.out.println("Enter the element you want to search: ");
	int element = read.readInt();
	System.out.println(calc.searchElementInArray(element));*/
	
	
	/*Exercise 16: Write a Java program by using two for loops to produce the output shown below:

		*******

		******

		*****

		****

		***

		**

		* */



        //Exercise 18: Write a function that takes an input list
        // and an interval n and returns a new list with all the elements
        // of the original list, in order, except that every nth item has
        // been removed. For instance, given the input
        // list (1 2 3 4 5 6 7 8 9 10) and n = 4, the function should
        // return the list (1 2 3 5 6 7 9 10).

//	        int number = i;
        //
//	        if (lista.contains(i))
//	            lista.remove(i);
        //
//	        Collections.sort(lista);
//	        System.out.println(lista.toString());

        //List<Integer> array = new ArrayList<Integer>();
//	        for(int i = 4; i >= 0; i--) {
//	            array.add(i+1);
//	        }
//	        array.add(2);
//	        array.add(1);
//	        array.add(5);
//	        array.add(4);
//	        array.add(3);
//	        array.remove(Integer.valueOf(3));
//	        System.out.println(array);

//	        boolean swapped = true;
//	        int j = 0;
//	        int tmp;
//	        while (swapped) {
//	            swapped = false;
//	            j++;
//	            for (int i = 0; i < array.size() - j; i++) {
//	                if (array.get(i) > array.get(i + 1)) {
//	                    tmp = array.get(i);
//	                    array.set(i, array.get(i + 1));
//	                    array.set(i + 1, tmp);
//	                    swapped = true;
//	                    System.out.println(array);
//	                }
//	            }
//	        }


        //
//	        n = 2;
//	        List<Integer> newArray = new ArrayList<Integer>();
        //
//	        for(int i = 0; i < array.size(); i++) {
//	            if(!((i +1 ) % n == 0)) {
//	                newArray.add(array.get(i));
//	            }
//	        }
//	        System.out.println(newArray);


//	        TreeMap<String, Integer> hashmap = new TreeMap<String, Integer>();
//	        //scanner scan = new Scanner(System.in);
////	        hashmap.put("unt",5);
////	        hashmap.put("inghetata",2);
////	        hashmap.put("salata",8);
////	        hashmap.put("portocale",6);
////	        hashmap.put("portocale",8);
////	         int a = readInput.readNumber();
////	        String b = readInput.readString();
////	        hashmap.put("cheie", a);
////	        hashmap.put(b, a);
//	        // hashmap.clear();
//	        //hashmap.remove("salata");
//	        //  System.out.println("Produsele din cos sunt: "+hashmap);
        //
//	        int n = readInput.readNumber();
        //
//	        for (int i = 0; i < n; i++) {
//	            String b = readInput.readString();
//	            int a = readInput.readNumber();
        //
//	            hashmap.put(b, a);
        //

    }


}
		
	
	
	 

	


 