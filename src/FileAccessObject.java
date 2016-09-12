import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Gvozd on 12.09.2016.
 */
public class FileAccessObject {
    RandomAccessFile file;

    public FileAccessObject(File efile){
        try {
            file = new RandomAccessFile(efile, "rws");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean write(String ch){
        try {
            file.writeUTF(ch);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
