package toptal.ii;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public String solution(String S) {
        List<Bucket> numbers = new ArrayList<>();
        numbers.add(new Bucket());
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                Bucket b;
                if (numbers.get(numbers.size() - 1).chars.size() == 3) {
                    b = new Bucket();
                    numbers.add(b);
                } else {
                    b = numbers.get(numbers.size() - 1);
                }
                b.chars.add(c);
            }
        }

        Bucket last = numbers.get(numbers.size() - 1);
        if (last.chars.size() == 1) {
            Bucket prev = numbers.get(numbers.size() - 2);
            last.chars.add(0, prev.chars.remove(2));
        }

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < numbers.size(); i++) {
            for (Character c : numbers.get(i).chars) {
                result.append(c);
            }

            if (i != numbers.size() - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }

    private class Bucket {
        List<Character> chars = new ArrayList<>();
    }
}
