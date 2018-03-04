public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int []num=new int[50];
		
		num[0]=1;
		for(int i=1;i<50;i++) {
			num[i]=i*i;
		}
			for(int j=26;j<50;j++) {
				num[j]=j*j*j;
		}
			
			for(int k=0;k<50;k++) {
				if(k%10==0) {
					System.out.println();
					System.out.print(" "+num[k]);
				}else {
					System.out.print(" "+num[k]);
				}
			
			}
			
			
					
					
				
				
			}
			
	}

	
