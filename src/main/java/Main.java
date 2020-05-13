public class Main {

    public static void main(String[] args) {

        String message = "how are you doing today";
        int offset = 12;
        CeasarsCipher ceasarsCipher = new CeasarsCipher();

        String newMessage = ceasarsCipher.cipher(message, offset);

        System.out.println("original message: " + message);
        System.out.println("new message: " + newMessage);

    }
}
