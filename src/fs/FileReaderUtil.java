package fs;

import java.io.*;

public class FileReaderUtil{
	public String readFile(File filename) {
        String line;
        StringBuilder sb = new StringBuilder("");
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (FileNotFoundException e){
            System.err.println("File not Found");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("unable to Read");
            System.exit(1);
        }
        return sb.toString().trim();
    }
}