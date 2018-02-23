import java.util.Scanner;
public class AirplaneSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char [][]ap = new char[13][6];
		ap[0][2]='x';
		ap[0][4]='x';
		ap[0][5]='x';
		ap[1][1]='x';
		ap[1][3]='x';
		ap[1][5]='x';
		ap[2][2]='x';
		ap[2][3]='x';
		ap[2][5]='x';
		ap[3][0]='x';
		ap[3][2]='x';
		ap[3][4]='x';
		ap[3][5]='x';
		ap[4][1]='x';
		ap[4][3]='x';
		ap[5][1]='x';
		ap[5][5]='x';
		ap[6][1]='x';
		ap[6][4]='x';
		ap[6][5]='x';
		ap[7][1]='x';
		ap[7][3]='x';
		ap[7][3]='x';
		ap[8][0]='x';
		ap[8][2]='x';
		ap[8][3]='x';
		ap[8][5]='x';
		ap[9][1]='x';
		ap[9][3]='x';
		ap[9][4]='x';
		ap[9][5]='x';
		ap[10][2]='x';
		ap[10][4]='x';
		ap[11][2]='x';
		ap[11][3]='x';
		ap[11][5]='x';
		ap[12][4]='x';
		for(int i=0;i<6;i++) {
			for(int j=0;j<13;j++) {
				if(ap[i][j] != 'x') {
				
					System.out.print('*' + "   ");
				}
				else {
					System.out.print(ap[i][j] + "  ");
				}
				
			}
			System.out.println();
		}
	}

}
