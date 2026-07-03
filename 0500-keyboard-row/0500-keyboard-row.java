import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            String s = word.toLowerCase();
            String row = rows[rows[0].indexOf(s.charAt(0)) != -1 ? 0 :
                              rows[1].indexOf(s.charAt(0)) != -1 ? 1 : 2];

            boolean ok = true;
            for (char c : s.toCharArray())
                if (row.indexOf(c) == -1) {
                    ok = false;
                    break;
                }

            if (ok) ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}