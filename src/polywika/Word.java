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

    private String word;
    private String meaning;
    private String diin; //pronounciation
    private String type;
    private int[] guesses; //0 = correct, 1 = wrong

    public Word(String word_in, String meaning_in, String diin_in, String type_in) {
        word = word_in;
        meaning = meaning_in;
        diin = diin_in;
        type = type_in;
        guesses = new int[2];
    }

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getDiin() {
        return diin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type_in) {
        type = type_in;
    }

    public void setDiin(String diin_in) {
        diin = diin_in;
    }

    public void setWord(String word_in) {
        word = word_in;
    }

    public void setMeaning(String meaning_in) {
        meaning = meaning_in;
    }

    public int[] getGuesses() {
        return guesses;
    }

    public void setGuesses(int[] i) {
        guesses = i;
    }

    public void addGuess(boolean guess) { //0 = correct, 1 = wrong
        if (guess) guesses[1]++;
        else guesses[0]++;
    }
}

//comment
