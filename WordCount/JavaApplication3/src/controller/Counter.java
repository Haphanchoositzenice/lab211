/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.StringTokenizer;
import model.CharacterContainer;
import model.LetterContainer;

/**
 *
 * @author coi12
 */
public class Counter
{

    private String str;
    CharacterContainer characterContainer;
    LetterContainer letterContainer;

    public Counter(String str)
    {
        this.str = str;
        this.characterContainer = new CharacterContainer();
        this.letterContainer = new LetterContainer();
    }

    public void count()
    {
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens())
        {
            String word = st.nextToken();
            if (countCharacter(word))
            {
                countLetter(word);
            }           
        }
    }

    public void countLetter(String word)
    {
        letterContainer.addCount(word);
    }
  
    public boolean countCharacter(String word)
    {
        boolean isFound = false; 
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);        
            if (Character.isLetter(c))
            {
                isFound = true;
                characterContainer.addCount(c);
            }
        }
        
        return isFound;
    }
    
    public String getCharacterCount()
    {
        return characterContainer.toString();
    }
    
    public String getLetterCount()
    {
        return letterContainer.toString();
    }

}
