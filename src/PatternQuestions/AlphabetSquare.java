package PatternQuestions;

public class AlphabetSquare {
    public static void main(String[] args){
        for(int i = 'A'; i <= 'D'; i++){
            for(int j = 'A' ; j <= 'D' ; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
