package Application.Files;

import java.io.FileOutputStream;

public class OutputFile {

    private final FileOutputStream fileOutputStream;

    public OutputFile(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public FileOutputStream getFileOutputStream() {
        return fileOutputStream;
    }
}
