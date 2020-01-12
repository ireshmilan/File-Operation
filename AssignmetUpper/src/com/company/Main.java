package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
	// write your code here
try {
    FileReader filereader = new FileReader("C:\\Users\\Iresh\\Desktop\\Mila\\iresh.txt");
    ReadFile readfile = new ReadFile(filereader);
    int i;
    while((i=readfile.read())!=-1){
        System.out.print((char)i);

    }
    readfile.close();
    filereader.close();
}catch (IOException e){
    System.out.println(e.getMessage());
}


    }
    }

