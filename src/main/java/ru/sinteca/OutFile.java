package ru.sinteca;

import java.io.FileOutputStream;

public class OutFile {

    public void out(String text) {
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            out.write(text.getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

