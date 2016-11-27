package pracaDomowa1;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PalindromeCheckerTest {
    @Test
    public void shouldCorrectlyRecognizePalindrome() {
        //given
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String palindromeWord = "kajak";
        //when
        boolean result = palindromeChecker.isPalindrome(palindromeWord);
        //then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void shouldCorrectlyRecognizeNonPalindrome() {
        //given
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String nonePalindromeWord = "aleksandra";
        //when
        boolean result = palindromeChecker.isPalindrome(nonePalindromeWord);
        //then
        Assertions.assertThat(result).isFalse();

    }

    @Test
    public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
        //given
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String word = "Ala";
        //when
        boolean result = palindromeChecker.isPalindrome(word);
        //then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        //given
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String emptyString = " ";
        //when
        boolean result = palindromeChecker.isPalindrome(emptyString);
        //then
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void stringContainingOnlyWhiteCharactersIsNotPalindrome() {
        //given
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String includesOnlySpacesAndTabulate = "\t \t \n";
        //when
        boolean result = palindromeChecker.isPalindrome(includesOnlySpacesAndTabulate);
        //then
        Assertions.assertThat(result).isFalse();
    }

}
