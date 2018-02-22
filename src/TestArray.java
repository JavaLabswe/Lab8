
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumindex = 0;   
		int [] index = {10,20,30,40,50,60,70,80,90,100,
						10,20,30,40,50,60,70,80,90,100,
						10,20,30,40,50,60,70,80,90,100,
						10,20,30,40,50,60,70,80,90,100,
						10,20,30,40,50,60,70,80,90,100,
				};
		
		
		for(int i = 0;i<index.length;i++) {
			if(i<index.length/2) {
				index[i] = index[i]	* index[i];
			}
			else if(i>index.length/2){
				index[i] = index[i]	* index[i] * index[i];
			}
			System.out.print(index[i]+" ");
			if(i%10==9) {
				System.out.println();
			}
		}
		
		
	}

}
