package NumberQuestions;

public class isPrime {
    public static void main(String[] args){
        int number = 5;
        boolean isPrime = true;

        for(int i = 2; i < number ; i++){
         if(number % i == 0){
             isPrime = false;
             break;
         }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
