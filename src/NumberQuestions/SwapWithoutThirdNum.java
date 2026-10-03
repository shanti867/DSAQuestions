package NumberQuestions;

public class SwapWithoutThirdNum {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The changed value of a is " + a);
        System.out.println("The changed  value of b is " + b);
    }
}
