package Application;

import Application.Compress.CompressFile;
import Application.Decompress.DecompressFile;
import Application.Files.InputFile;
import Application.Files.OutputFile;
import Application.Files.ZipInput;
import Application.Files.ZipOutput;

import java.io.*;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        File sourceFile = new File("/Users/lubodimoff/Desktop/output.wav");
        File destinationFile = new File("/Users/lubodimoff/Desktop/output1.wav");

        InputFile inputFile = new InputFile(new FileInputStream(sourceFile));
        OutputFile outputFile = new OutputFile(new FileOutputStream(destinationFile));


        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            ZipOutput zipOutput = new ZipOutput(new GZIPOutputStream(outputFile.getFileOutputStream()));
            CompressFile compress = new CompressFile(inputFile, outputFile, zipOutput);
        } else {
            ZipInput zipInput = new ZipInput(new GZIPInputStream(inputFile.getFileInputStream()));
            DecompressFile decompress = new DecompressFile(inputFile, outputFile, zipInput);
        }


    }
}

