package StringQuestions;

public class AnagramsString {
    public static void main(String[] args){
        String a = "listen";
        String b = "silent";

        if(a.length() != b.length()){
            System.out.println("Not a Anagram");
        }
        else{
            char[] x = a.toCharArray();
            char[] y = b.toCharArray();

            java.util.Arrays.sort(x);
            java.util.Arrays.sort(y);

            if(java.util.Arrays.equals(x,y)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}
