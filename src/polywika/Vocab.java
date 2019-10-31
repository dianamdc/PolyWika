/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika;

import java.util.ArrayList;

/**
 *
 * @author diana
 */
public class Vocab {

    private String name;
    private ArrayList<Word> learned;
    private ArrayList<Word> unlearned;

    public Vocab(String name_in) {
        name = name_in;
        learned = new ArrayList<>();
        unlearned = new ArrayList<>();
    }

    public void addNewWord(String word, String meaning) {
        unlearned.add(new Word(word, meaning));
    }

    public void learnWord(Word w) {

    }
}
