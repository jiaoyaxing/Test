package test.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest {

    @Test
    public void test() {
        File file = new File("D:/temp/a.csv");
        File file1 = new File("D:/temp/logs");
        System.out.println(file1.getParent());
        try {
            System.out.println(file1.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file1.getAbsolutePath());
    }
}
