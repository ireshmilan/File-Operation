package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;


public class ReadFile extends BufferedReader {
    private BufferedReader buffered;

    public ReadFile(Reader reader) {
        super(reader);
        buffered = new BufferedReader(reader);
    }

    public int read() throws IOException {

   return toUperCase(buffered.read());

    }
    private int toUperCase(int a)
    {

           // char c =(char)a;
            if (97 <= a && a<=122)
            {
                a = a - 32;
            }
            //System.out.print(c);
        return a;
    }
}
