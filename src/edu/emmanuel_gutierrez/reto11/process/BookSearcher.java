package edu.emmanuel_gutierrez.reto11.process;

import edu.emmanuel_gutierrez.reto9.process.ContadorPalabras;

import java.text.Normalizer;
import java.util.*;
import java.util.stream.Collectors;

public class BookSearcher {
    // Método para contar las vocales en una lista de palabras
    public static long countVowels(List<String> words) {
        long vowelCount = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                // Verificar si el carácter es una vocal, incluyendo vocales acentuadas
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'á' || ch == 'é' || ch == 'í' || ch == 'ó' || ch == 'ú') {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }

    public static List<String> startWithVowelWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>();
        return words.stream()
                .filter(word -> {
                    char firstChar = Character.toLowerCase(word.charAt(0));
                    return "aeiouáéíóú".indexOf(firstChar) != -1 && uniqueWords.add(word.toLowerCase());
                })
                .collect(Collectors.toList());
    }


    public static List<String> oddLengthWords(List<String> words) {
        return words.stream()
                .filter(word -> word.length() % 2 != 0) // Filtrar palabras con longitud impar
                .collect(Collectors.toList());
    }


    public static String longestWord(List<String> words) {
        if (words.isEmpty()) {
            return null; // O devuelve un valor predeterminado específico si lo prefieres
        }

        return words.stream()
                .max(Comparator.comparingInt(String::length)) // Comparar la longitud de las palabras
                .orElse(null);
    }


    public static String shortestWord(List<String> words) {
        return words.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
    }


    public static boolean existsWordWithVowelStartEndAndLength(List<String> words) {
        return words.stream()
                .anyMatch(word -> {
                    // Convertir la palabra a minúsculas para comparaciones sin distinción entre mayúsculas y minúsculas
                    String lowercaseWord = word.toLowerCase();
                    // Verificar si la palabra comienza y termina con una vocal y tiene una longitud mínima de 5 caracteres
                    return lowercaseWord.matches("^[aeiouáéíóú].*[aeiouáéíóú]$") && lowercaseWord.length() >= 5;
                });
    }

    public static boolean isPalindrome(String word){
        // Eliminar caracteres especiales, acentos y convertir a minúsculas
        String normalizedWord = Normalizer.normalize(word, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();
        // Comparar la palabra con su reverso
        return normalizedWord.equals(new StringBuilder(normalizedWord).reverse().toString());
    }

    private static List<String> getWords(String fileName) {
        return ContadorPalabras.contarPalabras(fileName).stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
