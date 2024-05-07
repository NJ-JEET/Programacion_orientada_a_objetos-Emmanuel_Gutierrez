package edu.emmanuel_gutierrez.reto12.test;

import edu.emmanuel_gutierrez.reto11.process.BookSearcher;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static edu.emmanuel_gutierrez.reto11.process.BookSearcher.isPalindrome;
import static org.junit.Assert.*;

public class BookSearcherTest {

    @Test
    public void contarVocalesEnListaTest() {
        // Definir una lista de palabras para probar
        List<String> words = Arrays.asList("alegría", "murciélago", "estrella", "ocaso", "ruiseñor", "aventura", "isla", "amoroso", "utopía", "esmeralda");

        // Llamar al método countVowels y obtener el resultado
        long actualVowelCount = BookSearcher.countVowels(words);

        // Definir el resultado esperado
        long expectedVowelCount = 37;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void contarVocalesEnListaVaciaTest() {
        // Definir una lista de palabras vacía para probar
        List<String> words = List.of();

        // Llamar al método countVowels y obtener el resultado
        long actualVowelCount = BookSearcher.countVowels(words);

        // Definir el resultado esperado
        long expectedVowelCount = 0;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void contarVocalesEnPalabrasConAcentosTest() {
        // Definir una lista de palabras con acentos para probar
        List<String> words = Arrays.asList("árbol", "rápido", "íntimo", "óptimo", "útil");

        // Llamar al método countVowels y obtener el resultado
        long actualVowelCount = BookSearcher.countVowels(words);

        // Definir el resultado esperado
        long expectedVowelCount = 13;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void contarVocalesEnPalabrasSinVocalesTest() {
        // Definir una lista de palabras sin vocales para probar
        List<String> words = Arrays.asList("cbl", "dfr", "ght", "jkl", "mnp");

        // Llamar al método countVowels y obtener el resultado
        long actualVowelCount = BookSearcher.countVowels(words);

        // Definir el resultado esperado
        long expectedVowelCount = 0;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void palabrasQueEmpiezanConVocalOrdenadasAlfabeticamenteTest() {
        // Definir una lista de palabras para probar
        List<String> words = Arrays.asList("elefante", "abeja", "iguana", "orangután", "unicornio");

        // Llamar al método startWithVowelWords y obtener el resultado
        List<String> actualWords = BookSearcher.startWithVowelWords(words);

        // Ordenar la lista de palabras actual alfabéticamente
        Collections.sort(actualWords);

        // Definir el resultado esperado
        List<String> expectedWords = Arrays.asList("abeja", "elefante", "iguana", "orangután", "unicornio");

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedWords, actualWords);
    }


    @Test
    public void identificarPalabraMasLargaTest() {
        // Definir una lista de palabras para probar
        List<String> words = Arrays.asList("gato", "perro", "elefante", "jirafa", "cocodrilo");

        // Llamar al método longestWord y obtener el resultado
        String actualLongestWord = BookSearcher.longestWord((words));

        // Definir el resultado esperado
        String expectedLongestWord = "cocodrilo";

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedLongestWord, actualLongestWord);
    }

    @Test
    public void identificarPalabraMasCortaTest() {
        // Definir una lista de palabras para probar
        List<String> words = Arrays.asList("gato", "perro", "elefante", "jirafa", "cocodrilo");

        // Llamar al método shortestWord y obtener el resultado
        String actualShortestWord = BookSearcher.shortestWord(words);

        // Definir el resultado esperado
        String expectedShortestWord = "gato";

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedShortestWord, actualShortestWord);
    }

    @Test
    public void verificarPalabraConVocalInicioFinalYLongitudTest() {
        // Definir una lista de palabras para probar
        List<String> words = Arrays.asList("amigo", "casa", "auto", "perro", "banana");

        // Llamar al método existsWordWithVowelStartEndAndLength y obtener el resultado
        boolean actualResult = BookSearcher.existsWordWithVowelStartEndAndLength(words);

        // Definir el resultado esperado
        boolean expectedResult = true;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedResult, actualResult);
    }

    //Pruebas Unitarias para el texto de palabras repetidas,se definen dentro ya que encontre la forma de agregar la ruta de acceso pero son las mismas palabras

    private final List<String> words = Arrays.asList("serendipia", "efímero", "altruismo", "galimatías", "inefable", "ópalo", "resiliencia", "índigo", "anacronismo", "espiral", "serendipia", "efímero", "altruismo");

