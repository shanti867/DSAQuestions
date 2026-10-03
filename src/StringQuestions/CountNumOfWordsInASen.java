package StringQuestions;

public class CountNumOfWordsInASen {
    public static void main(String[] args){

        String str = "Java is easy to learn";
        int count = 0;
        boolean inwords = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' && inwords == false){
                count++;
                inwords =  true;
            }
            if(str.charAt(i) == ' '){
                inwords = false;
            }
        }
        System.out.println("No. of words "+ count);
    }
}
