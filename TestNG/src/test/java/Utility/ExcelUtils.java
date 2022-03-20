package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;

public class ExcelUtils {

	public static final String currentDir = System.getProperty("user.dir");
	 
    //Location of Test data excel file
    public static String testDataExcelPath = null;
    public static String testDataExcelFileName = null;
    public static String fileExtensionName=null;
 
    //Excel WorkBook
    private static XSSFWorkbook excelWBook;
 
    //Excel Sheet
    private static XSSFSheet excelWSheet;
 
    //Excel cell
    private static XSSFCell cell;
 
    //Excel row
    private static XSSFRow row;
     
    
    //Row Number
    public static int rowNumber;
 
    //Column Number
    public static int columnNumber;
 
    
    
    //Setter and Getters of row and columns
    public static void setRowNumber(int pRowNumber) {
        rowNumber = pRowNumber;
    }
 
    public static int getRowNumber() {
        return rowNumber;
    }

    public static void setColumnNumber(int pColumnNumber) {
        columnNumber = pColumnNumber;
    }
 
    public static int getColumnNumber() {
        return columnNumber;
    }
    
    public void getRowsColumnCount() throws IOException
    {
		XSSFRow row = null;
		row = excelWSheet.getRow(0);
		 
		int colCount = row.getLastCellNum();
		System.out.println("Column Count :- " + colCount);
		
		int rowCount = excelWSheet.getLastRowNum() + 1;
		System.out.println("Row Count :- " + rowCount);	 
		
		
    }
    
    /*public int getColumnCount()
    {
		XSSFColumn column = null;
		row = excelWSheet.getRow(0);
		// Making the object of excel row
		//column = excelWSheet..getRow(0);
 
		int colCount = row.getLastCellNum();
		System.out.println("Column Count :- " + colCount);
		return colCount;
		
    }*/
   
 
    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.
    public static void setExcelFileSheet(String excelFilename,String excelSheetName) throws IOException {
        //MAC or Windows Selection for excel path
        /*if (Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
            testDataExcelPath = currentDir + "//src//test//java//resources//";
        } else if (Platform.getCurrent().toString().contains("WIN")) {
            testDataExcelPath = currentDir + "\\src\\test\\java\\resources\\";
        }*/
        try {
            // Open the Excel file
        	//Check condition if the file is xlsx file
        	/*String fileExtensionName = fileName.substring(fileName.indexOf("."));
        	if(fileExtensionName.equals(".xlsx")){
        	//If it is xlsx file then create object of XSSFWorkbook class
        		FileInputStream ExcelFile = new FileInputStream(currentDir+"\\testData\\"+excelFilename+".xlsx");
        		excelWBook = new XSSFWorkbook(ExcelFile);
                excelWSheet = excelWBook.getSheet(excelSheetName);   
        	}
        	//Check condition if the file is xls file
        	else if(fileExtensionName.equals(".xls")){
        		//If it is xls file then create object of XSSFWorkbook class
        		FileInputStream ExcelFile = new FileInputStream(currentDir+"\\testData\\"+excelFilename+".xls");
        		excelWBook = new XSSFWorkbook(ExcelFile);
                excelWSheet = excelWBook.getSheet(excelSheetName);    
        	}*/
            FileInputStream ExcelFile = new FileInputStream(currentDir+"\\testData\\"+excelFilename+".xlsx");
            excelWBook = new XSSFWorkbook(ExcelFile);
            excelWSheet = excelWBook.getSheet(excelSheetName);
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
 
    //This method reads the test data from the Excel cell.
    //We are passing row number and column number as parameters.
    public static String getCellData(int RowNum, int ColNum) {
        try {
            cell = excelWSheet.getRow(RowNum).getCell(ColNum);
            DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
        } catch (Exception e) {
            throw (e);
        }
    }
 
    //This method takes row number as a parameter and returns the data of given row number.
    public static XSSFRow getRowData(int RowNum) {
        try {
            row = excelWSheet.getRow(RowNum);
            return row;
        } catch (Exception e) {
            throw (e);
        }
    }
 
    //This method gets excel file, row and column number and set a value to the that cell.
    public static void setCellData(String value, int RowNum, int ColNum) {
        try {
            row = excelWSheet.getRow(RowNum);
            cell = row.getCell(ColNum);
            if (cell == null) {
                cell = row.createCell(ColNum);
                cell.setCellValue(value);
            } else {
                cell.setCellValue(value);
            }
            // Constant variables Test Data path and Test Data file name
            FileOutputStream fileOut = new FileOutputStream(testDataExcelPath + testDataExcelFileName);
            excelWBook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}