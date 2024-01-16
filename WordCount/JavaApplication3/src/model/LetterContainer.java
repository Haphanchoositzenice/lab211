/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;

/**
 *
 * @author coi12
 */
public class LetterContainer
{
    HashMap letterMap;

    public LetterContainer()
    {
        this.letterMap = new HashMap<String, Integer>();
    }
    
    public void addCount(String word)
    {
        Integer count = null;
        count = (Integer)letterMap.getOrDefault(word, 0);
        
        ++count;
        letterMap.put(word, count);
    }

    @Override
    public String toString()
    {
        return letterMap.toString();
    }
    
    
}