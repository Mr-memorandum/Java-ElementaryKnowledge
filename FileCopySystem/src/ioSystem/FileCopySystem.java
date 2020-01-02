package ioSystem;

import java.io.*;

public class FileCopySystem {
    FileCopySystem(File file, File copyFile) throws IOException
    {
        try (InputStream input = new FileInputStream(file);
             OutputStream output = new FileOutputStream(copyFile))
        {
            int bytesAvailable = input.available();
            if (bytesAvailable > 0)
            {
                byte[] data = new byte[bytesAvailable];
                input.read(data);
                output.write(data);
            }
        }
    }
}
