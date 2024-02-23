package View;

import java.util.HashMap;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author ROG
 */
public interface IDictionaryRepository {
    void readFile(HashMap<String, String> hm);

    void addNewWord(HashMap<String, String> hm);

    void deleteWord(HashMap<String, String> hm);

    void translate(HashMap<String, String> hm);
}