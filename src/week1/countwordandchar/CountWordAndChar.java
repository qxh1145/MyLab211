/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.countwordandchar;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author knigh
 */
public class CountWordAndChar {
    String inputString;
    private int countWord;
    Map<String, Integer> numOfWord;
    Map<Character, Integer> numOfChar;

    public CountWordAndChar(String inputString) {
        this.inputString = inputString;
        this.numOfChar = new HashMap<>();
        this.numOfWord = new HashMap<>();
        processInput();
    }
    private void processInput(){
        StringTokenizer tokenizer = new StringTokenizer(inputString, "");
        String word = tokenizer.nextToken();
        while (tokenizer.hasMoreTokens()){
            numOfWord.put(word, numOfWord.getOrDefault(word, 0) + 1);
        }
        for (char c : inputString.replaceAll("\\s", "").toCharArray()){
            numOfChar.put(c, numOfChar.getOrDefault(c,0) + 1);
        }
    }


    public Map<String, Integer> getNumOfWord() {
        return numOfWord;
    }

    public Map<Character, Integer> getNumOfChar() {
        return numOfChar;
    }

    @Override
    public String toString() {
        return  getNumOfWord() + "\n" +
                 getNumOfChar() + "\n";
    }
}
