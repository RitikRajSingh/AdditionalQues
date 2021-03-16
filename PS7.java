import java.util.*;

public class PS7{

	public static void main(String args[]){
		PS7 example = new PS7();
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1,4);
		hm.put(2,6);
		hm.put(4,7);
		hm.put(5,9);
		example.task(hm);
	}


	public void task(HashMap<Integer, Integer> hm){
		int sum = 0;
    		int count = 0;
    		Iterator<Integer> it = hm.keySet().iterator();
    		while (it.hasNext()) {
      			int y = it.next();
      			if (y % 2 != 0) {
        		sum = sum + hm.get(y);
        		count++;
      		}
    	}
    	float d = sum / count;
    	System.out.println("The average is = "+d);
	}
}