package StringQuestions;

public class CountUpperLowerChar {
    public static void main(String[] args){
        String str =  "JavaDeveloper";
        int upper = 0;
        int lower = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                lower++;
            }
        }
        System.out.println("UpperCase " + upper);
        System.out.println("LowerCase " + lower);
    }
}
