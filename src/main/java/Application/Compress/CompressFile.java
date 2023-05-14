package Application.Compress;

import Application.Files.InputFile;
import Application.Files.OutputFile;
import Application.Files.ZipOutput;
import java.io.IOException;

public class CompressFile {

    private final InputFile inputFile;
    private final OutputFile outputFile;
    private final ZipOutput zipOutput;

    public CompressFile(InputFile inputFile, OutputFile outputFile, ZipOutput zipOutput) throws IOException {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.zipOutput = zipOutput;

        compress();
    }

    private void compress() throws IOException {
        byte[] buffer = new byte[1024];
        int count;
        while ((count = inputFile.getFileInputStream().read(buffer)) != -1) {
            zipOutput.getGzipOutputStream().write(buffer, 0, count);
        }
        zipOutput.getGzipOutputStream().finish();
        close();
    }

    private void close() throws IOException {
        outputFile.getFileOutputStream().close();
        zipOutput.getGzipOutputStream().close();
        inputFile.getFileInputStream().close();
    }
}
