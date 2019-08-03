package pl.sda.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSingelton {

    private static FileWriterSingelton instance;

    private FileWriterSingelton(){

    }

    public synchronized static FileWriterSingelton getInstance(){
        if (instance == null){
            System.out.println("jestem w if");
            instance = new FileWriterSingelton();
        }
        return instance;
    }

    public void write(String text, String file){
        FileWriter fw = null;

        try {
            fw = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bw = new BufferedWriter(fw);
        try {

                bw.write(text+"\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
