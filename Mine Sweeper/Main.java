/**/

package main;

import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;

public class Main {
	public static int reveal(){//Revealing a spot on the field
		return 0;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int xLen=12,yLen=12,choiceX=0,choiceY=0;
		boolean[][] revealed=new boolean[yLen][xLen];
		int[][] field=new int[yLen][xLen];
		for(int y=0;y<yLen;y++){//Creating the field
			Arrays.fill(revealed[y], true);
			Arrays.fill(field[y], 0);
		}
		for(int m=0;m<5;m++){//Adding mines, 9=mine
			
		}
		while(reveal()!=9){
			choiceX=sc.nextInt();
			choiceY=sc.nextInt();
			revealed[choiceY][choiceX]=true;
			for(int y=0;y<12;y++){
				for(int x=0;x<12;x++){
					if(revealed[y][x]){
						System.out.print(field[y][x]);
					}else{
						System.out.print("X");
					}
				}
				System.out.print("\n");
			}
		}
		/*JFrame frame=new JFrame("XD");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);*/
	}
}
