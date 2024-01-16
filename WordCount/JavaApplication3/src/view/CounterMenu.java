/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Counter;
import validation.validation;

/**
 *
 * @author coi12
 */
public class CounterMenu extends Menu
{

    public CounterMenu(String title, String[] options)
    {
        super(title, options);
    }
    
    @Override
    protected void execute(int n)
    {
        String str = validation.getString("Enter your content");
        Counter counter = new Counter(str);
        counter.count();
        
        System.out.println(counter.getLetterCount());
        System.out.println(counter.getCharacterCount());
    }
    
}