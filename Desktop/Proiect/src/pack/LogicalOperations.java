package pack;

/**
 * Created by cosminciocan on 17/07/2017.
 */
public class LogicalOperations {

    public int compareToValue(int noToCompare, int no){
        if(no < noToCompare)
            return no;
        return noToCompare;
    }

    public int compareBetweenValues(int noToCompare1,int noToCompare2, int no){
        if(no <= noToCompare1 || no >= noToCompare2)
            return no;
        return noToCompare1;
    }

    public int[] getValuesLessThan(int number, int noToCompare) {
        int[] array = new int[noToCompare - number];

        for(int i = 0; number < noToCompare; i++, number++) {
            array[i] = number;
        }

        return array;
    }
    
    public int compareNumbers(int x, int y){
    	if(x > y)
    		return x;
    	else
    		return y;
    }
    


	public void comparison(int firstNumber, int secondNumber, int thirdNumber) {
		if (firstNumber >= secondNumber || firstNumber == thirdNumber)
			System.out.println("The amount of snow this winter was(cm):" + firstNumber);
		else
			System.out.println("The forecast snow is(cm):" + thirdNumber);
	}
	
	public void numberCompare(int x1, int y1,int z1){
		if(x1 > z1 && x1 != y1 )
			System.out.println("The number is greater than " + z1 + " and not equal to " + y1);
		else 
			if (x1 == y1)
				System.out.println("The number is equal to " +y1);
			else
				if (x1 < z1)
					System.out.println("The number is lower than " +z1); 
	}
	
	public void odderOrEvven(int num){
		if(num % 2 == 0)
			System.out.println("You enter an even number");
		else
			System.out.println("You enter an odder number");
		
		
	}
	
	public void checkAge(int age){
		if(age >= 18)
			System.out.println("The person is eligible to vote !");
		else 
			System.out.println("The person is not eligible to vote !");
	}
	
	public String searchElementInArray(int searchedElem){

	    int[] array = {0,1,2,3,4,5,6,7,8,9};
	    for(int i = 0; i < 10; i++){
	        if(array[i] == searchedElem)
	            return "Your searched element is in the array !";

	    }
	    return "Your searched element isn't in the array !";
	}

	
}

