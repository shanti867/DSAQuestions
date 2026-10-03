package ArrayBasedQuestions;

public class CountEvenAndOddNumbers {
    public static void main(String[] args){
        int[] arr = {10, 15, 20, 7, 8, 13};
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < arr.length; i++){
           if(arr[i] % 2 == 0){
               countEven++;
           }
           else{
               countOdd++;
           }
        }
        System.out.println("the total even numbers are " + countEven);
        System.out.println("the total odd numbers are " + countOdd);
    }
}
