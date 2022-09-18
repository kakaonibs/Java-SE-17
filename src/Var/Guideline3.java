package src.Var;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// Consider var when the initializer provides sufficient information

public class Guideline3 {
    public static void main(String[] args) throws IOException {
        var outputStream = new ByteArrayOutputStream();
        var reader = Files.newBufferedReader(Path.of(""));
        var list = List.of("a", "b", "c");

    }
}