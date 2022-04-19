
import java.util.Scanner;

/* A program to store a chess board information.
 Program utilizeS a string 2D array to store positions of chess pieces. The grid size is 8 X 8. */
public class ChessBoard {
	  char [][] gridContents = new char[8][8]; // Grid Contents array
      int rowMove;
      int columnMove;
      int rowTo;
      int columnTo;    
      
   // Initialize Grid Contents array
   public void initializeGrid() {
      gridContents[0][0] = 'R';     // ROOK
      gridContents[0][1] = 'N';     // KNIGHT
      gridContents[0][2] = 'B';     // BISHOP
      gridContents[0][3] = 'Q';     // QUEEN
      gridContents[0][4] = 'K';     // KING
      gridContents[0][5] = 'B'; 
      gridContents[0][6] = 'N'; 
      gridContents[0][7] = 'R';      
	     
	  for (int i = 0; i < gridContents.length; ++i) {
	     gridContents[1][i] = 'P';  // PAWN
	  }
	      
      for (int i = 0; i < gridContents.length; ++i) {
    	  gridContents[2][i] = 'E';  // EMPTY
      }
      for (int i = 0; i < gridContents.length; ++i) {
    	  gridContents[3][i] = 'E';
      }
      for (int i = 0; i < gridContents.length; ++i) {
    	  gridContents[4][i] = 'E';
      }
      for (int i = 0; i < gridContents.length; ++i) {
    	  gridContents[5][i] = 'E';
      }
      for (int i = 0; i < gridContents.length; ++i) {
    	  gridContents[6][i] = 'P';
      }
	      
      gridContents[7][0] = 'R';    
      gridContents[7][1] = 'N';    
      gridContents[7][2] = 'B';     
      gridContents[7][3] = 'Q';     
      gridContents[7][4] = 'K';     
      gridContents[7][5] = 'B'; 
      gridContents[7][6] = 'N'; 
      gridContents[7][7] = 'R'; 
	 
   } 
      
    //Printing the grid contents. 
      public void displayGrid() {	 
         for (int i = 0; i < gridContents.length; ++i) {
    	    for (int j = 0; j < gridContents[0].length; ++j) {
    	       System.out.print(gridContents[i][j] + " ");
    	  	}
    	       System.out.println();
    	 }
    	    
    	    System.out.println();
      	
      }
      
      //Proceed to update the grid (2D array) and then print the updated array.
      public void updateGrid() {
	      if ((rowMove >= 0) && (rowMove <= 7) && (columnMove >= 0) && (columnMove <= 7) && (rowTo >= 0) && (rowTo <= 7) && (columnTo >= 0) && (columnTo <= 7)) {
	         if ((rowTo >= 2) && (rowTo <= 5)) { 
	    	    for (int i = 0; i < gridContents.length; ++i) {
		           for (int j = 0; j < gridContents[0].length; ++j) {
		              System.out.print(gridContents[i][j] + " ");
		    	   }
		        System.out.println();
	            }
	         }
	         else 
	        	 System.out.println("not a valid destination");
	      }
	      else
	    	  System.out.println("Either the row or column entered or both is less than zero or greater than 7");
   
      }
}

		      
