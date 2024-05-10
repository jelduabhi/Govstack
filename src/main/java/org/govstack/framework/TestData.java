package org.govstack.framework;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class TestData {

    static Map<Integer, String> keys = new HashMap<>();
    static Map<Integer, String> values = new HashMap<>();
    static Map<String, String> datacomb = new HashMap<>();


    public static void readTestData(String testCaseNumber) {
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//TestData//TestData.xlsx");
            Workbook wb = WorkbookFactory.create(file);
            Sheet sheet;
            for(Sheet sh:wb) {
                sheet = wb.getSheet(sh.getSheetName());
                for (Row row : sheet) {
                    Cell cellNumber = row.getCell(row.getFirstCellNum());
                    String cellValue = cellNumber.getStringCellValue();
                    if (cellValue.equals("TestCaseNumber")) {
                        for (Cell cell : row) {
                            keys.put(cell.getColumnIndex(), cell.getStringCellValue());
                        }
                    } else if (cellValue.equals(testCaseNumber)) {
                        for (Cell cell : row) {
                            values.put(cell.getColumnIndex(), cell.getStringCellValue());
                        }
                    }
                }
            }
            for(Integer index:values.keySet()){
                datacomb.put(keys.get(index),values.get(index));
            }
        } catch (Exception e) {
            System.out.println("Unable to read test data");
        }
    }

    public static String getData(String key){
        return datacomb.get(key);
    }

}
