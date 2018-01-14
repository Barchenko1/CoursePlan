package lecture9;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UncloseSystemIn extends FilterInputStream {
    public UncloseSystemIn(InputStream in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
        //NOP
    }
}
