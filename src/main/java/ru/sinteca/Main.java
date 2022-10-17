package ru.sinteca;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        SearchMatchPhrase search = new SearchMatchPhrase();
        OutFile outFile = new OutFile();
        readFile.readFile();
        String out = search.createMatches(readFile.getFirst(), readFile.getSecond());
        outFile.out(out);
    }
}
