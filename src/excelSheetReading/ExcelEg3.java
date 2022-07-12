package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("F:\\26th march b\\poi-bin-5.2.2-20220312\\Testexcel26thMArchB.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		int totalNumberOfRows = mysheet.getLastRowNum();
		int rowcount =totalNumberOfRows ;
		
		System.out.println("Total Number OF Rows Are"+ totalNumberOfRows);
		
		short totalNumberOfCells = mysheet.getRow(totalNumberOfRows).getLastCellNum();
		int cellCount = totalNumberOfCells-1;
		
		System.out.println("Total Number OF cell Are"+cellCount);
		
		for(int  i=0;i<=rowcount;i++)  // outer for loop rows
		{
			for(int j=0;j<=cellCount;j++)  // inner for loop cell
			{
				Cell cellValue = mysheet.getRow(i).getCell(j);
				CellType dataType = cellValue.getCellType();
		
				if(dataType==CellType.STRING)
				{
					String value = cellValue.getStringCellValue();
					System.out.print(value+"  ");
					
				}
			else if (dataType==CellType.NUMERIC)
				{
					double value = cellValue.getNumericCellValue();
					System.out.print(value+"  ");
					
				}
				else if (dataType==CellType.BOOLEAN)
					
				{
					boolean value = cellValue.getBooleanCellValue();
					System.out.print(value+"  ");
					
					
				}
			else if (dataType==CellType.BLANK)
				
				{
					
					System.out.print(" ");
				}
				
					
				}
				
			System.out.println();
			}
		}
		

	}



