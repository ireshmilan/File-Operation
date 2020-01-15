/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Iresh
 */
public class FileReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Iresh\\Desktop\\Mila\\iresh.txt")) {
            String text = "My name is iresh";
            fileWriter.write(text);
            System.out.println("Successfully wrote to the file");
        } catch (Exception e) {
            System.out.println(e.getMessage()+"");
        }

        try (FileReader fileReader = new FileReader("C:\\Users\\Iresh\\Desktop\\Mila\\iresh.txt")) {
            int ch = fileReader.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()+"File path is not exist!");
        } catch (IOException e) {
            
        }
    }

}
