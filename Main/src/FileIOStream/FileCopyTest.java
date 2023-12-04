package Main.src.FileIOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyTest {
    
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "C:\\Users\\equat\\Code\\Java-in-action\\14(a).pdf";
        String outputFile = "C:\\Users\\equat\\Code\\Java-in-action\\copy.pdf";
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

        long startTime1 = System.currentTimeMillis();
        copyFileByteType(inputFile, outputFile);
        long endTime1 = System.currentTimeMillis();
        System.out.println("1-1. 1 바이트 단위 복사 소요 시간: " + (endTime1 - startTime1) + "ms");

        // 1-2. 버퍼 단위로 읽고 쓰는 방식
        long startTime2 = System.currentTimeMillis();
        copyFileBuffer(inputFile, outputFile);
        long endTime2 = System.currentTimeMillis();
        System.out.println("1-2. 버퍼 단위 복사 소요 시간: " + (endTime2 - startTime2) + "ms");
    }

    public static void copyFileByteType(String inputFile,String outputFile){
        try(FileInputStream fis = new FileInputStream(inputFile)) {
            FileOutputStream fos = new FileOutputStream(outputFile);
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("잘못된 경로 지정");
        }
    }

    public static void copyFileBuffer(String inputFile, String ouputFile) throws FileNotFoundException{
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile))){
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ouputFile));
            int c;
            while ((c = bis.read()) != -1) {
                bos.write((char)c);
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            System.out.println("잘못된 경로 지정");
        }
    }
}
