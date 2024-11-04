package desafios.d10;

public class SentenceOperator {
    private static String[] splitWords(String sentence) {
        return sentence.split(" ");
    }

    public static String invertStringWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Word cannot be null");
        }

        else {
            //spit
            String[] words = splitWords(sentence);
            //invert

            for (int i = 0; i < words.length; i++) {
                StringBuilder sb = new StringBuilder(words[i]);
                words[i] = sb.reverse().toString();
            }

            //join
            return String.join(" ", words);
        }
    }
}
