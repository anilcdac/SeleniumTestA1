package org.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.CellReference;


public class readExcelCellRef {
    public static void main (String [] args) throws IOException {
        // Path of the excel file
        FileInputStream fs = new FileInputStream("ExcelDemo.xlsx");
        // Creating a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Using CellReference to get cell A1
        CellReference cellRef = new CellReference("A1");
        Row row = sheet.getRow(cellRef.getRow());
        Cell cell = row.getCell(cellRef.getCol());
        System.out.println(cell);

        // Using CellReference to get cell B2
        CellReference cellRefB2 = new CellReference("B2");
        Row rowB2 = sheet.getRow(cellRefB2.getRow());
        Cell cellB2 = rowB2.getCell(cellRefB2.getCol());
        System.out.println(cellB2);

        // Close the workbook and file input stream
        workbook.close();
        fs.close();
    }
}
