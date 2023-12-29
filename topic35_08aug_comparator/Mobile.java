package topic35_08aug_comparator;

public class Mobile {

	
	private String name;
	private int Storage;
	private int ram;
	private float cost;
	public Mobile(String name, int storage, int ram, float cost) {
		super();
		this.name = name;
		this.Storage = storage;
		this.ram = ram;
		this.cost = cost;
	}
	
	
	
	public int getStorage() {
		return Storage;
	}



	@Override
	public String toString() {
		return "Mobile [name=" + name + ", Storage=" + Storage + ", ram=" + ram + ", cost=" + cost + "]";
	}
	
	
}
