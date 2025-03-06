package org.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class readExcelCellRef2 {
    public static void main(String[] args) throws IOException {
        // Path of the excel file
        try (FileInputStream fs = new FileInputStream("ExcelDemo.xlsx");
             XSSFWorkbook workbook = new XSSFWorkbook(fs)) {
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Print cells A1 and B2
            printCell(sheet, "A1");
            printCell(sheet, "B2");
        }
    }

    private static void printCell(XSSFSheet sheet, String cellRefStr) {
        CellReference cellRef = new CellReference(cellRefStr);
        Row row = sheet.getRow(cellRef.getRow());
        if (row != null) {
            Cell cell = row.getCell(cellRef.getCol());
            if (cell != null) {
                System.out.println(cellRefStr + ": " + cell);
            } else {
                System.out.println("Cell " + cellRefStr + " is empty or does not exist.");
            }
        } else {
            System.out.println("Row for cell " + cellRefStr + " does not exist.");
        }
    }
}