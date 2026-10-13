package ArrayBasedQuestions;

public class FindLengthOfString {
    public static void main(String[] args){
        String str = "java";
        int count = 0;

        for(char ch: str.toCharArray()){
            count++;
        }
        System.out.println("The total length: " + count);
    }
}
