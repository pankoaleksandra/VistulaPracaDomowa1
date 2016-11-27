package pracaDomowa1;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        if (word.trim().equals("")) {
            return false;
        }

        StringBuffer buffer = new StringBuffer(word);
        String reversedWord = buffer.reverse().toString();

        String wordLowerCase = word.toLowerCase();
        String reversedWordLowerCase = reversedWord.toLowerCase();

        boolean result = wordLowerCase.equals(reversedWordLowerCase);
        return result;
    }
}
