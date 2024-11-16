package Assignmentday1;

public class NthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,8,3,6,2,9,4,7};
		
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				int temp=0;
				if(n[i]>n[j]) {
					temp=n[i];
				    n[i]=n[j];
				    n[j]=temp;		
					}
				
				}
				
			}
		int nl=2;
		int ns=3;
		System.out.println(n[n.length-nl]);
		System.out.println(n[ns-1]);
		
		
		
		}
		
		
	
	}