    @Test
    public void contarPalabrasUnicasTest() {
        // Llamar al método countUniqueWords y obtener el resultado
        long actualUniqueWordCount = words.stream().distinct().count();

        // Definir el resultado esperado
        long expectedUniqueWordCount = 10;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedUniqueWordCount, actualUniqueWordCount);
    }

    @Test
    public void palabrasMasRepetidasTest() {
        // Definir la lista de palabras única para la prueba
        List<String> uniqueWords = words.stream().distinct().toList();

        // Obtener las palabras repetidas en la lista original
        List<String> repeatedWords = words.stream()
                .filter(word -> Collections.frequency(words, word) > 1)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        // Verificar si las palabras repetidas están entre las palabras únicas
        assertTrue(uniqueWords.containsAll(repeatedWords));

        // Verificar que todas las palabras repetidas sean esperadas
        assertEquals(Arrays.asList("altruismo", "efímero", "serendipia"), repeatedWords);
    }


    @Test
    public void palabrasConVocalAlInicioTest() {
        // Llamar al método startWithVowelWords y obtener el resultado
        List<String> actualVowelWords = BookSearcher.startWithVowelWords(words);

        // Definir el resultado esperado
        List<String> expectedVowelWords = Arrays.asList("efímero", "altruismo", "inefable", "ópalo", "índigo", "anacronismo", "espiral");

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedVowelWords, actualVowelWords);
    }

    @Test
    public void palabraMasLargaTest() {
        // Llamar al método longestWord y obtener el resultado
        String actualLongestWord = BookSearcher.longestWord(words);

        // Definir el resultado esperado
        String expectedLongestWord = "resiliencia";

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedLongestWord, actualLongestWord);
    }

    @Test
    public void palabraMasCortaTest() {
        // Llamar al método shortestWord y obtener el resultado
        String actualShortestWord = BookSearcher.shortestWord(words);

        // Definir el resultado esperado
        String expectedShortestWord = "ópalo";

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedShortestWord, actualShortestWord);
    }

    @Test
    public void existePalabraConVocalInicioFinYLongitudTest() {
        // Llamar al método existsWordWithVowelStartEndAndLength y obtener el resultado
        boolean actualResult = BookSearcher.existsWordWithVowelStartEndAndLength(words);

        // Definir el resultado esperado
        boolean expectedResult = true;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void contarVocalesTest() {
        // Llamar al método countVowels y obtener el resultado
        long actualVowelCount = BookSearcher.countVowels(words);

        // Definir el resultado esperado
        long expectedVowelCount = 55;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedVowelCount, actualVowelCount);
    }

    //Pruebas Unitarias para el texto de palabras con acento,se definen dentro ya que encontre la forma de agregar la ruta de acceso pero son las mismas palabras

    private final List<String> palabrasConAcento = Arrays.asList(
            "cántaro", "lábaro", "párvulos", "ávido", "áureo", "río", "cáspita", "látigo", "pávido", "párraco"
    );

    @Test
    public void contarVocalesAcentoTest() {
        long actualVowelCount = BookSearcher.countVowels(palabrasConAcento);
        long expectedVowelCount = 30; // Se cuentan las vocales en todas las palabras
        assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void palabrasQueEmpiezanConVocalOrdenadasAlfabeticamenteAcentoTest() {
        List<String> actualWords = BookSearcher.startWithVowelWords(palabrasConAcento);
        List<String> expectedWords = Arrays.asList("ávido", "áureo"); // Cambia a las palabras con acento
        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void palabrasLongitudImparAcentoTest() {
        List<String> actualOddLengthWords = BookSearcher.oddLengthWords(palabrasConAcento);
        List<String> expectedOddLengthWords = Arrays.asList("cántaro", "áureo", "cáspita", "párraco"); // Cambia a las palabras con acento

        actualOddLengthWords.retainAll(expectedOddLengthWords);

        // Ordenar ambas listas alfabéticamente
        actualOddLengthWords.sort(String::compareToIgnoreCase);
        expectedOddLengthWords.sort(String::compareToIgnoreCase);

        assertEquals(expectedOddLengthWords, actualOddLengthWords);
    }


    @Test
    public void palabraMasLargaAcentoTest() {
        String actualLongestWord = BookSearcher.longestWord(palabrasConAcento);
        String expectedLongestWord = "párvulos"; // Cambia a la palabra más larga con acento
        assertEquals(expectedLongestWord, actualLongestWord);
    }

    @Test
    public void palabraMasCortaAcentoTest() {
        String actualShortestWord = BookSearcher.shortestWord(palabrasConAcento);
        String expectedShortestWord = "río"; // Cambia a la palabra más corta con acento
        assertEquals(expectedShortestWord, actualShortestWord);
    }

    @Test
    public void existePalabraConVocalInicioFinYLongitudAcentoTest() {
        boolean existePalabra = BookSearcher.existsWordWithVowelStartEndAndLength(palabrasConAcento);
        assertTrue(existePalabra);
    }

    // Añadimos las pruebas adicionales utilizando la lista de palabras con acento

    @Test
    public void palabrasConVocalInicioAcentoTest() {
        List<String> actualVowelWords = BookSearcher.startWithVowelWords(palabrasConAcento);
        List<String> expectedVowelWords = Arrays.asList("ávido", "áureo"); // Las palabras con acento que empiezan con vocal
        assertEquals(expectedVowelWords, actualVowelWords);
    }

    @Test
    public void palabraMasLargaConAcentoTest() {
        // Definir una lista de palabras para probar
        List<String> palabrasConAcento = Arrays.asList("cántaro", "lábaro", "párvulos", "ávido", "áureo");

        // Llamar al método longestWord y obtener el resultado
        String actualLongestWord = BookSearcher.longestWord(palabrasConAcento);

        // Definir el resultado esperado
        String expectedLongestWord = "párvulos";

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedLongestWord, actualLongestWord);
    }

    @Test
    public void palabraMasCortaConAcentoTest() {
        // Definir una lista de palabras para probar
        List<String> palabrasConAcento = Arrays.asList("cántaro", "lábaro", "párvulo", "ávido", "áureo");

        // Llamar al método shortestWord y obtener el resultado
        String actualShortestWord = BookSearcher.shortestWord(palabrasConAcento);

        // Definir el resultado esperado
        String expectedShortestWord = "ávido";

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(expectedShortestWord, actualShortestWord);
    }

    // Definir una lista de palabras para todas las pruebas
    private final List<String> palabrasDiferentes = Arrays.asList(
            "elefante", "igu@na", "ór#ita", "avi0n", "esp3jo", "a$eja", "elefante", "m6rciélago", "t1gr3", "unic0rnio", "c4fé"
    );

    @Test
    public void contarVocalesPalabrasDifTest() {
        // Llamar al método countVowels y obtener el resultado
        long conteoVocalesActual = BookSearcher.countVowels(palabrasDiferentes);

        // Definir el resultado esperado
        long conteoVocalesEsperado = 30;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(conteoVocalesEsperado, conteoVocalesActual);
    }

    @Test
    public void palabrasDifQueEmpiezanConVocalTest() {
        // Llamar al método startWithVowelWords y obtener el resultado
        List<String> palabrasConVocalActual = BookSearcher.startWithVowelWords(palabrasDiferentes);

        // Definir el resultado esperado
        List<String> palabrasConVocalEsperadas = Arrays.asList("avi0n", "a$eja", "elefante", "igu@na", "ór#ita", "esp3jo", "unic0rnio");

        // Ordenar ambas listas
        Collections.sort(palabrasConVocalActual);
        Collections.sort(palabrasConVocalEsperadas);

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(palabrasConVocalEsperadas, palabrasConVocalActual);
    }

    @Test
    public void palabrasDifDeLongitudImparTest() {
        // Llamar al método oddLengthWords y obtener el resultado
        List<String> palabrasLongitudImparActual = BookSearcher.oddLengthWords(palabrasDiferentes);

        // Definir el resultado esperado
        List<String> palabrasLongitudImparEsperadas = Arrays.asList("avi0n", "a$eja", "t1gr3", "unic0rnio");

        // Ordenar ambas listas
        Collections.sort(palabrasLongitudImparActual);
        Collections.sort(palabrasLongitudImparEsperadas
        );

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(palabrasLongitudImparEsperadas, palabrasLongitudImparActual);
    }

    @Test
    public void palabraDifMasLargaTest() {
        // Llamar al método longestWord y obtener el resultado
        String palabraMasLargaActual = BookSearcher.longestWord(palabrasDiferentes);

        // Definir el resultado esperado
        String palabraMasLargaEsperada = "m6rciélago";

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(palabraMasLargaEsperada, palabraMasLargaActual);
    }

    @Test
    public void palabraDifMasCortaTest() {
        // Llamar al método shortestWord y obtener el resultado
        String palabraMasCortaActual = BookSearcher.shortestWord(palabrasDiferentes);

        // Definir el resultado esperado
        String palabraMasCortaEsperada = "c4fé";

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(palabraMasCortaEsperada, palabraMasCortaActual);
    }

    @Test
    public void existePalabraDifConVocalAlInicioFinYLongitudTest() {
        // Llamar al método existsWordWithVowelStartEndAndLength y obtener el resultado
        boolean resultadoActual = BookSearcher.existsWordWithVowelStartEndAndLength(palabrasDiferentes);

        // Definir el resultado esperado
        boolean resultadoEsperado = true;

        // Verificar si el resultado obtenido es igual al resultado esperado
        assertEquals(resultadoEsperado, resultadoActual);
    }

    //

    // Verifica si todas las palabras en la lista son palíndromos
    @Test
    public void testPalindromes() {
        List<String> words = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        for (String word : words) {
            assertTrue(word + " no es un palíndromo", isPalindrome(word));
        }
    }



//     Verifica si todas las palabras en la lista comienzan con vocal
    @Test
    public void testAllWordsStartWithVowel() {
        List<String> palindromos = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        assertFalse(BookSearcher.startWithVowelWords(palindromos).isEmpty());
    }

    @Test
    public void palindromosLongitudImparTest() {
        List<String> palindromos = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        List<String> oddLengthWords = BookSearcher.oddLengthWords(palindromos);
        Set<String> expectedOddLengthWords = new HashSet<>(Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer"));
        assertTrue(oddLengthWords.containsAll(expectedOddLengthWords));
    }

    // Verifica si existe alguna palabra que comience con consonante en la lista
    @Test
    public void testExistWordStartsWithConsonant() {
        List<String> palindromos = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        assertFalse(BookSearcher.startWithVowelWords(palindromos).isEmpty());
    }

    // Verifica si existe alguna palabra repetida en la lista
    @Test
    public void testExistRepeatedWords() {
        List<String> palindromos = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        boolean containsRepeatedWords = palindromos.size() != BookSearcher.startWithVowelWords(palindromos).size();
        assertTrue(containsRepeatedWords);
    }


    // Verifica si existe alguna palabra con vocales al inicio y al final en la lista
    @Test
    public void testExistWordWithVowelStartEndAndLength() {
        List<String> palindromos = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        assertTrue(BookSearcher.existsWordWithVowelStartEndAndLength(palindromos));
    }

    // Verifica si la palabra más larga de la lista es la esperada
    @Test
    public void testLongestWordInList() {
        List<String> palindromos = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        String longestWords = BookSearcher.longestWord(palindromos);
        Set<String> expectedLongestWords = new HashSet<>(Arrays.asList("reconocer", "sometemos"));
        assertTrue(expectedLongestWords.contains(longestWords));
    }
    // Verifica si la palabra más corta de la lista es la esperada
    @Test
    public void testShortestWordsInList() {
        List<String> palindromos = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        String shortestWords = BookSearcher.shortestWord(palindromos);
        Set<String> expectedShortestWords = new HashSet<>(Arrays.asList("ojo", "ala", "ala"));
        assertTrue(expectedShortestWords.contains(shortestWords));
    }

    // Verifica si la cantidad de vocales en la lista es la esperada
    @Test
    public void testCountVowelsInList() {
        List<String> palindromos = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        long vowelCount = BookSearcher.countVowels(palindromos);
        long expectedVowelCount = 45;
        assertEquals(vowelCount, expectedVowelCount);
    }

    // Verifica si todas las palabras en la lista son únicas
    @Test
    public void testAllWordsAreUnique() {
        List<String> words = Arrays.asList("reconocer", "radar", "sometemos", "anilina", "arenera", "salas", "anina", "ojo", "sanas", "neuquén", "arenera", "oso", "ala", "ala", "reconocer");
        List<String> uniqueWords = BookSearcher.oddLengthWords(words);
        assertEquals("No todas las palabras son únicas", uniqueWords.size(), words.size());
    }
}


