import java.*;

class findIsland{
	public static void main(String[] args){
		int[][] M = {
				{1, 1, 0, 0, 0},
				{0, 1, 0, 0, 1},
				{1, 0, 0, 1, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1}
			};
			
		boolean[][] visited = new boolean[5][5];
		
		int count = 0;
		for(int i = 0 ; i < 5; i++){
			for(int j = 0 ; j < 5; j++){
				if(visited[i][j] == false && M[i][j] == 1){
					DFS(i, j, visited, M);
					count++;
				}
			}
		}

		System.out.print(count);


	}
	public static int isSafe(int row, int col, boolean[][] visited){
		if(row < 0 || col < 0 || row > 4 || col > 4 || visited == true){
			return false;
		}
		else{
			return true;
		}
	}
	public static void DFS(int row, int col, boolean[][] visited, int[][] M){

		static int rowNbr[] = {-1, -1, -1,  0, 0,  1, 1, 1};
		static int colNbr[] = {-1,  0,  1, -1, 1, -1, 0, 1};
		visited[row][col] = true;

		for(int i = 0; i < 8; i++){
			if(isSafe(row + rowNbr[i], col + colNbr[i], visited) && M[row][col] == 1){
				DFS(row + rowNbr[i], col + colNbr[i], visited, M);
			}
		}

	}
}
