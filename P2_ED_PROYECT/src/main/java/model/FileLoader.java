/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileLoader {

    public Map<String, String[]> loadQuestionsAndAnswers(String questionsFile, String answersFile) throws IOException {
        Map<String, String[]> data = new HashMap<>();

        try (BufferedReader questionReader = new BufferedReader(new FileReader(questionsFile));
             BufferedReader answerReader = new BufferedReader(new FileReader(answersFile))) {

            String questionLine;
            while ((questionLine = questionReader.readLine()) != null) {
                String[] answerData = answerReader.readLine().split(" ");
                data.put(questionLine, answerData);
            }
        }

        return data;
    }
}