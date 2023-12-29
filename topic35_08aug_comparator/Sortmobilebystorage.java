package topic35_08aug_comparator;

import java.util.Comparator;

public class Sortmobilebystorage implements Comparator<Mobile>{

	@Override
	public int compare(Mobile mobile1, Mobile mobile2) {
		// TODO Auto-generated method stub
		return mobile1.getStorage()-mobile2.getStorage();
		
		
	}

}
