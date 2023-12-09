import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    static final String[] words = {"samochód", "smalec", "gwóźdź"};
    List<Character> userCharacter = new ArrayList<Character>();
    private final String correctWord;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public Wisielec(){
        correctWord = words[random.nextInt(words.length)];
        do{
            EnterCharacter();
            PrintProgress();
        }while (!Check());
    }
    public void EnterCharacter(){
        System.out.println("Enter character:");
        String inputString = scanner.next();
        if (!inputString.isEmpty()) {
            char firstCharacter = inputString.charAt(0);
            userCharacter.add(firstCharacter);
        }
    }

    public void PrintProgress(){
        System.out.print("User character: ");
        for (Character character : userCharacter) {
            System.out.print(character + ", ");
        }
        System.out.println();
        for (int i = 0; i < correctWord.length(); i++) {
            char toAdd = '_';
            for (int j = 0; j < userCharacter.size(); j++) {
                if(correctWord.charAt(i)==userCharacter.get(j)){
                    toAdd = correctWord.charAt(i);
                }
            }
            System.out.print(toAdd);
        }
        System.out.println();
    }
    public boolean Check(){
        boolean isCorrect = true;

        for (int i = 0; i < correctWord.length(); i++) {
            if(!containsLetter(userCharacter, correctWord.charAt(i))){
                isCorrect = false;
            }
        }
        if(isCorrect){
            return true;
        }else {
            return false;
        }

    }
    private boolean containsLetter(List<Character> list, char target) {
        for (char element : list) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
