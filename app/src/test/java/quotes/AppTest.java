/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testJSONFileParsing() {
        try {
            Gson gson = new Gson();
            Quote[] quoteArray = gson.fromJson(new FileReader("src/main/resources/recentQuotes.json"), Quote[].class);
            List<Quote> quotes = Arrays.asList(quoteArray);

            assertNotNull(quotes);
            assertFalse(quotes.isEmpty());
            assertEquals(138, quotes.size());

            Quote firstQuote = quotes.get(0);
            assertEquals("I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.", firstQuote.getText());
            assertEquals("Marilyn Monroe", firstQuote.getAuthor());
        }catch(IOException e){
          e.printStackTrace();
        }
    }


    @Test
    public void testRandomQuoteSelection() {
        List<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote("I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.", "Marilyn Monroe"));
        quotes.add(new Quote("Ask no questions, and you'll be told no lies.", "Charles Dickens"));

        Random random = new Random();
        int index = random.nextInt(quotes.size());
        Quote selectedQuote = quotes.get(index);

        assertNotNull(selectedQuote);
        assertTrue(quotes.contains(selectedQuote));
    }

    }










