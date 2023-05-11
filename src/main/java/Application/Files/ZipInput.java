package Application.Files;

import java.util.zip.GZIPInputStream;

public class ZipInput {

    private final GZIPInputStream gzipInputStream;

    public ZipInput(GZIPInputStream gzipInputStream) {
        this.gzipInputStream = gzipInputStream;
    }

    public GZIPInputStream getGzipInputStream() {
        return gzipInputStream;
    }
}
