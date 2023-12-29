package topic35_08aug_comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Mobile>mymobile=new LinkedList<>();
mymobile.add(new Mobile("one plus",256,8,22000));
mymobile.add(new Mobile("samsung",64,4,20000));
mymobile.add(new Mobile("oppo",128,6,18000));
mymobile.add(new Mobile("one plus nord",128,16,32000));
System.out.println(mymobile);


Sortmobilebystorage smbs=new Sortmobilebystorage();
//Collections.sort(mymobile,smbs);

int result;
System.out.println(mymobile.get(0));
System.out.println(mymobile.get(1));
result=smbs.compare(mymobile.get(0),mymobile.get(1));
System.out.println(result);

Collections.sort(mymobile,new Sortmobilebystorage());

System.out.println(mymobile);

	}

}
