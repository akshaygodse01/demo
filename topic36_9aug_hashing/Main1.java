package topic36_9aug_hashing;

import java.util.HashMap;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer>mymap=new HashMap<>();
mymap.put("akki", 1);
mymap.put("godse", 10);
mymap.put("akshay", 007);
System.out.println(mymap);

mymap.put("akki", 12);//if you add duplicate value then override the original value
System.out.println(mymap);

Set<String>mykeys=mymap.keySet();
System.out.println(mykeys);//it gives only keys in hash
	}

}
