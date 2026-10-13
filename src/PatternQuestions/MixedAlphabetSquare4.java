package PatternQuestions;

public class MixedAlphabetSquare4 {
    public static void main(String[] args){
        for(char i = 'A'; i <= 'D'; i++){
            for(char j = 'A'; j <= 'D'; j++){
               if(i == 'A'){
                   System.out.print('a' + " ");
               }
               else{
                   System.out.print(i + " ");
               }
            }
            System.out.println();
        }
    }
}
