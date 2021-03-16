import java.util.Arrays;

public class PS8{

	public static void main(String args[]){
		PS8 example = new PS8();
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};
		int arr3[] = task(arr1, arr2);
		example.task(arr1,arr2);
		//after calling the function.....
		System.out.println("The output is ");
		for (int j : arr3)
			System.out.println(j);
	}

	
	public static int[] task(int[] arr1, int[] arr2){
		
		int arr3[] = new int[arr1.length];

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {

				if(i % 2 == 0) {
					arr3[i] = arr2[i];
				} 
				else {
					arr3[i] = arr1[i];
				}
			}
		}
		return arr3;	
}
}