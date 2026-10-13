package ArrayBasedQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsTwoArrays {
    public static void main(String[] args){
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 5};

        HashSet<Integer> a1 = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            a1.add(a[i]);
        }
        HashSet<Integer> b1 = new HashSet<>();
        for(int j = 0; j < b.length; j++){
            b1.add(b[j]);
        }
        boolean found = false;
        for(int num: b1){
            if(a1.contains(num)){
                System.out.print(num+ " ");
                found = true;
            }
        }
        if(found==false){
            System.out.println("No Common Elements Found");
        }
    }
}
