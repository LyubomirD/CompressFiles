package Application.Decompress;

import Application.Files.InputFile;
import Application.Files.OutputFile;
import Application.Files.ZipInput;
import java.io.IOException;

public class DecompressFile {

    private final InputFile inputFile;
    private final OutputFile outputFile;
    private final ZipInput zipInput;

    public DecompressFile(InputFile inputFile, OutputFile outputFile, ZipInput zipInput) throws IOException {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.zipInput = zipInput;

        decompress();
    }

    private void decompress() throws IOException {
        byte[] buffer = new byte[1024];
        int count;
        while ((count = zipInput.getGzipInputStream().read(buffer)) != -1) {
            outputFile.getFileOutputStream().write(buffer, 0, count);
        }

        close();
    }

    private  void close() throws IOException {
        outputFile.getFileOutputStream().close();
        zipInput.getGzipInputStream().close();
        inputFile.getFileInputStream().close();
    }

}
