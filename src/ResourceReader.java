import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public final class ResourceReader {
    /**
     * Produces a list of lines in a resource file.
     *
     * @param resourceName the name of the resource file whose contents to get.
     *
     * @return a list of the lines in the resource file.
     *
     * @throws IOException if the resource file called {@code resourceName} does not exist or cannot be accessed.
     * @throws NullPointerException if {@code resourceName} is {@code null}.
     */
    static List<String> readAllLinesInResourceFile(final String resourceName) throws IOException {
        try (var reader = new BufferedReader(new InputStreamReader(ResourceReader.class.getResourceAsStream(resourceName)))) {
            return reader.lines().collect(Collectors.toList());
        }
    }
}
