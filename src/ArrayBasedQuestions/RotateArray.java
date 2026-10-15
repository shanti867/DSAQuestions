package ArrayBasedQuestions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {6, 8, 1, 2, 4, 9, 0};
        int d = 3;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] =  arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return  arr;
    }
}
