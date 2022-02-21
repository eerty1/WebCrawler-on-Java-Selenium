import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class RelatedWordExcelFunctions {


    void saveWordPlusAmountOfCertainLetterToExcel (HashMap<String, Integer> excel) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        int rowIndex = 0;
        Cell cellWord;
        Cell cellAmountOfLetters;
        for (Map.Entry<String,Integer> mapItem : excel.entrySet()) {
            Row row = sheet.createRow(rowIndex++);
            cellWord = row.createCell(0);
            cellAmountOfLetters = row.createCell(1);

            cellWord.setCellValue(mapItem.getKey());
            cellAmountOfLetters.setCellValue(mapItem    .getValue());
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/test/resources/excel.xlsx");
            workbook.write(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
