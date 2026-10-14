package PatternQuestions;

public class Pyramid {
    public static void main(String[] args){
        //My first method - 1
//        for(int i = 1; i <= 4; i++){
//            for(int j = 1; j <= 4 - i; j++){
//                System.out.print("  ");
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print("* ");
//            }
//            for(int l = 1; l <= i-1; l++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //MY Second Method - 2
//        for(int i =  1; i <= 4; i++){
//            for(int j = 1; j <= 4-i; j++){
//                System.out.print("  ");
//            }
//            for(int k = 1; k <= 2*i-1; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//       }

        int n = 5;
        int  nsp = n-1;
        int nst = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print("  ");
            }
            for(int k = 1;k  <= nst; k++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }

    }
}
