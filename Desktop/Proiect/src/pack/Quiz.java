package pack;

public class Quiz {

	public void question(String answer){

        switch(answer){
            case ("a"):
                System.out.println("Wrong answer !");
                break;
            case ("b"):
                System.out.println("Wrong answer !");
                break;
            case ("c"):
                System.out.println("Correct answer ! ");
                break;
            case ("d"):
                System.out.println("Wrong answer !");
                break;
            default :
                System.out.println("Invalid input !");
        }
    }
}
