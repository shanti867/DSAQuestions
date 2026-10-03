package ArrayBasedQuestions;

import java.util.Arrays;

public class MoveAllZeroesToTheEnd {
    public static void main(String[] args){
//        int[] arr = {0, 10, 22, 8, 0, 5, 0};
        int[] arr  = {};
        int z = 0;
        int nz = 0;
        if(arr.length == 1 || arr.length == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        else {
            while (nz < arr.length) {
                if (arr[nz] != 0) {
                    int temp = arr[nz];
                    arr[nz] = arr[z];
                    arr[z] = temp;
                    nz++;
                    z++;
                } else {
                    nz++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
