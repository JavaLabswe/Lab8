
public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] first  = {{16,18,23},
						  {54,91,11},
						  
		
		};
		
		int[][] second  = {{24,52,77},
						   {16,19,59},
		
		};
		
		int[][] result = new int[2][3];

		
		for(int i = 0;i<first.length;i++) {
			for(int j = 0;j<first[i].length;j++) {
				result[i][j] = first[i][j] + second[i][j];
			}
			
		}
		//print first
		System.out.println("First");
		//for print first
		for(int i = 0;i<first.length;i++) {
			System.out.println("");
			for(int j = 0;j<first[i].length;j++) {
				System.out.print(first[i][j]+" ");
				
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.print("Second");
		System.out.println("");

		for(int i = 0;i<second.length;i++) {
			System.out.println("");
			for(int j = 0;j<second[i].length;j++) {
				System.out.print(second[i][j]+" ");
				
			}
		}
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Result");
		
		for(int i = 0;i<result.length;i++) {
			System.out.println("");
			for(int j = 0;j<result[i].length;j++) {
				System.out.print(result[i][j]+" ");
				
			}
		}
	}
	
}

