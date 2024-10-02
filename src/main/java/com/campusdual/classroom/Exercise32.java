package com.campusdual.classroom;

import com.campusdual.util.Utils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise32 {

    public static void main(String[] args) {

        String textToSave = generateStringToSave(null);
        printToFile(textToSave);
    }

    public static String generateStringToSave(String string) {
        if (string == null) {
            return generateUserInputToSave();
        } else {
            return string;
        }
    }

    private static String generateUserInputToSave() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String input;
        while (!(input = Utils.string()).isEmpty()) {
            sb.append(input).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {
        String filePath = "src/main/resources/data.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
