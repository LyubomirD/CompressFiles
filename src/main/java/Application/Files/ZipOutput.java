package Application.Files;

import java.util.zip.GZIPOutputStream;

public class ZipOutput {

    private final GZIPOutputStream gzipOutputStream;

    public ZipOutput(GZIPOutputStream gzipOutputStream) {
        this.gzipOutputStream = gzipOutputStream;
    }

    public GZIPOutputStream getGzipOutputStream() {
        return gzipOutputStream;
    }
}
