package ioSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String fileName = "test";
        String fileTail = ".zip";
        File file = new File("src/"+fileName+fileTail);
        File copyFile = new File("src/"+fileName+"_copy"+fileTail);
        new FileCopySystem(file,copyFile);

        CountFileBytes count = new CountFileBytes(
                new FileInputStream("src/" + fileName + fileTail));
        int n = 0;
        while(n != -1)
        {
            n = count.read();
        }
        System.out.println("Total read "+count.getBytesCount()+" bytes.");
    }
}
