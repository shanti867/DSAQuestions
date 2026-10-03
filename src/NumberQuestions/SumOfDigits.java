package NumberQuestions;

public class SumOfDigits {
    public static void main(String[] args){
        int number = 1234;
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
        System.out.println("The Sum is " + sum);
    }
}
