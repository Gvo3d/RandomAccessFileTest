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
            file.seek(file.length());
            file.writeBytes(ch);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public void clear(){
        try {
            file.seek(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
