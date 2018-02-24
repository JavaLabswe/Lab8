import java.util.Arrays;

public class Max2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=-99999,maxi=0,maxj = 0;
		int[][] n = {{16,22,99,4,18},
					 {-258,4,101,5,98},
					 {105,6,15,2,45},
					 {33,88,72,16,3},
		};
		int[] sort = new int[4*5];
		
		for(int i = 0;i<n.length;i++) {
			for(int j = 0;j<n[i].length;j++) {
				
				if(n[i][j]>max) {
					max = n[i][j];
					maxi = i;
					maxj = j;
				}
				int pos = (i*5)+j;
				sort[pos] = n[i][j];
			}
			
		}
		System.out.println("Max is : "+max);
		System.out.println("Max i j is : "+maxi+" "+maxj);
		Arrays.sort(sort);
		
		for(int i = 0;i<sort.length;i++) {
			System.out.print(sort[i]+" ");
		}
	}

}
