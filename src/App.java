import java.io.File;

/**
 * Created by Gvozd on 12.09.2016.
 */
public class App {
    public static void main(String[] args) {
    FileAccessObject fao = new FileAccessObject(new File("test.txt"));

        fao.write("fuck");
    }
}
