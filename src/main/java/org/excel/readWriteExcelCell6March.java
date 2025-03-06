package org.excel;



import org.apache.poi.ss.usermodel.*;
        import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.util.CellReference;
import java.io.*;

public class readWriteExcelCell6March {
    private static String filePath = "data.xlsx";

    // Read data using CellReference
    public static String readCell(String cellRefStr) throws IOException {
        FileInputStream file = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        CellReference cellRef = new CellReference(cellRefStr);
        Row row = sheet.getRow(cellRef.getRow());
        Cell cell = row.getCell(cellRef.getCol());
        String cellValue = cell.getStringCellValue();
        workbook.close();
        return cellValue;
    }

    // Write data using CellReference
    public static void writeCell(String cellRefStr, String value) throws IOException {
        FileInputStream file = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        file.close();

        CellReference cellRef = new CellReference(cellRefStr);
        Row row = sheet.getRow(cellRef.getRow());
        if (row == null) row = sheet.createRow(cellRef.getRow());

        Cell cell = row.getCell(cellRef.getCol());
        if (cell == null) cell = row.createCell(cellRef.getCol());

        cell.setCellValue(value);

        FileOutputStream outFile = new FileOutputStream(new File(filePath));
        workbook.write(outFile);
        outFile.close();
        workbook.close();
    }
}
