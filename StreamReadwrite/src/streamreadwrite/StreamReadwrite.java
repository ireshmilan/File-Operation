/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamreadwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Iresh
 */
public class StreamReadwrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Iresh\\Desktop\\Mila\\ireeesh.txt")) {
            String fileContent = "My name is Iresh";
            fileOutputStream.write(fileContent.getBytes());
            System.out.println("Successfully wrote to the file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Iresh\\Desktop\\Mila\\iresh.txt")) {
            int ch = fileInputStream.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()+"File not exist!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
