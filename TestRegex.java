public class TestRegex {



    public static void main(String[] args){
        String[] test =  {"coollar","coullar","escoba","puerta"};
        for(String word : test){
            System.out.println(word + "   " + word.matches("^.c.*"));

        }


    }
}