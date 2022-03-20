package Utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenCapture {

	public static String path = System.getProperty("user.dir");
	public static WebDriver driver;
	String SSno,folderpath,folderName;

	
	public void cteateFolder(String FolderName) throws Exception
	{
		File file = new File(path+"\\screenshots\\"+FolderName);
		file.getParentFile().mkdir();
		file.createNewFile();
		path= path+"\\screenshots\\"+FolderName;
	}
		
	
	
	public String Imagewithtimestamp( WebDriver driver) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("DDHHMMSS");
		
		Calendar cal = Calendar.getInstance();
		SSno = dateFormat.format(cal.getTime());
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(path+"\\screenshots\\" + SSno + ".png");
        FileUtils.copyFile(SrcFile, DestFile);
        return SSno;
				
	}
	
	
	
	public void ImagewithtimestampandName( WebDriver driver,String Nameofsnap) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MMDDHHMMSS");
		Calendar cal = Calendar.getInstance();
		SSno = dateFormat.format(cal.getTime());
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(path+"\\screenshots\\" + SSno +"_"+Nameofsnap+".png");
        FileUtils.copyFile(SrcFile, DestFile);
				
	}
	
	public void ImagewithName(WebDriver driver,String fName) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(path+"\\screenshots\\"+ fName + ".png");
       	FileUtils.copyFile(SrcFile, DestFile);
    }

}
