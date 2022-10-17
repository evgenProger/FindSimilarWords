package ru.sinteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private List<String> first = new ArrayList<>();
    private List<String> second = new ArrayList<>();

    public void readFile() {
        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            addList(first, in);
            addList(second, in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addList(List<String> list, BufferedReader in) throws IOException {
        int key = Integer.parseInt(in.readLine());
        for (int i = 0; i < key; i++) {
            list.add(in.readLine());
        }
    }

    public List<String> getFirst() {
        return first;
    }

    public List<String> getSecond() {
        return second;
    }
}

