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
public class CharacterContainer
{
    HashMap characterMap;

    public CharacterContainer()
    {
        this.characterMap = new HashMap<Character, Integer>();
    }
    
    public void addCount(char c)
    {
        Integer count = null;
        count = (Integer)characterMap.getOrDefault(c, 0);
        
        ++count;
        characterMap.put(c, count);
    }

    @Override
    public String toString()
    {
        return characterMap.toString();
    }
}