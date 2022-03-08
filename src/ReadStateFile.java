import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;

public class ReadStateFile {

    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        String fileName;
        System.out.print("Enter name of file to use >> ");
        fileName = kb.nextLine();
        //fileName = fileName;//idk but the file lives in this project folder so uhh....
        Path file = Paths.get(fileName);
        
        final String ID_FORMAT = "000";
        final String NAME_FORMAT = "          ";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "WI";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";
        String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + HOME_STATE + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();

        byte data[] = s.getBytes();
        final String EMPTY_ACCT = "000";
        String[] array = new String[4];
        double balance = 0;
        double total = 0;

        try{
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("\nAttributes of the file");
            System.out.println("Creation time " + attr.creationTime());
            System.out.println("Size " + attr.size());
            


        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
