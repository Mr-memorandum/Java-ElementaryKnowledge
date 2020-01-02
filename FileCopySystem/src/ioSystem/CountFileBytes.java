package ioSystem;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class CountFileBytes extends FilterInputStream {
    private int bytesCount = 0;
    CountFileBytes(InputStream input)
    {
        super(input);
    }

    public int getBytesCount()
    {
        return this.bytesCount;
    }

    public int read() throws IOException
    {
        int n = in.read();
        if(n != -1)
        {
            this.bytesCount++;
        }
        return n;
    }

    public int read(byte[] b,int offset,int length) throws IOException
    {
        int n = in.read(b,offset,length);
        this.bytesCount +=n;
        return bytesCount;
    }
}
