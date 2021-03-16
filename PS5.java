public class PS5 {
	public static void main(String args[]) {
		PS5 app = new PS5();
		app.run("Hello*world");
		System.out.println(run("Hello*world"));
	}

	public static boolean run(String string) {
		char charArray[] = string.toCharArray();
		int count = 0;
		for (char element : charArray) {
			if (element == '*') {
				count++;
			}
		}
		if (count > 0) {
			String arr[] = string.split("\\*");
			if (arr[0].equals(arr[1])) {
				return true;
			}
		}
		return false;
	}
}