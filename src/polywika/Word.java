/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika;

/**
 *
 * @author diana
 */
public class Word {

    private final String word;
    private final String meaning;
    private int[] guesses; //0 = correct, 1 = wrong

    public Word(String word_in, String meaning_in) {
        word = word_in;
        meaning = meaning_in;
        guesses = new int[2];
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void addGuess(boolean guess) { //0 = correct, 1 = wrong
        if (guess) guesses[1]++;
        else guesses[0]++;
    }
}
