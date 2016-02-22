package client;

import fs.FileReaderUtil;
import lib.WC;
import java.io.File;
import java.util.Arrays;

public class WCClient {
	WC wc;

	public static void print(String detail){
		System.out.println(detail);
	}

	public static void printPartialDetail(File fileName ,String option){
		FileReaderUtil fr = new FileReaderUtil();
		String text = fr.readFile(fileName);
		WC wc = new WC(text ,fileName.toString());
		print(wc.partialDetails(option));
	}

	public static void printFromatedResult(File fileName){
		FileReaderUtil fr = new FileReaderUtil();
		String text = fr.readFile(fileName);
		WC wc = new WC(text ,fileName.toString());
		print(wc.formatedResult());
	}

	public static void printAllFilesDetails(File[] files ,String option){
		for (int i= 0;i < files.length ;i++ ) {
			if(!files[i].isFile()){
				print(files[i]+": not a valid file");
			}else{
				printPartialDetail(files[i] ,option);
			}
		}
	}

	public static void printAllFilesDetails(File[] files){
		for (int i= 0;i < files.length ;i++ ) {
			if(!files[i].isFile()){
				print(files[i]+": not a valid file");
			}else{
				printFromatedResult(files[i]);
			}
		}
	}

	public static void printError(){
		System.err.println("Arguments not found....");
        System.err.println("Usage:sh wc.sh [Option] [File Name]");
        System.exit(1);
	}

	public static File[] makeFileObject(String[] list){
		File[] files = new File[list.length];
		for (int i =0;i<list.length ;i++ ) {
			files[i] = new File(list[i]);
		}
		return files;
	}

	public static void main(String[] args) {
		String option;
		if (args.length < 1) {
            printError();
        }else if(!args[0].startsWith("-")){
        	printAllFilesDetails(makeFileObject(args));
        }else{
        	option = args[0];
        	Arrays.copyOfRange(args ,1,args.length);
        	printAllFilesDetails(makeFileObject(args) ,option);
        }
	}
}