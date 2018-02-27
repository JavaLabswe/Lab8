public class TestArray {
	public static void main(String[] args) {
		int[] a = new  int[50];
		for(int i=0;i<a.length;i++) {
			if(i<25) {
				a[i]=(i*i);
			}
			else {
				a[i]=(i*3);
			}
		}
		int c=0;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
			c++;
			if(c==10) {
				System.out.println();
				c=0;
			}
		}
	}
}