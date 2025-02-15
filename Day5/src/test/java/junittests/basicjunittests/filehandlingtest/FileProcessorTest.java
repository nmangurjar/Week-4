package junittests.basicjunittests.filehandlingtest;

import junit.basicjunittestproblems.testingfilehandling.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

   static final String TEST_FILE = "testfile.txt";
 FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @Test
    @DisplayName("Test Writing and Reading File Content")
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        fileProcessor.writeToFile(TEST_FILE, content);
        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "File content should match");
    }

    @Test
    @DisplayName("Test File Exists After Writing")
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Some content");
        assertTrue(Files.exists(Path.of(TEST_FILE)), "File should exist after writing");
    }

    @Test
    @DisplayName("Test IOException When File Does Not Exist")
    void testIOExceptionWhenFileNotExists() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("non_existent_file.txt"),
                "Reading a non-existent file should throw IOException");
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }
}
