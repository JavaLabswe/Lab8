
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[50];
		a[0]=1;
		for(int i=1;i<25;i++) {
			a[i]=i*i;
		}
			for(int j=25;j<50;j++) {
				a[j]=j*3;
		}
			for(int r=0;r<50;r++) {
			System.out.print("\n "+a[r]);
			}
	}

	}