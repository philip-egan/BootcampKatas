import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    @Override
    public void putToCache(PutRecordsRequest putRecordsRequest){
        ....
        if (!dataTmpFile.exists()){
            try {
                dataTmpFile.createNewFile();
            } catch (IOException e) {
                LOGGER.error("Failed to create cache tmp file, return.", e);
                return;
            }
        }
        ....
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}