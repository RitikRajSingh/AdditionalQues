import java.util.Arrays;
import java.util.Collections;

public class PS9{
	public static void main(String args[]) {
		PS9 example = new PS9();
		String arr[]={"red","ivory","green","blue"};
		example.task(arr,1);
	}

	public void task(String arr[], int place) {
		int n = arr.length;
		Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("Array in asc. order = "+Arrays.toString(arr));
		Arrays.sort(arr);
			System.out.println("Array in desc. order = "+Arrays.toString(arr));

		System.out.println("Array element in place of argument = "+arr[place]);
	}
}