import java.io.*;
public class FailiLogija {
    void logi(String text) throws IOException, FileNotFoundException, UnsupportedEncodingException{
        try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("teated.txt"), "utf-8"))){
            writer.write(text);
        }
    }
}