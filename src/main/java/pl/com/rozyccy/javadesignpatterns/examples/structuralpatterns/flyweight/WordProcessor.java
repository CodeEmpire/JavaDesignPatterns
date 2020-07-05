package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class WordProcessor {
    private List<Letter> letters = new ArrayList<>();

    public void addLetter(Letter letter) {
        this.letters.add(letter);
    }

    public void printLetters() {
        for (Letter letter : letters) {
            System.out.print(letter.getValue());
        }
    }
}
