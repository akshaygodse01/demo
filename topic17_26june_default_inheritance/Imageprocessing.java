package topic17_26june_default_inheritance;

import topic17_22june_interfaces.SavetoDB;

public interface Imageprocessing extends SavetoDB{
@Override //override the default method//use2
default void saveToCloudDB() {
	// TODO Auto-generated method stub

	System.out.println("overriding...");
}
//use 3 in notebook- declare the default method
////public void saveToCloudDB();
//{
//}
}