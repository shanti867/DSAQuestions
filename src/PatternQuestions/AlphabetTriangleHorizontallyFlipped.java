package PatternQuestions;

public class AlphabetTriangleHorizontallyFlipped {
    public static void main(String[] args){
        for(char i = 'a'; i <= 'd'; i++){
            for(char j = 'a'; j <= ('d' -i +'a'); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
