package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static FileInputStream file;

    public static int rows;
    public static int cols;
    
     /*
     * Method Name: readExcelData
     * Author name: Kartik Bameta
     * Description: This method reads a specific cell from an Excel sheet using the Apache POI library and returns its value as a String.
     * Parameters: String path, String name,  int rows, int cols
     * Return type: String
     */
    public static String readExcelData(String path,String name, int rows, int cols) {
		try {
			 file=new FileInputStream(path);
	            workbook=new XSSFWorkbook(file);
	            sheet=workbook.getSheet(name);
	            row=sheet.getRow(rows);
	            cell=row.getCell(cols);
	            
	            String value = cell.toString();
	            return value;

		} catch (FileNotFoundException e) {
             LoggerHandler.logError(e.getMessage());
		}
		catch (IOException e) {
             LoggerHandler.logError(e.getMessage());
		}
		return null;
	}

}
