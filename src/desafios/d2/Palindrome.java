package desafios.d2;

public class Palindrome {

    public static boolean isPalindromeMethod1(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Word cannot be null");
        }

        else {
            String reversedWord = new StringBuilder(word).reverse().toString();
            return word.equals(reversedWord);
        }
    }


    public static boolean isPalindromeMethod2(String word){
        if (word == null) {
            throw new IllegalArgumentException("Word cannot be null");
        }

        else {
            int i = 0;
            int j = word.length() - 1;
            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }

}
