package Application;

import Application.GUI.Interaction.AppLabels;
import Application.GUI.Visibility.AppDimensions;
import Application.GUI.Visibility.AppFrame;
import Application.GUI.Visibility.AppPanel;

import javax.swing.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        File sourceFile = new File("/Users/lubodimoff/Desktop/output.wav");
//        File destinationFile = new File("/Users/lubodimoff/Desktop/output1.wav");
//
//        InputFile inputFile = new InputFile(new FileInputStream(sourceFile));
//        OutputFile outputFile = new OutputFile(new FileOutputStream(destinationFile));

        AppDimensions dimensions = new AppDimensions(415, 500);
        AppLabels appLabels = new AppLabels(new JLabel());
        AppPanel appPanel = new AppPanel(new JPanel(), dimensions, appLabels);
        AppFrame appFrame = new AppFrame(new JFrame(), appPanel, dimensions);

//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        if (choice == 1) {
//            ZipOutput zipOutput = new ZipOutput(new GZIPOutputStream(outputFile.getFileOutputStream()));
//            CompressFile compress = new CompressFile(inputFile, outrputFile, zipOutput);
//        } else {
//            ZipInput zipInput = new ZipInput(new GZIPInputStream(inputFile.getFileInputStream()));
//            DecompressFile decompress = new DecompressFile(inputFile, outputFile, zipInput);
//        }




    }
}

