package it.unipd.mtss;

public class RomanPrinter {
    public static String printAsciiArt(String roman) {
        String res = "";

        for (int i = 0; i < getNumber('I').length; i++) {
            for (int j = 0; j < roman.length(); j++) {
                res += getNumber(roman.charAt(j))[i];
            }
            res += "\n";
        }

        return res;
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    public static String[] getNumber(char ch) {
        switch (ch) {
            case 'I': return "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|".split("\n");
            case 'V': return " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    ".split("\n");
            case 'X': return " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\".split("\n");
            case 'L': return "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|".split("\n");
            case 'C': return "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|".split("\n");
            case 'D': return "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ ".split("\n");
            case 'M': return "  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|".split("\n");
            default:
                System.err.println(ch);
                throw new IllegalArgumentException();
        }
    }
}