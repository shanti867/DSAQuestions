package PatternQuestions;

public class AlphabetTriangle2 {
    public static void main(String[] args){
        for(char i = 'A'; i <= 'D'; i++){
            for(char j = 'A'; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
