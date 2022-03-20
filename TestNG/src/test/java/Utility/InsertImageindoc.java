package Utility;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;

import org.apache.poi.hpsf.Section;
import org.apache.poi.util.Units;
import org.apache.poi.wp.usermodel.Paragraph;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class InsertImageindoc {
	
	
	public void image_insert(String Filename, String Imagename) throws Exception
    {
	
	XWPFDocument document = new XWPFDocument();
	  
    // Step 2: Creating a Paragraph using
    // createParagraph() method
    XWPFParagraph paragraph
        = document.createParagraph();
    XWPFRun run = paragraph.createRun();

    // Step 3: Creating a File output stream of word
    // document at the required location
    FileOutputStream fout = new FileOutputStream(
        new File("C:\\Users\\VILASAGARAMBABU\\git\\Testing\\TestNG\\screenshots\\"+Filename+".docx"));

    // Step 4: Creating a file input stream of image by
    // specifying its path
    File image = new File("C:\\Users\\VILASAGARAMBABU\\git\\Testing\\TestNG\\screenshots\\"+Imagename+".png");
    FileInputStream imageData  = new FileInputStream(image);

    // Step 5: Retrieving the image file name and image
    // type
    int imageType = XWPFDocument.PICTURE_TYPE_JPEG;
    String imageFileName = image.getName();

    // Step 6: Setting the width and height of the image
    // in pixels.
    int width = 450;
    int height = 400;

    // Step 7: Adding the picture using the addPicture()
    // method and writing into the document
    run.addPicture(imageData, imageType, imageFileName,
                   Units.toEMU(width),
                   Units.toEMU(height));
    document.write(fout);

    // Step 8: Closing the connections
    fout.close();
    document.close();
	}
	
	
	public void insertText(String Filename,String text1) throws Exception
    {
	
	XWPFDocument document = new XWPFDocument();
	  
    // Step 2: Creating a Paragraph using
    // createParagraph() method
    XWPFParagraph paragraph
        = document.createParagraph();
    XWPFRun run = paragraph.createRun();

    // Step 3: Creating a File output stream of word
    // document at the required location
    FileOutputStream fout = new FileOutputStream(
    new File("C:\\Users\\VILASAGARAMBABU\\git\\Testing\\TestNG\\screenshots\\"+Filename+".docx"));
    run.setText("Suresh is the best boy");
    run.setText(text1);
    document.write(fout);

    // Step 8: Closing the connections
    fout.close();
    document.close();
	}
}


