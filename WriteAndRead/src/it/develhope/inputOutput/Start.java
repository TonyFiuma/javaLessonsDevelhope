package it.develhope.inputOutput;

import it.develhope.inputOutput.concrete.WriteAndReadMethodE;
import it.develhope.inputOutput.concrete.WriteAndReadOnTemporary;
import it.develhope.inputOutput.interfaces.IWriterAndReader;


public
class Start {
    public static
    void main ( String ...args ) {

        String stringToWrite = "Lorem ipsum";
        String fileToWrite = "C:\\Users\\axelf\\OneDrive\\Desktop\\develhopeFile.txt";

        /*IWriterAndReader wr =new WriteAndReadMethodE();
        wr.write (stringToWrite,fileToWrite );
        wr.read ( fileToWrite);
        */

        WriteAndReadOnTemporary.write(stringToWrite);
    }
}
