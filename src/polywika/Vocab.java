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

    public Vocab() {

    }

    public void addNewWord(String word, String meaning, String diin) {
        unlearned.add(new Word(word, meaning, diin));
    }

    public void learnWord(Word w) {
        unlearned.remove(w);
        learned.add(w);
    }

    public String getName() {
        return name;
    }

    public void setName(String name_in) {
        name = name_in;
    }

    public ArrayList<Word> getLearned() {
        return learned;
    }

    public void setLearned(ArrayList<Word> a) {
        learned = a;
    }

    public ArrayList<Word> getUnlearned() {
        return unlearned;
    }

    public void setUnearned(ArrayList<Word> a) {
        unlearned = a;
    }
}
