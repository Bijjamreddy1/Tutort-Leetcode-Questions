package tutort;

public class CountNegativeNumbersinaSortedMatrix {

	public static void main(String[] args) {

		int[][] grid = {{5,1,0},{-5,-5,-5}};
		
		
		int row=grid[0].length;
		int col=grid.length;
		
		
		int count=0;
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if(grid[i][j]<0)
					count++;
			}
		}
		
		System.out.println(count);
	}

}