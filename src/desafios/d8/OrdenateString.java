package desafios.d8;

public class OrdenateString {

    private static String[] splitWords(String sentence) {
        return sentence.split(" ");
    }


    public static String alphabeticOrder(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Word cannot be null");
        }

        else {
            //spit
            String[] words = splitWords(sentence);
            //sort
            java.util.Arrays.sort(words);
            //join
            return String.join(" ", words);


        }
    }
}
