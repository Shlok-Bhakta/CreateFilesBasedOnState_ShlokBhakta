import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;

public class CreateFilesBasedOnState {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //3
        Path inStateFile = Paths.get("InStateCusts.txt");
        Path outStateFile = Paths.get("OutStateCusts.txt");

        //4
        final String ID_FORMAT = "000";
        final String NAME_FORMAT = "          ";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "WI";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";
        String s = ID_FORMAT + delimiter + NAME_FORMAT +delimiter + HOME_STATE + delimiter + BALANCE_FORMAT + System.getProperty("line.seperator");
        final int RECSIZE = s.length();

        
        




    }
}
