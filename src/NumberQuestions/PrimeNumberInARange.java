package NumberQuestions;

public class PrimeNumberInARange {
    public static void main(String[] args){
        int start = 1;
        int end = 100;

        for(int i = 1; i <= 100; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i %j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
