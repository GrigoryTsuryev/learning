package Masa.Encrypted;

import java.io.*;

public class Encrypted {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("Old path");
        OutputStream outputStream = new FileOutputStream("New path ");
        encrypt(inputStream, outputStream);
        inputStream.close();
        outputStream.close();

        InputStream inputCrypted = new FileInputStream("New path");
        OutputStream outputCrypted = new FileOutputStream("New path");
        decrypt(inputCrypted, outputCrypted);
        inputCrypted.close();
        outputCrypted.close();
    }


    public static void encrypt(InputStream inputStream, OutputStream outputStream)throws  IOException{
        while (true){
            int b = inputStream.read();
            if(b==-1){
                break;
            }
            outputStream.write(b+1);
            System.out.println(b +" encoded" + (char)(b+1));
        }
    }

    public static void decrypt(InputStream inputStream, OutputStream outputStream)throws  IOException {
        while (true){
            int b = inputStream.read();
            if(b==-1){
                break;
            }
            outputStream.write(b-1);
            System.out.println(b +" encoded" + (char)(b-1));
        }
    }
}