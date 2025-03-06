package org.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class readExcelCellRefCompare {
    public static void main(String[] args) throws IOException {
        // Path of the excel file
        try (FileInputStream fs = new FileInputStream("ExcelDemo.xlsx");
             XSSFWorkbook workbook = new XSSFWorkbook(fs)) {
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Print and compare cells A1 and B2 with user-provided values
            printAndCompareCell(sheet, "A1", "ExpectedValueA1");
            printAndCompareCell(sheet, "B2", "B2");
        }
    }

    private static void printAndCompareCell(XSSFSheet sheet, String cellRefStr, String expectedValue) {
        CellReference cellRef = new CellReference(cellRefStr);
        Row row = sheet.getRow(cellRef.getRow());
        if (row != null) {
            Cell cell = row.getCell(cellRef.getCol());
            if (cell != null) {
                String cellValue = cell.toString();
                System.out.println(cellRefStr + ": " + cellValue);
                if (cellValue.equals(expectedValue)) {
                    System.out.println("The value matches the expected value.");
                } else {
                    System.out.println("The value does not match the expected value.");
                }
            } else {
                System.out.println("Cell " + cellRefStr + " is empty or does not exist.");
            }
        } else {
            System.out.println("Row for cell " + cellRefStr + " does not exist.");
        }
    }
}