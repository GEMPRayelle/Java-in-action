package Main.src.FileIOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Caesars_Cipher {
    
    public static void main(String[] args) {
        
        String inputFile = "C:\\Users\\equat\\Code\\Java-in-action\\input.txt";
        String encFile = "C:\\Users\\equat\\Code\\Java-in-action\\enc.txt";
        String recoverFile = "C:\\Users\\equat\\Code\\Java-in-action\\recover.txt";

        try {
            FileWriter inputFileWriter = new FileWriter(inputFile);
            FileWriter encFileWriter = new FileWriter(encFile);
            FileWriter recoverFileWriter = new FileWriter(recoverFile);
            inputFileWriter.write("Hello. My name is YoHan Park.");
            inputFileWriter.close();
        } catch (IOException e) {
            System.out.println("경로가 존재하지않습니다");
        }

        EncryptFile(inputFile, encFile);
        System.out.println("\n");
        RecoverFile(encFile, recoverFile);
        System.out.println("\n");
        System.out.println("동일한 파일인지에 대한 검사 여부: " + compareFile(inputFile, recoverFile));
    }

    public static void EncryptFile(String inputFile, String encFile){
        try {
            FileReader inputFileReader = new FileReader(inputFile);
            FileWriter encFileWriter = new FileWriter(encFile);
            int c,d;
            while ((c = inputFileReader.read()) != -1) {
                d = c + 3;
                if(d >= 128) { d -= 125;}
                System.out.print((char)d);
                encFileWriter.write((char)d);
            }
            encFileWriter.close();
            } catch (Exception e) {
            System.out.println("경로가 없습니다.");
        }
    }

    public static void RecoverFile(String encFile,String recoverFile){
        try {
            FileReader encFileReader = new FileReader(encFile);
            FileWriter recoverFileWriter = new FileWriter(recoverFile);

            int c,d;
            while ((c = encFileReader.read()) != -1) {
                d = c - 3;
                if(d < 0) { d += 125;}
                System.out.print((char)d);
                recoverFileWriter.write((char)d);
            }
            recoverFileWriter.close();
            } catch (Exception e) {
            System.out.println("경로가 없습니다.");
        }
    }

    public static boolean compareFile(String inputFile, String recoverFile){
        try {
            FileReader inputFileReader = new FileReader(inputFile);
            FileReader recoverFileReader = new FileReader(recoverFile);
            int c,d;
            while((c = inputFileReader.read()) != -1 && (d=recoverFileReader.read()) != -1){
                if(c != d) { return false; }
            }
        } catch (Exception e) {
            System.out.println("경로 재설정해라");
        }
        return true;
    }
}
