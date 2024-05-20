package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    static RomanPrinter printer;

    @Test
    public void testPrintI() {
        int arabic_number = 1;
        String expected = "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n";

        String ascii_art_for_I = RomanPrinter.print(arabic_number);

        assertEquals(expected, ascii_art_for_I);
    }

    @Test
    public void testPrintV() {
        int arabic_number = 5;
        String expected = " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n";

        String ascii_art_for_V = RomanPrinter.print(arabic_number);

        assertEquals(expected, ascii_art_for_V);
    }

    @Test
    public void testPrintX() {
        int arabic_number = 10;
        String expected = " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n";

        String ascii_art_for_X = RomanPrinter.print(arabic_number);

        assertEquals(expected, ascii_art_for_X);
    }

    @Test
    public void testPrintL() {
        int arabic_number = 50;
        String expected = "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n";

        String ascii_art_for_L = RomanPrinter.print(arabic_number);

        assertEquals(expected, ascii_art_for_L);
    }

    @Test
    public void testPrintC() {
        int arabic_number = 100;
        String expected = "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n";

        String ascii_art_for_C = RomanPrinter.print(arabic_number);

        assertEquals(expected, ascii_art_for_C);
    }

    @Test
    public void testPrintD() {
        int arabic_number = 500;
        String expected = "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n";

        String ascii_art_for_D = RomanPrinter.print(arabic_number);

        assertEquals(expected, ascii_art_for_D);
    }

    @Test
    public void testPrintM() {
        int arabic_number = 1000;
        String expected = "  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n";

        String ascii_art_for_M = RomanPrinter.print(arabic_number);

        assertEquals(expected, ascii_art_for_M);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberZeroAsciiArt() {
        int arabic_number = 0;
        String expected = "";

        String ascii_art_for_zero = RomanPrinter.print(arabic_number);

        assertEquals(expected, ascii_art_for_zero);
    }
}