
public class Max2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {
				{16,22,99,4,18},
				{-258,4,101,5,98},
				{105,6,15,2,45},
				{33,88,72,16,3}
				

};
		int max=0;
		int s = 0,r=0;
		int []w=new int[a.length*a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int y=0;y<a[0].length;y++) {
				if(a[i][y]>max) {
					max=a[i][y];
					s=i;
					r=y;
					
					
				}
				
			}
			
		}
		System.out.print("print max"+max);
		System.out.print("print max"+s+","+r);
		for(int i=0;i<a.length;i++) {
			for(int y=0;y<a[i].length-1;y++) {
				if(a[i][y]>a[i][y+1]) {
					int temp=a[i][y];
					a[i][y]=a[i][y+1];
					a[i][y+1]=temp;
				}
			}
		}
		
}
}