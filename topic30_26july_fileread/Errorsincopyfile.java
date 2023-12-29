package topic30_26july_fileread;



	import java.io.*;
	import java.util.Scanner;

	public class Errorsincopyfile  {
	    public static void main(String[] args)  {

	        Scanner in = new Scanner(System.in);

	        System.out.printf("Enter Source file name:");
	        String sourceFile = in.nextLine();

	        System.out.printf("Enter Target file name:");
	        String targetFile = in.nextLine();

	        File input = new File(sourceFile);
	        File output = new File(targetFile);
	        if ( output.exists() ) {
	            System.err.println("The target file exists ....");
	            System.exit(2);
	        }
	        FileInputStream fr = null;
	        try {
	            fr = new FileInputStream(input);
	        } catch (FileNotFoundException e) {
	            System.err.println("The source file was not found ...");
	            System.exit(1);
	        }

	        try {
	        	//if file was not created then create
	            output.createNewFile();
	        } catch (IOException e) {
	            System.err.println("Unable to create file ...");
	            System.exit(4);
	        }

	        FileOutputStream fw = null;
	        try {
	            fw = new FileOutputStream(output);
	        } catch (FileNotFoundException e) {
	            System.err.println("Error 3");
	            System.exit(3);
	        }

	        try {
	            int data;
	            while ((data = fr.read()) != -1) {
	                fw.write(data);
	            }
	        } catch (IOException e) {
	            System.err.println("Unable to read or write the file");
	            System.exit(5);
	        }

	        try {
	            fr.close();
	            fw.close();
	        } catch (IOException e) {
	            System.err.println("Unable to read or write the file");
	            System.exit(5);;
	        }


	    }
	}


	    
