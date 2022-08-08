import java.util.Scanner;

public class MultiplicationOfMatrics {
	
//	private static Scanner sc;

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 
		int i, j, rows, columns;
		rows = 3;
		columns = 3;
		 
		int[][] arr1 = new int[rows][columns];
		int[][] arr2 = new int[rows][columns];
		 
		System.out.println("\nEnter the First 3*3 Matrix  :  ");
		for(i = 0; i < rows; i++) {
		    for(j = 0; j < columns; j++) {
		      arr1[i][j] = sc.nextInt();
		    }
		}
		System.out.println("\nEnter the Second 3*3 Matrix :  ");
		for(i = 0; i < rows; i++)  {
		    for(j = 0; j < columns; j++) {
		        arr2[i][j] = sc.nextInt();
		      }
		  }
		System.out.println("\n-----The Multiplication of two Matrix----- ");
		for(i = 0; i < rows; i++) {
		    for(j = 0; j < columns; j++) {
		       System.out.format("%d \t", (arr1[i][j] * arr2[i][j]));
		    }
		    System.out.println("");
		}
		}

	}

	


