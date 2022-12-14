package it.develhope.inputOutput.concrete;

import it.develhope.inputOutput.interfaces.IWriterAndReader;

import java.io.*;

public
class WriteAndReadMethodB implements IWriterAndReader {
    @Override
    public
    void write ( String s , String filePath ) {
        try (
                FileWriter writer = new FileWriter ( filePath , true ) ;
                PrintWriter pw = new PrintWriter ( writer ) ;
        ) {
            pw.printf ( "Io sono Antonio e ho %d anni",30 );
pw.write ( s );
pw.append ( "--------------------------" );
        }
        catch ( Exception e ) {
            e.printStackTrace ( );
        }
    }



    @Override
    public
    void read ( String filePath ) {
    }
}
