package it.develhope.inputOutput.concrete;

import it.develhope.inputOutput.interfaces.IWriterAndReader;

import java.io.File;

public class WriteAndReadOnTemporary{

    public static String write(String stringToWrite){
        try{
          File fileToWrite =  File.createTempFile("myTemporaryFile", "suffix");
            System.out.println("File directory" + fileToWrite.getAbsolutePath());
          IWriterAndReader wr = new WriteAndReadMethodA();
          wr.write(stringToWrite,fileToWrite.getAbsolutePath());
          wr.read(fileToWrite.getAbsolutePath());
          return fileToWrite.getAbsolutePath();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
