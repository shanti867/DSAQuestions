package ArrayBasedQuestions;

public class FindAMissingNum {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 5};
        int n = 5;
        int expected = n * (n+1)/2;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        int missingNumber = expected - sum;
        System.out.println("The missing number is " + missingNumber);
    }
}
