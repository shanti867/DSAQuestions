package PatternQuestions;

public class StarTriangleVerticallyFlipped {
    public static void main(String[] args){
//        for(int i = 1; i <= 4; i++){
//            for(int j = 1; j <= 4; j++){
//                if((i+j) > 4){
//                    System.out.print("* ");
//                }
//                else if((i+j) <= 4){
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
