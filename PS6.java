import java.util.*;

public class PS6{

	public static void main(String args[]){
		PS6 example = new PS6();
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("abc",50);
		hm1.put("efg",70);
		example.task(hm1);
	}

	public void task(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		HashMap<String, String> hm2 = new HashMap<>();

		for(Map.Entry<String, Integer> me : set) {
			String stud = me.getKey();
			Integer marks = me.getValue();
			if (marks < 60) {
				hm2.put(stud, "fail");
			} else {
				hm2.put(stud, "pass");
			}
		System.out.println("The student "+stud+" has "+marks+" marks.");
		}
		System.out.println("Result === "+hm2);
	}
}
