package Assignmentday1;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		int value=12;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==value) {
					System.out.print(a[i]+","+a[j]);
					System.out.println();
				}
			}
		}

	}

}
