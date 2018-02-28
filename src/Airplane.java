import java.util.Scanner;
public class Airplane {
	public static void main(String[] args) {
		char[][] a = new char[13][6];
		a[0][2] ='x';
		a[0][4] ='x';
		a[0][5] ='x';
		a[1][1] ='x';
		a[1][3] ='x';
		a[1][5] ='x';
		a[2][2] ='x';
		a[2][3] ='x';
		a[2][5] ='x';
		a[3][0] ='x';
		a[3][2] ='x';
		a[3][4] ='x';
		a[3][5] ='x';
		a[4][1] ='x';
		a[4][3] ='x';
		a[5][1] ='x';
		a[5][5] ='x';
		a[6][1] ='x';
		a[6][4] ='x';
		a[6][5] ='x';
		a[7][1] ='x';
		a[7][3] ='x';
		a[7][4] ='x';
		a[8][0] ='x';
		a[8][2] ='x';
		a[8][3] ='x';
		a[8][5] ='x';
		a[9][1] ='x';
		a[9][3] ='x';
		a[9][4] ='x';
		a[9][5] ='x';
		a[10][2] ='x';
		a[10][4] ='x';
		a[11][2] ='x';
		a[11][3] ='x';
		a[11][5] ='x';
		a[12][4] ='x';
		System.out.println("\t"+"A\t"+"B\t"+"C\t"+"D\t"+"E\t"+"F\t");
		for(int i=0;i<a.length;i++) {
			System.out.print("Row"+(i+1)+"\t");
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]!='x') {
					a[i][j] ='*'; 
					System.out.print('*'+"\t");
				}
				else {
					System.out.print(a[i][j]+"\t");
				}	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		customer(a);
	}
	public static  void customer(char[][] a) {
		Scanner in = new Scanner(System.in);
		char Q='Y';
		while(Q=='Y'||Q =='y') {
			System.out.print("Reser row[1-13] : ");
			int r = in.nextInt();
			System.out.print("seat[A-F] : ");
			char c =in.next().charAt(0);
			int n;
			if(c=='A') {
				n=0;
			}
			else if(c=='B') {
				n=1;
			}
			else if(c=='C') {
				n=2;
			}
			else if(c=='D') {
				n=3;
			}
			else if(c=='E') {
				n=4;
			}
			else {
				n=5;
			}
			if(a[r-1][n]=='x') {
				System.out.println("Busy seats :( ");
			}
			else {
				a[r-1][n]='x';
				System.out.println("Reservation completed :) ");
			}
			System.out.print("You will continue [y/n] : ");
			Q =in.next().charAt(0);
		}
		System.out.println();
		System.out.println();
		System.out.println("update Reser");
		System.out.println("\t"+"A\t"+"B\t"+"C\t"+"D\t"+"E\t"+"F\t");
		for(int i=0;i<a.length;i++) {
			System.out.print("Row"+(i+1)+"\t");
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]!='x') {
					a[i][j] ='*'; 
					System.out.print('*'+"\t");
				}
				else {
					System.out.print(a[i][j]+"\t");
				}	
			}
			System.out.println();
		}
	}	
}
