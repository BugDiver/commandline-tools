package client;

import fs.FileReaderUtil;
import lib.WC;
import java.io.File;

public class WCClient {

	public static void main(String[] args) {
		File file = new File(args[0]);
		FileReaderUtil fr = new FileReaderUtil();
		String text = fr.readFile(file);
		WC wc = new WC(text ,file.toString());
		System.out.println(wc.formatedResult()); 
	}
}