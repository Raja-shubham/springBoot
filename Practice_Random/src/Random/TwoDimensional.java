package Random;

import java.util.*;
public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("Enter the number of rows");
		row=sc.nextInt();
		System.out.println("enter the number of column");
		col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter "+row*col+ " "+"elements in 2-D array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");;
			}
			System.out.println();
		}
	}

}
