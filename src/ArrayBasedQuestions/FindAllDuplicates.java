package ArrayBasedQuestions;

public class FindAllDuplicates {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 4, 4, 5, 2, 3, 1};
        boolean[] isVisited = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(isVisited[i]){
                continue;
            }
            int count = 1;
            for(int j = i +1; j < arr.length; j++){
                if(arr[i] == arr[j] && isVisited[j] == false){
                    count++;
                    isVisited[j] = true;
                }
            }
            if(count > 1){
                System.out.println(arr[i]);
            }
        }
    }
}
