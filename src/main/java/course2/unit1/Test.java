package course2.unit1;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

import java.io.File;

public class Test {
    /**
     * 在java里调用kotlin的拓展函数
     * @param args
     */
    public static void main(String[] args) {
        File file= new File("gradlew.bat");
        String content = FilesKt.readText(file, Charsets.UTF_8);
        System.out.println(content);
    }
}
