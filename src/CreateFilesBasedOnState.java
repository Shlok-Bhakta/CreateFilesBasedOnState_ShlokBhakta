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
        Path inStateFile = Paths.get("InStateCusts.txt");
        Path outStateFile = Paths.get("OutStateCusts.txt");
    }
}
