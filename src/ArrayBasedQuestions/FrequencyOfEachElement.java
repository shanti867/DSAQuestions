package ArrayBasedQuestions;

public class FrequencyOfEachElement {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 1, 1};
        boolean[] isVisited = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(isVisited[i]){
                continue;
            }
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    isVisited[j] = true;
                }
            }
            System.out.println(arr[i] + "=" + count);
        }
    }
}
