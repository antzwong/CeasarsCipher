public class CeasarsCipher {


    //private static final int alphabetSize = 26;
    private static final char letterA = 'a';
    private static final char letterZ = 'z';

    public String cipher(String message, int offset) {
        message = message.toLowerCase();
        char[] messageInChar = message.toCharArray(); //takes input String into array of characters

        for (int i = 0; i < messageInChar.length; i++) {
            if (messageInChar[i] != ' ') {
                messageInChar[i] = offsetChar(messageInChar[i], offset /*, letterA, letterZ */);
            }
        }

        return new String (messageInChar);


    }

    private char offsetChar(char c, int offset /*, char letterA, char letterB */) {
        c += offset;
        if (c < letterA) {
            return (char) (c + 26);
        }

        if (c > letterZ) {
            return (char) (c - 26);
        }
        return c;
    }

}
