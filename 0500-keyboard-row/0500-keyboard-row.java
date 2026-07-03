import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for (String word : words) {
            String s = word.toLowerCase();

            if (check(s, r1) || check(s, r2) || check(s, r3))
                ans.add(word);
        }

        return ans.toArray(new String[0]);
    }

    boolean check(String s, String row) {
        for (char c : s.toCharArray())
            if (row.indexOf(c) == -1)
                return false;
        return true;
    }
}

//or

import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for (String word : words) {
            String s = word.toLowerCase();

            if (check(s, r1) || check(s, r2) || check(s, r3))
                ans.add(word);
        }

        return ans.toArray(new String[0]);
    }

    boolean check(String s, String row) {
        for (char c : s.toCharArray())
            if (row.indexOf(c) == -1)
                return false;
        return true;
    }
}
