package NumberQuestions;

public class ArmStrongNumber {
    public static void main(String[] args){
        int number = 1634;
        int temp = number;
        int temp2 = number;
        int digits = 0;

        while(temp > 0){
            digits++;
            temp = temp/10;
        }
//        System.out.println(digits);

        int sum = 0;
        while(temp2 > 0){
            int rem = temp2  % 10;
            int power = 1;
            for(int i = 1; i <= digits; i++){
                power = power * rem;
            }
            sum = sum + power;
            temp2 = temp2 / 10;
        }
        if(sum == number){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
