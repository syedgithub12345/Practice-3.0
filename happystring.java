import java.util.ArrayList;
import java.util.List;

class happystring {
    public String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        backtrack(n, "", happyStrings);
        return k <= happyStrings.size() ? happyStrings.get(k - 1) : "";
    }
    
    private void backtrack(int n, String current, List<String> happyStrings) {
        if (current.length() == n) {
            happyStrings.add(current);
            return;
        }
        
        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (current.isEmpty() || current.charAt(current.length() - 1) != ch) {
                backtrack(n, current + ch, happyStrings);
            }
        }
    }
}