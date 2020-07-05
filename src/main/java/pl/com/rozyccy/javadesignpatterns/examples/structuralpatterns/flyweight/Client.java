package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.flyweight;

public class Client {
    public static void main(String[] args) {
        WordProcessor processor = new WordProcessor();

        String textToAdd = "Hello I'm aaaa wwwworddd processorrrrr";
        int length = textToAdd.length();

        LetterFactory factory = new LetterFactory();

        for (int i = 0; i < length; i++) {
            String value = textToAdd.substring(i, i+1);
            processor.addLetter(factory.createLetter(value));
        }

        processor.printLetters();
    }
}
