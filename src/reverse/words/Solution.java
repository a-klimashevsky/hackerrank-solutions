package reverse.words;

import java.util.Stack;

/**
 * Created by alexk on 2/18/21.
 */
public class Solution {
    public String reverseWords(String s) {
        Stack<String> words = new Stack<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                word.append(c);
            } else if (word.length() > 0) {
                words.push(word.toString());
                word = new StringBuilder();
            }
        }

        if (word.length() > 0) {
            words.push(word.toString());
        }

        StringBuilder builder = new StringBuilder();

        while (words.size() > 1) {
            builder.append(words.pop());
            builder.append(" ");
        }
        if (!words.isEmpty()) {
            builder.append(words.pop());
        }

        return builder.toString();
    }
}
