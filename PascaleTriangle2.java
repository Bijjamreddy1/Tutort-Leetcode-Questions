package tutort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascaleTriangle2 {

	public static void main(String[] args) {
		
		int rowIndex=3;
		
		List<Integer> res=getRow(rowIndex);
		System.out.println(res);
		
		
		}

	private static List<Integer> getRow(int rowIndex) {
		List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1);
            row = newRow;
        }

        return row;   
	
	}

}
