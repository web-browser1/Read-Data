
/**
  Author: David A.
*/


public class ReadData {

	
  // Variables
  
	int B = 2;
	
	int C = 4;
	
	int X = 6;
	
	int Y = 7;
	
	
	int E = 8;
	
	int F = 15;
	
	
	
	
	int J = 11; 
	
	int K = 12; 
	
	
	int T = 16; 
	
	int R = 17; 
	
	int P = 18; 
	
	int V = 19; 
	
	
	int D = 20;
	
	int A = 21; 
	
	int H = 22; 
	
	int S = 30; 
	
	
	
  // Matrices
	
	public int[][] word10() {
		
		
		int O = 1;
		
		int U = 1;
		
		
		int wordarg[][] = new int[][] {
				
				
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, S, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, C, O, O, O, C, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, D, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, U, B, B, B, B, B, B, U, U, B, B, B, B },
				{ U, U, U, U, U, U, B, B, B, B, U, U, U, U, U, B, B, B, U, U, U, U, U, U },
				
				
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, Y, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, B, B },
				{ O, O, O, O, B, B, B, O, O, O, O, O, O, B, B, O, O, O, O, O, O, O, B, B },
				{ O, O, B, B, B, B, B, O, O, O, O, O, O, B, B, O, O, O, O, O, O, O, B, B },
				{ B, B, B, B, B, B, B, B, B, B, Y, B, B, B, B, B, B, O, O, Y, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, O, O, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, O, O, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, U, U, B, B, B, B, B },
				{ U, U, B, B, U, U, U, U, U, U, B, B, B, U, U, U, U, U, U, U, U, U, U, U },
			
				

				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, O, C, O, C, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, B, B, B, B, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, D, B, B, B, B, B, B, B, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, D, B, B, B, B, B, B, B, B, B, B, B, O, O, O, O, O, O },
				{ O, O, O, O, B, B, B, B, B, B, B, B, B, B, B, B, B, B, D, B, O, O, O, O },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, D, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, U, U, B, B, U, U, B, B, B, B, U, U, B, B, U, U, B, B, B, B },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				
				
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, C, O, C, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, D, B, B, B, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, D, B, B, B, B, B, B, B, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, D, B, B, B, B, B, B, B, B, B, B, B, O, O, O, O, O, O },
				{ O, O, O, O, D, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, O, O, O, O },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, U, U, B, B, U, U, B, B, B, B, U, U, B, B, U, U, B, B, B, B },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				
				
				
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, C, O, C, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, B, B, B, B, B, B, B, B, O, O, O, O, O, O, O, O, O, O, O, O },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, U, U, B, B, U, U, B, B, B, B, U, U, B, B, U, U, B, B, B, B },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				
				
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, C, O, C, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ D, B, B, B, B, B, B, B, B, B, B, B, B, B, B, D, B, D, B, B, D, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, U, U, U, B, B, B, B },
				{ U, U, U, U, U, U, U, U, U, U, U, B, B, B, B, U, U, U, U, U, U, U, U, U },
				
				
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, D, B, O, O, D, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, B, B, O, O, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, B, B, B, B, B, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ B, B, B, B, B, B, B, B, B, B, B, B, D, B, B, B, B, B, D, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, U, B, B, B, B, B, B, U, U, B, B, B, B },
				{ U, U, U, U, B, B, U, U, B, B, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				
				
				
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, B, O, O, D, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, D, B, O, D, B, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, B, B, D, B, B, B, B, D, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ B, B, B, B, B, B, B, B, B, B, B, B, D, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, U, B, B, B, B, B, U, B, B, B, B, B, B, U, U, B, B, B, B },
				{ U, U, B, U, B, U, B, B, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				
				
				
				

				
				{ U, U, U, U, U, B, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, B, B, B, B, B, B, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, B, B, B, B, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, B, B, B, B, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, B, B, B, B, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, U, B, B, B, B, B, U, B, B, B, B, B, U, U, U, B, B, B, B },
				{ U, U, U, B, B, U, U, U, U, B, B, U, U, U, U, B, B, U, U, U, U, U, U, U },
				
				
				
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
				{ O, O, O, O, H, O, O, O, O, O, H, O, O, O, O, O, O, T, B, B, O, O, O, O },
				{ T, B, B, B, B, B, B, B, B, B, T, B, B, T, B, B, B, B, B, B, F, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, U, U, U, B, B, B, B },
				{ B, B, B, U, B, B, B, B, U, U, B, B, B, U, U, U, U, U, U, U, U, U, U, U },
				
				

				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
				{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, B, B },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, B, B },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, B, B },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, B, B },
				{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, H, O, O, O, O, B, B },
				{ O, O, O, H, O, O, H, O, O, O, O, O, O, O, O, O, O, T, B, B, B, B, B, B }, 
				{ T, B, B, B, B, B, B, B, B, B, T, B, B, T, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B },
				{ B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, B, U, U, U, B, B, B, B },
				{ B, B, B, U, U, U, B, B, B, B, U, U, U, B, B, B, B, U, U, U, U, U, U, U },
				
				
				
				
				
		};
	
	
	
	
		return wordarg;
	}
	
	
	
	
	
	// section length 24
	
	
	int sections = 0;
	
	
	
	public int[][] getMap(int level) {
		

	int O = 1;
	
	int U = 1;
	
	int wordarg[][] = new int[][] {
			
			{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
			{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, C, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, S, O, O, O, 7, B, B, B, B, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, B, B, B, B, B, O, O, B, B, B, B, B, O, O, O, O, O, O, O },
			{ B, B, B, O, O, B, B, B, B, B, O, O, B, B, B, B, B, B, B, B, B, B, O, O },
			{ B, B, B, O, O, B, B, B, B, B, O, O, B, B, B, B, B, B, B, B, B, B, O, O },
			{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
			{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
			
			
			{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
			{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O },
			{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
			{ U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U, U },
			
			
	};
	
	wordarg = word10();
	

	
	
	
	int wordsave[][];
	
	
	
	/** Array sections graph
	 * 
	 * READ WORLD ARRAY GRAPH
	 * 
	 * 
	 */
	
	
	wordsave = new int[125][10];
	
	
	int sC = 0;
	
	
	int xL = wordarg[0].length;
	int yL = wordarg.length;
	
  
	
	int secY = 12;
	
	int secYStart = 0;
	
	int secXStart = 0;
	
	int secYCur = secY-1;
	
	
	
	int maxY = secY-1;
	
	int m = 1;
	
	int yc = 0;
	int xc = 0;
	
	int cc = 0;
	
	
	int chX = 0, chY = 0;
	
	
	while( m == 1 ) {
		
		
		cc++;
		
		
		int xl = wordarg[0].length - xc;
		
	
		if( wordarg[yc][xc] == 30 ) {
			
			chX = xc + secXStart;
			
			chY = yc - secYStart;
		}
		
		

		if(	wordarg[yc][xc] == 2 || wordarg[yc][xc] == 4 || wordarg[yc][xc] == 5 || 
				wordarg[yc][xc] == 6 || wordarg[yc][xc] == 7 || wordarg[yc][xc] == 8 || wordarg[yc][xc] == 15 ||
				wordarg[yc][xc] == 11 || wordarg[yc][xc] == 12 ||
				
				wordarg[yc][xc] == 16 || wordarg[yc][xc] == 17 || wordarg[yc][xc] == 18 || 
				wordarg[yc][xc] == 19 || wordarg[yc][xc] == 20 || wordarg[yc][xc] == 21 || wordarg[yc][xc] == 22     ) {
			
			
				wordsave[sC][5] = (int) wordarg[yc][xc];
				
			
				
				wordarg[yc][xc] = 3;
				
			
				
				wordsave[sC][0] = xc + secXStart;
				wordsave[sC][1] = yc - secYStart;
				
				wordsave[sC][2] = 1;
				wordsave[sC][3] = 1;
				
				wordsave[sC][4] = sC;
			
				
				if(  wordsave[sC][5] != 8 && wordsave[sC][5] != 4 && wordsave[sC][5] != 22 ) {
					
					
					int r = 1;
					
					int yce = 0;
					
					while( r == 1 ) {
					
						
						// Y 
						if( yc < maxY && wordarg[ ((yc-1) + wordsave[sC][3] + 1) ][xc] == B	) {
							
							
							wordarg[ ((yc-1) + wordsave[sC][3] + 1) ][xc] = 3;
							
							wordsave[sC][3] += 1;
							
							if( ((yc-1) + wordsave[sC][3]) == maxY  ) {
								r = 0;
								
								
							} else if( wordarg[ ((yc-1) + wordsave[sC][3] + 1) ][xc] != B ) {
								r = 0;
								
							}
							
						} 
						
						else if( yc < maxY && wordarg[ ((yc-1) + wordsave[sC][3] + 1) ][xc] != B ||
								yc == maxY ) {
							
							wordarg[ ((yc-1) + wordsave[sC][3] ) ][xc] = 3;
							
							r = 0;
						
						}
						
					}
					
					yce = yc + wordsave[sC][3] - 1;
						
					
					int xv = 1;
					
					while( xv == 1 ) {
						
						// X
						
						if( xc+wordsave[sC][2] < xL &&
								
							(	
							(yc == 0 && wordarg[yc][xc+wordsave[sC][2]] == B ||
							yc >= 1 && wordarg[yc][xc+wordsave[sC][2]] == B && wordarg[yc-1][xc+wordsave[sC][2]] != B)
								
							&& 
							
							(yce == maxY && wordarg[yce][xc+wordsave[sC][2]] == B  ||
							yce < maxY && wordarg[yce][xc+wordsave[sC][2]] == B && wordarg[yce+1][xc+wordsave[sC][2]] != B)	
							
							)
							
						  ) {
					
							   
								for( int i = 0; i<wordsave[sC][3]; i++ ) {
									
									wordarg[yc+i][xc+wordsave[sC][2]] = 3;
								}
								
								wordsave[sC][2] += 1;
								
						
						} else {
							xv = 0;
							
							
						}
						
					}
				
				
				}
				
				
				
					
			
				sC++;
		}
		
		
		
		
		yc++;
		
	
		
		if( yc == secYCur ) {
			
			xc++;
			
			
			if( xc == wordarg[0].length && yc == wordarg.length-1 ) {
				m = 0;
				
				xc = 0;
				
				
				sections = (int) Math.ceil( (wordsave[sC-1][0]+wordsave[sC-1][2]) / 24 );
			}
			
			
			yc = secYStart;
			
			if( xc == wordarg[0].length ) {
			
			
				secXStart += xL;
				
				secYStart += secY;
				
				secYCur += secY;
				
				maxY += secY;
				
				xc = 0;
			}
			
			
		}
			
		
	}
	
	
	
	
	int start = 0;
	
	int end = 0;
	
	int xw = 0;
	
	
	
	
	wordsave[sC][5] = 30;
	
	
	wordsave[sC][0] = chX;
	wordsave[sC][1] = chY;
	
	
	
	
	for( int c = 1; c<sC; c++ ) {
		
		
		if( wordsave[c][0] < xw ) {
			
			if( start == 0 ) {
				start = wordsave[c][4]-1;
			}
			
			if( (wordsave[c][0]+wordsave[c][2]) > xw ) {
				
				xw = (wordsave[c][0]+wordsave[c][2]);
			}
			
		}
		
		
		if( wordsave[c][0] >= xw ) {
			
			xw = (wordsave[c][0]+wordsave[c][2]);
			
			if( start != 0 ) {
				end = wordsave[c][4]-1;
			}
			
		} 
		
		
		
		
		if( wordsave[c][5] == 21 ) {
			
			
			
		}
		
		
		
		if( wordsave[c][5] == 22 ) {
			
			wordsave[c][6] = 3; 
			
			wordsave[c][7] = (wordsave[c+1][2]*2) -2; 
			
			wordsave[c][8] = 0;
			
			
		}
				
		
		
		//brick incX
		if( wordsave[c][5] == 6 ) {
			
			wordsave[c][6] = 3; 
			
			wordsave[c][7] = ((wordsave[c+1][0]) - (wordsave[c][0]+wordsave[c][2]))*2; 
			
			wordsave[c][8] = 1; 
		}
		
		//brick incY
		if( wordsave[c][5] == 7 ) {
			
			
			wordsave[c][6] = 1; 
			
			
			if( wordsave[c][1] == wordsave[c+1][1] ) {
				
				wordsave[c][7] = ( (wordsave[c-1][1]) - (wordsave[c][1]) )*2;
				
			} else if( wordsave[c][1] == wordsave[c-1][1] ) {
				
				wordsave[c][7] = ( (wordsave[c+1][1]) - (wordsave[c][1]) )*2;
				
			}
			
			
			wordsave[c][8] = 1; 
			
		}
		
	
		if( wordsave[c][5] == 8 ) {
			
					
			wordsave[c][6] = 5; // state
			
			wordsave[c][7] = (wordsave[c+1][2]*2) -2; 
			
			wordsave[c][8] = 2;
			
			
			if( wordsave[c+1][5] == 21 ) {

				wordsave[c][8] = 3;
			}
					
					
		}
		
		
		//brick incY drop
		if( wordsave[c][5] == D ) {
			
			wordsave[c][6] = 1; // state
			
			wordsave[c][7] = 20; 
			
			wordsave[c][8] = 0; 
			
			
		}
		
		
		
		//brick incY  J from U
		if( wordsave[c][5] == 11 ) {
			
			wordsave[c][7] = (( wordsave[c+1][1] - ( wordsave[c][1]+wordsave[c][3]) )*2) + 0;
			

			wordsave[c][6] = 1; // state
			
			wordsave[c][8] = 1; // speed
			
		}
		
		
		//brick incY  K from ground
		if( wordsave[c][5] == 12 ) {
			
			wordsave[c][7] = (( ( wordsave[c-1][1]+wordsave[c-1][3] )  -  wordsave[c][1] )*2) - 0;
			

			wordsave[c][6] = 1; // state
			
			wordsave[c][8] = 1; // speed
		}
		
		
		
		
		
		if( start != 0 && end != 0 ) {
			
			// loop replace twice from first to last
			
			int ground[][] = new int[10][9]; int g = 0;
			int roof[][] = new int[10][9]; int r = 0;
			
			for( int i = start; i<(end+1); i++ ) {
				
				if( wordsave[i][1] <= 2  ) {
					
					 roof[r] = wordsave[i];
					
					 r++;
					 
				}
				
				if( wordsave[i][1] >= 3 && (wordsave[i][1]+wordsave[i][3]) < (secY-3) ) {
					
					roof[r] = wordsave[i];
					
					r++;
				}
				
				
				
				if( wordsave[i][1] >= 3 && (wordsave[i][1]+wordsave[i][3]) > (secY-3)   ) {
					
					 ground[g] = wordsave[i];
						
					 g++;
					
					
				}
				
				
			}
      
			
		
			int rg = 0;
			for( int i = start; i<(end+1); i++ ) {
				
				if( g == 0 && r != 0 ) {
					
					wordsave[i] = roof[rg];
					
					rg++;
					
					r--;
				}
				
				
				if( g != 0 ) {
					
					wordsave[i] = ground[rg];
					
					rg++;
					
					g--;
					
					if( g == 0 ) { rg = 0; }
				}
				
			}
			
			
			start = 0;
			end = 0;
			
		}
		
		
		
		
	}

	
	return wordsave;
	
	
	
	}
	
	
}
