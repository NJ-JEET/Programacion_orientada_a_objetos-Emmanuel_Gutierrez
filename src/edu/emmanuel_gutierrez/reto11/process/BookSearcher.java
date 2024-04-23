package edu.emmanuel_gutierrez.reto11.process;

import edu.emmanuel_gutierrez.reto9.process.ContadorPalabras;

import java.util.*;
import java.util.stream.Collectors;

public class BookSearcher {
    public static long countVowels(String fileName) {
        List<String> words = getWords(fileName);
        return words.stream()
                .mapToLong(word -> word.chars()
                        .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                        .count())
                .sum();
    }

    public static List<String> startWithVowelWords(String fileName) {
        List<String> words = getWords(fileName);
        return words.stream()
                .filter(word -> "aeiouAEIOU".indexOf(word.charAt(0)) != -1)
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> oddLengthWords(String fileName) {
        List<String> words = getWords(fileName);
        return words.stream()
                .filter(word -> word.length() % 2 != 0)
                .collect(Collectors.toList());
    }

    public static String longestWord(String fileName) {
        List<String> words = getWords(fileName);
        return words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }

    public static String shortestWord(String fileName) {
        List<String> words = getWords(fileName);
        return words.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
    }

    public static boolean existsWordWithVowelStartEndAndLength(String fileName) {
        List<String> words = getWords(fileName);
        return words.stream()
                .anyMatch(word -> "aeiouAEIOU".indexOf(word.charAt(0)) != -1 &&
                        "aeiouAEIOU".indexOf(word.charAt(word.length() - 1)) != -1 &&
                        word.length() >= 5);
    }

    private static List<String> getWords(String fileName) {
        return ContadorPalabras.contarPalabras(fileName).stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
