package NumberQuestions;

public class ProductOfDigits {
    public static void main(String[] args){
        int number = 234;
        int product = 1;
        while(number != 0){
            int rem = number % 10;
            product = product * rem;
            number = number/10;
        }
        System.out.println("The product of digits is "+ product);
    }
}
