package pack;

public class Display {
	
	public void displayStar(int a){
      for(int i=a; i>0; i--) {
          for (int j = 0; j < i; j++)
              System.out.print("*");
          System.out.println("");
          }

	}
	
	public void displayVal(int a) {
		for (int i= 1; i <=a; i++) 
		{
			for (int j = 1; j<=i; j++)
				System.out.print(j);
			for (int k = a; k > i; k--)
				System.out.print("*");
			System.out.println("");
		}
	}
	
}