/**
 * 
 */
package topic17_22june_interfaces;

/**
 * @author Dell
 *
 */
public interface Shape {
	//bydefault fields are public ,static and final
	int pensize=1;
	
	//by default the methods are public
	
//abstract method
	void draw();

//static method
	static void paint() {
		System.out.println("painting....");
	}
}
