// Your name here: MICO BARCELONA

package Main;

public class Lab01{
	public static void main(String[] args){
		// TESTER: DO NOT MODIFY!!!
		int[] a = {2,5,3,4,9,8,6,7,1,0};
		int[] b = {5,4,6,3,7,2,8,-1,1,9};
		Lab01 lab = new Lab01(a);			// Declare and initialize class object
		p(lab.getSize());					// Should return 10
		p(lab.getElement(0));				// Should return 2
		p(lab.getMax());					// Should return 9
		p(lab.getSum());					// Should return 45
		p(Lab01.getStaticMin(b));			// Should return -1
		// END OF TEST!!!
	}
	// HELPER METHOD FOR TEST: DO NOT MODIFY!!!
	public static <E> void p(E item){
		System.out.println(item);
	}
	
	// Fields below here...
	
	private int[] ray;
	
	
	
	
	
	// Constructor below here...
		
	public Lab01 (int[] test){
	
			 
		this.ray = test;
		
		
	}
		
		
	
		
	// Methods below here...
		
	
	
	
	//NUMBER 1
		public int getSize(){	
			return ray.length;


	
	}
		
	//NUMBER 2
		
		public int getElement(int test){
			
			if(ray.length == 0) {
				
				return -1;
				
			}
			
			return ray[test];
		}
		
		
		
		
		//NUMBER 3
		
		
		public int getMax(){
			
		
			
			if (ray.length == 0) {
				
				return -1;
				
			} else {
			}
			int max = -1;
			
				max = ray[0];
			
				for (int i1 = 1; i1 <ray.length; i1++)
				
					if (ray[i1] > max) {
										
						max = ray[i1];
					}
		

						return max;	
              }


		
		
		//NUMBER 4
		
		public int getSum(){
			
			int sum = 0;
			
			
				
			for (int i = 0; i <ray.length; i++ ){
				
				sum += ray[i];
				
			}

			return sum;
			
}




			
				
		
	
		
		
		
		//NUMBER 5
		

		public static int getStaticMin(int[] ray){
			
			int min = ray[0];
			
			
			for (int i = 1; i < ray.length; i++) {
				
				if (ray[i] < min) {
					min = ray[i];
				}
				
				
				}
			
			return min;
			
		}
		
			
		}
			
			
		
		
		