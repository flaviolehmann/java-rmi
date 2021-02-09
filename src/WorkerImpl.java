import java.util.Arrays;
import java.util.stream.Collectors;

public class WorkerImpl implements Worker {

    @Override
    public Boolean isPalindrome(String s) {
        return reverse(s).equals(s);
    }

    @Override
    public String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    @Override
    public String toUpperCase(String s) {
        return s.toUpperCase();
    }

    @Override
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    @Override
    public Long getVowelCount(String s) {
        return (long) getVowelsOnly(s).length();
    }

    @Override
    public Long getConsonantCount(String s) {
        return (long) getConsonantsOnly(s).length();
    }

    @Override
    public String getVowelsOnly(String s) {
        return Arrays.stream(s.split(""))
                .filter(this::isVowel)
                .collect(Collectors.joining());
    }

    @Override
    public String getConsonantsOnly(String s) {
        return Arrays.stream(s.split(""))
                .filter(this::isConsonant)
                .collect(Collectors.joining());
    }

    private Boolean isVowel(String s) {
        String vowels = "aeiou";
        return vowels.contains( s.toLowerCase() );
    }

    private Boolean isConsonant(String s) {
        return !isVowel(s);
    }
}
