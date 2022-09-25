import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String word = "level";
        int i = 0;

        boolean test = isPalindrome(word);

        System.out.println(test);
    }

    private static boolean isPalindrome(String word) {
        List<String> wordSplit = new ArrayList<>();
        char[] wordChar = word.toCharArray();
        for (int i = 0; i<wordChar.length;i++){
           wordSplit.add(word.substring(i,i+1));
        }
        String proverka = "";
        for (int i= 0;i<wordSplit.size();i++){
            proverka += wordSplit.get(wordSplit.size()-(i+1));
        }
        boolean compare = false;

        if (word.equalsIgnoreCase(proverka)){
            compare = true;
        }
        return compare;

    }
}
