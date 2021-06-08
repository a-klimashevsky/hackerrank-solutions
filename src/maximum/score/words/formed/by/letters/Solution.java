package maximum.score.words.formed.by.letters;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        int[] letterCounts = new int[256];
        for (char c : letters) {
            letterCounts[c - 'a']++;
        }

        Queue<String> w = new ArrayDeque<>();

        for (String s : words) {
            w.add(s);
        }

        return maxScore(words, 0, letterCounts, score);
    }

    private int maxScore(String[] words, int wordIndex, int[] letters, int[] scores) {
        if (words.length <= wordIndex) return 0;
        String word = words[wordIndex];
        int skipScore = maxScore(words, wordIndex + 1, Arrays.copyOf(letters, letters.length), scores);
        int score = 0;
        int[] newLetter = Arrays.copyOf(letters, letters.length);
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (newLetter[c - 'a'] > 0) {
                score += scores[c - 'a'];
                newLetter[c - 'a']--;
            } else {
                score = 0;
                break;
            }
        }
        return Math.max(skipScore,
                score + maxScore(words, wordIndex + 1, newLetter, scores));
    }
}
