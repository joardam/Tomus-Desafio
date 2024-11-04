package desafios.d5;

public class VogalCounting {
    public static int countVogals(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Word cannot be null");
        }

        else {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }
    }
}
