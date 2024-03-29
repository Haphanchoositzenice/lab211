/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ROG
 */
    public class Text {
    public String normalizeText(String input) {
        String[] sentences = input.split("(?<=[.!?])\\s+");

        StringBuilder normalizedText = new StringBuilder();

        for (String sentence : sentences) {
            sentence = sentence.trim();
            if (!sentence.isEmpty()) {
                sentence = normalizeLine(sentence);
                normalizedText.append(sentence).append(" ");
            }
        }

        return normalizedText.toString().trim() + ".";
    }

    private String normalizeLine(String line) {
        line = allLowerCase(line);
        line = line.replaceAll("\\s+", " ");
        line = line.replaceAll("\\s*,\\s*", ", ");
        line = line.replaceAll("\\s*\\.\\s*", ". ");
        line = line.replaceAll("\\s*:\\s*", ": ");
        line = lowerCaseFirstCharacter(line);
        line = upperFirstCharacter(line);
        line = line.replaceAll("\\s*\"\\s*", "\"");
        return line;
    }

    private String upperFirstCharacter(String line) {
        Pattern pattern = Pattern.compile("(^|[.]\\s+|\"\\s+)([a-z])");
        Matcher matcher = pattern.matcher(line);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group(1) + matcher.group(2).toUpperCase());
        }
        matcher.appendTail(result);

        return result.toString();
    }
    private String lowerCaseFirstCharacter(String line) {
        Pattern pattern = Pattern.compile("(^|[,:]\\s+|\"\\s+)([A-Z])");
        Matcher matcher = pattern.matcher(line);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group(1) + matcher.group(2).toLowerCase());
        }
        matcher.appendTail(result);
        return result.toString();
    }
    private String allLowerCase(String line){
        return line.toLowerCase();
    }
}

