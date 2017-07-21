package pack;

public class Calculator {

    public static int sum(int a, int b) {
        return (a + b);
    }
    
    public static int substract(int a, int b){
    	return (a-b);
    }
    
    public double convertFtoC(float F){
        double C = (5.0/9*(F-32));
        return C;
    }
    public String calculateGrade(int quizScore, int midTermScore, int finalScore){
        int averageScore = (quizScore + midTermScore + finalScore) / 3;
        if(averageScore >= 90) return "A";
        if(averageScore >= 70 && averageScore< 90) return "B";
        if(averageScore >= 50 && averageScore < 70) return "C";
        if(averageScore < 50) return "F";
        return "too small. Keep learning !";
    }
}
