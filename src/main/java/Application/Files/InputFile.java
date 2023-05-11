package Application.Files;

import java.io.FileInputStream;

public class InputFile {

    private final FileInputStream fileInputStream;

    public InputFile(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public FileInputStream getFileInputStream() {
        return fileInputStream;
    }
}
