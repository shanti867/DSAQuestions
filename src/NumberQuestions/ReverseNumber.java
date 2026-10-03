package NumberQuestions;

public class ReverseNumber {
    public static void main(String[] args){
        int number = 1234;
        int temp = number;
        int reverse = 0;
        while (temp > 0){
            int rem = temp % 10;
            reverse = reverse*10 + rem;
            temp = temp/10;

        }
        System.out.println(reverse);
    }
}
