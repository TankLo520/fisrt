package day2_task_deep;

public class Solution {
	 public boolean Find(int target, int [][] array) {
	        int x = 0;
	        int y = array.length-1;
			while((x<array[0].length)&&(y>=0)){
	            if(array[y][x]<target){
	                x++;
	        }else if(array[y][x]>target){
	                y--;
	        }else{
	               return true; 
	            }
	            
	        }
			return false;
	    }	
//	public boolean Find(int target, int[][] array) {
//		int i = target;
//		// int [][] aaa = array[][];
//		int h = array.length;
//		int z = array[0].length;
////		boolean flag = false;
//		for (int a = 0; a < h; a++) {
//			{
//				for (int b = 0; b < z; b++) {
//					if (i == array[a][b]) {
//						return true;
//					}
//				}
//			}
//			
//		}
//		
//		return false;
//		
//		
//	}

	public static void main(String[] args){
//        Scanner sc = new Scanner
//		int arr[][] = new int[][]{{1},{1,2},{1,2,3}};
//		for(int a = 0;a<arr.length;a++){
//			for(int b = 0; b<arr[a].length; b++){
//				System.out.print(arr[a][b]);
//			}
//			System.out.println();
//		}
		
		
    }

}






