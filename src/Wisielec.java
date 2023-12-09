import java.util.Random;

public class Wisielec {
    static final String[] words = {"Samochód", "Smalec", "Gwóźdź"};
    char[] userCharacter;
    private String correctWord;
    Random random = new Random();
    public Wisielec(){
        correctWord = words[random.nextInt(words.length)];
        System.out.println(correctWord);
    }
}
