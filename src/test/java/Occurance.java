public class Occurance{
	public static void main(String[] args){
		String s="My Name is Rama";

		char arr[]=s.toCharArray();

		for(int i=1;i<=arr.length;i++) {
			int count=1;

			for(int j=1;j<=arr.length;j++) {
				if (arr[i]==arr[j] && arr[i]>arr[j]) {
					count++;
					
				}
				if(count>0) {
				System.out.println(count);
				}
				}
			}
			
		}
	}











