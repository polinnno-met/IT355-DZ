package org.example;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void readStudents(String filePath) throws IOException {
        FileInputStream excelTable = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(excelTable);
        Sheet sheet = workbook.getSheetAt(0);
        for (Row current : sheet) {
            Cell nameCell = current.getCell(0);
            Cell surnameCell = current.getCell(1);
            Cell indexCell = current.getCell(2);

            String name = nameCell.getStringCellValue();
            String surname = surnameCell.getStringCellValue();
            String index = String.valueOf((int)indexCell.getNumericCellValue());

            System.out.println("First Name: " + name + ", Last Name: " + surname + ", Index: " + index);
        }
    }


    public static void main(String[] args) throws IOException {
        String filePath = Main.class.getResource("/studenti.xlsx").getFile();
        readStudents(filePath);
    }
}
