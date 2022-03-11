import static org.junit.Assert.*;
import org.junit.*;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void testSnippet1() throws IOException{
        String contents = Files.readString(Path.of("Snippet 1.md"));
        List<String> expected = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(expected, contents);
    }

    @Test
    public void testSnippet2() throws IOException{
        String contents = Files.readString(Path.of("Snippet 2.md"));
        List<String> expected = List.of("a.com", "a.com(())", "example.com");
        assertEquals(expected, contents);
    }

    @Test
    public void testSnippet3() throws IOException{
        String contents = Files.readString(Path.of("Snippet 3.md"));
        List<String> expected = List.of("https://twitter.com", "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/");
        assertEquals(expected, contents);
    }
}